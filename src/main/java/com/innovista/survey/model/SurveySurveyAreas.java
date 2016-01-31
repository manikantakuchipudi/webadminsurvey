/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovista.survey.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mkuchipudi
 */
@Entity
@Table(name = "survey_survey_areas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SurveySurveyAreas.findAll", query = "SELECT s FROM SurveySurveyAreas s"),
    @NamedQuery(name = "SurveySurveyAreas.findByssaid", query = "SELECT s FROM SurveySurveyAreas s WHERE s.ssaid = :ssaid")})
public class SurveySurveyAreas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "s_s_aid", nullable = false)
    private Integer ssaid;
    @JoinColumn(name = "area_id", referencedColumnName = "area_id", nullable = false)
    @ManyToOne(optional = false)
    private SurveyAreas areaId;
    @JoinColumn(name = "survey_id", referencedColumnName = "survey_id", nullable = false)
    @ManyToOne(optional = false)
    private Surveys surveyId;

    public SurveySurveyAreas() {
    }

    public SurveySurveyAreas(Integer ssaid) {
        this.ssaid = ssaid;
    }

    public Integer getssaid() {
        return ssaid;
    }

    public void setssaid(Integer ssaid) {
        this.ssaid = ssaid;
    }

    public SurveyAreas getAreaId() {
        return areaId;
    }

    public void setAreaId(SurveyAreas areaId) {
        this.areaId = areaId;
    }

    public Surveys getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Surveys surveyId) {
        this.surveyId = surveyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssaid != null ? ssaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveySurveyAreas)) {
            return false;
        }
        SurveySurveyAreas other = (SurveySurveyAreas) object;
        if ((this.ssaid == null && other.ssaid != null) || (this.ssaid != null && !this.ssaid.equals(other.ssaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innovista.survey.model.SurveySurveyAreas[ ssaid=" + ssaid + " ]";
    }
    
}
