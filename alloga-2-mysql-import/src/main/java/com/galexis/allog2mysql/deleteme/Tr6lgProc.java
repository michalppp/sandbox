package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Tr6lgProc generated by hbm2java
 */
@Entity
@Table(name="TR6LG_PROC"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Tr6lgProc  implements java.io.Serializable {


     private Tr6lgProcId id;

    public Tr6lgProc() {
    }

    public Tr6lgProc(Tr6lgProcId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="crTime", column=@Column(name="CR_TIME", nullable=false, length=26) ), 
        @AttributeOverride(name="serverId", column=@Column(name="SERVER_ID", nullable=false, length=10) ), 
        @AttributeOverride(name="appId", column=@Column(name="APP_ID", nullable=false, length=10) ), 
        @AttributeOverride(name="tag", column=@Column(name="TAG", nullable=false, length=80) ), 
        @AttributeOverride(name="messagetyp", column=@Column(name="MESSAGETYP", nullable=false, length=50) ), 
        @AttributeOverride(name="messagever", column=@Column(name="MESSAGEVER", nullable=false, length=5) ), 
        @AttributeOverride(name="taskId", column=@Column(name="TASK_ID", nullable=false, length=36) ), 
        @AttributeOverride(name="refId", column=@Column(name="REF_ID", nullable=false, length=50) ), 
        @AttributeOverride(name="transId", column=@Column(name="TRANS_ID", nullable=false, length=36) ), 
        @AttributeOverride(name="partnerId", column=@Column(name="PARTNER_ID", nullable=false, length=50) ), 
        @AttributeOverride(name="clientId", column=@Column(name="CLIENT_ID", nullable=false, length=30) ), 
        @AttributeOverride(name="severity", column=@Column(name="SEVERITY", nullable=false, length=1) ), 
        @AttributeOverride(name="info", column=@Column(name="INFO", nullable=false, length=2048) ), 
        @AttributeOverride(name="summary", column=@Column(name="SUMMARY", nullable=false, length=250) ) } )
    public Tr6lgProcId getId() {
        return this.id;
    }
    
    public void setId(Tr6lgProcId id) {
        this.id = id;
    }




}


