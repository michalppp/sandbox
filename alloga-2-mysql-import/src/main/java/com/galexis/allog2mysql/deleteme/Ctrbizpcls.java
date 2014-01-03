package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Ctrbizpcls generated by hbm2java
 */
@Entity
@Table(name="CTRBIZPCLS"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"CONTRDEFPK", "BIZPMASTERPK", "CONTRACTORCLASS"}) 
)
public class Ctrbizpcls  implements java.io.Serializable {


     private long pk;
     private Contrdef contrdef;
     private Bizpmaster bizpmaster;
     private String contractorclass;
     private String contractorclassgroup;
     private Character isactiveflag;
     private Date recordlastchangetime;
     private Date recordcreationtime;

    public Ctrbizpcls() {
    }

	
    public Ctrbizpcls(long pk, Contrdef contrdef, Bizpmaster bizpmaster, String contractorclass, String contractorclassgroup, Date recordcreationtime) {
        this.pk = pk;
        this.contrdef = contrdef;
        this.bizpmaster = bizpmaster;
        this.contractorclass = contractorclass;
        this.contractorclassgroup = contractorclassgroup;
        this.recordcreationtime = recordcreationtime;
    }
    public Ctrbizpcls(long pk, Contrdef contrdef, Bizpmaster bizpmaster, String contractorclass, String contractorclassgroup, Character isactiveflag, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.contrdef = contrdef;
       this.bizpmaster = bizpmaster;
       this.contractorclass = contractorclass;
       this.contractorclassgroup = contractorclassgroup;
       this.isactiveflag = isactiveflag;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
    }
   
     @Id 

    
    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTRDEFPK", nullable=false)
    public Contrdef getContrdef() {
        return this.contrdef;
    }
    
    public void setContrdef(Contrdef contrdef) {
        this.contrdef = contrdef;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZPMASTERPK", nullable=false)
    public Bizpmaster getBizpmaster() {
        return this.bizpmaster;
    }
    
    public void setBizpmaster(Bizpmaster bizpmaster) {
        this.bizpmaster = bizpmaster;
    }

    
    @Column(name="CONTRACTORCLASS", nullable=false, length=30)
    public String getContractorclass() {
        return this.contractorclass;
    }
    
    public void setContractorclass(String contractorclass) {
        this.contractorclass = contractorclass;
    }

    
    @Column(name="CONTRACTORCLASSGROUP", nullable=false, length=30)
    public String getContractorclassgroup() {
        return this.contractorclassgroup;
    }
    
    public void setContractorclassgroup(String contractorclassgroup) {
        this.contractorclassgroup = contractorclassgroup;
    }

    
    @Column(name="ISACTIVEFLAG", length=1)
    public Character getIsactiveflag() {
        return this.isactiveflag;
    }
    
    public void setIsactiveflag(Character isactiveflag) {
        this.isactiveflag = isactiveflag;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDLASTCHANGETIME", length=26)
    public Date getRecordlastchangetime() {
        return this.recordlastchangetime;
    }
    
    public void setRecordlastchangetime(Date recordlastchangetime) {
        this.recordlastchangetime = recordlastchangetime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }




}

