package thiGK.ntu64130299.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu64130299.model.Page;

@Controller
public class DashBoardController {
	@GetMapping("/")
    public String showDashboard() {
        return "page/all";
    }
	
	 @GetMapping("/page/all")
	    public String getAllPages(Model model) {
	        List<Page> pages = Page.getSamplePages();
	        model.addAttribute("pages", pages); 
	        return "page/all";
	    }
	
}
