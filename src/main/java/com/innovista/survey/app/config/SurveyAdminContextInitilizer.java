package com.innovista.survey.app.config;


import org.springframework.context.ApplicationContextInitializer;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.innovista.survey.app.config.context.SurveyAdminContexConfiguration;
import com.innovista.survey.app.config.context.SurveyAdminDataConfiguration;
import com.innovista.survey.app.config.context.SurveyAdminRepositoryRestMvcConfiguration;


@Configuration
@Import({
		SurveyAdminDataConfiguration.class,
		SurveyAdminRepositoryRestMvcConfiguration.class
       
})




public class SurveyAdminContextInitilizer implements ApplicationContextInitializer<AnnotationConfigWebApplicationContext> {
	
	

	@Override
	public void initialize(AnnotationConfigWebApplicationContext applicationContext) {
		
		applicationContext.register(SurveyAdminContexConfiguration.class);
	}

}
