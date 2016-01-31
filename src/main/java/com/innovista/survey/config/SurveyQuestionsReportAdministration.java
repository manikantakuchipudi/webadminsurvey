/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovista.survey.config;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;

import com.innovista.survey.model.SurveyQuestionsReport;

public class SurveyQuestionsReportAdministration extends AdministrationConfiguration<SurveyQuestionsReport> 
{
    
	public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				
				//.field("surveyQuestionsReportPK").caption("report")
				.field("surveyQuestions").caption("Survey Questions")
				.field("answer").caption("answer")
				.build();
	}
	
}
