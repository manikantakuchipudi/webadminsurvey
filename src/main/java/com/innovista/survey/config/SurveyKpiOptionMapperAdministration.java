package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;


import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;
import org.springframework.beans.factory.annotation.Autowired;

import com.innovista.survey.config.listener.SimpleRepositoryEventListener;
import com.innovista.survey.model.SurveyKpiOption;
import com.innovista.survey.service.SurveyGridQuestionService;
import com.innovista.survey.service.SurveyKpiOptionService;

public class SurveyKpiOptionMapperAdministration extends AdministrationConfiguration<SurveyKpiOption> {

	  @Autowired
	    private SurveyKpiOptionService surveyKpiOptionService;
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(getKpiOptionExtractor())
                .singularName("Survey KPI Option")
                 .repositoryEventListener(SimpleRepositoryEventListener.class)
                .pluralName("Survey KPI Options").build();
        
    }
	
	public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("kpiId").caption("KPI NAME")
				.field("kpiOptionId").caption("OPTION NAME").enumeration(surveyKpiOptionService.getQuestionOptionEnumElements())
				.build();
	}
	
	
	 private static EntityNameExtractor<SurveyKpiOption> getKpiOptionExtractor() {
	        return new EntityNameExtractor<SurveyKpiOption>() {
	            @Override
	            public String apply(final SurveyKpiOption surveyKpiOption) {
	                return String.format("%s",surveyKpiOption.getKpiOptionId().getQid().getQuestion()+"["+surveyKpiOption.getKpiOptionId().getAnswerValue()+"]");
	            }
	        };
	    }
	
	
}

