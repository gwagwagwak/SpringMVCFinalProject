package com.test.paytesting.dto;

public class TestDTO {
	private String id;
	private String name;
	
	
	
	
	
	public TestDTO(){}
	
	public TestDTO(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}