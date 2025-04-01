package thiGK.ntu64130299.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64130299.model.Page;
import thiGK.ntu64130299.service.PageService;

@Controller
public class DashBoardController {
	 @Autowired
	private PageService pageService;
	private List<Page> pages = Page.getSamplePages();
	
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
	
	// Method to show the add page form
    @GetMapping("/page/addNew")
    public String showAddNewPageForm(ModelMap model) {
        model.addAttribute("page", new Page()); // Create a new Page object for the form
        return "page/addNew"; // Return the form template for adding a new page
    }

    @PostMapping("/page/addNew")
    public String addNewDb(
            ModelMap model,
            @RequestParam("id") String id,
            @RequestParam("pageName") String pageName,
            @RequestParam("parentPageId") int parentPageId) {
    	
    	boolean isSuccess = pageService.addNewPage(new Page(id, pageName, parentPageId));

        if (isSuccess) {
            model.addAttribute("success", "Thêm thành công");
        } else {
            model.addAttribute("success", "Thêm thất bại");
        }

        model.addAttribute("pages", pageService.getAllPages());

        return "page/pagelist"; // Return to the page list after adding the page
    }

}
