package oracle.java.nomyBatis3.dao;

import java.util.List;

import oracle.java.nomyBatis3.model.QnaCommentVO;
import oracle.java.nomyBatis3.model.QnaVO;

public interface QnaCommentDao {
	public int getcount(int q_no) throws Exception;

	
	/*public List<QnaCommentVO> getCommentList(int q_no, int start, int end, HttpSession session) throws Exception; - 로그인 기록 처리*/
	public List<QnaCommentVO> getCommentList(int q_no, int start, int end) throws Exception;

	public QnaVO getQna(int q_no) throws Exception;

	public void insertComment(QnaVO qvo) throws Exception;

	public void updateComment(QnaVO qvo) throws Exception;

	public void deleteComment(QnaVO qvo) throws Exception;

	
}
