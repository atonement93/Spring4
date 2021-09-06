package com.mhs.s4.board.notice;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO implements BoardDAO {
	
	//오버라이딩
	@Autowired
	private SqlSession sqlSession;
	private final String NAMASPACE = "com.mhs.s4.board.notice.NoticeDAO.";
	

}
