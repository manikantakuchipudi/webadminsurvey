package com.innovista.survey.controller;

import org.lightadmin.core.config.LightAdminConfiguration;
import org.lightadmin.core.config.domain.DomainTypeAdministrationConfiguration;
import org.lightadmin.core.config.domain.GlobalAdministrationConfiguration;
import org.lightadmin.core.persistence.repository.DynamicJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.mapping.PersistentEntity;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import java.io.Serializable;

import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.servlet.support.ServletUriComponentsBuilder.fromCurrentContextPath;

@Controller
public class ApplicationController {

	@RequestMapping(value = "/search/count", method = GET)
	@ResponseBody
   public String hello()
   {
	   return "hello";
   }
}