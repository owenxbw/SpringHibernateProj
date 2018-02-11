package io.Leo.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService service;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return service.getAllList(); 
	}
}
