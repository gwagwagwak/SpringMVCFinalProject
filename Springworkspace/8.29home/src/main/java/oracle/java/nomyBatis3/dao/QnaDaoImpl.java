package oracle.java.nomyBatis3.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oracle.java.nomyBatis3.model.QnaVO;

@Repository
public class QnaDaoImpl implements QnaDao {

	@Autowired
	private SqlSession session;

	@Override
	public QnaVO getQna(int id) {
		return session.selectOne("getQna");
	}

	
	@Override
	public void insertQna(QnaVO qvo) {
		session.insert("qna.insertQna", qvo);
	}
	

	@Override
	public void updateQna(QnaVO qvo) throws Exception {
		session.update("updateQna");
	}

	@Override
	public void deleteQna(QnaVO qvo) throws Exception {
		session.delete("deleteQna");

	}

	@Override
	public int getTotalQnaCount() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("qna.getTotalQnaCount");
	}

	@Override
	public int getIncompleteQnaCount() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("getIncompleteQnaCount");
	}

	@Override
	public int getCompleteQnaCount() throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne("getCompleteQnaCount");
	}

	@Override
	public List<QnaVO> getQnaList(int start, int end) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList("qna.getQnaList");
	}

	@Override
	public List<QnaVO> getQnaIncompleteList(int start, int end) throws Exception {

		return session.selectList("qna.getQnaIncompleteList");
	}

	@Override
	public List<QnaVO> getQnaCompleteList(int start, int end) throws Exception {
		return session.selectList("qna.getQnaCompleteList");
	}

	@Override
	public void increaseViewCnt(int q_id) throws Exception {

	}
}
