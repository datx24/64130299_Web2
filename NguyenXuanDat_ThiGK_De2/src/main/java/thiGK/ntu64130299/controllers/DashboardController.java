package thiGK.ntu64130299.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DashboardController {
	@RequestMapping("/")
	public String home() {
		return "page/index";
	}
}