package thiGK.ntu64130299.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64130299.models.Student;
import thiGK.ntu64130299.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	public StudentService studentService;
	
	@GetMapping("/all")
	public String getAllStudents(Model m) {
		m.addAttribute("students", studentService.findAll());
		return "page/student/list";
	}
	
	@GetMapping("/new")
	public String addNewStudent(Model m) {
		m.addAttribute("student", new Student());
		return "page/student/addNew";
	}
	
	@PostMapping("/save")
	public String saveStudent(
			@RequestParam("id") String id,
			@RequestParam("name") String name,
			@RequestParam("groupId") String groupId) {
		Student student = new Student(id, name, groupId);
		studentService.addStudent(student);
		return "redirect:/student/all";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("id") String id) {
		studentService.deleteStudentById(id);
		return "redirect:/student/all";
	}
	
	@GetMapping("/view")
	public String viewStudent(@RequestParam("id") String id, Model m) {
		m.addAttribute("student", studentService.findStudentById(id));
		return "page/student/view";
	}
}
