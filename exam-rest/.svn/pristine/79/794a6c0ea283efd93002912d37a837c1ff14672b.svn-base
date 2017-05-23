package com.slokam.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.exam.dao.AuthoritiesDao;
import com.slokam.exam.iservice.IAuthoritiesService;
import com.slokam.exam.pojo.Authority;
@Service
public class AuthoritiesService implements IAuthoritiesService{
	@Autowired
	private AuthoritiesDao authorityDao;
	
	@Override
	public List<Authority> getAuthorities() {
		return authorityDao.findAll();
	}

}
