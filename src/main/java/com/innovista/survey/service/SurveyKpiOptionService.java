package com.innovista.survey.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.lightadmin.api.config.utils.EnumElement;
import org.springframework.stereotype.Service;

import com.innovista.survey.model.SurveyQuestionOptions;
import com.innovista.survey.model.SurveyQuestions;



@Service
public class SurveyKpiOptionService {
	
	private static final Logger logger=Logger.getLogger(SurveyKpiOptionService.class);

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public EnumElement[] getQuestionOptionEnumElements() {

		logger.info("looger info enterd valueee");
		try
		{
			final Query query = entityManager.createNamedQuery("SurveyQuestions.findAll");
			List<SurveyQuestions> data= query.getResultList();
			logger.debug("looger value"+data);
			List<EnumElement> questionData=new ArrayList<EnumElement>();
			for(SurveyQuestions gridQue:data)
			{
				if(!gridQue.getQtypeId().getQtypeValue().equals("GRID"))
				{
					for(SurveyQuestionOptions options: gridQue.getSurveyQuestionOptionsCollection())
					{
						questionData.add(EnumElement.element(options.getQuOptId(),options.getQid().getQuestion()+"["+options.getAnswerValue()+"]"));
					}
				}
			}
			logger.info("data is rendering ");
			return convertArray(questionData);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	public EnumElement[] convertArray(List<EnumElement> abcd)
	{
		EnumElement[] array=new EnumElement[abcd.size()];

		for( int i=0;i<abcd.size();i++)
		{
			array[i]=abcd.get(i);
		}
		return array;

	}



}
