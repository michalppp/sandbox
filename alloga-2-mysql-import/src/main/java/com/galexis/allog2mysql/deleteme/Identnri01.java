package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Identnri01 generated by hbm2java
 */
@Entity
@Table(name="IDENTNRI01"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Identnri01  implements java.io.Serializable {


     private Identnri01Id id;

    public Identnri01() {
    }

    public Identnri01(Identnri01Id id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="filename", column=@Column(name="FILENAME", nullable=false, length=50) ), 
        @AttributeOverride(name="lastidentifier", column=@Column(name="LASTIDENTIFIER", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="recordlastchangetime", column=@Column(name="RECORDLASTCHANGETIME", nullable=false, length=26) ) } )
    public Identnri01Id getId() {
        return this.id;
    }
    
    public void setId(Identnri01Id id) {
        this.id = id;
    }




}


