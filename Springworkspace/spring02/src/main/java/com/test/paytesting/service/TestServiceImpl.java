package com.test.paytesting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.paytesting.dao.TestDAO;
import com.test.paytesting.dto.TestDTO;

@Service
public class TestServiceImpl implements TestService{
	@Autowired 
	TestDAO testdao;
	
	public TestDTO test(){
		return testdao.test22();
	}
}
