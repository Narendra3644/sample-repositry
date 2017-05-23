package com.slokam.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.iservice.IAuthoritiesService;
import com.slokam.exam.pojo.Authority;

@RestController
@RequestMapping("authority")
public class AuthoritiesController {

	 @Autowired
	 private IAuthoritiesService authorityServices;
	 
	 @RequestMapping(value="all",method=RequestMethod.GET)
	 public List<Authority> getAuthorities(){
		 return authorityServices.getAuthorities();
	 }
	 
	
}
