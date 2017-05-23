package com.slokam.exam.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="optn")
public class OptionPojo {

	private Integer id;
	private String value;
	private QuestionPojo question;
	
	@ManyToOne
	@JoinColumn(name="qtid")
	public QuestionPojo getQuestion() {
		return question;
	}
	public void setQuestion(QuestionPojo question) {
		this.question = question;
	}
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
