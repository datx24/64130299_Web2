package thiGK.ntu64130299.service;

import org.springframework.stereotype.Service;
import thiGK.ntu64130299.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public PostService() {
        // Hard-code dữ liệu mẫu
        posts.add(new Post("1", "Introduction to Java", "Java is a popular programming language.", 1));
        posts.add(new Post("2", "Spring Boot Basics", "Learn how to use Spring Boot.", 2));
        posts.add(new Post("3", "REST API Design", "Best practices for designing RESTful APIs.", 3));
        posts.add(new Post("4", "Database Optimization", "Improve your SQL queries.", 4));
        posts.add(new Post("5", "Microservices Architecture", "An overview of microservices.", 5));
    }

    // Lấy tất cả bài viết
    public List<Post> getAllPosts() {
        return posts;
    }

    // Thêm bài viết mới
    public boolean addNewPost(Post post) {
        return posts.add(post);
    }
}
