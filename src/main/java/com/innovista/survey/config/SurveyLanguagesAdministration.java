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


import com.innovista.survey.model.SurveyLanguages;

public class SurveyLanguagesAdministration extends AdministrationConfiguration<SurveyLanguages>{

	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(surveyLanguagesExtractor())
                .singularName("Survey Languages")
                .pluralName("Survey Languages").build();
    }

    public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
        return screenContextBuilder.screenName("SurveyLanguages Administration").build();
    }

    public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("langCode").caption("Language Code")
                .field("langName").caption("Language Name")
                .build();
    }

   public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("langCode").caption("Language Code")
                .field("langName").caption("Language Name")
                .build();
    }

    public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("langCode").caption("Language Code")
                .field("langName").caption("Language Name")
                .build();
    }

    public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
        return fragmentBuilder
        		.field("langCode").caption("Language Code")
                .field("langName").caption("Language Name")
                .build();
    }

    public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
        return filterBuilder
                .filter("Language Name", "langName")
                .filter("Language Code", "langCode")
                .build();
    }

    private static EntityNameExtractor<SurveyLanguages> surveyLanguagesExtractor() {
        return new EntityNameExtractor<SurveyLanguages>() {
            @Override
            public String apply(final SurveyLanguages surveyLanguages) {
                return String.format("%s", surveyLanguages.getLangName());
            }
        };
    }

	
	
}
