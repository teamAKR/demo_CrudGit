package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;
import com.serviceI.ServiceI;

@Controller
public class HomeController {
	@Autowired
	ServiceI service;
	
	
	
	public ServiceI getService() {
		return service;
	}
	public void setService(ServiceI service) {
		this.service = service;
	}
	@RequestMapping("/")
	public String Start()
	{
		System.out.println("This Will go to the Login PAGE");
		return "index";
		
	}      
	@RequestMapping("/registerpage")
	public String register()
	{
		System.out.println("This will go to register PAge");
		return "register";
		
	}
	
	public String login(@ ModelAttribute Student student)
	{
		return "Success";
		
	}
	

}
