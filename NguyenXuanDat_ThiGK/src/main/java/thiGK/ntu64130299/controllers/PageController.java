package thiGK.ntu64130299.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import thiGK.ntu64130299.model.Page;
import thiGK.ntu64130299.service.PageService;

@Controller
public class PageController {
    @Autowired
    private PageService pageService;

    @GetMapping("/page/all")
    public String getAllPages(Model model) {
        List<Page> pages = pageService.getAllPages();
        model.addAttribute("pages", pages);
        return "page/all";
    }

    @GetMapping("/page/new")
    public String showAddNewPageForm(ModelMap model) {
        model.addAttribute("page", new Page());
        return "page/new";
    }

    @PostMapping("/page/addNew")
    public String addNewPage(ModelMap model,
                             @RequestParam("id") String id,
                             @RequestParam("pageName") String pageName,
                             @RequestParam("parentPageId") int parentPageId,
                             RedirectAttributes redirectAttributes) {

        boolean isSuccess = pageService.addNewPage(new Page(id, pageName, parentPageId));

        if (isSuccess) {
            redirectAttributes.addFlashAttribute("success", "Thêm trang thành công!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Thêm trang thất bại!");
        }

        return "page/all";
    }

    @GetMapping("/page/view")
    public String viewPage(@RequestParam("id") String id, Model model) {
        Page page = pageService.getPageById(id);
        if (page == null) {
            model.addAttribute("error", "Không tìm thấy trang!");
            return "redirect:/page/all";
        }
        model.addAttribute("page", page);
        return "page/view";
    }

    @GetMapping("/page/delete")
    public String deletePage(@RequestParam("id") String id, RedirectAttributes redirectAttributes) {
        boolean isDeleted = pageService.deletePage(id);

        if (isDeleted) {
            redirectAttributes.addFlashAttribute("success", "Xóa trang thành công!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Xóa trang thất bại!");
        }

        return "page/all";
    }
}
