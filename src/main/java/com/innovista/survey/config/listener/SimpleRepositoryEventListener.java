package com.innovista.survey.config.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.innovista.core.survey.model.Surveys;
import com.innovista.survey.model.SurveyGridQuestions;
import com.innovista.survey.model.SurveyQuestions;


public class SimpleRepositoryEventListener extends AbstractRepositoryEventListener<SurveyGridQuestions> {

    private final Logger logger = LoggerFactory.getLogger(SimpleRepositoryEventListener.class);

   
    
    
   // @Autowired
   // private PasswordEncoder encoder;

    @Override
    public void onBeforeSave(SurveyGridQuestions gridQuestions) {
       /// final String password = userService.getPassword(user);
    	gridQuestions.setQid(new SurveyQuestions(1));
    	  logger.info("gridQuestions Object After Save Method");

       // logger.info("#handleBeforeSave: User {} is Password : {}");
    }

    @Override
    public void onAfterSave(SurveyGridQuestions gridQuestions) {
    	
    	//logger.info("#After Save : User {} is Password : {}", user, user.getPassword());
        logger.info("gridQuestions Object After Save Method");
    }
}