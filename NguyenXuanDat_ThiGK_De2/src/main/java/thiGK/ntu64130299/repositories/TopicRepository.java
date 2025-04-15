package thiGK.ntu64130299.repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import thiGK.ntu64130299.models.Topic;

@Repository
public class TopicRepository {
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("1", "Chương trình đào tạo", "a_123", "Học tập"),
            new Topic("2", "Lập trình Java", "b_456", "Công nghệ thông tin"),
            new Topic("3", "Cấu trúc dữ liệu", "c_789", "Học tập"),
            new Topic("4", "Lập trình Web", "d_101", "Công nghệ thông tin"),
            new Topic("5", "Kỹ thuật lập trình", "e_112", "Học tập"),
            new Topic("6", "Cơ sở dữ liệu", "f_131", "Công nghệ thông tin"),
            new Topic("7", "Hệ điều hành", "g_415", "Khoa học máy tính"),
            new Topic("8", "An toàn thông tin", "h_161", "Công nghệ thông tin"),
            new Topic("9", "Xử lý ảnh", "i_718", "Khoa học máy tính"),
            new Topic("10", "Khoa học máy tính nâng cao", "j_192", "Khoa học máy tính")
    ));
	
	public List<Topic> findAll(){
		return topics;
	}
	
	//phương thức tìm id topic
	public Topic findById(String id) {
		for(Topic t: topics) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}
	
	//phương thức thêm topic
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	//phương thức xóa topic
	public void deleteTopicById(String id) {
		for(int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
				break;
			}
		}
	}
}
