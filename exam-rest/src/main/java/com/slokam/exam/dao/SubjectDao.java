package com.slokam.exam.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.exam.pojo.SubjectPojo;

@Repository
public interface SubjectDao extends JpaRepository<SubjectPojo, Integer>{

}
