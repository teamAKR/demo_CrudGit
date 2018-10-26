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


	@RequestMapping("/edit")
	public String edit(@RequestParam int id,Model model)
	{
		System.out.println("This Is In the Edit ");
		Student stud=service.edit(id);
		model.addAttribute("data", stud);
		return "Update";
	}
	
	
	@RequestMapping("/update")
	public String update(@ModelAttribute Student st,Model model)
	{
		Student s=service.update(st);
		List<Student> sl=service.getAllData();
		model.addAttribute("data",sl);
		return "Success" ;
		
	}
	


	@RequestMapping("/del")
	  public String delete(@RequestParam int id,@ModelAttribute  Student st,Model model)
	  {
		System.out.println("In delete....");
		service.deleteStudent(id);
		List<Student> list=service.getAllData();
		System.out.println("annnu");
		
		model.addAttribute("msg", "Record Deleted");
		model.addAttribute("data", list);
		
		return "Success";
		
		
	  }

}
