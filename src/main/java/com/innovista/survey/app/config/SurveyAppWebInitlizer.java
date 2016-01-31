package com.innovista.survey.app.config;

import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMINISTRATION_BASE_PACKAGE;
import static org.springframework.core.Ordered.LOWEST_PRECEDENCE;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.lightadmin.core.config.bootstrap.LightAdminBeanDefinitionRegistryPostProcessor;
import org.lightadmin.core.config.context.LightAdminContextConfiguration;
import org.lightadmin.core.config.context.LightAdminSecurityConfiguration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.innovista.survey.app.config.context.SurveyAdminContexConfiguration;

import static com.innovista.survey.app.utils.SurveyConfigUtils.*;

public class SurveyAppWebInitlizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		lightAdminApplicationContext(servletContext);
		
	}
	
	
	 private AnnotationConfigWebApplicationContext lightAdminApplicationContext(final ServletContext servletContext) {
	        AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();

	        String basePackage = configurationsBasePackage(servletContext);
	        webApplicationContext.register(configurations(servletContext));
	        webApplicationContext.addBeanFactoryPostProcessor(new LightAdminBeanDefinitionRegistryPostProcessor(basePackage, servletContext));
	        webApplicationContext.setDisplayName("surveyAdmin WebApplicationContext");
	        webApplicationContext.setNamespace("surveyAdmin");
	        return webApplicationContext;
	    }

	
	 private String configurationsBasePackage(final ServletContext servletContext) {
	        return servletContext.getInitParameter(SURVEY_ADMINISTRATION_BASE_PACKAGE);
	    }
	 
	 
	 private Class[] configurations(final ServletContext servletContext) {
	        return new Class[]{SurveyAdminContexConfiguration.class};
	    }
}
