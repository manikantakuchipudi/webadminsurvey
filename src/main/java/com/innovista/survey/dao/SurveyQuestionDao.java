package com.innovista.survey.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.innovista.survey.model.SurveyGridQuestions;



public class SurveyQuestionDao {
	
	
	@PersistenceContext
    private EntityManager entityManager;

    public boolean isVIP(SurveyGridQuestions gridQuestions) {
        //final Query query = entityManager.createQuery("select count(*) from Customer customer join customer.discountPrograms discountProgram where customer.id = :id and discountProgram.name = 'Platinum Discount Program'")
           //s     .setParameter("id", customer.getId());
       return true;
    }

}
