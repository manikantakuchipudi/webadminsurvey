package com.innovista.survey.config;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

import com.innovista.survey.model.SurveyLanguages;
import com.innovista.survey.model.SurveyQuestionOptionQuestions;
import com.innovista.survey.model.SurveyQuestionOptions;
import com.innovista.survey.model.SurveyQuestions;
import com.innovista.survey.model.Surveys;


@SuppressWarnings( "unused" )
public class SurveyQuestionOptionQuestionAdministration extends AdministrationConfiguration<SurveyQuestionOptionQuestions> {

	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
		return configurationBuilder
				.nameExtractor(surveyLanguagesExtractor())
				.singularName("Survey Question Option Question")
				.pluralName("Survey Question Option Questions").build();
	}

	public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
		return screenContextBuilder.screenName("SurveyQuestion Option Administration").build();
	}

	public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("qid").caption("Question ID")
				.field("quOptId").caption("Question Option ID")
				.field("subQid").caption("Sub Question ID")
				.build();
	}

	public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("qid").caption("Question ID")
				.field("quOptId").caption("Question Option ID")
				.field("subQid").caption("Sub Question ID")
				.build();
	}

	public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("qid").caption("Question ID")
				.field("quOptId").caption("Question Option ID")
				.field("subQid").caption("Sub Question ID")
				.build();
	}

	public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("qid").caption("Question ID")
				.field("quOptId").caption("Question Option ID")
				.field("subQid").caption("Sub Question ID")
				.build();
	}

	public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
		return filterBuilder


				.filter("Question ID", "qid")
				.filter("Question Option ID", "quOptId")
				.filter("Sub Question ID", "subQid")
				.build();
	}

	private static EntityNameExtractor<SurveyQuestionOptionQuestions> surveyLanguagesExtractor() {
		return new EntityNameExtractor<SurveyQuestionOptionQuestions>() {
			@Override
			public String apply(final SurveyQuestionOptionQuestions surveyQuestionOptionQuestions) {
				return String.format("%s", surveyQuestionOptionQuestions.getQid().getQuestion());
			}
		};
	}




}
