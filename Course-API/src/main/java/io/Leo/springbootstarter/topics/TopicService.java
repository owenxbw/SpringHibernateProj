package io.Leo.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("2","spring","this is for spring framework"),
			new Topic("4","spring boot","this is spring boot applicaiton"));

	public List<Topic> getAllList() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get());
	}

	
}
