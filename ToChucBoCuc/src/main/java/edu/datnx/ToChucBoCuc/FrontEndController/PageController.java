package edu.datnx.ToChucBoCuc.FrontEndController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	@GetMapping("/")
	public String home(ModelMap model) {
		return "pages/index";
	}
	
	@GetMapping("/about")
	public String about(ModelMap model) {
		return "pages/about";
	}
	
	@GetMapping("/contact")
	public String contact(ModelMap model) {
		return "pages/contact";
	}
}
