package com.test.paytesting.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.paytesting.dto.TestDTO;

@Repository
public class TestDAOImpl implements TestDAO {

	@Inject
	private SqlSession sqlsession;

	@Override
	public TestDTO test22() {
		// TODO Auto-generated method stub
		return null;
	}

		/*
	public TestDTO test() {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("testtest.test");		//testtest : 사용할 메퍼의 이름              test : 메퍼 안의 쿼리 아이디 명칭 
	}*/
	
}
