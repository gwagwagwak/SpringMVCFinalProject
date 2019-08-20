package kr.spring.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import kr.spring.member.domain.MemberCommand;
   
//생략가능. mybatise가 알아서 넣음
@Repository("memberMapper")
public interface MemberMapper {
	//너무 길어서 어노테이션으로 안하고 xml로 하기로 함.
	public List<MemberCommand> getMemberList(Map<String,Object> map);
	
	@Select("SELECT count(*) FROM member1")
	public int getMemberCount();
	
	@Insert("INSERT INTO member1 (id,passwd,name,reg_date) VALUES (#{id},#{passwd},#{name},sysdate)")
	public void insertMember(MemberCommand memberCommand);
	
	@Select("SELECT * FROM member1 WHERE id=#{id}")
	public MemberCommand getMember(String id);
	
	@Update("UPDATE member1 SET passwd=#{passwd},name=#{name} WHERE id=#{id}")
	public void updateMember(MemberCommand member);
	
	//delete 어노테이션 쓰려면 MemberMapper.xml에 delete 태그가 있으면 안됨.(주석 처리 하기)
	//MemberMapper.xml에서 delete 쓰려면 여기 @Delete 어노테이션 주석 처리하기.
	@Delete("DELETE FROM member1 WHERE id=#{id}")
	public void deleteMember(String id);
}
