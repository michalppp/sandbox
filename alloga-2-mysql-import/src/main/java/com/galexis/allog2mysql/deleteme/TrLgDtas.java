package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * TrLgDtas generated by hbm2java
 */
@Entity
@Table(name="TR_LG_DTAS"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class TrLgDtas  implements java.io.Serializable {


     private TrLgDtasId id;

    public TrLgDtas() {
    }

    public TrLgDtas(TrLgDtasId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="crTime", column=@Column(name="CR_TIME", nullable=false, length=26) ), 
        @AttributeOverride(name="appId", column=@Column(name="APP_ID", nullable=false, length=10) ), 
        @AttributeOverride(name="tag", column=@Column(name="TAG", nullable=false, length=80) ), 
        @AttributeOverride(name="transId", column=@Column(name="TRANS_ID", nullable=false, length=36) ), 
        @AttributeOverride(name="severity", column=@Column(name="SEVERITY", nullable=false, length=1) ), 
        @AttributeOverride(name="data", column=@Column(name="DATA", nullable=false, length=2500) ), 
        @AttributeOverride(name="segmNo", column=@Column(name="SEGM_NO", nullable=false, precision=5, scale=0) ), 
        @AttributeOverride(name="summary", column=@Column(name="SUMMARY", nullable=false, length=250) ) } )
    public TrLgDtasId getId() {
        return this.id;
    }
    
    public void setId(TrLgDtasId id) {
        this.id = id;
    }




}


