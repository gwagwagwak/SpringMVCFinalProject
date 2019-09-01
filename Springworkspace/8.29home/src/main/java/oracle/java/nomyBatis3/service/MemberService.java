package oracle.java.nomyBatis3.service;


import java.util.List;

import oracle.java.nomyBatis3.model.MemberVO;

public interface MemberService {

	//회원 리스트 가져오기
	public List<MemberVO> getMemberList();
	
	//일반회원 가입
	public void insertMember(MemberVO member);
	
	//회원 정보 보기
	public MemberVO viewMember(String m_email);
	
	//회원 업데이트
	public void updateMember(MemberVO member);
	
	//회원 삭제
	public void deleteMember(String m_email);
	
	//회원 비밀번호 체크
	public boolean checkPw(String m_email, String pw);
	
	//회원 수 구하기
	public int getMemberCount();
	
}
