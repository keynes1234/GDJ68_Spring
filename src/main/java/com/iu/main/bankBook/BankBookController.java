package com.iu.main.bankBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bankbook/*")
public class BankBookController {

	@Autowired 
	private BankBookService bankBookService;

	@RequestMapping(value="/list", method = RequestMethod.GET)
	public String getList()throws Exception{
		System.out.println("list");
		
		return "bankbook/list";
	}
	
	@RequestMapping(value="/detail")
	public String getDetail(BankBookDTO bankBookDTO) throws Exception{
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		System.out.println(bankBookDTO.getBookNum());
		System.out.println(bankBookDTO.getBookName());
		return "bankbook/detail";
	}
	
	
	


}
