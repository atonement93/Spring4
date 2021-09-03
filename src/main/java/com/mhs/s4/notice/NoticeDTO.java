package com.mhs.s4.notice;

public class NoticeDTO {
	
	private long Num;
	private String Title;
	private String Contents;
	private String Writer;
	private String Regdate;
	private int Hits;
	
	public long getNum() {
		return Num;
	}
	public void setNum(long num) {
		Num = num;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getContents() {
		return Contents;
	}
	public void setContents(String contents) {
		Contents = contents;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	public String getRegdate() {
		return Regdate;
	}
	public void setRegdate(String regdate) {
		Regdate = regdate;
	}
	public int getHits() {
		return Hits;
	}
	public void setHits(int hits) {
		Hits = hits;
	}
	

}
