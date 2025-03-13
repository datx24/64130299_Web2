package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bmi")
public class BMIController {
	
	@GetMapping("/home")
	public String showForm() {
		return "bmi";
	}
}
