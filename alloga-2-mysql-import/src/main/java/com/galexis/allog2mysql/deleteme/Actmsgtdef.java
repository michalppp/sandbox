package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Actmsgtdef generated by hbm2java
 */
@Entity
@Table(name="ACTMSGTDEF"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames="PK") 
)
public class Actmsgtdef  implements java.io.Serializable {


     private ActmsgtdefId id;

    public Actmsgtdef() {
    }

    public Actmsgtdef(ActmsgtdefId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", unique=true, nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="contrdefpk", column=@Column(name="CONTRDEFPK", precision=12, scale=0) ), 
        @AttributeOverride(name="messagetype", column=@Column(name="MESSAGETYPE", nullable=false) ), 
        @AttributeOverride(name="taskmessagetype", column=@Column(name="TASKMESSAGETYPE", nullable=false) ), 
        @AttributeOverride(name="taskmessagetypeversion", column=@Column(name="TASKMESSAGETYPEVERSION", nullable=false, length=5) ), 
        @AttributeOverride(name="sequenceoverride", column=@Column(name="SEQUENCEOVERRIDE", nullable=false) ), 
        @AttributeOverride(name="messagetypeversion", column=@Column(name="MESSAGETYPEVERSION", nullable=false, length=5) ), 
        @AttributeOverride(name="selectableinemailfunction", column=@Column(name="SELECTABLEINEMAILFUNCTION", nullable=false, length=1) ), 
        @AttributeOverride(name="recordcreationtime", column=@Column(name="RECORDCREATIONTIME", nullable=false, length=26) ) } )
    public ActmsgtdefId getId() {
        return this.id;
    }
    
    public void setId(ActmsgtdefId id) {
        this.id = id;
    }




}


