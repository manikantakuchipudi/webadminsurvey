
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


import com.innovista.survey.model.SurveyUserAreas;



public class SurveyUserAreasAdministration extends AdministrationConfiguration<SurveyUserAreas>{
   
	
	  public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
			return configurationBuilder
					.nameExtractor(surveysExtractor())
					.singularName("SurveyUserAreas")
					.pluralName("SurveyUserAreass").build();
		}

		public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
			return screenContextBuilder.screenName("SurveyUserAreas Administration").build();
		}

		public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("userId").caption("SurveyUser Name")
					.field("areaId").caption("SurveyArea Name")
					
					.build();
		}

		public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("userId").caption("SurveyUser Name")
					.field("areaId").caption("SurveyArea Name")
					.build();
		}

		public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("userId").caption("SurveyUser Name")
					.field("areaId").caption("SurveyArea Name")
					
					.build();
		}

		public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("userId").caption("SurveyUser Name")
					.field("areaId").caption("SurveyArea Name")
					
					.build();
		}

		public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
			return filterBuilder


					.filter("SurveyUser Name", "userId")
					.filter("SurveyArea Name", "areaId")
					
					.build();
		}

		private static EntityNameExtractor<SurveyUserAreas> surveysExtractor() {
			return new EntityNameExtractor<SurveyUserAreas>() {
				@Override
				public String apply(final SurveyUserAreas surveyUserAreas) {
					return String.format("%s", surveyUserAreas.getAreaId().getAreaName());
				}
			};
		}
	
	
}
