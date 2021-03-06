package oracle.java.nomyBatis3.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import oracle.java.nomyBatis3.model.QnaCommentVO;

public interface QnaCommentService {

	
	//댓글 작성
	void create(QnaCommentVO commentvo) throws Exception;
	void admincreate(QnaCommentVO commentvo) throws Exception;
	int count(int q_no);

	//댓글 리스트 가져오기
	List<QnaCommentVO> getCommentList(int q_no, int start, int end, HttpSession httpsession);
	
	//관리자 답변 한 개 가져오기
	QnaCommentVO getAdminReply(int comt_textid);

}
