package com.slokam.exam.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


public  class CommonPojo {
        
	    private Integer id;   
		private Boolean isDeleted;
		private Date lastUpdated;
		
		@Id 
		@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	    
		
}
