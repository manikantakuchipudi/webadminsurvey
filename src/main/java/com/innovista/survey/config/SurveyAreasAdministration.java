package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;


import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FiltersConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.FiltersConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;



import com.innovista.survey.model.SurveyAreas;

public class SurveyAreasAdministration extends AdministrationConfiguration<SurveyAreas>{

	
	
	 public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
	        return configurationBuilder
	                .nameExtractor(surveyAreasExtractor())
	                .singularName("SurveyArea")
	                .pluralName("SurveyAreas").build();
	    }

	    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
	        return screenContextBuilder.screenName("SurveyAreas Administration").build();
	    }

	    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	                .field("areaName").caption("Survey Area")
	                .build();
	    }

	   public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("areaName").caption("Survey Area")
	                .build();
	    }

	    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("areaName").caption("Survey Area").build();
	    }

	    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("areaName").caption("Survey Area").build();
	    }

	    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
	        return filterBuilder
	                .filter("Survey Area", "areaName")
	                .build();
	    }

	    private static EntityNameExtractor<SurveyAreas> surveyAreasExtractor() {
	        return new EntityNameExtractor<SurveyAreas>() {
	            @Override
	            public String apply(final SurveyAreas survyArea) {
	                return String.format("%s",  survyArea.getAreaName());
	            }
	        };
	    }
	
	
	
}
