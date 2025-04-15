package thiGK.ntu64130299.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu64130299.models.Topic;
import thiGK.ntu64130299.services.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/all")
	public String getAllTopics(Model m) {
		m.addAttribute("topics", topicService.findAll());
		return "page/topic/list";
	}
	
	@GetMapping("/new")
	public String addNewTopic(Model m) {
		m.addAttribute("topic", new Topic());
		return "page/topic/addNew";
	}
	
	@PostMapping("/save")
	public String saveTopic(
			@RequestParam("id") String id,
			@RequestParam("topicName") String topicName,
			@RequestParam("supervisorId") String supervisorId,
			@RequestParam("topicType") String topicType) {
		Topic topic = new Topic(id, topicName, supervisorId, topicType);
		topicService.addTopic(topic);
		return "redirect:/topic/all";
	}
	
	@GetMapping("/delete")
	public String deleteTopic(@RequestParam("id") String id) {
		topicService.deleteTopicById(id);
		return "redirect:/topic/all";
	}
	
	@GetMapping("/view")
	public String viewTopic(@RequestParam("id") String id, Model m) {
		m.addAttribute("topic", topicService.findById(id));
		return "page/topic/view";
	}
}
