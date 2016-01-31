package com.innovista.survey.config;

import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;


import com.innovista.survey.model.SurveyGridsColumns;




public class SurveyGridColumnsAdministration extends AdministrationConfiguration<SurveyGridsColumns>{

	
	
	
	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(surveyGridsColumnsExtractor())
                .singularName("Survey Grid Column")
                .pluralName("Survey Grid Columns").build();
    }
	
	
	public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("gridId").caption("gridName")
        		.field("columnName").caption("Grid Column")
        		.field("columnPosition").caption("Column Position")
        		.build();
    }

   public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("gridId").caption("gridName")
        		.field("columnName").caption("Grid Column")
        		.field("columnPosition").caption("Column Position")
        		.field("gridcolTypeId").caption("Column Type")
        		
        		.build();
    
    }

   public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("gridId").caption("gridName")
        		.field("columnName").caption("Grid Column")
        		.field("columnPosition").caption("Column Position")
        		.field("gridcolTypeId").caption("Column Type")
        		.build();
    
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("gridId").caption("gridName")
        		.field("columnName").caption("Grid Column")
        		.field("columnPosition").caption("Column Position")
        		.field("gridcolTypeId").caption("Column Type")
        		.build();
    }
	
	
	
	private static EntityNameExtractor<SurveyGridsColumns> surveyGridsColumnsExtractor() {
		return new EntityNameExtractor<SurveyGridsColumns>() {
			@Override
			public String apply(final SurveyGridsColumns SurveyGridsColumns) {
				return String.format("%s", SurveyGridsColumns.getColumnName());
			}
		};
	}


	
	
}


