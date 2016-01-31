/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import org.springframework.stereotype.Service;


import com.innovista.survey.model.SurveyQuestionTypes;




public class SurveyQuestionTypesAdministration  extends AdministrationConfiguration<SurveyQuestionTypes> {

	 
	 public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
			return configurationBuilder
					.nameExtractor(surveyQuestionOptionsExtractor())
					.singularName("SurveyQuestionType")
					.pluralName("SurveyQuestionTypes").build();
		}

		public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
			return screenContextBuilder.screenName("SurveyQuestionTypes Administration").build();
		}

		public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeValue").caption("Question Type Value")
					.build();
		}

		public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeValue").caption("Question Type Value")
					.build();
		}

		public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeValue").caption("Question Type Value")
					.build();
		}

		public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeValue").caption("Question Type Value")
					.build();
		}

		public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
			return filterBuilder
					.filter("Question Type Value", "qtypeValue")
					.build();
		}

		private static EntityNameExtractor<SurveyQuestionTypes> surveyQuestionOptionsExtractor() {
			return new EntityNameExtractor<SurveyQuestionTypes>() {
				@Override
				public String apply(final SurveyQuestionTypes surveyQuestionTypes) {
					return String.format("%s", surveyQuestionTypes.getQtypeValue());
				}
			};
		}

}
