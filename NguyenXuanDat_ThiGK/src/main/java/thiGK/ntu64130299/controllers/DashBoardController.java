package thiGK.ntu64130299.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {
	@GetMapping("/")
    public String showDashboard() {
        return "page/all";
    }
}
