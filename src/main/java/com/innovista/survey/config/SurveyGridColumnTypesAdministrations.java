package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;

import com.innovista.survey.model.SurveyGridColumnTypes;
import com.innovista.survey.model.SurveyLanguages;


public class SurveyGridColumnTypesAdministrations extends AdministrationConfiguration<SurveyGridColumnTypes> {

	
	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(gridNameExtractor())
                .singularName("Survey GridColumnType")
                .pluralName("Survey GridColumnTypes").build();
    }
	
	
	
	 public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("columnType").caption("Column Type")
	               // .field("langName").caption("Language Name")
	                .build();
	    }
	
	 public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("columnType").caption("Column Type")
	               // .field("langName").caption("Language Name")
	                .build();
	    }
	
	 private static EntityNameExtractor<SurveyGridColumnTypes> gridNameExtractor() {
	        return new EntityNameExtractor<SurveyGridColumnTypes>() {
	            @Override
	            public String apply(final SurveyGridColumnTypes surveyGridColumnTypes) {
	                return String.format("%s", surveyGridColumnTypes.getColumnType());
	            }
	        };
	    }
	
}
