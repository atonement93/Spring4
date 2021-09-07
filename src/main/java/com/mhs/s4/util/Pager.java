package com.mhs.s4.util;

public class Pager {

	private Long pn;
	
	//한페이지에 출력할 글의 갯수 -10개 기본값
	private Long perPage;
	
	//한 페이지에 출력할 pn의 갯수 - 5개 기본값
	private Long perBlock;
	
	//-----------------------RowNUM
	
	private Long startRow;
	private Long lastRow;
	
	//----------------------startNum, lastNum, jsp에서 사용
	private Long startNum;
	private Long lastNum;
	
	
	private Long totalPage;
	
	//-----------------------------검색
	private String kind;
	private String search;
	




	// rownum 계산
	public void makeRow() {
		this.startRow=(this.getPn()-1)*this.getPerPage()+1;
		this.lastRow=this.getPn()*this.getPerPage();
	}
	
	//----------------------startNum, lastNum jsp 번호 출력
	public void makeNum(Long totalCount) {
		//1. totalCount : 전체 글의 갯수
		//2. totalCount로 totalPage 계산 :  전체 페이지 번호
		totalPage = totalCount/this.getPerPage();
		if(totalCount % this.getPerPage() != 0) {
			totalPage++;
		}
		
		//3. totalPage로 totalBlock 계산
		Long totalBlock = totalPage/this.getPerBlock();
		if(totalPage%this.getPerBlock() != 0) {
			totalBlock ++;
		}
		
		//3-1. pn으로 curBlock 구하기

		
		//4. pn으로 현재 블럭 번호 구하기
		Long curBlock=this.getPn()/this.getPerBlock();
		if(this.getPn()%this.getPerBlock() !=0) {
			curBlock++;
		}
		
		//5. curBlock으로 startNum, lastNum 계산
		this.startNum = (curBlock-1)*this.getPerBlock()+1;
		this.lastNum = curBlock*this.getPerBlock();
		
		//6. Curblock이 마지막 block일 때 lastNum을 변경
		if(curBlock == totalBlock) {
			this.lastNum = totalPage;
		}
		
	}
	
	//-----------------------세터 게터





	//1. 파라미터 처리
	public Long getPn() {
		if(this.pn==null || this.pn <1) {
			this.pn=1L;
		}
		return pn;
	}

	public void setPn(Long pn) {
		this.pn = pn;
	}
	
	//2.
	public Long getPerPage() {
		this.perPage=10L;
		
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	

	//3.
	public Long getPerBlock() {
		this.perBlock=5L;
		return perBlock;
	}

	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	
	//
	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}

	public Long getLastRow() {
		return lastRow;
	}

	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	
	//
	public Long getStartNum() {
		return startNum;
	}

	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}

	public Long getLastNum() {
		return lastNum;
	}

	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	
	//
	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	
	//
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSearch() {
		if(this.search == null) {
			this.search="";
		}
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
}
