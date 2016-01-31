package com.innovista.survey.app.config.context;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.innovista.survey.controller.ApplicationController;



@Configuration
@Import({
        SurveyAdminDataConfiguration.class,
        SurveyAdminRepositoryRestMvcConfiguration.class
      })
@EnableWebMvc


public class SurveyAdminContexConfiguration  extends WebMvcConfigurerAdapter {

	
	 @Bean
	    public ApplicationController applicationController() {
	        return new ApplicationController();
	    }
	
}
