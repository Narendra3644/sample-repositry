package com.slokam.exam.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.pojo.TopicPojo;

@Repository
public interface TopicDao extends JpaRepository<TopicPojo ,Integer>{
 
	@Query("from TopicPojo where isDeleted is null or isDeleted=false")
	public List<TopicPojo> getAll();
	@Query("from TopicPojo where (isDeleted is null or isDeleted=false) and id=?1")
	public List<TopicPojo> getTopic(Integer id);
	
	
}
