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
@Table(name = "survey_grid_questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SurveyGridQuestions.findAll", query = "SELECT s FROM SurveyGridQuestions s "),
    @NamedQuery(name = "SurveyGridQuestions.findByGridqid", query = "SELECT s FROM SurveyGridQuestions s WHERE s.gridqid = :gridqid"),
    @NamedQuery(name = "SurveyGridQuestions.findGridAll", query = "SELECT s FROM SurveyGridQuestions s where s.qid.qtypeId.qtypeValue ='GRID'"),
    })
public class SurveyGridQuestions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "gridqid")
    private Integer gridqid;
    @JoinColumn(name = "qid", referencedColumnName = "qid")
    @ManyToOne
    private SurveyQuestions qid;
    @JoinColumn(name = "gridnameid", referencedColumnName = "grid_id")
    @ManyToOne
    private SurveyGrid gridnameid;

    public SurveyGridQuestions() {
    }

    public SurveyGridQuestions(Integer gridqid) {
        this.gridqid = gridqid;
    }

    public Integer getGridqid() {
        return gridqid;
    }

    public void setGridqid(Integer gridqid) {
        this.gridqid = gridqid;
    }

    public SurveyQuestions getQid() {
        return qid;
    }

    public void setQid(SurveyQuestions qid) {
        this.qid = qid;
    }

    public SurveyGrid getGridnameid() {
        return gridnameid;
    }

    public void setGridnameid(SurveyGrid gridnameid) {
        this.gridnameid = gridnameid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gridqid != null ? gridqid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyGridQuestions)) {
            return false;
        }
        SurveyGridQuestions other = (SurveyGridQuestions) object;
        if ((this.gridqid == null && other.gridqid != null) || (this.gridqid != null && !this.gridqid.equals(other.gridqid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innovista.survey.model.SurveyGridQuestions[ gridqid=" + gridqid + " ]";
    }
    
}
