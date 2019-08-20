package kr.spring.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import kr.spring.member.domain.MemberCommand;
   
//��������. mybatise�� �˾Ƽ� ����
@Repository("memberMapper")
public interface MemberMapper {
	//�ʹ� �� ������̼����� ���ϰ� xml�� �ϱ�� ��.
	public List<MemberCommand> getMemberList(Map<String,Object> map);
	
	@Select("SELECT count(*) FROM member1")
	public int getMemberCount();
	
	@Insert("INSERT INTO member1 (id,passwd,name,reg_date) VALUES (#{id},#{passwd},#{name},sysdate)")
	public void insertMember(MemberCommand memberCommand);
	
	@Select("SELECT * FROM member1 WHERE id=#{id}")
	public MemberCommand getMember(String id);
	
	@Update("UPDATE member1 SET passwd=#{passwd},name=#{name} WHERE id=#{id}")
	public void updateMember(MemberCommand member);
	
	//delete ������̼� ������ MemberMapper.xml�� delete �±װ� ������ �ȵ�.(�ּ� ó�� �ϱ�)
	//MemberMapper.xml���� delete ������ ���� @Delete ������̼� �ּ� ó���ϱ�.
	@Delete("DELETE FROM member1 WHERE id=#{id}")
	public void deleteMember(String id);
}
