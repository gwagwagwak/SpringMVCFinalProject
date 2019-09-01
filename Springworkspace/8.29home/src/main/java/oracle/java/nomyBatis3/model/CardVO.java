package oracle.java.nomyBatis3.model;

import java.util.Date;

public class CardVO {
	
	private int c_number;		//카드 번호(기본키)
	private String c_type;		//카드 타입
	private Date c_expr;		//카드 만료일
	private int c_csc;			//카드 csc번호
	private String c_addr;	//카드 청구 주소
	private String c_username;		//카드 회원 메일	(외래키 : member.m_email)
	
	
	public CardVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CardVO(int c_number, String c_type, Date c_expr, int c_csc, String c_addr, String c_username) {
		super();
		this.c_number = c_number;
		this.c_type = c_type;
		this.c_expr = c_expr;
		this.c_csc = c_csc;
		this.c_addr= c_addr;
		this.c_username = c_username;
	}


	public int getC_number() {
		return c_number;
	}


	public void setC_number(int c_number) {
		this.c_number = c_number;
	}


	public String getC_type() {
		return c_type;
	}


	public void setC_type(String c_type) {
		this.c_type = c_type;
	}


	public Date getC_expr() {
		return c_expr;
	}


	public void setC_expr(Date c_expr) {
		this.c_expr = c_expr;
	}


	public int getC_csc() {
		return c_csc;
	}


	public void setC_csc(int c_csc) {
		this.c_csc = c_csc;
	}


	public String getC_addr() {
		return c_addr;
	}


	public void setC_addr(String c_addr) {
		this.c_addr = c_addr;
	}


	public String getc_username() {
		return c_username;
	}


	public void setc_username(String c_username) {
		this.c_username = c_username;
	}
	
	
	
	
	
	
	
}
