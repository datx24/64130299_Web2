package edu.datnx.TongHopGK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import edu.datnx.TongHopGK.services.StudentService;

@Controller
public class HomeController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String home() {
		for(var item : studentService.getAllStudents()) {
			System.out.println(item.toString());
		}
		return "pages/home";
	}
	
	@GetMapping("/about")
	public String about() {
		return "pages/about";
	}
	
	@GetMapping("/addnew")
	public String addNew() {
		return "pages/addNew";
	}
	
	@GetMapping("/studentlist")
	public String studentlist(ModelMap m) {
		m.addAttribute("students", studentService.getAllStudents());
		return "pages/studentlist";
	}
}
