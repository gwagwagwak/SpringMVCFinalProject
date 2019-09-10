package oracle.java.nomyBatis3.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import oracle.java.nomyBatis3.model.MemberVO;
import oracle.java.nomyBatis3.model.QnaCommentVO;
import oracle.java.nomyBatis3.service.AutoPayService;
import oracle.java.nomyBatis3.service.CardService;
import oracle.java.nomyBatis3.service.MemberService;
import oracle.java.nomyBatis3.service.Pager;
import oracle.java.nomyBatis3.service.PayListService;
import oracle.java.nomyBatis3.service.QnaCommentService;
import oracle.java.nomyBatis3.service.QnaMainService;
import oracle.java.nomyBatis3.service.QnaService;

@RestController
@Controller
public class QnaCommentController {

	@Inject
	private QnaCommentService qcservice;
	
	@Inject
	private QnaService qservice;
	
	@RequestMapping("commentInsert.do")
	public String commentInsert(QnaCommentVO commentvo, HttpSession httpsession) throws Exception{
		//로그인을했을 경우 멤버 객체를 세션값으로 받아온다.
		MemberVO loginmember =(MemberVO)httpsession.getAttribute("loginMember");
		
		//loginmember이 관리자인 경우 flag =2로 설정하여 관리자가 달았다고 표시한다.
		if(loginmember.getM_type() == 1){
			qcservice.admincreate(commentvo);
			System.out.println("관리자 댓글 등록 완성");
			
			int q_no = commentvo.getComt_textid(); //원글 아이디 번호
			qservice.adminreplyComplete(q_no);
			System.out.println("관리자 답변 작성 완료");
			
			qservice.adminreplyComplete(commentvo.getComt_textid());
			System.out.println("답변완료 처리 완성");
		}
		
		else{
			String member_email = loginmember.getM_email();
			
			//접속중인 멤버 아이디를 댓글 작성자 아이디에 등록
			commentvo.setComt_writer(member_email);		//아이디 셋팅 
			
			System.out.println(commentvo.toString());
			qcservice.create(commentvo);
			System.out.println("일반 ghldnjsd댓글 등록 완성");
			
			/*return "redirect:/qnaRead2.do:";*/
			/*return "redirect:getQnaList.do";*/
		}
		return "s";
	}
	
	//관리자 댓글 가져오기 가져오기
	@RequestMapping("getAdminReply.do")
	public  Map<String, Object > getAdminReply(@RequestParam int q_no, HttpSession httpsession) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		Map<String, Object> result = new HashMap<>();
		
		QnaCommentVO admincomment = new QnaCommentVO();
		int comt_textid = q_no;
		
		admincomment = qcservice.getAdminReply(comt_textid);
		
		result.put("admincomment", admincomment);	
		return result;
		
		
	}
	
	
	
	
	
	
	//댓글 리스트 가져오기
	@ResponseBody
	@RequestMapping("getCommentList.do")
	public Map<String, Object >getCommentList(int q_no, @RequestParam(defaultValue="1") int curPage,
			ModelAndView mv, HttpSession httpsession){
	/*public ModelAndView getCommentList(int q_no, @RequestParam(defaultValue="1") int curPage,
			ModelAndView mv, HttpSession httpsession){*/
		
		//qnacomment 갯수 가져오기
		int comment_count = qcservice.count(q_no);
		System.out.println("댓글 개수 : " +comment_count  );
		
		Pager pager = new Pager(comment_count, curPage);
		int start = pager.getPageBegin();
		int end = pager.getPageEnd();
		
		List<QnaCommentVO> commentlist = qcservice.getCommentList(q_no, start, end, httpsession);
		System.out.println("댓글 목록가져오기 완료");
		System.out.println(commentlist.toString());
		
		Map<String, Object> result = new HashMap<>();
		
		result.put("commentlist", commentlist);
		result.put("pager", pager);
		return result;
		/*
		mv.addObject("commentlist", commentlist);
		mv.addObject("pager", pager);
		return mv;*/
	}
	/*
	 * 
	 * 
	 * 
	private int comt_no;			//댓글 번호  (시퀀스, 기본 키)
	private String comt_writer;		//댓글 작성자 (외래키 : member.m_email)
	private String comt_content;	//댓글 내용
	private Date comt_date;			//댓글 작성일
	private String comt_flag;		//댓글 삭제 여부
	private int comt_textid;		/
	 * 
	 * 
	 */
	
	
	
}
