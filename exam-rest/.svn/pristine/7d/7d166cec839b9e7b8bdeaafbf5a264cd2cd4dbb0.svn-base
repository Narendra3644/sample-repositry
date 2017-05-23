package com.slokam.exam.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.iservice.ISubjectService;
import com.slokam.exam.pojo.SubjectPojo;

@RestController
@RequestMapping("subject")
public class SubjectController {
	 @Autowired
     private ISubjectService subjectService;
	 
	 public  final Logger LOGGER = Logger.getLogger(getClass());
	 
	 @RequestMapping( value="{id}", method=RequestMethod.GET)
	 public SubjectPojo getSubject(@PathVariable Integer id){
		 LOGGER.info("entered into getSubject");
		 SubjectPojo subject = subjectService.getSubject(id);
		 LOGGER.info("exit from getSubject");
		 return subject;
	 }
	 
	 @RequestMapping(  method=RequestMethod.POST)
	 public void saveorupdateSubject(@RequestBody SubjectPojo subject){
		 LOGGER.info("entered into saveorupdateSubject");
		 subjectService.saveorupdateSubject(subject);
		 LOGGER.info("exit from saveorupdateSubject");
	 }
	 
	 @RequestMapping( value="all", method=RequestMethod.GET)
	 public List<SubjectPojo> getAllSubjects(){
		 LOGGER.info("entered into getAllSubjects");
		 List<SubjectPojo> subjectList = subjectService.getAllSubjects();
		 LOGGER.info("exit from getAllSubjects");
		 return subjectList;
	 }
	 
	 @RequestMapping( value="{id}", method=RequestMethod.DELETE)
	 public void deleteSubject(@PathVariable Integer id){
		 LOGGER.info("entered into deleteSubject");
		  subjectService.deleteSubject(id);
		 LOGGER.info("exit from deleteSubject");
	 }
	 
	 
	
}
