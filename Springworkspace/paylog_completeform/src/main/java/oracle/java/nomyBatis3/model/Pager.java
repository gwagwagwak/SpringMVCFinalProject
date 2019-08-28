package oracle.java.nomyBatis3.model;

public class Pager {
	//페이지당 게시물 수
	public static final int PAGE_SCALE=10;
	
	public static final int BLOCK_SCALE=10;
	
	private int curPage;	//다음 페이지 블록
	private int prevPage;	//다음 페이지 블록
	private int nextPage;	//다음 페이지 블록
	private int totPage;	//다음 페이지 블록
	private int totBlock;	//다음 페이지 블록
	private int curBlock;	//다음 페이지 블록
	private int prevBlock;	//다음 페이지 블록
	private int nextBlock;	//다음 페이지 블록
	
	private int pageBegin;	//#{start}
	private int pageEnd;	//#{end}
	
	// [이전] blockBegin 42 43 44 45 46 47 48 49 blockEnd [다음]
	private int blockBegin;	//현재 페이지 블록의 시작 번호
	private int blockEnd;	//현재 페이지 블록의 끝번호
	
	
	//페이지 총 레코드 갯수,   현재 페이지 번호
	public Pager(int count, int curPage){
		curBlock = 1;				//현재 페이지 블록번호
		this.curPage = curPage;		//현재 페이지 설정
		setTotPage(count);		//전체 페이지 갯수 계산
		setPageRange();			
		setTotBlock();			//전체 페이지 블록 갯수 계산
		setBlockRange();		//페이지 블록의 시작, 끝 번호 계산
	}
	
	
	public void setBlockRange(){
		curBlock 	= (int)Math.ceil((curPage-1)/BLOCK_SCALE)+1; //현재 페이지가 몇 번째 페이지 블록에 속하는지 계산	
		blockBegin 	= (curBlock-1) * BLOCK_SCALE+1;				//현재 페이지 블록의 시작, 끝 번호 계산
		blockEnd 	= blockBegin + BLOCK_SCALE-1;
		
		if(blockEnd > totPage) blockEnd = totPage;				//마지막 페이지 번호가 블록 범위 초과하지 않도록함
		
		prevPage = (curBlock ==1)? 1: (curBlock-1)*BLOCK_SCALE;	//[이전] 눌럿을 때 이동할 페이지 번호
		nextPage = curBlock>totBlock? (curBlock*BLOCK_SCALE) : curBlock *BLOCK_SCALE;	//[다음]눌럿을 때 이동할 페이지 번호
		
		if(nextPage >= totPage) nextPage = totPage;				//마지막 페이지가 페이지 범위 초과하지 않도록
	}
	
	//페이지 범위
	public void setPageRange(){
		//where rn between #{start} and #{end}에 입력될 값

		//시작번호 = (현재 페이지 -1) * 페이지당 게시물 수 +1;
		pageBegin = (curPage-1) * PAGE_SCALE+1;
		
		//끝 번호= 시작번호 _ 페이지당 게시물 수 -1;
		pageEnd= pageBegin + PAGE_SCALE-1;
				
	}


	public int getCurPage() {
		return curPage;
	}


	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}


	public int getPrevPage() {
		return prevPage;
	}


	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}


	public int getNextPage() {
		return nextPage;
	}


	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}


	public int getTotPage() {
		return totPage;
	}

	//전체 페이지 계산
	public void setTotPage(int count) {
		totPage = (int)Math.ceil(count*1.0 / PAGE_SCALE);
		/*this.totPage = totPage;*/
	}


	public int getTotBlock() {
		return totBlock;
	}

	//페이지 총 블록 갯수 계산(게시물 100개면 블록은 10개) 한페이지에 게시물이 열개나온다는 가정하
	public void setTotBlock() {
		totBlock = (int)Math.ceil(totPage / BLOCK_SCALE);
/*		this.totBlock = totBlock;*/
	}


	public int getCurBlock() {
		return curBlock;
	}


	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}


	public int getPrevBlock() {
		return prevBlock;
	}


	public void setPrevBlock(int prevBlock) {
		this.prevBlock = prevBlock;
	}


	public int getNextBlock() {
		return nextBlock;
	}


	public void setNextBlock(int nextBlock) {
		this.nextBlock = nextBlock;
	}


	public int getPageBegin() {
		return pageBegin;
	}


	public void setPageBegin(int pageBegin) {
		this.pageBegin = pageBegin;
	}


	public int getPageEnd() {
		return pageEnd;
	}


	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}


	public int getBlockBegin() {
		return blockBegin;
	}


	public void setBlockBegin(int blockBegin) {
		this.blockBegin = blockBegin;
	}


	public int getBlockEnd() {
		return blockEnd;
	}


	public void setBlockEnd(int blockEnd) {
		this.blockEnd = blockEnd;
	}


	public static int getPageScale() {
		return PAGE_SCALE;
	}


	public static int getBlockScale() {
		return BLOCK_SCALE;
	}
	

	
	
	
}
