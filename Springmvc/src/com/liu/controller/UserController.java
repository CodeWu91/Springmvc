package com.liu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
/**
 * 
 * 控制器
 * 
 * 
 */
public class UserController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("-------访问到了----------");
		
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

}
