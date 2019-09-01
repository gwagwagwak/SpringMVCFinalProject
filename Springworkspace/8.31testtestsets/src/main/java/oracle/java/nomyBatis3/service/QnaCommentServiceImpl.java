package oracle.java.nomyBatis3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oracle.java.nomyBatis3.dao.AutoPayDao;
import oracle.java.nomyBatis3.dao.CardDao;
import oracle.java.nomyBatis3.dao.MemberDao;
import oracle.java.nomyBatis3.dao.QnaCommentDao;
import oracle.java.nomyBatis3.dao.QnaDao;
import oracle.java.nomyBatis3.dao.QnaMainDao;
import oracle.java.nomyBatis3.model.QnaCommentVO;
import oracle.java.nomyBatis3.model.QnaVO;
@Service
public class QnaCommentServiceImpl implements QnaCommentService{
	@Autowired
	private MemberDao mdao;
	@Autowired
	private AutoPayDao adao;
	@Autowired
	private CardDao cdao;
	@Autowired
	private QnaCommentDao qcdao;
	@Autowired
	private QnaDao qdao;
	@Autowired
	private QnaMainDao qmdao;
	
	
	@Override
	public int getcount(int q_no) throws Exception {
		return qcdao.getcount(q_no);
	}
	
	@Override
	public List<QnaCommentVO> getCommentList(int q_no, int start, int end) throws Exception {
		return qcdao.getCommentList(q_no, start, end);
	}
	
	@Override
	public QnaVO getQna(int q_no) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
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


}
