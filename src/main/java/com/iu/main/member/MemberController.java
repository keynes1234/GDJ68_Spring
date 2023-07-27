package com.iu.main.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "join")
	public void setJoin() { }
	
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String setJoin(MemberDTO memberDTO, MultipartFile pic, HttpSession session)throws Exception {
		memberService.setJoin(memberDTO,pic, session);
		System.out.println(pic.getName());
		System.out.println(pic.getOriginalFilename());
		System.out.println(pic.getSize());
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "login")
	public void getLogin() throws Exception { }
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String getLogin(MemberDTO memberDTO, HttpSession session) {
		memberDTO = memberService.getLogin(memberDTO);
		if(memberDTO != null) {
			session.setAttribute("member", memberDTO);
		}
		
		return "redirect:..";
	}
	
	@RequestMapping(value = "logout")
	public String getLogout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "mypage")
	public void getMyPage(HttpSession session) { }
	
	@RequestMapping(value = "memberUpdate")
	public void setMemberUpdate(HttpSession session) { }
	
	@RequestMapping(value = "memberUpdate", method = RequestMethod.POST)
	public String setMemberUpdate(MemberDTO memberDTO, HttpSession session) {
		memberDTO.setId(((MemberDTO)session.getAttribute("member")).getId());
		int result = memberService.setMemberUpdate(memberDTO);
		
		if(result > 0) {
			session.setAttribute("member", memberDTO);
		}
		
		return "redirect:./mypage";
	}
}