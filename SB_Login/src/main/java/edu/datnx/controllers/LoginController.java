package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping
	public String showLoginForm() {
		return "login";
	}
	
	@PostMapping
	public String processLogin
	(@RequestParam String id,
	 @RequestParam String password, 
	 Model m) {
		if("64130299".equals(id) && "Datnx123@".equals(password)) {
			m.addAttribute("user",id);
			return "home"; //Chuyển đến trang home nếu thành công
		}
		m.addAttribute("message","Sai id hoặc mật khẩu !");
			return "login"; // Quay lai login nếu sai
	}
}
