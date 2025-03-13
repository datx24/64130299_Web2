package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bmi")
public class BMIController {
	
	@GetMapping("/home")
	public String showForm() {
		return "bmi";
	}
	
	@PostMapping("/calculate")
	public String calculateBMI(@RequestParam double weight, @RequestParam double height, Model m) {
		double bmi = weight / (height * height);
		String category = getCategory(bmi);
		m.addAttribute("result", String.format("%.2f", bmi));
		m.addAttribute("type",category);
		return "bmi";
	}
	
	public String getCategory(double bmi) {
		if(bmi >= 0 && bmi < 18.5) {
			return "Underweight";
		}
		else if(bmi < 24.9) {
			return "Normal Weight";
		}
		else if(bmi < 29.9) {
			return "Overweight";
		}
		return "Obesity";
	}
}
