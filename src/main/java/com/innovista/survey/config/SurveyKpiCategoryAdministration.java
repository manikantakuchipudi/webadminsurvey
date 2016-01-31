package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;

import com.innovista.survey.config.listener.SimpleRepositoryEventListener;
import com.innovista.survey.model.SurveyKpi;
import com.innovista.survey.model.SurveyKpiCategory;


public class SurveyKpiCategoryAdministration extends AdministrationConfiguration<SurveyKpiCategory>{

	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(getKpinameExtractor())
                .singularName("Survey KPI Category")
                 .repositoryEventListener(SimpleRepositoryEventListener.class)
                .pluralName("Survey KPI Categorys").build();
    }
	
	
	public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				
				.field("surveyCategoryName").caption("surveyCategoryName")
				.build();
	}
	
	private static EntityNameExtractor<SurveyKpiCategory> getKpinameExtractor() {
	        return new EntityNameExtractor<SurveyKpiCategory>() {
	            @Override
	            public String apply(final SurveyKpiCategory surveyKpiCategory) {
	                return String.format("%s ",surveyKpiCategory.getSurveyCategoryName());
	            }
	        };
	    }
	
	
	
}
