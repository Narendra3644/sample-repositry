package com.slokam.exam.pojo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="authority")
public class Authority implements GrantedAuthority{

	private Integer id;
	private String authority;
	@JsonIgnore
	private List<UserDetailsImpl> users;
	
	@ManyToMany
	@JoinTable(
			name="user_authority",
			joinColumns={@JoinColumn(name="aid")},
			inverseJoinColumns={@JoinColumn(name="uid")}
			
	)
	public List<UserDetailsImpl> getUsers() {
		return users;
	}

	public void setUsers(List<UserDetailsImpl> users) {
		this.users = users;
	}

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	

}
