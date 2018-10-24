package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Address;
import com.model.Student;
import com.serviceI.ServiceInterface;

@Controller
public class HomeController
{
	@Autowired
	ServiceInterface service;
	
	
	public ServiceInterface getService() {
		return service;
	}


	public void setService(ServiceInterface service) {
		this.service = service;
	}

	@RequestMapping("/")
	public String start()
	{
		return "login";
	}
	@RequestMapping("/registrationpage")
	public String start1()
	{
		return "register";
	}


	@RequestMapping("/register")
	public String saveStudent(@ModelAttribute Student student,@ModelAttribute Address address)
	{
		student.setAddr(address);
		Student s=service.saveStudent(student);
	
		if(s!=null)
		{
			return "login";
		}
		else
		{
			return "register";
		}
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute Student student,Model model)
	{
		List<Student>students=service.login(student);
		if(students==null)
		{
			model.addAttribute("msg","enter valid credentials");
			return "login";
		}
		else {
			model.addAttribute("students",students);
			return "success";
		}
	}
	
	@RequestMapping("/editNew")
	public String edit(@RequestParam int id,Model model)
	{
		Student s=service.getSingleStudent(id);
//		Address a=s.getAddr();
//		model.addAttribute("a",a);
		model.addAttribute("s", s);
		return "edit";
	}

	@RequestMapping("/update")
	public String update(@ModelAttribute Student student,@ModelAttribute Address addr,Model model)
	{
		student.setAddr(addr);
		Student s=service.updateStudent(student);
		List<Student> list=service.getAllStudent();
		model.addAttribute("msg", "Record Updated");
		model.addAttribute("students", list);
		return "success";
	}
	
	@RequestMapping("/delNew")
	public String delete(@RequestParam int id,Model model)
	{
		service.deleteStudent(id);
		List<Student> list=service.getAllStudent();
		model.addAttribute("msg", "Record Deleted");
		model.addAttribute("students", list);
		return "success";
	}
}
