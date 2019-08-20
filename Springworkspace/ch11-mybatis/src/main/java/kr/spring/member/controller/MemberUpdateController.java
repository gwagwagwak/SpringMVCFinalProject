package kr.spring.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;
import kr.spring.member.validator.MemberValidator;

@Controller
@SessionAttributes("memberCommand")
public class MemberUpdateController {

	@Resource(name="memberService")
	private MemberService memberService;
	
	//selectDetail.do에서 id값 넘김
	@RequestMapping(value="/update.do",method=RequestMethod.GET)
	public ModelAndView form(@RequestParam("id") String id) {
		
		MemberCommand memberCommand = memberService.getMember(id);
								//view 이름			속성명		속성값
		return new ModelAndView("updateForm","memberCommand",memberCommand);
	}
	
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public String submit(MemberCommand memberCommand, BindingResult result, SessionStatus status){
		
		//유효성체크
		new MemberValidator().validate(memberCommand, result);
		if(result.hasErrors()) {
			return "updateForm";
		}
		
		memberService.updateMember(memberCommand);
		
		//session에 저장된 model을 삭제하는 이벤트 발생
		status.setComplete();
		
		return "redirect:/list.do";
	}
}
