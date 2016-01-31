package com.innovista.survey.app.config.context;

import org.lightadmin.core.config.context.LightAdminRepositoryRestMvcConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.RepositoryRestController;



@Configuration
@ComponentScan(basePackages = {"com.innovista.survey"},
        includeFilters = @ComponentScan.Filter(RepositoryRestController.class), useDefaultFilters = false)

public class SurveyAdminRepositoryRestMvcConfiguration  {

}
