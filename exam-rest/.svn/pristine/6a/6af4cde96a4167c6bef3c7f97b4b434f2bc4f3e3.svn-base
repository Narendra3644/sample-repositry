package com.slokam.exam.service;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.dao.QuestionDao;
import com.slokam.exam.iservice.IQuestionService;
import com.slokam.exam.pojo.QuestionPojo;
@Service
public class QuestionService implements IQuestionService{

	@Autowired
	private QuestionDao Questiondao;
	
	@Override
	public void saveorupdateQuestion(QuestionPojo question) {
		Questiondao.save(question);
	}

	@Override
	public void deleteQuestion(Integer id) {
		Questiondao.delete(id);
	}

	@Override
	public QuestionPojo getQuestion(Integer id) {
		return Questiondao.findOne(id);
	}

	@Override
	public List<QuestionPojo> getAllQuestions() {
		return Questiondao.findAll();
	}

	
}
