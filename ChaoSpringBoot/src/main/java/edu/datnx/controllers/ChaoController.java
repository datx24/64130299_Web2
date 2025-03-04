package edu.datnx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ChaoController {
	@RequestMapping("/hello")
	public String xinChao(ModelMap m) {
		//Gói dữ liệu sang view
		m.addAttribute("tb", "Dữ liệu thông báo! Xin Chào SpringBoot");
		return "index";
	}
}
