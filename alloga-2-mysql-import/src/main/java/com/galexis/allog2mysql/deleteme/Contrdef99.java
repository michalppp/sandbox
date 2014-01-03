package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contrdef99 generated by hbm2java
 */
@Entity
@Table(name="CONTRDEF99"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Contrdef99  implements java.io.Serializable {


     private Contrdef99Id id;

    public Contrdef99() {
    }

    public Contrdef99(Contrdef99Id id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="contractor", column=@Column(name="CONTRACTOR", nullable=false, length=10) ), 
        @AttributeOverride(name="supplier", column=@Column(name="SUPPLIER", length=20) ), 
        @AttributeOverride(name="description", column=@Column(name="DESCRIPTION", length=100) ) } )
    public Contrdef99Id getId() {
        return this.id;
    }
    
    public void setId(Contrdef99Id id) {
        this.id = id;
    }




}

