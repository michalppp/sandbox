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
 * Bizwclfunc generated by hbm2java
 */
@Entity
@Table(name="BIZWCLFUNC"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = {@UniqueConstraint(columnNames={"BIZPWEBCLPK", "BIZWEBFUNHPK"}), @UniqueConstraint(columnNames="PK")} 
)
public class Bizwclfunc  implements java.io.Serializable {


     private BizwclfuncId id;
     private Bizwebfunh bizwebfunh;
     private Bizpwebcl bizpwebcl;

    public Bizwclfunc() {
    }

    public Bizwclfunc(BizwclfuncId id, Bizwebfunh bizwebfunh, Bizpwebcl bizpwebcl) {
       this.id = id;
       this.bizwebfunh = bizwebfunh;
       this.bizpwebcl = bizpwebcl;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", unique=true, nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="bizpwebclpk", column=@Column(name="BIZPWEBCLPK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="bizwebfunhpk", column=@Column(name="BIZWEBFUNHPK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="disabledflag", column=@Column(name="DISABLEDFLAG", length=1) ), 
        @AttributeOverride(name="userid", column=@Column(name="USERID", length=10) ), 
        @AttributeOverride(name="recordlastchangetime", column=@Column(name="RECORDLASTCHANGETIME", length=26) ), 
        @AttributeOverride(name="recordcreationtime", column=@Column(name="RECORDCREATIONTIME", nullable=false, length=26) ) } )
    public BizwclfuncId getId() {
        return this.id;
    }
    
    public void setId(BizwclfuncId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZWEBFUNHPK", nullable=false, insertable=false, updatable=false)
    public Bizwebfunh getBizwebfunh() {
        return this.bizwebfunh;
    }
    
    public void setBizwebfunh(Bizwebfunh bizwebfunh) {
        this.bizwebfunh = bizwebfunh;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZPWEBCLPK", nullable=false, insertable=false, updatable=false)
    public Bizpwebcl getBizpwebcl() {
        return this.bizpwebcl;
    }
    
    public void setBizpwebcl(Bizpwebcl bizpwebcl) {
        this.bizpwebcl = bizpwebcl;
    }




}

