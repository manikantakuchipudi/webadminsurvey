package com.innovista.survey.config;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;

import com.innovista.survey.model.SurveyGridsColumns;
import com.innovista.survey.model.SurveyGridsColumnsOptions;

public class SurveyGridColumnOptionsAdministration extends AdministrationConfiguration<SurveyGridsColumnsOptions>{

	
	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(gridColumnOptionsExtractor())
                .singularName("Survey GridColumnOptions")
                .pluralName("Survey GridColumnOptions").build();
    }
	
	/*public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("optionName").caption("gridName")
        		.field("gridColumnOptId").caption("Grid Column")
        		.field("gridColumnId").caption("Column Position")
        		.build();
    }
	
	
	public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("optionName").caption("gridName")
        		.field("gridColumnOptId").caption("Grid Column")
        		.field("gridColumnId").caption("Column Position")
        		.build();
    
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("optionName").caption("gridName")
        		.field("gridColumnOptId").caption("Grid Column")
        		.field("gridColumnId").caption("Column Position")
        		.build();
    }
	*/

	
	
	private static EntityNameExtractor<SurveyGridsColumnsOptions> gridColumnOptionsExtractor() {
		return new EntityNameExtractor<SurveyGridsColumnsOptions>() {
			@Override
			public String apply(final SurveyGridsColumnsOptions surveyGridsColumnsOptions) {
				
				if( surveyGridsColumnsOptions.getGridColumnId()!=null)
				return String.format("%s,%s", surveyGridsColumnsOptions.getGridColumnId().getGridId().getGridName(),surveyGridsColumnsOptions.getOptionName());
				else
				return String.format("%s",surveyGridsColumnsOptions.getOptionName());
					
	 		
			}
		};
	}

	
	
}
