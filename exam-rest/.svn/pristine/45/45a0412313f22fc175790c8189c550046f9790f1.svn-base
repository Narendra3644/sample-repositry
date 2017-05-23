package com.slokam.exam.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class QuestionPojo  {

	private Integer id;
	private Boolean isDeleted;
	private Date lastupdated;
	private String description;
	private String answer;
	private List<TopicPojo>  topics;
	private QuestionTypePojo questionType;
	private List<OptionPojo> options;
	
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)
	public List<OptionPojo> getOptions() {
		return options;
	}
	public void setOptions(List<OptionPojo> options) {
		this.options = options;
	}
	
	@ManyToOne
	@JoinColumn(name="qtid")
	public QuestionTypePojo getQuestionType() {
		return questionType;
	}
	public void setQuestionType(QuestionTypePojo questionType) {
		this.questionType = questionType;
	}
	
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
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToMany
	@JoinTable(
			name="question_topic",
			joinColumns={@JoinColumn(name="qid")},
			inverseJoinColumns={@JoinColumn(name="tid")}
	)
	public List<TopicPojo> getTopics() {
		return topics;
	}
	public void setTopics(List<TopicPojo> topics) {
		this.topics = topics;
	}
	
	
	
}
