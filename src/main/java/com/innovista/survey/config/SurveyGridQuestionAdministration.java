package com.innovista.survey.config;

import static org.lightadmin.api.config.utils.EnumElement.element;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.PersistentFieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.utils.EntityNameExtractor;
import org.lightadmin.api.config.utils.EnumElement;
import org.lightadmin.api.config.utils.FieldValueRenderer;
import org.lightadmin.core.config.domain.renderer.EnumRenderer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

import com.innovista.survey.config.listener.SimpleRepositoryEventListener;
import com.innovista.survey.model.SurveyGridColumnTypes;
import com.innovista.survey.model.SurveyGridQuestions;
import com.innovista.survey.service.SurveyGridQuestionService;

public class SurveyGridQuestionAdministration extends AdministrationConfiguration<SurveyGridQuestions> {

	
	  @Autowired
	    private SurveyGridQuestionService surveyGridQuestionService;
	
	public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
        return configurationBuilder
                .nameExtractor(gridQuestionExtractor())
                .singularName("Survey Grid Question")
                 .repositoryEventListener(SimpleRepositoryEventListener.class)
                .pluralName("Survey Grid Questions").build();
    }
	
	
	
	public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder
				.field("gridnameid").caption("gridnameid")
				.field("qid").caption("QID").enumeration(surveyGridQuestionService.getGridQuestionEnumElements())
				.build();
	}
	
	
	
	
	
	
	public class gridvalueRender extends EnumRenderer<SurveyGridQuestions>
	{
		 @Override
		    public String apply(SurveyGridQuestions surveyGridQuestions) {
			 if(surveyGridQuestions.getQid().getQtypeId().getQtypeValue().equals("GRID"))
	        	{
				   return String.format("%s", surveyGridQuestions.getQid().getQuestion());
				      
	        	}
			 return null;
		    }

	}
	
	
	 private static EntityNameExtractor<SurveyGridQuestions> gridQuestionExtractor() {
	        return new EntityNameExtractor<SurveyGridQuestions>() {
	            @Override
	            public String apply(final SurveyGridQuestions surveyGridQuestions) {
	            	
	            	if(surveyGridQuestions.getQid().getQtypeId().getQtypeValue().equals("GRID"))
	            	{
	            	
	                return String.format("%s", surveyGridQuestions.getQid().getQuestion());
	            	}
	            	else
	            	{
	            		return "";
	            	}
	            }
	        };
	    }
	
}
