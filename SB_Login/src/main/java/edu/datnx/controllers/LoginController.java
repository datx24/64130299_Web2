package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.datnx.models.User;
import edu.datnx.services.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	private final UserService userService;
	
	public LoginController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public String showLoginForm() {
		return "login";
	}
	
	@PostMapping
	public String processLogin
	(@RequestParam String id,
	 @RequestParam String password, 
	 Model m) {
		User user = userService.authenticate(id, password);
		if(user != null) {
			m.addAttribute("user",id);
			return "home"; //Chuyển đến trang home nếu thành công
		}
		m.addAttribute("message","Sai id hoặc mật khẩu !");
			return "login"; // Quay lai login nếu sai
	}
}
