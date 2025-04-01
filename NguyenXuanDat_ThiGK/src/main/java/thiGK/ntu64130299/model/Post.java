package thiGK.ntu64130299.model;

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
