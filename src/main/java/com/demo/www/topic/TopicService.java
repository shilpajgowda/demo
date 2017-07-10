package com.demo.www.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring","framework","spring framework description"),
			new Topic("springg","frameworkk","spring framework descriptionn"),
			new Topic("springgg","frameworkkk","spring framework descriptionnn")
			
			
			);
	public List<Topic> getAllTopics(){
		return topics;
	}
}
