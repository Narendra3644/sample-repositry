package com.slokam.exam.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Subject")
public class SubjectPojo  implements Serializable {
	private Integer id;   
	private Boolean isDeleted;
	private Date lastUpdated;
	private String name;
	private String description;
	
	@JsonIgnore
	private List<TopicPojo> topicList;
	
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@OneToMany(mappedBy="subject")
	public List<TopicPojo> getTopicList() {
		return topicList;
	}
	public void setTopicList(List<TopicPojo> topicList) {
		this.topicList = topicList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
