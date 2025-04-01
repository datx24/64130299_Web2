package thiGK.ntu64130299.service;

import org.springframework.stereotype.Service;
import thiGK.ntu64130299.model.Post;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public PostService() {
        posts.add(new Post("1", "Introduction to Java", "Java is a popular programming language.", 1));
        posts.add(new Post("2", "Spring Boot Basics", "Learn how to use Spring Boot.", 2));
        posts.add(new Post("3", "REST API Design", "Best practices for designing RESTful APIs.", 3));
        posts.add(new Post("4", "Database Optimization", "Improve your SQL queries.", 4));
        posts.add(new Post("5", "Microservices Architecture", "An overview of microservices.", 5));
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    public Post getPostById(String id) {
        return posts.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean addNewPost(Post post) {
        if (getPostById(post.getId()) == null) {
            return posts.add(post);
        }
        return false; // Không thêm nếu ID đã tồn tại
    }

    public boolean deletePost(String id) {
        return posts.removeIf(p -> p.getId().equals(id));
    }
}
