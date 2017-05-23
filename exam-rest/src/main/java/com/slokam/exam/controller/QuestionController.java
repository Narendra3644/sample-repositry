package com.slokam.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.dao.FooRepository;
import com.slokam.exam.iservice.IQuestionService;
import com.slokam.exam.pojo.OptionPojo;
import com.slokam.exam.pojo.QuestionPojo;
import com.slokam.exam.pojo.SubjectPojo;

@RestController
@RequestMapping("question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService; 
	@Autowired
	private FooRepository repo;
	
	@RequestMapping(method=RequestMethod.GET )
	public  List<SubjectPojo> getsubjects(){
		return repo.getsubjects();
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void saveorupdateQuestion(@RequestBody QuestionPojo question){
		
			List<OptionPojo> options = question.getOptions();
			
			for (OptionPojo optionPojo : options) {
				optionPojo.setQuestion(question);
			}
			questionService.saveorupdateQuestion(question);
	}
	
	
	
	
	
	
}
