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

import com.innovista.survey.model.SurveyQuestionOptions;





public class SurveyQuestionOptionsAdministration extends AdministrationConfiguration<SurveyQuestionOptions>  {
   
	
	    
	    
	    
	    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
			return configurationBuilder
					.nameExtractor(surveyQuestionOptionsExtractor())
					.singularName("Survey Question Option")
					.pluralName("Survey Question Options").build();
		}

		public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
			return screenContextBuilder.screenName("SurveyQuestion Option Administration").build();
		}

		public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("answerValue").caption("Option Value")
					.field("answerKey").caption("Question Option ID")
					.field("qid").caption("Question ID")
					.field("surveyQuestionOptionQuestionsCollection").caption("Survey Question Option Questions")
					.build();
		}

		public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("answerValue").caption("Option Value")
					.field("answerKey").caption("Question Option ID")
					.field("qid").caption("Question ID")
					.field("surveyQuestionOptionQuestionsCollection").caption("Survey Question Option Questions")
					.build();
		}

		public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("answerValue").caption("Option Value")
					.field("answerKey").caption("Question Option ID")
					.field("qid").caption("Question ID")
					.field("surveyQuestionOptionQuestionsCollection").caption("Survey Question Option Questions")
					.build();
		}

		public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("answerValue").caption("Option Value")
					.field("answerKey").caption("Question Option ID")
					.field("qid").caption("Question ID")
					.field("surveyQuestionOptionQuestionsCollection").caption("Survey Question Option Questions")
					.build();
		}

		public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
			return filterBuilder


					.filter("Option Value", "answerValue")
					.filter("Question Option ID", "answerKey")
					.filter("Question ID", "qid")
					.build();
		}

		private static EntityNameExtractor<SurveyQuestionOptions> surveyQuestionOptionsExtractor() {
			return new EntityNameExtractor<SurveyQuestionOptions>() {
				/*@Override
				public String apply(final SurveyQuestionOptions surveyQuestionOptions) {
					return String.format("%s,%s",surveyQuestionOptions.getQid().getQuestion(), surveyQuestionOptions.getAnswerValue());
				}*/
				
				@Override
				public String apply(final SurveyQuestionOptions surveyQuestionOptions) {
					return String.format("%s", surveyQuestionOptions.getAnswerValue());
				}
				
				
			};
		}



}
