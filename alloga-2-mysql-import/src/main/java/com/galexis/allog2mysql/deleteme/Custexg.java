package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Custexg generated by hbm2java
 */
@Entity
@Table(name="CUSTEXG"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Custexg  implements java.io.Serializable {


     private long pk;
     private String custglx;
     private String custgln;
     private String custglxwarehouse;
     private char custglxact;
     private char custglxblk;
     private String transactionid;
     private Date recordcreationtime;
     private char recordprocessedflag;
     private Date recordprocessingtime;

    public Custexg() {
    }

	
    public Custexg(long pk, String custglx, String custgln, String custglxwarehouse, char custglxact, char custglxblk, String transactionid, Date recordcreationtime, char recordprocessedflag) {
        this.pk = pk;
        this.custglx = custglx;
        this.custgln = custgln;
        this.custglxwarehouse = custglxwarehouse;
        this.custglxact = custglxact;
        this.custglxblk = custglxblk;
        this.transactionid = transactionid;
        this.recordcreationtime = recordcreationtime;
        this.recordprocessedflag = recordprocessedflag;
    }
    public Custexg(long pk, String custglx, String custgln, String custglxwarehouse, char custglxact, char custglxblk, String transactionid, Date recordcreationtime, char recordprocessedflag, Date recordprocessingtime) {
       this.pk = pk;
       this.custglx = custglx;
       this.custgln = custgln;
       this.custglxwarehouse = custglxwarehouse;
       this.custglxact = custglxact;
       this.custglxblk = custglxblk;
       this.transactionid = transactionid;
       this.recordcreationtime = recordcreationtime;
       this.recordprocessedflag = recordprocessedflag;
       this.recordprocessingtime = recordprocessingtime;
    }
   
     @Id 

    
    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }

    
    @Column(name="CUSTGLX", nullable=false, length=11)
    public String getCustglx() {
        return this.custglx;
    }
    
    public void setCustglx(String custglx) {
        this.custglx = custglx;
    }

    
    @Column(name="CUSTGLN", nullable=false, length=13)
    public String getCustgln() {
        return this.custgln;
    }
    
    public void setCustgln(String custgln) {
        this.custgln = custgln;
    }

    
    @Column(name="CUSTGLXWAREHOUSE", nullable=false, length=3)
    public String getCustglxwarehouse() {
        return this.custglxwarehouse;
    }
    
    public void setCustglxwarehouse(String custglxwarehouse) {
        this.custglxwarehouse = custglxwarehouse;
    }

    
    @Column(name="CUSTGLXACT", nullable=false, length=1)
    public char getCustglxact() {
        return this.custglxact;
    }
    
    public void setCustglxact(char custglxact) {
        this.custglxact = custglxact;
    }

    
    @Column(name="CUSTGLXBLK", nullable=false, length=1)
    public char getCustglxblk() {
        return this.custglxblk;
    }
    
    public void setCustglxblk(char custglxblk) {
        this.custglxblk = custglxblk;
    }

    
    @Column(name="TRANSACTIONID", nullable=false, length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }

    
    @Column(name="RECORDPROCESSEDFLAG", nullable=false, length=1)
    public char getRecordprocessedflag() {
        return this.recordprocessedflag;
    }
    
    public void setRecordprocessedflag(char recordprocessedflag) {
        this.recordprocessedflag = recordprocessedflag;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDPROCESSINGTIME", length=26)
    public Date getRecordprocessingtime() {
        return this.recordprocessingtime;
    }
    
    public void setRecordprocessingtime(Date recordprocessingtime) {
        this.recordprocessingtime = recordprocessingtime;
    }




}

