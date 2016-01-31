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


import com.innovista.survey.model.Surveys;

public class SurveysAdminstration extends AdministrationConfiguration<Surveys>{
	
	
	
	
	

    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
		return configurationBuilder
				.nameExtractor(surveysExtractor())
				.singularName("Surveys")
				.pluralName("Surveys").build();
	}

	public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
		return screenContextBuilder.screenName("Surveys Administration").build();
	}

	public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("surveyName").caption("Survey Name")
				.build();
	}

	public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("surveyName").caption("Survey Name")
				.build();
	}

	public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("surveyName").caption("Survey Name")
				.build();
	}

	public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("surveyName").caption("Survey Name")
				.build();
	}

	public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
		return filterBuilder


				.filter("Survey Name", "surveyName")
				.build();
	}

	private static EntityNameExtractor<Surveys> surveysExtractor() {
		return new EntityNameExtractor<Surveys>() {
			@Override
			public String apply(final Surveys surveys) {
				return String.format("%s", surveys.getSurveyName());
			}
		};
	}

}
