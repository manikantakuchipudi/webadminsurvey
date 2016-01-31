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

import com.innovista.survey.model.SurveySurveyAreas;


public class SurveySurveyAreasAdministration  extends AdministrationConfiguration<SurveySurveyAreas> {
	
	

	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
			return configurationBuilder
					.nameExtractor(surveySurveyAreasExtractor())
					.singularName("SurveySurveyArea")
					.pluralName("SurveySurveyAreas").build();
		}

		public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
			return screenContextBuilder.screenName("SurveySurveyArea Administration").build();
		}

		public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("ssaid").caption("SurveyArea ID")
					.field("surveyId").caption("Survey Name")
					.field("areaId").caption("SurveyArea Name")
					
					
					.build();
		}

		public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("ssaid").caption("SurveyArea ID")
					.field("surveyId").caption("Survey Name")
					.field("areaId").caption("SurveyArea Name")
					
					.build();
		}

		public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("ssaid").caption("SurveyArea ID")
					.field("surveyId").caption("Survey Name")
					.field("areaId").caption("SurveyArea Name")
					
					.build();
		}

		public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("ssaid").caption("SurveyArea ID")
					.field("surveyId").caption("Survey Name")
					.field("areaId").caption("SurveyArea Name")
					
					.build();
		}

		public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
			return filterBuilder


					.filter("Survey Name", "surveyId")
					.filter("SurveyArea Name", "areaId")
					
					.build();
		}

		private static EntityNameExtractor<SurveySurveyAreas> surveySurveyAreasExtractor() {
			return new EntityNameExtractor<SurveySurveyAreas>() {
				@Override
				public String apply(final SurveySurveyAreas surveySurveyAreas) {
					return String.format("%s", surveySurveyAreas.getAreaId().getAreaName());
				}
			};
		}
}
