package oracle.java.nomyBatis3.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import oracle.java.nomyBatis3.model.QnaMainVO;
import oracle.java.nomyBatis3.service.AutoPayService;
import oracle.java.nomyBatis3.service.CardService;

import oracle.java.nomyBatis3.service.MemberService;
import oracle.java.nomyBatis3.service.PayListService;
import oracle.java.nomyBatis3.service.QnaCommentService;
import oracle.java.nomyBatis3.service.QnaMainService;
import oracle.java.nomyBatis3.service.QnaService;

@Controller
public class QnaMainController {
	
	@Inject
	QnaMainService qmainservice;
	
	@Autowired
	private MemberService ms;
	@Autowired
	private AutoPayService as;
	@Autowired
	private CardService cs;
	@Autowired
	private PayListService ps;
	@Autowired
	private QnaCommentService qcs;
	@Autowired
	private QnaMainService qms;
	@Autowired
	private QnaService qs;
	
	
	
	@RequestMapping("qnamainwrite.do")
	public String write(){
		return "qnamainwrite";
	}
	
 
	//메인 화면 qnseamil 보내기 /////////////////////////////////////////////////////////////
	@RequestMapping("qnamainsend.do")
	public String send(@ModelAttribute QnaMainVO qnamainvo, Model model)
	/*public String send(HttpServletRequest request, Model model)*/{
		/*String qm_title = request.getParameter("qm_title");
		String qm_sendermail = request.getParameter("qm_title");
		String qm_content = request.getParameter("qm_title");
		*/
		
		/*QnaMainVO qmainvo = new QnaMainVO();*/ 
		System.out.println("값 확인 : "+qnamainvo.getQm_receivcemail() + qnamainvo.getQm_sendermail() + qnamainvo.getQm_sendername() +qnamainvo.getQm_title());
		System.out.println("내용 : " + qnamainvo.getQm_content() );
		
		try{
			qmainservice.sendEmail(qnamainvo);
			System.out.println("메일이 정상적으로 보내짐!!!!!!!!!!!!!!!!!!!!!!");
			model.addAttribute("message", "문의하신 사항이 접수되었습니다.");
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("message", "문의사항 발송에 실패하셨습니다.");
		}
		
		return "main";
	}
	
	
}
