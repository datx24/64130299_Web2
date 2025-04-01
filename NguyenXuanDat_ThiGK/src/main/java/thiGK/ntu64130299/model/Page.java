package thiGK.ntu64130299.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Page {
	private String id;
	private String pageName;
	private String keyWord;
	private String content;
	private int parentPageId;
	
	private static List<Page> pages = new ArrayList<>();
	
	 // Default constructor
    public Page() {}
	
	public Page(String id, String pageName, int parentPageId) {
		this.id = id;
		this.pageName = pageName;
		this.parentPageId = parentPageId;
	}

	public static List<Page> getSamplePages() {
        List<Page> pages = new ArrayList<Page>();
        pages.add(new Page("1", "Home", 0));
        pages.add(new Page("2", "About", 0));
        pages.add(new Page("3", "Contact", 0));
        return pages;
    }

    public static void main(String[] args) {
        List<Page> pages = getSamplePages();
        for (Page page : pages) {
            System.out.println("ID: " + page.getId() + ", Name: " + page.getPageName());
        }
    }
    
    // Method to add a new page
    public static boolean addNewPage(Page page) {
        return pages.add(page);
    }

    // Method to get all pages
    public static List<Page> getAllPages() {
        return pages;
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
