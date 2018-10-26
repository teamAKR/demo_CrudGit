package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
import com.serviceI.ServiceI;

@Controller
public class HomeController
{
	@Autowired
	ServiceI service;
	
	public ServiceI getService() 
	{
		return service;
	}
	public void setService(ServiceI service) 
	{
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
	
	@RequestMapping("/register")
	public String SaveUser(@ModelAttribute Student student)
	{
	Student s= (Student) service.SaveUser(student);
		return "index";
		
	}
	
	@RequestMapping("/login")
	public String login(@ ModelAttribute Student student,Model model)
	{
		model.addAttribute("msg","Login Succesfully");
		
		Student st=service.check(student);
		System.out.println(st);
		List<Student> sl=service.getAllData();
		model.addAttribute("data",sl);
		return "Success";
		
	}
	@RequestMapping("/del")
	  public String delete(@RequestParam int id,@ModelAttribute  Student st,Model model)
	  {
		service.deleteStudent(id);
		List<Student> list=service.getAllData();
		
		model.addAttribute("msg", "Record Deleted");
		model.addAttribute("data", list);
		
		return "Success";
		
		
	  }
}
