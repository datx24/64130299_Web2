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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import thiGK.ntu64130299.model.Page;
import thiGK.ntu64130299.model.Post;
import thiGK.ntu64130299.service.PageService;
import thiGK.ntu64130299.service.PostService;

@Controller
public class DashBoardController {
	@Autowired
	private PageService pageService;
	@Autowired
	private PostService postService;
	private List<Page> pages = Page.getSamplePages();

	@GetMapping("/")
	public String showDashboard() {
		return "page/all";
	}

	@GetMapping("/page/all")
	public String getAllPages(Model model) {
		List<Page> pages = pageService.getAllPages();
		model.addAttribute("pages", pages);
		return "page/all";
	}

	@GetMapping("/page/new")
	public String showAddNewPageForm(ModelMap model) {
		model.addAttribute("page", new Page()); // Create a new Page object for the form
		return "page/new"; // Return the form template for adding a new page
	}

	@PostMapping("/page/addNew")
	public String addNewDb(ModelMap model, @RequestParam("id") String id, @RequestParam("pageName") String pageName,
			@RequestParam("parentPageId") int parentPageId) {

		boolean isSuccess = pageService.addNewPage(new Page(id, pageName, parentPageId));

		if (isSuccess) {
			model.addAttribute("success", "Thêm thành công");
		} else {
			model.addAttribute("success", "Thêm thất bại");
		}

		model.addAttribute("pages", pageService.getAllPages());

		return "page/all";
	}
	
	// Hiển thị tất cả bài viết
    @GetMapping("/post/all")
    public String getAllPosts(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "post/all";
    }

    // Hiển thị form thêm bài viết mới
    @GetMapping("/post/new")
    public String showAddNewPostForm(ModelMap model) {
        model.addAttribute("post", new Post("", "", "", 0));
        return "post/new";
    }

    // Xử lý thêm bài viết mới
    @PostMapping("/post/new")
    public String addNewPost(
    		ModelMap model,
            @RequestParam("id") String id,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("categoryId") int categoryId,
            RedirectAttributes redirectAttributes) {

        boolean isSuccess = postService.addNewPost(new Post(id, title, content, categoryId));

        if (isSuccess) {
            redirectAttributes.addFlashAttribute("success", "Thêm bài viết thành công!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Thêm bài viết thất bại!");
        }
        
        model.addAttribute("posts", postService.getAllPosts());

        return "post/all";
    }

}
