package oracle.java.nomyBatis3.controller;



import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import oracle.java.nomyBatis3.dao.MemberDaoImpl;
import oracle.java.nomyBatis3.model.MemberVO;
import oracle.java.nomyBatis3.service.AutoPayService;
import oracle.java.nomyBatis3.service.CardService;
import oracle.java.nomyBatis3.service.MemberService;
import oracle.java.nomyBatis3.service.PayListService;
import oracle.java.nomyBatis3.service.QnaCommentService;
import oracle.java.nomyBatis3.service.QnaMainService;
import oracle.java.nomyBatis3.service.QnaService;


@Controller
public class MemberController {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberDaoImpl.class);
	
	
	
	
	
	@Inject
	MemberService mservice;
	
	ModelAndView mv;
	
/*	@RequestMapping(value="listMember")
	public String listMember(MemberDao mdao,Model model,String currentPage){
		
		
		int total=ms.total();
		System.out.println("controller_01");
		
		
		//model.addAttribute("list",listMember(null, null));
		System.out.println("controller_02");
		return "listMember";
		
	}*/
	
	//회원 목록 페이지 처리
	@RequestMapping(value="getMemberList.do")
	public String getMemberList(Model model){
		List<MemberVO> list = mservice.getMemberList();
		
		logger.info("회원목록 : " +list);
		model.addAttribute("list", list);
		return "memberList";				//회원 목록 페이지로 이동
		
	}

	
	@RequestMapping(value="main.do")
	public String main(Model model){
		System.out.println("11111111111111111111111");
		return "main";
	}

	//로그인 페이지로 이동
	@RequestMapping(value="loginForm.do")
	public String loginForm(Model model){
		return "/member/loginForm";
	}
	
	
	//회원가입 페이지로 이동
	@RequestMapping(value="registerForm_03_p.do")
	public String registerForm_03_p(Model model){
		System.out.println("11111111111111111111111");
		return "/member/registerForm_03_p";
	}
	
	
	//회원가입 처리
	
	
	
	
	
}
