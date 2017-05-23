package com.slokam.exam.service;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.slokam.exam.dao.UserDao;
import com.slokam.exam.iservice.IUserService;
import com.slokam.exam.pojo.UserDetailsImpl;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserDao userDao;
	@Autowired
	private JavaMailSender mailSender;  
	
	@Override
	public void saveUser(UserDetailsImpl user) {
		SimpleMailMessage smessage = new SimpleMailMessage();
		smessage.setTo(user.getUsername());
		smessage.setFrom("bhyravreddy123@gmail.com");
		smessage.setSubject("Registration with slokam application");
		smessage.setText("Your password is "+user.getPassword());
		userDao.save(user);
		mailSender.send(smessage);
		
	}
	
}
