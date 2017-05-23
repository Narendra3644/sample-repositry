package com.slokam.exam.sec;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.slokam.exam.dao.UserDao;
import com.slokam.exam.pojo.Authority;
import com.slokam.exam.pojo.UserDetailsImpl;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserDao userDao;
	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		
		  return userDao.getUserByUserName(arg0);
		 
		/*UserDetailsImpl userDetails = new UserDetailsImpl();
		userDetails.setUsername("user1");
		userDetails.setPassword("password1");
		userDetails.setEnabled(true);
		userDetails.setCredentialsNonExpired(true);
		userDetails.setAccountNonExpired(true);
		userDetails.setAccountNonLocked(true);
		
		List<Authority> authorityList = new ArrayList();
			Authority au1 = new Authority();
			au1.setAuthority("ROLE_ADMIN");
			Authority au2 = new Authority();
			au2.setAuthority("ROLE_USER");
			authorityList.add(au1);
			authorityList.add(au2);
			userDetails.setAuthorities(authorityList);
			
		return userDetails;*/
		
		
	}

	
}
