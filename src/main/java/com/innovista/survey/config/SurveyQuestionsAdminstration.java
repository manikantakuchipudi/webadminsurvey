/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovista.survey.config;



import static org.lightadmin.api.config.utils.EnumElement.element;

import javax.swing.text.Element;

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




import com.innovista.survey.model.SurveyQuestions;





public class SurveyQuestionsAdminstration extends AdministrationConfiguration<SurveyQuestions> {
 
	
	


	    public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
			return configurationBuilder
					.nameExtractor(surveyQuestionsExtractor())
					.singularName("SurveyQuestion")
					.pluralName("SurveyQuestions").build();
		}

		public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
			return screenContextBuilder.screenName("SurveyQuestions Administration").build();
		}
		
		public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					
					.field("qtypeId").caption("Question Type")
					.field("langId").caption("Question Language")
					.field("surveyId").caption("Survey ID")
					.field("question").caption("Question")
					.field("noOfOptions").caption("No Of Options")
					//.field("gridId").caption("Grid Attached Name")
					.field("surveyQuestionOptionsCollection").caption("Question Options")
					.build();
		}

		public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeId").caption("Question Type")
					.field("langId").caption("Question Language")
					.field("surveyId").caption("Survey ID")
					.field("questionPostion").caption("Question Postion")
					.field("question").caption("Question")
					.field("noOfOptions").caption("No Of Options")
					
					//.field("gridId").caption("Grid Attached Name")
					.field("surveyQuestionOptionsCollection").caption("Question Options")
					.build();
		}

		public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeId").caption("Question Type")
					.field("langId").caption("Question Language")
					.field("surveyId").caption("Survey ID")
					.field("questionPostion").caption("Question Postion")
					.field("question").caption("Question")
					.field("noOfOptions").caption("No Of Options")
					//.field("gridId").caption("Grid Attached Name")
					.field("surveyQuestionOptionsCollection").caption("Question Options")
					.build();
		}

		public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("qtypeId").caption("Question Type")
					.field("langId").caption("Question Language")
					.field("surveyId").caption("Survey ID")
					.field("questionPostion").caption("Question Postion")
					.field("question").caption("Question")
					.field("defaultQuestion").caption("Default Question").enumeration(
	                        element("Yes", "Yes"),
	                        element("No", "No"))
					.field("noOfOptions").caption("No Of Options")
					//.field("gridId").caption("Grid Attached Name")
					.field("surveyQuestionOptionsCollection").caption("Question Options")
					.build();
		}

		public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
			return filterBuilder


					.filter("Question Type", "qtypeId")
					.filter("Question Language", "langId")
					.filter("Survey ID", "surveyId")
					.filter("Question", "question")
					.build();
		}

		private static EntityNameExtractor<SurveyQuestions> surveyQuestionsExtractor() {
			return new EntityNameExtractor<SurveyQuestions>() {
				@Override
				public String apply(final SurveyQuestions surveyQuestions) {
					return String.format("%s", surveyQuestions.getQuestion());
				}
			};
			
			
			
			
			
			
		}



}
