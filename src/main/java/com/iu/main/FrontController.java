package com.iu.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	//home
	// /주소가 왔을 때 실행, index.jsp
	
	//BnakBookController
	//Membercontroller, GET
	//주소 .do 삭제
	// /member/login
	
	@RequestMapping(value = "/")
	public String home() throws Exception{
		
		return "index";
	}
	
	@RequestMapping(value = "index.do")
	public String home1() throws Exception{
		
		return "index";
	}
	
	@RequestMapping(value = "bankbook/add.do")
	public String add() throws Exception{
		
		return "/bankbook/add";
	}
	
	@RequestMapping(value="/member/login.do", method = RequestMethod.GET)
	public String getLogin() throws Exception{
		return "member/login";
	}
	
	@RequestMapping(value = "member/join.do")
	public String join() throws Exception{
		
		return "/member/join";
	}
}
