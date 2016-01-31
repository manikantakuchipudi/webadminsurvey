package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;

import com.innovista.survey.model.SurveyGrid;


public class SurveyGridAdministration extends AdministrationConfiguration<SurveyGrid>{

	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(surveyGridsExtractor())
                .singularName("Survey Grid")
                .pluralName("Survey Grids").build();
    }
	
	
	
	
/*	 public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("gridName").caption("gridName").build()
	                .build();
	    }
*/
	   public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("gridName").caption("gridName")
	                .build();
	    }
	
	   public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("gridName").caption("gridName")
	                .build();
	    }

	    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("gridName").caption("gridName")
	                .build();
	    }
	   
	   
	
	
	private static EntityNameExtractor<SurveyGrid> surveyGridsExtractor() {
		return new EntityNameExtractor<SurveyGrid>() {
			@Override
			public String apply(final SurveyGrid surveyGrid) {
				return String.format("%s", surveyGrid.getGridName());
			}
		};
	}


	
}
