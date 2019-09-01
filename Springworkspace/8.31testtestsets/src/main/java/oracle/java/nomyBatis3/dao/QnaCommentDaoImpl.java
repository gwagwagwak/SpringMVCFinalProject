package oracle.java.nomyBatis3.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.java.nomyBatis3.model.QnaCommentVO;
import oracle.java.nomyBatis3.model.QnaVO;
@Repository
public class QnaCommentDaoImpl implements QnaCommentDao{
	@Autowired
	private SqlSession session;
	
	@Override
	public List<QnaCommentVO> getCommentList(int q_no, int start, int end) throws Exception {
		
		Map<String, Object> map = new HashMap<>();
		map.put("q_no", q_no);
		map.put("start", start);
		map.put("end", end);
		return session.selectList("qnacomment.getListComment", map);
	}

	@Override
	public int getcount(int q_no) throws Exception {
		 
		return session.selectOne("qnacomment.cout", q_no);
	}

	/*@Override
	public QnaVO getQna(int q_no) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("qnacomment.);
	}
*/
	@Override
	public void insertComment(QnaVO qvo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateComment(QnaVO qvo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(QnaVO qvo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public QnaVO getQna(int q_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
