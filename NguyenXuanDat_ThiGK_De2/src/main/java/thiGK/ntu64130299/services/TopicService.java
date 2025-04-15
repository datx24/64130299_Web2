package thiGK.ntu64130299.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu64130299.models.Topic;
import thiGK.ntu64130299.repositories.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> findAll() {
		return topicRepository.findAll();
	}
	
	public Topic findById(String id) {
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.addTopic(topic);
	}
	
	public void deleteTopicById(String id) {
		topicRepository.deleteTopicById(id);
	}
}
