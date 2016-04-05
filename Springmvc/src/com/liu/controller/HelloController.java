package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/hello.do")
	public String hello(String  userName,Model model )
	{
		
		System.out.println("");
		model.addAttribute("helloworld", "Hello:"+ userName);
		
		return "index";
	}

	
}
