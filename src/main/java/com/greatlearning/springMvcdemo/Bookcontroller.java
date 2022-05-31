package com.greatlearning.springMvcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/books")
public class Bookcontroller {
	@Autowired
	private Bookservice bookservice;
	
	@RequestMapping("/addBook")
	
	public String saveBook(@ModelAttribute("book")Book book) 
	{
		System.out.println(book);
		bookservice.save(book);
		return "success";
	}
	
	

}
