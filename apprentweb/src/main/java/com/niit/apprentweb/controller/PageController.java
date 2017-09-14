package com.niit.apprentweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{

	@RequestMapping(value = {"/"})   
	public ModelAndView index()
	{ 
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring web MVC");
		return mv;  	
	}
	
}