package com.slokam.exam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.exam.pojo.UserDetailsImpl;

@Repository
public interface UserDao extends JpaRepository<UserDetailsImpl, Integer> {
	
	@Query("from UserDetailsImpl where username=?1")
	public abstract UserDetailsImpl getUserByUserName(String userName);
	
}
