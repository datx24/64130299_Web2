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

import thiGK.ntu64130299.model.Post;
import thiGK.ntu64130299.service.PostService;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/post/all")
    public String getAllPosts(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "post/all";
    }

    @GetMapping("/post/new")
    public String showAddNewPostForm(ModelMap model) {
        model.addAttribute("post", new Post("", "", "", 0));
        return "post/new";
    }

    @PostMapping("/post/new")
    public String addNewPost(ModelMap model,
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

        return "post/all";
    }

    @GetMapping("/post/view")
    public String viewPost(@RequestParam("id") String id, Model model) {
        Post post = postService.getPostById(id);
        if (post == null) {
            model.addAttribute("error", "Không tìm thấy bài viết!");
            return "redirect:/post/all";
        }
        model.addAttribute("post", post);
        return "post/view";
    }

    @GetMapping("/post/delete")
    public String deletePost(@RequestParam("id") String id, RedirectAttributes redirectAttributes) {
        boolean isDeleted = postService.deletePost(id);

        if (isDeleted) {
            redirectAttributes.addFlashAttribute("success", "Xóa bài viết thành công!");
        } else {
            redirectAttributes.addFlashAttribute("error", "Xóa bài viết thất bại!");
        }

        return "post/all";
    }
}
