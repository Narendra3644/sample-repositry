package com.slokam.exam.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.dao.TopicDao;
import com.slokam.exam.iservice.ITopicServices;
import com.slokam.exam.pojo.TopicPojo;

@Service
public class TopicServices implements ITopicServices{

	@Autowired
	private TopicDao topicDao;
	
	@Override
	public void saveorupdateTopic(TopicPojo topic) {
		topicDao.save(topic);
	}

	@Override
	public void deleteTopic(Integer id) {
		TopicPojo topic = topicDao.findOne(id);
		topic.setIsDeleted(true);
		topic.setLastUpdated(new Date());
		topicDao.save(topic);
	}

	@Override
	public TopicPojo getTopic(Integer id) {
		
		List<TopicPojo> topics = topicDao.getTopic(id);
		if(topics.size()>0){
		  return topics.get(0);
		}
		else return null;
		
	}

	@Override
	public List<TopicPojo> getAllTopics() {
		return topicDao.getAll();
	}

}
