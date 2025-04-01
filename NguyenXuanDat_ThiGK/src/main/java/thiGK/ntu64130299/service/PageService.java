package thiGK.ntu64130299.service;

import org.springframework.stereotype.Service;
import thiGK.ntu64130299.model.Page;

import java.util.ArrayList;
import java.util.List;

@Service
public class PageService {
	// Constructor để thêm dữ liệu mặc định
    public PageService() {
        pages.add(new Page("1", "Home", 0));
        pages.add(new Page("2", "About", 0));
        pages.add(new Page("3", "Contact", 0));
    }

    private List<Page> pages = new ArrayList<>();

    // Fetch all pages
    public List<Page> getAllPages() {
        return pages;
    }

    // Add a new page
    public boolean addNewPage(Page page) {
        return pages.add(page);
    }
}
