package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String Start()
	{
		return "index";
		
	}
	@RequestMapping("registerpage")
	public String register()
	{
		return "register";
		
	}

}
