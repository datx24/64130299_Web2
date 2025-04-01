package thiGK.ntu64130299.model;

import java.util.Arrays;
import java.util.List;

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
	
	public static List<Page> getSamplePages() {
        return Arrays.asList(
            new Page("1", "Home", "home, main", "Welcome to Home Page", 0),
            new Page("2", "About", "about, info", "About Us Page Content", 0),
            new Page("3", "Contact", "contact, support", "Contact Us Page", 0),
            new Page("4", "Services", "services, offerings", "Our Services Page", 0),
            new Page("5", "Blog", "blog, articles", "Our Blog Page", 0),
            new Page("6", "FAQ", "faq, questions", "Frequently Asked Questions", 0),
            new Page("7", "Privacy Policy", "privacy, terms", "Privacy Policy Page", 0),
            new Page("8", "Careers", "careers, jobs", "Join our team!", 0),
            new Page("9", "Portfolio", "portfolio, work", "Our Work Showcase", 0),
            new Page("10", "Support", "support, help", "Support and Help Center", 0)
        );
    }

    public static void main(String[] args) {
        List<Page> pages = getSamplePages();
        for (Page page : pages) {
            System.out.println("ID: " + page.getId() + ", Name: " + page.getPageName());
        }
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
