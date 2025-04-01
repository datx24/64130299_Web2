package thiGK.ntu64130299.model;

import java.util.Arrays;
import java.util.List;

public class Post {
	private String id;
	private String title;
	private String content;
	private int categoryId;
	public Post(String id, String title, String content, int categoryId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.categoryId = categoryId;
	}
	
	public static List<Post> getSamplePosts() {
        return Arrays.asList(
            new Post("1", "Introduction to Java", "Java is a popular programming language.", 1),
            new Post("2", "Spring Boot Basics", "Learn how to use Spring Boot.", 2),
            new Post("3", "REST API Design", "Best practices for designing RESTful APIs.", 3),
            new Post("4", "Database Optimization", "Improve your SQL queries.", 4),
            new Post("5", "Microservices Architecture", "An overview of microservices.", 5),
            new Post("6", "Docker for Developers", "Using Docker in your development workflow.", 6),
            new Post("7", "Cloud Computing", "Introduction to cloud services.", 7),
            new Post("8", "Cybersecurity Basics", "Protecting your applications.", 8),
            new Post("9", "AI and Machine Learning", "Fundamentals of AI and ML.", 9),
            new Post("10", "DevOps Best Practices", "Automating your CI/CD pipelines.", 10)
        );
    }

    public static void main(String[] args) {
        List<Post> posts = getSamplePosts();
        for (Post post : posts) {
            System.out.println("ID: " + post.getId() + ", Title: " + post.getTitle());
        }
    }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
}
