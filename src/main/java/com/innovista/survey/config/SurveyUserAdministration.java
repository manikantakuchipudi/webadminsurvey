/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovista.survey.config;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

import com.innovista.survey.model.SurveyCompanies;
import com.innovista.survey.model.SurveyUser;
import com.innovista.survey.model.SurveyUserRole;
import com.innovista.survey.model.SurveyQuestionsReport;



public class SurveyUserAdministration extends AdministrationConfiguration<SurveyUser> {
 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "user_id", nullable = false)
	    private Integer userId;
	    @Basic(optional = false)
	    @Column(name = "username", nullable = false, length = 100)
	    private String username;
	    @Basic(optional = false)
	    @Column(name = "password", nullable = false, length = 100)
	    private String password;
	    @Column(name = "phoneno")
	    private String phoneno;
	    @JoinColumn(name = "company_id", referencedColumnName = "company_id", nullable = false)
	    @ManyToOne(optional = false)
	    private SurveyCompanies companyId;
	    @JoinColumn(name = "role_id", referencedColumnName = "role_id", nullable = false)
	    @ManyToOne(optional = false)
	    private SurveyUserRole roleId;
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyUser")
	    private Collection<SurveyQuestionsReport> surveyQuestionsReportCollection;
	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
	
	  public EntityMetadataConfigurationUnit configuration(EntityMetadataConfigurationUnitBuilder configurationBuilder) {
			return configurationBuilder
					.nameExtractor(surveysExtractor())
					.singularName("SurveyUser")
					.pluralName("SurveyUser").build();
		}

		public ScreenContextConfigurationUnit screenContext(ScreenContextConfigurationUnitBuilder screenContextBuilder) {
			return screenContextBuilder.screenName("SurveyUser Administration").build();
		}

		public FieldSetConfigurationUnit listView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("companyId").caption("Company Name")
					.field("username").caption("SurveyUser Name")
					.field("password").caption("Password")
					.field("phoneno").caption("Phone No:")
					.field("roleId").caption("Role Name:")
					
					
					.build();
		}

		public FieldSetConfigurationUnit quickView(FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("companyId").caption("Company Name")
					.field("username").caption("SurveyUser Name")
					.field("password").caption("Password")
					.field("phoneno").caption("Phone No:")
					.field("roleId").caption("Role Name:")
					
					
					.build();
		}

		public FieldSetConfigurationUnit showView(final FieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("companyId").caption("Company Name")
					.field("username").caption("SurveyUser Name")
					.field("password").caption("Password")
					.field("phoneno").caption("Phone No:")
					.field("roleId").caption("Role Name:")
					
					
					.build();
		}

		public FieldSetConfigurationUnit formView(final PersistentFieldSetConfigurationUnitBuilder fragmentBuilder) {
			return fragmentBuilder
					.field("companyId").caption("Company Name")
					.field("username").caption("SurveyUser Name")
					.field("password").caption("Password")
					.field("phoneno").caption("Phone No:")
					.field("roleId").caption("Role Name:")
					
					
					.build();
		}

		public FiltersConfigurationUnit filters(final FiltersConfigurationUnitBuilder filterBuilder) {
			return filterBuilder


					.filter("Company Name", "companyId")
					.filter("Company Name", "username")
					.filter("Phone No", "phoneno")
					.filter("Role Name", "roleId")
					.build();
		}

		private static EntityNameExtractor<SurveyUser> surveysExtractor() {
			return new EntityNameExtractor<SurveyUser>() {
				@Override
				public String apply(final SurveyUser surveyUser) {
					return String.format("%s, %s", surveyUser.getUserId(), surveyUser.getUsername());
				}
			};
		}
	
}
