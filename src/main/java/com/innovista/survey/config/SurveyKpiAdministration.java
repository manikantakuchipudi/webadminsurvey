package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;

import com.innovista.survey.config.listener.SimpleRepositoryEventListener;
import com.innovista.survey.model.SurveyCompanies;
import com.innovista.survey.model.SurveyKpi;


public class SurveyKpiAdministration extends AdministrationConfiguration<SurveyKpi>{

	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(getKpinameExtractor())
                .singularName("Survey Kpi")
                 .repositoryEventListener(SimpleRepositoryEventListener.class)
                .pluralName("Survey Kpis").build();
    }
	
	
	
	public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("surveyCategoryId").caption("survey CategoryID")
				.field("kpiname").caption("kpiname")
				.field("surveyId").caption("surveyId")
				.field("companyId").caption("companyId")
				.build();
	}
	
	 public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
	        return fragmentBuilder
	        		.field("surveyCategoryId").caption("survey CategoryID")
					.field("kpiname").caption("kpiname")
					.field("surveyId").caption("surveyId")
					.field("companyId").caption("companyId")
	                .build();
	    }
	
	
	 private static EntityNameExtractor<SurveyKpi> getKpinameExtractor() {
	        return new EntityNameExtractor<SurveyKpi>() {
	            @Override
	            public String apply(final SurveyKpi surveykpi) {
	                return String.format("%s ",surveykpi.getKpiname());
	            }
	        };
	    }
	
	
}
