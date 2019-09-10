package oracle.java.nomyBatis3.model;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PayListVO {

	private int p_no;			//���� ���� ���̵�(������, �⺻Ű)
	private String p_target;	//��볻��
	private Date p_date;		//���� ��¥
	private int p_charge;		//���� ���
	private String p_currc;		//���� ��ȭ
	private String p_type;		//���� ����
	private	int p_cnumber;	//���� ī�� ��ȣ	(�ܷ�Ű : card.c_number)
	private String p_username;		//���� ȸ�� ���� (�ܷ�Ű : member.m_email)
	
	SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	
	public PayListVO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PayListVO(int p_no, String p_target, String p_date, int p_charge, String p_currc, String p_type,
			String p_cnumber, String p_username) throws ParseException {
		super();
		this.p_no = p_no;
		this.p_target = p_target;
		this.p_date =format.parse(p_date);
		this.p_charge = p_charge;
		this.p_currc = p_currc;
		this.p_type = p_type;
		this.p_cnumber =Integer.parseInt(p_cnumber);
		this.p_username = p_username;
	}



	public int getP_no() {
		return p_no;
	}



	public void setP_no(int p_no) {
		this.p_no = p_no;
	}



	public String getP_target() {
		return p_target;
	}



	public void setP_target(String p_target) {
		this.p_target = p_target;
	}



	public int getP_charge() {
		return p_charge;
	}



	public void setP_charge(int p_charge) {
		this.p_charge = p_charge;
	}



	public String getP_currc() {
		return p_currc;
	}



	public void setP_currc(String p_currc) {
		this.p_currc = p_currc;
	}



	public String getP_type() {
		return p_type;
	}



	public void setP_type(String p_type) {
		this.p_type = p_type;
	}



	public Date getP_date() {
		return p_date;
	}



	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}



	public int getP_cnumber() {
		return p_cnumber;
	}



	public void setP_cnumber(int p_cnumber) {
		this.p_cnumber = p_cnumber;
	}



	public String getp_username() {
		return p_username;
	}



	public void setp_username(String p_username) {
		this.p_username = p_username;
	}
	
	
	
	
	
	
	
	
	
}