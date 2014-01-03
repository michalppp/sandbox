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
 * MqTrStat generated by hbm2java
 */
@Entity
@Table(name="MQ_TR_STAT"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"PARTNER", "MESSAGETYP", "SEQ_NO"}) 
)
public class MqTrStat  implements java.io.Serializable {


     private MqTrStatId id;

    public MqTrStat() {
    }

    public MqTrStat(MqTrStatId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="taskId", column=@Column(name="TASK_ID", nullable=false, length=36) ), 
        @AttributeOverride(name="transId", column=@Column(name="TRANS_ID", nullable=false, length=36) ), 
        @AttributeOverride(name="partner", column=@Column(name="PARTNER", nullable=false, length=10) ), 
        @AttributeOverride(name="messagetyp", column=@Column(name="MESSAGETYP", nullable=false, length=50) ), 
        @AttributeOverride(name="seqNo", column=@Column(name="SEQ_NO", nullable=false, precision=10, scale=0) ), 
        @AttributeOverride(name="filename", column=@Column(name="FILENAME", nullable=false, length=50) ), 
        @AttributeOverride(name="direction", column=@Column(name="DIRECTION", nullable=false, length=1) ), 
        @AttributeOverride(name="recordCnt", column=@Column(name="RECORD_CNT", nullable=false, precision=10, scale=0) ), 
        @AttributeOverride(name="processed", column=@Column(name="PROCESSED", nullable=false, length=1) ), 
        @AttributeOverride(name="procTs", column=@Column(name="PROC_TS", nullable=false, length=26) ), 
        @AttributeOverride(name="pcmlRetc", column=@Column(name="PCML_RETC", nullable=false, length=1) ), 
        @AttributeOverride(name="pcmlRetm", column=@Column(name="PCML_RETM", nullable=false, length=100) ), 
        @AttributeOverride(name="creatTs", column=@Column(name="CREAT_TS", nullable=false, length=26) ) } )
    public MqTrStatId getId() {
        return this.id;
    }
    
    public void setId(MqTrStatId id) {
        this.id = id;
    }




}


