package edu.datnx.ChaoSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChaoController {
	@RequestMapping("/hello")
	public String xinChao() {
		return "index";
	}
}
