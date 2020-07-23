package com.vipul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	@ResponseBody
	@RequestMapping("/")
	public String hello()
	{
		System.out.println("hii");
		return "Hello Spring";
	}
	

}
