-------drop table------------
drop table member;
drop table qna CASCADE CONSTRAINTS;
drop table qnamain;
drop table qnacomment;
drop table card;
drop table paylist;
drop table autopay;



------------create--------------------

CREATE TABLE member (
	m_email	varchar2(30)		primary key,
	m_pw	varchar2(30)		NULL,
	m_fname	varchar2(30)		NULL,
	m_lame	varchar2(30)		NULL,
	m_hp	varchar2(20)		NULL,
	m_addr	varchar2(100)		NULL,
	m_joindate	date		NULL,
	m_nation	varchar2(20)		NULL,
	m_secu	varchar2(50)		NULL,
	m_answer	varchar2(50)		NULL,
	m_type	number(2)		NULL,
	b_type	varchar2(30)		NULL,
	b_number	number(20)		NULL
);



CREATE TABLE qnamain (
	qm_no	number(20)		primary key,
	qm_email	varchar2(30)		NULL,
	qm_title	varchar2(100)		NULL,
	qm_content	varchar2(1000)		NULL
);

select * from qna;


CREATE TABLE qna(
	q_no	number(20)	primary key,
	q_writer varchar2(30),
	q_title	varchar2(100)	NULL,
	q_content	varchar2(1000)	NULL,
	q_date	date	NULL,
	q_divide varchar2(30) null,
	q_complete varchar2(20) null, 
	q_replytype	varchar2(20)	NULL,
	q_private	varchar2(20)	NULL
);



CREATE TABLE qnacomment (
	comt_no	number(20)		primary key,
	comt_writer	varchar2(30),
	comt_content	varchar2(500)		NULL,
	comt_date	date		NULL,
	comt_flag	number(2)		NULL,
	comt_textid	number(20)		NOT NULL
);



CREATE TABLE card (
	c_number	number(20)		primary key,
	c_type	varchar2(30)		NULL,
	c_expr	date		NULL,
	c_csc	number(5)		NULL,
	c_address	varchar2(500)		NULL,
	c_username	varchar2(30)		NOT NULL
);



CREATE TABLE paylist (
	p_no	number(20)		primary key,
	p_target	varchar2(100)		NULL,
	p_date	date		NULL,
	p_charge	number(15)		NULL,
	p_currc	varchar2(10)		NULL,
	p_type	varchar2(2)		NULL,
	p_cnumber	number(20)		NOT NULL,
	p_user	varchar2(30)		NOT NULL
);

CREATE TABLE autopay (
	a_no	number(20)		primary key,
	a_target	varchar2(100)		NULL,
	a_charge	number(15)		NULL,
	a_currc	varchar2(20)		NULL,
	a_date	date		NULL,
	a_cnumber	number(20)		NOT NULL
);

-------


-----테이블 조건 변경----------------

ALTER TABLE member ADD CONSTRAINT PK_USERS PRIMARY KEY(USERNO);

ALTER TABLE qna ADD CONSTRAINT PK_QNAPRIMARY KEY(q_no);




-----외래키--------------------
alter table qna add constraint qna_fk_memail foreign key(q_writer) references member(m_email);
alter table qnacomment add constraint qnacomment_fk_qno foreign key(comt_textid) references qna(q_no);
alter table card add constraint card_fk_cusername foreign key(c_username) references member(m_email);
alter table paylist add constraint paylist_fk_cardnumber foreign key(p_cnumber) references card(c_number);
alter table paylist add constraint paylist_fk_memail foreign key(p_user) references member(m_email);
alter table autopay add constraint autopay_fk_cnumber foreign key(a_cnumber) references card(c_number);

---외래키 삭제-----------------

alter table qna drop foreign key qna_fk_memail;

--외래키 확인------
3.1 테이블 기준 확인
select * from information_schema.table_constraints where table_name = '테이블명';

3.2 데이터베이스 기준 확인
select * from information_schema.table_constraints where constraint_schema = '데이터베이스명';


출처: https://allg.tistory.com/37 [프로그래밍 해볼까]

