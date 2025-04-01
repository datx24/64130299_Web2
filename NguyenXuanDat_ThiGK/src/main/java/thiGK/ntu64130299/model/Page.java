package thiGK.ntu64130299.model;

public class Page {
	private String id;
	private String pageName;
	private String keyWord;
	private String content;
	private int parentPageId;
	public Page(String id, String pageName, String keyWord, String content, int parentPageId) {
		super();
		this.id = id;
		this.pageName = pageName;
		this.keyWord = keyWord;
		this.content = content;
		this.parentPageId = parentPageId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getParentPageId() {
		return parentPageId;
	}
	public void setParentPageId(int parentPageId) {
		this.parentPageId = parentPageId;
	}
}
