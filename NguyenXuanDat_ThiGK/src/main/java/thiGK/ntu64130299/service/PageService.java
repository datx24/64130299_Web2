package thiGK.ntu64130299.service;

import org.springframework.stereotype.Service;
import thiGK.ntu64130299.model.Page;

import java.util.ArrayList;
import java.util.List;

@Service
public class PageService {
    private List<Page> pages = new ArrayList<>();

    public PageService() {
        pages.add(new Page("1", "Home", 0));
        pages.add(new Page("2", "About", 0));
        pages.add(new Page("3", "Contact", 0));
    }

    public List<Page> getAllPages() {
        return pages;
    }

    public Page getPageById(String id) {
        return pages.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean addNewPage(Page page) {
        if (getPageById(page.getId()) == null) {
            return pages.add(page);
        }
        return false; // Không thêm nếu ID đã tồn tại
    }

    public boolean deletePage(String id) {
        return pages.removeIf(p -> p.getId().equals(id));
    }
}
