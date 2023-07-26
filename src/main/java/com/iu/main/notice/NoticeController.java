package com.iu.main.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.main.bankBook.BankBookDTO;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
   
   @Autowired
   private NoticeService noticeService;
     
   @RequestMapping(value="list")
   public String getNoList(Model model)throws Exception{
      List<NoticeDTO> ar = noticeService.getList();
      model.addAttribute("list", ar);
      return "board/list";
  	}   
    
   @RequestMapping(value ="detail")
   ModelAndView getDetail(NoticeDTO noticeDTO, ModelAndView mv)throws Exception{
 		
 		
 		noticeDTO = noticeService.getDetail(noticeDTO);
 		System.out.println(noticeDTO.getNoticeNo());
 		mv.addObject("dto", noticeDTO);
 		mv.setViewName("/board/detail");
 		return mv;
   }
  
   @RequestMapping(value="add", method = RequestMethod.GET)
   public String setAdd()throws Exception{
	   return "board/add";
   }
   
   @RequestMapping(value="add", method = RequestMethod.POST)
   public String setAdd(NoticeDTO noticeDTO)throws Exception{
	   int result = noticeService.setAdd(noticeDTO);
	   return "redirect:./list";
   }
   
   //수정
   @RequestMapping(value = "update", method = RequestMethod.GET)
	public void setUpdate(NoticeDTO noticeDTO, Model model )throws Exception{
		noticeDTO = noticeService.getDetail(noticeDTO);
		model.addAttribute("dto", noticeDTO);
	}
   
   //update
   @RequestMapping(value = "update", method = RequestMethod.POST)
   public String setUpdate(NoticeDTO noticeDTO)throws Exception{
	   int result = noticeService.SetUpdate(noticeDTO);
	   
	   return "redirect:./detail?noticeNo="+noticeDTO.getNoticeNo();
   }
   
   //Delete
   @RequestMapping(value = "delete", method = RequestMethod.GET)
   public String setDelete(@RequestParam(name = "noticeNo") Long num)throws Exception{
	   int result = noticeService.setDelete(num);
	   return "redirect:./list";
   }
}