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
 * Phaselog generated by hbm2java
 */
@Entity
@Table(name="PHASELOG"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"DAYENDRELEASEDATE", "CONTRDEFPK", "PHASE"}) 
)
public class Phaselog  implements java.io.Serializable {


     private long pk;
     private Contrdef contrdef;
     private int dayendreleasedate;
     private String phase;
     private Date validfrom;
     private Date validto;
     private Date considered;
     private Date recordcreationtime;

    public Phaselog() {
    }

	
    public Phaselog(long pk, int dayendreleasedate, String phase, Date recordcreationtime) {
        this.pk = pk;
        this.dayendreleasedate = dayendreleasedate;
        this.phase = phase;
        this.recordcreationtime = recordcreationtime;
    }
    public Phaselog(long pk, Contrdef contrdef, int dayendreleasedate, String phase, Date validfrom, Date validto, Date considered, Date recordcreationtime) {
       this.pk = pk;
       this.contrdef = contrdef;
       this.dayendreleasedate = dayendreleasedate;
       this.phase = phase;
       this.validfrom = validfrom;
       this.validto = validto;
       this.considered = considered;
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
    @JoinColumn(name="CONTRDEFPK")
    public Contrdef getContrdef() {
        return this.contrdef;
    }
    
    public void setContrdef(Contrdef contrdef) {
        this.contrdef = contrdef;
    }

    
    @Column(name="DAYENDRELEASEDATE", nullable=false, precision=8, scale=0)
    public int getDayendreleasedate() {
        return this.dayendreleasedate;
    }
    
    public void setDayendreleasedate(int dayendreleasedate) {
        this.dayendreleasedate = dayendreleasedate;
    }

    
    @Column(name="PHASE", nullable=false, length=10)
    public String getPhase() {
        return this.phase;
    }
    
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="VALIDFROM", length=26)
    public Date getValidfrom() {
        return this.validfrom;
    }
    
    public void setValidfrom(Date validfrom) {
        this.validfrom = validfrom;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="VALIDTO", length=26)
    public Date getValidto() {
        return this.validto;
    }
    
    public void setValidto(Date validto) {
        this.validto = validto;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CONSIDERED", length=26)
    public Date getConsidered() {
        return this.considered;
    }
    
    public void setConsidered(Date considered) {
        this.considered = considered;
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


