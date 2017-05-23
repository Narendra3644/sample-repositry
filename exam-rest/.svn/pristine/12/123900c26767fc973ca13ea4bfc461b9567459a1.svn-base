package com.slokam.exam.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.dao.SubjectDao;
import com.slokam.exam.iservice.ISubjectService;
import com.slokam.exam.pojo.SubjectPojo;

@Service
public class SubjectService implements ISubjectService {

	@Autowired
	private SubjectDao subjectDao;

	@Override
	public SubjectPojo getSubject(Integer id) {
		return subjectDao.findOne(id);
	}

	@Override
	public List<SubjectPojo> getAllSubjects() {
		return subjectDao.findAll();
	}

	@Override
	public void deleteSubject(Integer id) {
		SubjectPojo subject = subjectDao.findOne(id);
		subject.setIsDeleted(true);
		subject.setLastUpdated(new Date());
		subjectDao.save(subject);
	}

	@Override
	public void saveorupdateSubject(SubjectPojo subject) {
		subject.setLastUpdated(new Date());
		subject.setIsDeleted(false);
		subjectDao.save(subject);
	}

	
}
