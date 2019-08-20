package kr.spring.member.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;
import kr.spring.member.validator.IdNotDuplicatedValidator;
import kr.spring.member.validator.MemberValidator;

@Controller
public class MemberInsertController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="memberService")
	private MemberService memberService;
	
	@Autowired
	private IdNotDuplicatedValidator idNotDuplicatedValidator;
	
	//커맨드 객체(자바빈) 초기화
	@ModelAttribute	//request에 저장?
	public MemberCommand initCommand() {
		return new MemberCommand();
	}
	
	@RequestMapping(value="/insert.do",method=RequestMethod.GET)
	public String form(){
		return "insertForm";
	}
	
	@RequestMapping(value="/insert.do",method=RequestMethod.POST)	
	public String submit(MemberCommand memberCommand, BindingResult result) {
		
		if(log.isDebugEnabled()) {
			log.debug("memberCommand : " + memberCommand);
		}
		
		//id,passwd,name 전송 여부 체크
		new MemberValidator().validate(memberCommand, result);
		
		//id 중복체크
		idNotDuplicatedValidator.validate(memberCommand, result);
		
		if(result.hasErrors()) {
			return form();
		}
		
		memberService.insertMember(memberCommand);
		
		return "redirect:/list.do";
	}
}
