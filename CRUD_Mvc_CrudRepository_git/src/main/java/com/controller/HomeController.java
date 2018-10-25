package com.controller;

import org.jboss.logging.LoggingClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Login;
import com.model.Role;
import com.model.User;
import com.serviceI.ServiceI;

@Controller
public class HomeController {
	
	@Autowired
	ServiceI service;
	
	
	@RequestMapping("/")
	public String Start()
	{
		
		return "login";
		
	}
	@RequestMapping("/registerpage")
	public String register()
	{
		return "register";
		
	}
	
	@RequestMapping("/register")
	public String saveUser(@ModelAttribute User user,@ModelAttribute Login login,@ModelAttribute Role role,Model model){
		
		user.setLogin(login);
		user.setRole(role);
		
		int i=service.saveUser(user);
		if(i==0){
			model.addAttribute("msg", "Registration Failed");
			return "login";
		}else{
			
			model.addAttribute("msg", "Registration Successfull");
		return "login";
		}
	}
	
	@RequestMapping("/Login")
	public String login(@ModelAttribute Login login,Model model) {
		
		User user=service.getSingleUser(login);
		
		switch (user.getRole().getRoleid()) {
		case 1:
			
			return "adminSuccess";
		case 2:
			
			return "managerSuccess";
		case 3:
			
			return "userSuccess";

		default:
			model.addAttribute("msg", "Enter Valid Credentials");
			return "login";
		}
		
		
		
	}
	
	

}
