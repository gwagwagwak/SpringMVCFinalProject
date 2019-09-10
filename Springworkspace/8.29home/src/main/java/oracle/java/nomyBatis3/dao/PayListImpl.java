package oracle.java.nomyBatis3.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.java.nomyBatis3.model.PayListVO;

@Repository
public class PayListImpl implements PayListDao{
	@Autowired
	private SqlSession session;

	@Override
	public List<PayListVO> getPayList(String p_username,int start,int end) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		map.put("p_username", p_username);
		map.put("end", end);

		map.put("start", start);
		
		System.out.println("qnadao접근 성공"+"시작값은 : " +map.get("start") +"끝값은: " +map.get("end") );
		return session.selectList("paylist.getPayList",map);
	}
	@Override
	public List<PayListVO> getPayList1(String p_username) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("getPaylist1 dao접근 성공 + p_username = " +p_username);
		return session.selectList("paylist.getPayList1",p_username);
	}

	@Override
	public void insertPayList(PayListVO paylist) throws Exception {
		session.insert("paylist.insertPayList", paylist);
		
	}
	@Override
	public List<PayListVO> getAPayList(PayListVO pl) throws Exception{
		return session.selectList("paylist.getAPayList",pl.getp_username());
	}
	
	@Override
	public List<PayListVO> getTPayList(String p_target,String p_username,int start,int end) throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("p_target", p_target);
		map.put("p_username", p_username);
		map.put("end", end);

		map.put("start", start);
		System.out.println("qnadao접근 성공"+"시작값은 : " +map.get("start") +"끝값은: " +map.get("end") );

		return session.selectList("paylist.getTPayList",map);
	}
	@Override
	public int payListCnt() throws Exception{
		return session.selectOne("paylist.payListCnt");
		
	}
	@Override
	public int TpayListCnt(String p_target,String p_username) throws Exception{
		Map<String, Object> map = new HashMap<>();
		map.put("p_target", p_target);
		map.put("p_username", p_username);
		return session.selectOne("paylist.TpayListCnt",p_target);
		
	}
}
