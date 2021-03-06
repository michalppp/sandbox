package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Pod generated by hbm2java
 */
@Entity
@Table(name="POD"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Pod  implements java.io.Serializable {


     private PodId id;

    public Pod() {
    }

    public Pod(PodId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="mandant", column=@Column(name="MANDANT", nullable=false, length=40) ), 
        @AttributeOverride(name="pvsshipmentno", column=@Column(name="PVSSHIPMENTNO", nullable=false, length=40) ), 
        @AttributeOverride(name="confirmationdate", column=@Column(name="CONFIRMATIONDATE", nullable=false, length=8) ), 
        @AttributeOverride(name="confirmationtime", column=@Column(name="CONFIRMATIONTIME", nullable=false, length=6) ), 
        @AttributeOverride(name="signature", column=@Column(name="SIGNATURE", nullable=false, length=40) ), 
        @AttributeOverride(name="transactionid", column=@Column(name="TRANSACTIONID", nullable=false, length=50) ), 
        @AttributeOverride(name="creationtimestamp", column=@Column(name="CREATIONTIMESTAMP", nullable=false, length=26) ) } )
    public PodId getId() {
        return this.id;
    }
    
    public void setId(PodId id) {
        this.id = id;
    }




}


