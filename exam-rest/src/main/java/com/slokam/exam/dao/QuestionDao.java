package com.slokam.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.exam.pojo.QuestionPojo;
@Repository
public interface QuestionDao extends JpaRepository<QuestionPojo, Integer>{
  
}
