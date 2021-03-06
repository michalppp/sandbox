package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Bizpwebcl generated by hbm2java
 */
@Entity
@Table(name="BIZPWEBCL"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames="CLIENTID") 
)
public class Bizpwebcl  implements java.io.Serializable {


     private long pk;
     private Bizpmaster bizpmaster;
     private String clientid;
     private Short lineperpage;
     private String democlientflag;
     private String adminclientflag;
     private String name;
     private String mailaddress;
     private String webpassword;
     private String passwordenabledflag;
     private Byte numberofattempts;
     private Byte maxnumberofattempts;
     private Integer numberofaccesses;
     private Date lastuseddate;
     private String systemadministratorflag;
     private String codeactiveinactive;
     private String viewmyaccountflag;
     private String changepasswordalwdflag;
     private String userid;
     private Date recordlastchangetime;
     private Date recordcreationtime;
     private Set<Bizwclfunc> bizwclfuncs = new HashSet<Bizwclfunc>(0);

    public Bizpwebcl() {
    }

	
    public Bizpwebcl(long pk, String clientid, Date recordcreationtime) {
        this.pk = pk;
        this.clientid = clientid;
        this.recordcreationtime = recordcreationtime;
    }
    public Bizpwebcl(long pk, Bizpmaster bizpmaster, String clientid, Short lineperpage, String democlientflag, String adminclientflag, String name, String mailaddress, String webpassword, String passwordenabledflag, Byte numberofattempts, Byte maxnumberofattempts, Integer numberofaccesses, Date lastuseddate, String systemadministratorflag, String codeactiveinactive, String viewmyaccountflag, String changepasswordalwdflag, String userid, Date recordlastchangetime, Date recordcreationtime, Set<Bizwclfunc> bizwclfuncs) {
       this.pk = pk;
       this.bizpmaster = bizpmaster;
       this.clientid = clientid;
       this.lineperpage = lineperpage;
       this.democlientflag = democlientflag;
       this.adminclientflag = adminclientflag;
       this.name = name;
       this.mailaddress = mailaddress;
       this.webpassword = webpassword;
       this.passwordenabledflag = passwordenabledflag;
       this.numberofattempts = numberofattempts;
       this.maxnumberofattempts = maxnumberofattempts;
       this.numberofaccesses = numberofaccesses;
       this.lastuseddate = lastuseddate;
       this.systemadministratorflag = systemadministratorflag;
       this.codeactiveinactive = codeactiveinactive;
       this.viewmyaccountflag = viewmyaccountflag;
       this.changepasswordalwdflag = changepasswordalwdflag;
       this.userid = userid;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
       this.bizwclfuncs = bizwclfuncs;
    }
   
     @Id 

    
    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZPMASTERPK")
    public Bizpmaster getBizpmaster() {
        return this.bizpmaster;
    }
    
    public void setBizpmaster(Bizpmaster bizpmaster) {
        this.bizpmaster = bizpmaster;
    }

    
    @Column(name="CLIENTID", unique=true, nullable=false, length=30)
    public String getClientid() {
        return this.clientid;
    }
    
    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    
    @Column(name="LINEPERPAGE", precision=3, scale=0)
    public Short getLineperpage() {
        return this.lineperpage;
    }
    
    public void setLineperpage(Short lineperpage) {
        this.lineperpage = lineperpage;
    }

    
    @Column(name="DEMOCLIENTFLAG", length=1)
    public String getDemoclientflag() {
        return this.democlientflag;
    }
    
    public void setDemoclientflag(String democlientflag) {
        this.democlientflag = democlientflag;
    }

    
    @Column(name="ADMINCLIENTFLAG", length=1)
    public String getAdminclientflag() {
        return this.adminclientflag;
    }
    
    public void setAdminclientflag(String adminclientflag) {
        this.adminclientflag = adminclientflag;
    }

    
    @Column(name="NAME", length=30)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="MAILADDRESS", length=50)
    public String getMailaddress() {
        return this.mailaddress;
    }
    
    public void setMailaddress(String mailaddress) {
        this.mailaddress = mailaddress;
    }

    
    @Column(name="WEBPASSWORD", length=10)
    public String getWebpassword() {
        return this.webpassword;
    }
    
    public void setWebpassword(String webpassword) {
        this.webpassword = webpassword;
    }

    
    @Column(name="PASSWORDENABLEDFLAG", length=1)
    public String getPasswordenabledflag() {
        return this.passwordenabledflag;
    }
    
    public void setPasswordenabledflag(String passwordenabledflag) {
        this.passwordenabledflag = passwordenabledflag;
    }

    
    @Column(name="NUMBEROFATTEMPTS", precision=2, scale=0)
    public Byte getNumberofattempts() {
        return this.numberofattempts;
    }
    
    public void setNumberofattempts(Byte numberofattempts) {
        this.numberofattempts = numberofattempts;
    }

    
    @Column(name="MAXNUMBEROFATTEMPTS", precision=2, scale=0)
    public Byte getMaxnumberofattempts() {
        return this.maxnumberofattempts;
    }
    
    public void setMaxnumberofattempts(Byte maxnumberofattempts) {
        this.maxnumberofattempts = maxnumberofattempts;
    }

    
    @Column(name="NUMBEROFACCESSES", precision=7, scale=0)
    public Integer getNumberofaccesses() {
        return this.numberofaccesses;
    }
    
    public void setNumberofaccesses(Integer numberofaccesses) {
        this.numberofaccesses = numberofaccesses;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LASTUSEDDATE", length=26)
    public Date getLastuseddate() {
        return this.lastuseddate;
    }
    
    public void setLastuseddate(Date lastuseddate) {
        this.lastuseddate = lastuseddate;
    }

    
    @Column(name="SYSTEMADMINISTRATORFLAG", length=1)
    public String getSystemadministratorflag() {
        return this.systemadministratorflag;
    }
    
    public void setSystemadministratorflag(String systemadministratorflag) {
        this.systemadministratorflag = systemadministratorflag;
    }

    
    @Column(name="CODEACTIVEINACTIVE", length=1)
    public String getCodeactiveinactive() {
        return this.codeactiveinactive;
    }
    
    public void setCodeactiveinactive(String codeactiveinactive) {
        this.codeactiveinactive = codeactiveinactive;
    }

    
    @Column(name="VIEWMYACCOUNTFLAG", length=1)
    public String getViewmyaccountflag() {
        return this.viewmyaccountflag;
    }
    
    public void setViewmyaccountflag(String viewmyaccountflag) {
        this.viewmyaccountflag = viewmyaccountflag;
    }

    
    @Column(name="CHANGEPASSWORDALWDFLAG", length=1)
    public String getChangepasswordalwdflag() {
        return this.changepasswordalwdflag;
    }
    
    public void setChangepasswordalwdflag(String changepasswordalwdflag) {
        this.changepasswordalwdflag = changepasswordalwdflag;
    }

    
    @Column(name="USERID", length=10)
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDLASTCHANGETIME", length=26)
    public Date getRecordlastchangetime() {
        return this.recordlastchangetime;
    }
    
    public void setRecordlastchangetime(Date recordlastchangetime) {
        this.recordlastchangetime = recordlastchangetime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpwebcl")
    public Set<Bizwclfunc> getBizwclfuncs() {
        return this.bizwclfuncs;
    }
    
    public void setBizwclfuncs(Set<Bizwclfunc> bizwclfuncs) {
        this.bizwclfuncs = bizwclfuncs;
    }




}


