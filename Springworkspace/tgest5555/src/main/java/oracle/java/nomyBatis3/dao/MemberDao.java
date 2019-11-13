package oracle.java.nomyBatis3.dao;

import java.util.List;

import oracle.java.nomyBatis3.DTO.LoginDTO;
import oracle.java.nomyBatis3.model.MemberVO;

public interface MemberDao {

	// 회원 리스트 가져오기
	public List<MemberVO> getMemberList();

	public List<MemberVO> getPersonalMemberList();

	public List<MemberVO> getBusinessMemberList();

	//비상장 회원 가져오기
	public List<MemberVO> getunlistBusinessMemberList();
	
	//상장 회원 가져오기
	public List<MemberVO> getlistBusinessMemberList();

	
	// 일반회원 가입
	public void insertMember(MemberVO member);

	// 비지니스 회원 가입
	public void insertBusinessMember(MemberVO member);

	// 회원 정보 보기
	public MemberVO viewMember(String m_email);

	// 회원 업데이트
	public void updateMember(MemberVO member);

	// 회원 삭제
	public void deleteMember(String m_email);

	// 회원 비밀번호 체크
	public boolean checkPw(String m_email, String pw);

	// 회원 수 구하기
	public int getMemberCount();

	// 일반 회원 수 구하기
	public int getPersonalMemberCount();
	//비지니스 상장 회원수 구하기
	public int getBusinessListMemberCount();
	//비지니스 비상장 회원수 구하기
	public int getBusinessUnlistMemberCount();
	

	// 로그인
	public MemberVO loginMember(LoginDTO logindto) throws Exception;

	// 이메일 중복 확인
	public int userIdCheck(String m_email);

	
	//회원 정보 업데이트
	public void updateUserInfo(MemberVO member);
	
	public void changePW(String m_email, String newpw, String m_pws);
	
	public void addSecurityAnswer(MemberVO member);

}