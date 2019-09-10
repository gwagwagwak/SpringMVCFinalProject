package oracle.java.nomyBatis3.service;

import java.util.List;

import oracle.java.nomyBatis3.model.CardVO;

public interface CardService {

	// ī�� ���� �ϳ� ��������
	public CardVO getCard(int c_number) throws Exception;

	public CardVO getLatestCard();
	// ȸ�� ī�� ���� ��������
	public List<CardVO> getCardList() throws Exception;

	// ī�� ���
	public void registCard(CardVO card) throws Exception;

	// ī�� ����
	public void deleteCard(int c_number) throws Exception;

}