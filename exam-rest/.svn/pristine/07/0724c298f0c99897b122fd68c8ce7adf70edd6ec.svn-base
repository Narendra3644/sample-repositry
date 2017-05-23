package com.slokam.exam.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.exam.pojo.SubjectPojo;

@Repository
public interface FooRepository 
extends JpaRepository<SubjectPojo, Integer>, FooRepositoryCustom {
 
}

interface FooRepositoryCustom {

    public List<SubjectPojo> getsubjects();
}
 class FooRepositoryImpl {

	    @PersistenceContext
	    protected EntityManager em;
	    
	    public List<SubjectPojo> getsubjects()
	    {
	        Criteria crit = em.unwrap(Session.class).createCriteria(SubjectPojo.class);
	        List<SubjectPojo> foos = crit.list();
	        return foos;
	    }
	    
}

