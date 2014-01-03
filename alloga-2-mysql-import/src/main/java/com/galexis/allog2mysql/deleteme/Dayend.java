package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Dayend generated by hbm2java
 */
@Entity
@Table(name="DAYEND"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = {@UniqueConstraint(columnNames="PK"), @UniqueConstraint(columnNames={"DAYENDRELEASEDATE", "CONTRDEFPK"})} 
)
public class Dayend  implements java.io.Serializable {


     private DayendId id;
     private Contrdef contrdef;

    public Dayend() {
    }

    public Dayend(DayendId id, Contrdef contrdef) {
       this.id = id;
       this.contrdef = contrdef;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", unique=true, nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="dayendreleasedate", column=@Column(name="DAYENDRELEASEDATE", nullable=false, precision=8, scale=0) ), 
        @AttributeOverride(name="contrdefpk", column=@Column(name="CONTRDEFPK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="stockreconciliationtime", column=@Column(name="STOCKRECONCILIATIONTIME", length=26) ), 
        @AttributeOverride(name="stockreconciliationtransactid", column=@Column(name="STOCKRECONCILIATIONTRANSACTID", length=50) ), 
        @AttributeOverride(name="programname", column=@Column(name="PROGRAMNAME", length=10) ), 
        @AttributeOverride(name="dayendreleaseuser", column=@Column(name="DAYENDRELEASEUSER", length=10) ), 
        @AttributeOverride(name="considered", column=@Column(name="CONSIDERED", length=26) ), 
        @AttributeOverride(name="ipDayendjobsprocessed", column=@Column(name="IP_DAYENDJOBSPROCESSED", length=26) ), 
        @AttributeOverride(name="recordcreationtime", column=@Column(name="RECORDCREATIONTIME", nullable=false, length=26) ) } )
    public DayendId getId() {
        return this.id;
    }
    
    public void setId(DayendId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTRDEFPK", nullable=false, insertable=false, updatable=false)
    public Contrdef getContrdef() {
        return this.contrdef;
    }
    
    public void setContrdef(Contrdef contrdef) {
        this.contrdef = contrdef;
    }




}


