package com.innovista.survey.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.commons.collections.iterators.EnumerationIterator;
import org.apache.log4j.Logger;
import org.lightadmin.api.config.utils.EnumElement;
import org.springframework.stereotype.Service;

import com.innovista.survey.model.SurveyQuestionTypes;
import com.innovista.survey.model.SurveyGridQuestions;
import com.innovista.survey.model.SurveyQuestions;



@Service
public class SurveyGridQuestionService {

	private static final Logger logger=Logger.getLogger(SurveyGridQuestionService.class);


	@PersistenceContext
	private EntityManager entityManager;

	public EnumElement[] getGridQuestionEnumElements() {

		logger.info("looger info enterd valueee");
		try
		{
			final Query query = entityManager.createNamedQuery("SurveyQuestions.findAll");
			List<SurveyQuestions> data= query.getResultList();
			logger.debug("looger value"+data);
			List<EnumElement> gridData=new ArrayList<EnumElement>();
			for(SurveyQuestions gridQue:data)
			{
				if(gridQue.getQtypeId().getQtypeValue().equals("GRID"))
				{
					gridData.add(EnumElement.element(gridQue.getQid(),gridQue.getQuestion()));

				}
			}
			logger.info("data is rendering ");
			return convertArray(gridData);
		
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
