package com.iu.main.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

   @Autowired
   private NoticeDAO noticeDAO;
   
   public List<NoticeDTO> getList() throws Exception{
      return noticeDAO.getList();
   }
   
   public NoticeDTO getDetail (NoticeDTO noticeDTO) throws Exception{
	   return noticeDAO.getDetail(noticeDTO);
   }
   
   public int setAdd(NoticeDTO noticeDTO)throws Exception{
	   return noticeDAO.setAdd(noticeDTO);
   }
   
   public int SetUpdate (NoticeDTO noticeDTO)throws Exception{
	   return noticeDAO.setUpdate(noticeDTO);
   }
   
   public int setDelete (Long num)throws Exception{
	   return noticeDAO.setDelete(num);
   }
   
}