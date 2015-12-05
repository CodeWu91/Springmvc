package com.liu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String hello = request.getParameter("hello");
		System.out.print("-----:"+hello);
		ModelAndView mav=  new ModelAndView("index");
		mav.addObject("helloworld", "hello "+ hello);
		return mav;
	}

	
}
