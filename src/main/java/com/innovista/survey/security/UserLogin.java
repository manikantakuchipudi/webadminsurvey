package com.innovista.survey.security;

import java.io.IOException;
import java.util.Properties;

import org.lightadmin.core.config.context.LightAdminSecurityConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;



@Configuration
public class UserLogin {

	
	 @Value("classpath:users1.properties")
	    private Resource usersResource;
	@Bean
    @Primary
    public UserDetailsService userDetailsService() throws IOException {
        Properties usersPproperties = PropertiesLoaderUtils.loadProperties(usersResource);
      
       
        
        return new InMemoryUserDetailsManager(usersPproperties);
    }
}
