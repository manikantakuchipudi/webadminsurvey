package com.innovista.survey.controller;

import static org.lightadmin.api.config.utils.ScopeMetadataUtils.isPredicateScope;
import static org.lightadmin.api.config.utils.ScopeMetadataUtils.isSpecificationScope;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.servlet.http.HttpServletRequest;

import org.lightadmin.api.config.utils.ScopeMetadataUtils;
import org.lightadmin.api.config.utils.ScopeMetadataUtils.PredicateScopeMetadata;
import org.lightadmin.core.config.domain.DomainTypeAdministrationConfiguration;
import org.lightadmin.core.config.domain.scope.ScopeMetadata;
import org.lightadmin.core.persistence.repository.invoker.DynamicRepositoryInvoker;
import org.lightadmin.core.web.RepositoryScopedSearchController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.mapping.PersistentEntity;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.RootResourceInformation;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping("/survey")
public class SurveyQuestionsController {

	private static final String BASE_MAPPING = "/{repository}";
	
	
	
	@RequestMapping(value = BASE_MAPPING + "/search/count", method = GET)
	@ResponseBody
    public int countItems(HttpServletRequest request) {
		System.out.println("Request is coming heree");
		return 3;
    }
	
	

}
