create table sanghotest (id varchar2(20), 
name varchar2(10));


insert into sanghotest values('ttt', 'ttttt');

select  * from SANGHOTEST;

CREATE TABLE member
   (	"m_email" VARCHAR2(50 BYTE) , 
	"m_pw" VARCHAR2(50 BYTE), 
	"m_fname" VARCHAR2(50 BYTE), 
	"m_lname" VARCHAR2(50 BYTE), 
	"m_hp" VARCHAR2(50 BYTE), 
	"m_addr" VARCHAR2(500 BYTE), 
	"m_joindate" DATE, 
	"m_nation" VARCHAR2(50 BYTE), 
	"m_secu" VARCHAR2(50 BYTE), 
	"m_asw" VARCHAR2(50 BYTE), 
	"m_type" NUMBER(2,0), 
	"b_type" VARCHAR2(50 BYTE), 
	"b_number" VARCHAR2(50 BYTE), 
	 CONSTRAINT "MEMBER_PK" PRIMARY KEY ("m_email")
	 );
	 
	 
	select * from member; 
	
	 
	 
	insert into member values('dddd', 'dddd', 'dddd', 'dddd', 'dddd', 'dddd', '20110222', 'dddd', 'dddd','dddd', 11, 'dddd', 'dddd');
	insert into member values('aaaa', 'aaaa', 'dddd', 'dddd', 'dddd', 'dddd', '20110222', 'dddd', 'dddd','dddd', 11, 'dddd', 'dddd');
	insert into member values('cccc', 'cccc', 'dddd', 'dddd', 'dddd', 'dddd', '20110222', 'dddd', 'dddd','dddd', 11, 'dddd', 'dddd');
	