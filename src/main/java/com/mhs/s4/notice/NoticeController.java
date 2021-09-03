package com.mhs.s4.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeList")
	public ModelAndView list(ModelAndView mv) {
		List<NoticeDTO> ar = noticeService.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("notice/noticeList");
		
		return mv;
	}
	
//	@RequestMapping("noticeSelect")
//	public void select(NoticeDTO noticeDTO, Model model) {
//		noticeDTO = noticeService.getSelect(noticeDTO);
//	    model.addAttribute("dto", noticeDTO);
//	}

}
