package edu.datnx.TongHopGK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "pages/home";
	}
	@GetMapping("/about")
	public String about() {
		return "pages/about";
	}
	@GetMapping("/studentlist")
	public String studentlist() {
		return "pages/studentlist";
	}
}
