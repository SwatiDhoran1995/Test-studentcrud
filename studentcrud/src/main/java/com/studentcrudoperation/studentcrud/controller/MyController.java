package com.studentcrudoperation.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.studentcrudoperation.studentcrud.domain.StudentDomain;
import com.studentcrudoperation.studentcrud.service.StudentService;

@Controller
public class MyController{
	
	@Autowired
	private StudentService serv;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<StudentDomain> list=serv.listAll();
		model.addAttribute("list",list);
		System.out.println("Get /");
		return "index";
	}
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("student",new StudentDomain());
		return "new.html";
	}
	@RequestMapping(value="/save",method= RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student")StudentDomain std) {
		serv.save(std);
		return "redirect/";		
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable(name="id") int id) {
		ModelAndView mav=new ModelAndView("new");
		StudentDomain std=serv.get(id);
		mav.addObject("student", std);
		return mav;
	}
	
	public String deletestudent(@PathVariable(name="id") int id) {
		serv.delete(id);
		return "redirect:/";
	}

}
