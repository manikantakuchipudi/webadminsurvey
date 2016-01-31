package com.innovista.survey.config;

import static org.lightadmin.api.config.utils.EnumElement.element;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;
import org.lightadmin.api.config.utils.EnumElement;
import org.lightadmin.api.config.utils.FieldValueRenderer;

import com.innovista.survey.model.SurveyGrid;
import com.innovista.survey.model.SurveyGridColumnTypes;
import com.innovista.survey.model.SurveyGridsColumnsOptionData;
import com.innovista.survey.model.SurveyGridsColumnsOptions;

public class SurveyGridColumnOptionDataAdministration extends AdministrationConfiguration<SurveyGridsColumnsOptionData>{

	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(gridColumnOptionsExtractor())
                .singularName("Survey GridColumnOption Data")
                .pluralName("Survey GridColumnOptions Data").build();
    }
	
	
	
	
	
	 public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		
	        		.field("gridId").caption("Grid Name")
	        		.field("gridColumnOptId").caption("Column Name")
	        		.field("data").caption("Option Data")
	        		.field("gridcolTypeId").caption("Option Type")
	        		
	                .build();
	    }
	
	 public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("gridId").caption("Grid Name")
	        		.field("gridColumnOptId").caption("Column Name")
	        		.field("data").caption("Option Data")
	        		.field("gridcolTypeId").caption("Option Type")
	        		
	               .build();
	    }
	 
	 
	 
	
	 
	 
	/* private static FieldValueRenderer<SurveyGridsColumnsOptionData> lineItemsFieldValueRenderer() {
	        return new FieldValueRenderer<SurveyGridsColumnsOptionData>() {
	            @Override
	            public String apply(final SurveyGridsColumnsOptionData surveyGridsColumnsOptions) {
	              return "empty";
	            }
	        };
	    }*/
	
	
	
	private static EntityNameExtractor<SurveyGridsColumnsOptionData> gridColumnOptionsExtractor() {
		return new EntityNameExtractor<SurveyGridsColumnsOptionData>() {
			@Override
			public String apply(final SurveyGridsColumnsOptionData surveyGridsColumnsOptionData) {
				return String.format("%s", surveyGridsColumnsOptionData.getData());
			}
			
			
			
			
		};
	}
}

	
	