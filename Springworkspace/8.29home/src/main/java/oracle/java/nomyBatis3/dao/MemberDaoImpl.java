package oracle.java.nomyBatis3.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.java.nomyBatis3.model.MemberVO;

@Repository
public class MemberDaoImpl implements MemberDao{

	private static final Logger logger = 
			LoggerFactory.getLogger(MemberDaoImpl.class);
	
	
	
	
	@Autowired
	private SqlSession session;

	@Override
	public List<MemberVO> getMemberList() {
		
		return session.selectList("member.getMemberList");
		
	}

	@Override
	public void insertMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberVO viewMember(String m_email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMember(MemberVO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String m_email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkPw(String m_email, String pw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getMemberCount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
/*	
	public List<MemberVO> list(){
		return session.selectList("listAll");
	}


	@Override
	public int totalMember() {
		
		return session.selectOne("totalMember");
	}


	@Override
	public MemberVO selMember(String id) {
		
		return null;
	}


	@Override
	public int total() {
		
		return session.selectOne("total");
	}
	*/
	
}
