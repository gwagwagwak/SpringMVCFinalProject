package kr.spring.member.validator;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.spring.member.domain.MemberCommand;
import kr.spring.member.service.MemberService;

@Component
public class IdNotDuplicatedValidator implements Validator {
	
	@Resource(name="memberService")
	private MemberService memberService;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return MemberCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		MemberCommand memberCommand = (MemberCommand)target;
		
		//아이디 중복 체크(비어있지 않은 경우 한건의 데이터 받아서 검사)
		if(memberCommand.getId() != null && !memberCommand.getId().isEmpty()) {
			MemberCommand member = memberService.getMember(memberCommand.getId());
			//받은 한건의 데이터가 비어있지 않으면 검사
			if(member != null && member.getId().equals(memberCommand.getId())) {
				//아이디 중복
				errors.rejectValue("id", "duplicatedId");
			}
		}
	}
	
	
}
