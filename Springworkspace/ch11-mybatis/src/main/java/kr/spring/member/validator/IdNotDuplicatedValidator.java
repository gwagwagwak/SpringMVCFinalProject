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
		
		//���̵� �ߺ� üũ(������� ���� ��� �Ѱ��� ������ �޾Ƽ� �˻�)
		if(memberCommand.getId() != null && !memberCommand.getId().isEmpty()) {
			MemberCommand member = memberService.getMember(memberCommand.getId());
			//���� �Ѱ��� �����Ͱ� ������� ������ �˻�
			if(member != null && member.getId().equals(memberCommand.getId())) {
				//���̵� �ߺ�
				errors.rejectValue("id", "duplicatedId");
			}
		}
	}
	
	
}
