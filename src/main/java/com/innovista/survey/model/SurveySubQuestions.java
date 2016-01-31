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
@Table(name = "survey_sub_questions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SurveySubQuestions.findAll", query = "SELECT s FROM SurveySubQuestions s"),
    @NamedQuery(name = "SurveySubQuestions.findBySubqid", query = "SELECT s FROM SurveySubQuestions s WHERE s.subqid = :subqid")})
public class SurveySubQuestions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer subqid;
    @JoinColumn(name = "qid", referencedColumnName = "qid", nullable = false)
    @ManyToOne(optional = false)
    private SurveyQuestions qid;
    @JoinColumn(name = "sub_qid", referencedColumnName = "qid", nullable = false)
    @ManyToOne(optional = false)
    private SurveyQuestions subQid;

    public SurveySubQuestions() {
    }

    public SurveySubQuestions(Integer subqid) {
        this.subqid = subqid;
    }

    public Integer getSubqid() {
        return subqid;
    }

    public void setSubqid(Integer subqid) {
        this.subqid = subqid;
    }

    public SurveyQuestions getQid() {
        return qid;
    }

    public void setQid(SurveyQuestions qid) {
        this.qid = qid;
    }

    public SurveyQuestions getSubQid() {
        return subQid;
    }

    public void setSubQid(SurveyQuestions subQid) {
        this.subQid = subQid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subqid != null ? subqid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveySubQuestions)) {
            return false;
        }
        SurveySubQuestions other = (SurveySubQuestions) object;
        if ((this.subqid == null && other.subqid != null) || (this.subqid != null && !this.subqid.equals(other.subqid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.innovista.survey.model.SurveySubQuestions[ subqid=" + subqid + " ]";
    }
    
}
