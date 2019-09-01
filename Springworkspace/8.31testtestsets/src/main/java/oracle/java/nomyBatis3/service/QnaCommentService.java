package oracle.java.nomyBatis3.service;

import java.util.List;

import oracle.java.nomyBatis3.model.QnaCommentVO;
import oracle.java.nomyBatis3.model.QnaVO;

public interface QnaCommentService {
	public int getcount(int q_no) throws Exception;

	public List<QnaCommentVO> getCommentList(int q_no, int start, int end) throws Exception;

	public QnaVO getQna(int q_no) throws Exception;

	public void insertComment(QnaVO qvo) throws Exception;

	public void updateComment(QnaVO qvo) throws Exception;

	public void deleteComment(QnaVO qvo) throws Exception;

}
