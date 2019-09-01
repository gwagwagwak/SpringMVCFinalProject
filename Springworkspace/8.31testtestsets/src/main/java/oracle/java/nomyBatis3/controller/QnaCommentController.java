package oracle.java.nomyBatis3.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import oracle.java.nomyBatis3.model.QnaCommentVO;
import oracle.java.nomyBatis3.service.AutoPayService;
import oracle.java.nomyBatis3.service.CardService;
import oracle.java.nomyBatis3.service.MemberService;
import oracle.java.nomyBatis3.service.Pager;
import oracle.java.nomyBatis3.service.PayListService;
import oracle.java.nomyBatis3.service.QnaCommentService;
import oracle.java.nomyBatis3.service.QnaMainService;
import oracle.java.nomyBatis3.service.QnaService;

@Controller
public class QnaCommentController {
	@Autowired
	private MemberService ms;
	@Autowired
	private AutoPayService as;
	@Autowired
	private CardService cs;
	@Autowired
	private PayListService ps;
	@Autowired
	private QnaCommentService commentservice;
	@Autowired
	private QnaMainService qms;
	@Autowired
	private QnaService qs;
	
	@RequestMapping(value = "replylist.do")
	public ModelAndView replylistHandle(int q_no, @RequestParam(defaultValue="1")int curPage,
			ModelAndView mv, HttpSession session) throws Exception {
		
		int count = commentservice.getcount(q_no);
		Pager pager = new Pager(count, curPage);
		int start = pager.getPageBegin();
		int end = pager.getPageEnd();
		
		List<QnaCommentVO> list = commentservice.getCommentList(q_no, start, end);
		
		/*mv.setViewName("board/reply_list");*/
		mv.setViewName("board/reply_list");
		mv.addObject("list", list);
		mv.addObject("pager", pager);
		
		/* return "companyIntroduce"; */
		return mv;
	}

	
}
