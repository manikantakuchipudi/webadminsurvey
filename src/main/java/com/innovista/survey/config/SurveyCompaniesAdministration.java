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


import com.innovista.survey.model.SurveyCompanies;


public class SurveyCompaniesAdministration extends AdministrationConfiguration<SurveyCompanies>{

	
	
	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(companyNameExtractor())
                .singularName("Company Details")
                .pluralName("Company Details").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("CompanyDetails Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
                .field("companyName").caption("Company Name")
                .field("comapnyDetails").caption("CompanyDetails")
                .build();
    }

   public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		 .field("companyName").caption("Company Name")
                 .field("comapnyDetails").caption("CompanyDetails")
                 .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("companyName").caption("Survey Area").build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		 .field("companyName").caption("Company Name")
                 .field("comapnyDetails").caption("CompanyDetails")
                 .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
                .filter("CompanyName", "companyName")
                .filter("CompanyDetails", "comapnyDetails")
                .build();
    }

    private static EntityNameExtractor<SurveyCompanies> companyNameExtractor() {
        return new EntityNameExtractor<SurveyCompanies>() {
            @Override
            public String apply(final SurveyCompanies surveyCompanies) {
                return String.format("%s ", surveyCompanies.getCompanyName());
            }
        };
    }

	
	
}
