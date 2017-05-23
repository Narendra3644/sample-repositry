package com.slokam.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.exception.ResourceNotFoundException;
import com.slokam.exam.iservice.ITopicServices;
import com.slokam.exam.pojo.TopicPojo;

@RestController
@RequestMapping("topic")
public class TopicController {
  
	@Autowired
	private ITopicServices topicServices;
	
	@RequestMapping(method=RequestMethod.POST)
	public void saveorUpdateTopic(@RequestBody TopicPojo topic){
		topicServices.saveorupdateTopic(topic);
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable Integer id){
		topicServices.deleteTopic(id);
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public TopicPojo getTopic(@PathVariable Integer id) throws ResourceNotFoundException{
		TopicPojo topic = topicServices.getTopic(id);
		if(topic==null)
		{
			throw new ResourceNotFoundException();
		}
		return topic;
	}
	
	@RequestMapping(value="all",method=RequestMethod.GET)
	public List<TopicPojo> getAllTopics(){
		return topicServices.getAllTopics();
	}
	
	
	
}
