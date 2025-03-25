package edu.datnx.TongHopGK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import edu.datnx.TongHopGK.models.Student;
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
	@PostMapping("/addnewdb")
	public String addNewDb(
			ModelMap m,
	        @RequestParam("fullName") String fullName,
	        @RequestParam("mssv") String mssv,
	        @RequestParam("averageGrade") double averageGrade) {
	    boolean isSucess = studentService.addNewStudent(new Student(mssv, fullName, averageGrade));
	    if(isSucess) {
	    	m.addAttribute("success", "Thêm thành công");
	    }else {
	    	m.addAttribute("success", "Thêm thất bại");
	    }
	    m.addAttribute("students", studentService.getAllStudents());
	    return "pages/studentlist"; 
	}

	@GetMapping("/studentlist")
	public String studentlist(ModelMap m) {
		m.addAttribute("students", studentService.getAllStudents());
		return "pages/studentlist";
	}
}
