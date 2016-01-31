package com.innovista.survey.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import com.innovista.survey.model.SurveyGridQuestions;


@Service
public class SurveyAreasService {
	
	
	@PersistenceContext
    private EntityManager entityManager;

    public boolean isVIP(SurveyGridQuestions gridQuestions) {
        //final Query query = entityManager.createQuery("select count(*) from Customer customer join customer.discountPrograms discountProgram where customer.id = :id and discountProgram.name = 'Platinum Discount Program'")
           //s     .setParameter("id", customer.getId());
       return true;
    }

}
