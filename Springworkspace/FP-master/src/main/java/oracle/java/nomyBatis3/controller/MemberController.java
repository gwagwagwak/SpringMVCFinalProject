package oracle.java.nomyBatis3.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import oracle.java.nomyBatis3.DTO.LoginDTO;
import oracle.java.nomyBatis3.dao.MemberDaoImpl;
import oracle.java.nomyBatis3.model.CardVO;
import oracle.java.nomyBatis3.model.MemberVO;
import oracle.java.nomyBatis3.model.PayListVO;
import oracle.java.nomyBatis3.service.AutoPayService;
import oracle.java.nomyBatis3.service.CardService;
import oracle.java.nomyBatis3.service.MemberService;
import oracle.java.nomyBatis3.service.PayListService;
import oracle.java.nomyBatis3.service.QnaCommentService;
import oracle.java.nomyBatis3.service.QnaMainService;
import oracle.java.nomyBatis3.service.QnaService;

@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberDaoImpl.class);

	@Inject
	MemberService mservice;
	@Inject
	CardService cservice;
	
	@Inject
	PayListService pservice;

	ModelAndView mv;

	/*
	 * @RequestMapping(value="listMember") public String listMember(MemberDao
	 * mdao,Model model,String currentPage){
	 * 
	 * 
	 * int total=ms.total(); System.out.println("controller_01");
	 * 
	 * 
	 * //model.addAttribute("list",listMember(null, null));
	 * System.out.println("controller_02"); return "listMember";
	 * 
	 * }
	 */

	//���������� �̵�
	@RequestMapping(value = "main.do")
	public String main(Model model) {
		System.out.println("11111111111111111111111");
		return "main";
	}

	
	// ȸ�� ��� ������ ó��
	@RequestMapping(value = "getMemberList.do")
	public String getMemberList(Model model) {
		List<MemberVO> list = mservice.getMemberList();

		logger.info("ȸ����� : " + list);
		model.addAttribute("list", list);
		return "member/memberList"; // ȸ�� ��� �������� �̵�

	}

	// �α��� �������� �̵�
	@RequestMapping(value = "loginForm.do")
	public String loginForm(Model model) {
		return "loginForm";
	}

	
	
	// �α��� ���� ó��
/*	@RequestMapping(value = "loginPost.do", method = RequestMethod.POST)
	public void loginPost(@ModelAttribute LoginDTO logindto, Model model) throws Exception {
		logger.info("loginPost={}", logindto);
		try {
			MemberVO member = mservice.loginMember(logindto);
			if (member != null) { // login success
				model.addAttribute("member", member);
				model.addAttribute("loginResult", member.getM_fname() + member.getM_lname());
			} else { // login fail
				model.addAttribute("loginResult", "Login Fail!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	
	// �α��� ���� ó��
	@RequestMapping(value = "loginPost.do", method = RequestMethod.POST)
	public String loginPost(@ModelAttribute LoginDTO logindto, Model model,HttpServletRequest request) throws Exception {
		logger.info("loginPost={}", logindto);
		HttpSession session = request.getSession();



		try {
			MemberVO member = mservice.loginMember(logindto);
			
			
			if (member != null) { // login success
				model.addAttribute("member", member);
				model.addAttribute("loginResult", member.getM_fname() + member.getM_lname());
				List<CardVO> clist = cservice.getCardList();
				model.addAttribute("clist", clist);
				System.out.println("�̸���: "+logindto.getM_email());
				System.out.println("�ּ�: "+member.getM_addr());
				session.setAttribute("username", logindto.getM_email());
				session.setAttribute("m_addr", member.getM_addr());
				List<PayListVO> plist = pservice.getPayList(logindto.getM_email());
				model.addAttribute("plist",plist);
				
				
				return "memberMain";
			} else { // login fail
				model.addAttribute("loginResult", "Login Fail!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/loginForm.do";
	}

	
	
	// ȸ������ ȸ�� ���� �������� �̵�
	@RequestMapping(value = "join_first.do")
	public String join_first(Model model) {
		System.out.println("11111111111111111111111");
		return "member/join_first";
	}
	// �Ϲ� ȸ������ �������� �̵�
	@RequestMapping(value = "registerForm_03_p.do")
	public String registerForm_03_p(Model model) {
		System.out.println("11111111111111111111111");
		return "member/registerForm_03_p";
	}
	// ��� ȸ������ �������� �̵�
	@RequestMapping(value = "registerForm_03_b.do")
	public String registerForm_03_b(Model model) {
		System.out.println("11111111111111111111111");
		return "member/registerForm_03_b";
	}
	
	// �Ϲ� ȸ�� ����
	@RequestMapping(value = "memberInsert.do")
	public String insertPersonalMember(@ModelAttribute MemberVO member, HttpServletRequest request) {
		System.out.println(
				member.getM_email() + "\n" + member.getM_fname() + "\n" + member.getM_pw() + "\n" + member.getM_addr());

		String addr1 = request.getParameter("m_addr");
		String addr2 = request.getParameter("m_addr2");

		member.setM_addr(addr1 + " " + addr2);

		mservice.insertMember(member);
		return "redirect:/loginForm.do";

	}
	// ��� ȸ�� ����
	@RequestMapping(value = "memberBusinessInsert.do")
	public String insertbusinessMember(@ModelAttribute MemberVO member, HttpServletRequest request) {
		System.out.println(
				member.getM_email() + "\n" + member.getM_fname() + "\n" + member.getM_pw() + "\n" + member.getM_addr());

		String addr1 = request.getParameter("m_addr");
		String addr2 = request.getParameter("m_addr2");

		member.setM_addr(addr1 + " " + addr2);

		mservice.insertMember(member);
		System.out.println("���ȸ�� ���� ó�� �Ϸ� ");
		
		return "redirect:/loginForm.do";

	}
	
	
	
	
	
	

	// �����ͷ� �̵�
	@RequestMapping(value = "serviceCenter.do")
	public String serviceCenter(Model model) {
		System.out.println("11111111111111111111111");
		return "serviceCenter";
	}

	// �̿����������� �̵�
	@RequestMapping(value = "privacy.do")
	public String Privacy(Model model) {
		System.out.println("11111111111111111111111");
		return "privacy";
	}

	// �α��� - �ϴ� ������ �α��� ó��
	/*
	 * @RequestMapping(value="memberLogin.do") public String
	 * loginHandle(MemberVO member, Model model, HttpSession httpsession){
	 * 
	 * MemberVO result = mservice.loginMember(member);
	 * 
	 * if(result == null){ model.addAttribute("message", "ID�� PW�� ��ġ���� �ʽ��ϴ�.");
	 * return "login"; }else{ httpsession.setAttribute("loginID",
	 * result.getM_email());
	 * 
	 * return "redirect:main.do"; return "main.do"; } }
	 */

	// ȸ������ ó��

}