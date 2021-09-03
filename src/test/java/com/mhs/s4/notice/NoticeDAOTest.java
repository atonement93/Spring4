package com.mhs.s4.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mhs.s4.MyJunitTest;

public class NoticeDAOTest extends MyJunitTest{
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getListTest() {
		List<NoticeDTO> ar = noticeDAO.getList();
		assertNotEquals(0, ar.size());
	}

}