--select--------------------------------
select * from member;
select * from qna ;
select * from qnamain;
select * from qnacomment;
select * from paylist;
select * from card;
select * from autopay;






---insert----------------------

insert into member values('황상호', '111', '황', '상호', '01050938', '서울시 강동구', SYSDATE, 'south korea', null, null, 2, null, null);
insert into qna(q_no, q_writer, q_title, q_content, q_date, q_divide, q_complete, q_replytype, q_private)values(seq_qna.nextval, '황상호', '제목', '얄리얄리야라셩 내용', SYSDATE, '결제', '미완료', '이메일', '비밀글');

 
-----다량  더미 데이터 insert---------------

declare
 i number :=1;
 begin
	while i <= 200 loop
		insert into qna(q_no, q_writer, q_title, q_content, q_date, q_divide, q_complete, q_replytype, q_private)values(seq_qna.nextval, '황상호', '제목', '얄리얄리야라셩 내용', SYSDATE, '결제', '미완료', '이메일', '비밀글');
 end 
 
 
 select * from qna order by 
 --------












--------------------------------시퀀스-------------------------------------
CREATE SEQUENCE  시퀀스명  
        START WITH n   
        INCREMENT BY n 
        MAXVALUE n |  NOMAXVALUE 
        MINVALUE n | NOMINVALUE
위의 옵션에 대해서 추가 설명을 드리자면, 

START WITH n ▶ n = 초기화 값
INCREMENT BY n ▶ n = 증가값
MAXVALUE n ▶ n = 최대값 또는 NOMAXVALUE = 무한대 값
MINVALUE n ▶ n = 최소값 또는 NOMINVALUE = 무한대 값





-----------------------------------------------------시퀀스---------------------------------------
CREATE SEQUENCE seq_qna START WITH 1 INCREMENT BY 1 NOMAXVALUE ;
CREATE SEQUENCE seq_qnamain START WITH 1 INCREMENT BY 1 NOMAXVALUE ;
CREATE SEQUENCE seq_qnacomment START WITH 1 INCREMENT BY 1 NOMAXVALUE ;
CREATE SEQUENCE seq_paylist START WITH 1 INCREMENT BY 1 NOMAXVALUE ;
CREATE SEQUENCE seq_autopay START WITH 1 INCREMENT BY 1 NOMAXVALUE ;


-----------시퀀스 초기화--------------

alter sequence seq_qna increment by 1;



--오류남--
insert into qna values(seq_qna.nextval, ,'제목', '얄리얄리야라셩 내용', to_date(sysdate,'yy.mm.dd'), '결제', '답변완료', '이메일', '비밀글', 'rmfhwlt0@naver.com' );



---------------옛날 것------------------------------------------
ALTER TABLE member ADD CONSTRAINT PK_MEMBER PRIMARY KEY(m_email);

ALTER TABLE qnamain ADD CONSTRAINT PK_QNAMAIN PRIMARY KEY (
	qm_no
);

ALTER TABLE qna ADD CONSTRAINT PK_QNA PRIMARY KEY (
	q_no
);

ALTER TABLE qnacomment ADD CONSTRAINT PK_QNACOMMENT PRIMARY KEY (
	comt_no
);

ALTER TABLE card ADD CONSTRAINT PK_CARD PRIMARY KEY (
	c_number
);

ALTER TABLE paylist ADD CONSTRAINT PK_PAYLIST PRIMARY KEY (
	p_no
);

ALTER TABLE autopay ADD CONSTRAINT PK_AUTOPAY PRIMARY KEY (
	a_no
);


select * from member;
select * from qna;


외래키 설정
ALTER TABLE 테이블명  ADD CONSTRAINTS 외래키 이름 FOREIGN KEY (참조컬럼)   REFERENCES 참조 테이블명(참조컬럼)

ALTER TABLE USERS ADD CONSTRAINT FK_USERS FOREIGN KEY(USERNO) REFERENCES USERS_INFO(USERNO);


qna 오래키
ALTER TABLE qna ADD CONSTRAINT FK_QNA FOREIGN KEY(q_writer) REFERENCES member(m_email);




