package com.slokam.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.exam.iservice.IUserService;
import com.slokam.exam.pojo.UserDetailsImpl;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(method=RequestMethod.POST)
	public void saveUser(@RequestBody UserDetailsImpl userDetails){
	
		userDetails.setAccountNonExpired(true);
		userDetails.setAccountNonLocked(true);
		userDetails.setCredentialsNonExpired(true);
		userDetails.setEnabled(true);
		
		userService.saveUser(userDetails);
	}
	
}
