package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/")
	public String Start()
	{
		System.out.println("This Will go to the Login PAGE");
		return "index";
		
	}    
	@RequestMapping("registerpage")
	public String register()
	{
		System.out.println("This will go to register PAge");
		return "register";
		
	}

}
