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
 * Bizpmaster generated by hbm2java
 */
@Entity
@Table(name="BIZPMASTER"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames="PARTNERNR") 
)
public class Bizpmaster  implements java.io.Serializable {


     private long pk;
     private Bizparaddr bizparaddrByBizparaddrpkMain;
     private Bizparaddr bizparaddrByBizparaddrpkDelivery;
     private Bizparaddr bizparaddrByBizparaddrpkInvoice;
     private String partnernr;
     private String language;
     private String eannr;
     private String customerihabrick;
     private String customergroup;
     private String customergroupdesc;
     private String subcustomergroup;
     private String subcustomergroupdesc;
     private String btmauthorization;
     private String vatnumber;
     private String mergeinvoicingflag;
     private String periodicinvoicingflag;
     private String manneroftransport;
     private String termsofpayment;
     private String phonenumber;
     private String faxnumber;
     private String standardemail;
     private String eplatformaccessflag;
     private String status;
     private Date recordlastchangetime;
     private Date recordcreationtime;
     private Set<Bizpitgaut> bizpitgauts = new HashSet<Bizpitgaut>(0);
     private Set<Bizparaddr> bizparaddrs = new HashSet<Bizparaddr>(0);
     private Set<Bizpconaut> bizpconauts = new HashSet<Bizpconaut>(0);
     private Set<Bizpwebcl> bizpwebcls = new HashSet<Bizpwebcl>(0);
     private Set<Ctrbizpcls> ctrbizpclses = new HashSet<Ctrbizpcls>(0);
     private Set<Contrdef> contrdefs = new HashSet<Contrdef>(0);

    public Bizpmaster() {
    }

	
    public Bizpmaster(long pk, String partnernr, Date recordcreationtime) {
        this.pk = pk;
        this.partnernr = partnernr;
        this.recordcreationtime = recordcreationtime;
    }
    public Bizpmaster(long pk, Bizparaddr bizparaddrByBizparaddrpkMain, Bizparaddr bizparaddrByBizparaddrpkDelivery, Bizparaddr bizparaddrByBizparaddrpkInvoice, String partnernr, String language, String eannr, String customerihabrick, String customergroup, String customergroupdesc, String subcustomergroup, String subcustomergroupdesc, String btmauthorization, String vatnumber, String mergeinvoicingflag, String periodicinvoicingflag, String manneroftransport, String termsofpayment, String phonenumber, String faxnumber, String standardemail, String eplatformaccessflag, String status, Date recordlastchangetime, Date recordcreationtime, Set<Bizpitgaut> bizpitgauts, Set<Bizparaddr> bizparaddrs, Set<Bizpconaut> bizpconauts, Set<Bizpwebcl> bizpwebcls, Set<Ctrbizpcls> ctrbizpclses, Set<Contrdef> contrdefs) {
       this.pk = pk;
       this.bizparaddrByBizparaddrpkMain = bizparaddrByBizparaddrpkMain;
       this.bizparaddrByBizparaddrpkDelivery = bizparaddrByBizparaddrpkDelivery;
       this.bizparaddrByBizparaddrpkInvoice = bizparaddrByBizparaddrpkInvoice;
       this.partnernr = partnernr;
       this.language = language;
       this.eannr = eannr;
       this.customerihabrick = customerihabrick;
       this.customergroup = customergroup;
       this.customergroupdesc = customergroupdesc;
       this.subcustomergroup = subcustomergroup;
       this.subcustomergroupdesc = subcustomergroupdesc;
       this.btmauthorization = btmauthorization;
       this.vatnumber = vatnumber;
       this.mergeinvoicingflag = mergeinvoicingflag;
       this.periodicinvoicingflag = periodicinvoicingflag;
       this.manneroftransport = manneroftransport;
       this.termsofpayment = termsofpayment;
       this.phonenumber = phonenumber;
       this.faxnumber = faxnumber;
       this.standardemail = standardemail;
       this.eplatformaccessflag = eplatformaccessflag;
       this.status = status;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
       this.bizpitgauts = bizpitgauts;
       this.bizparaddrs = bizparaddrs;
       this.bizpconauts = bizpconauts;
       this.bizpwebcls = bizpwebcls;
       this.ctrbizpclses = ctrbizpclses;
       this.contrdefs = contrdefs;
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
    @JoinColumn(name="BIZPARADDRPK_MAIN")
    public Bizparaddr getBizparaddrByBizparaddrpkMain() {
        return this.bizparaddrByBizparaddrpkMain;
    }
    
    public void setBizparaddrByBizparaddrpkMain(Bizparaddr bizparaddrByBizparaddrpkMain) {
        this.bizparaddrByBizparaddrpkMain = bizparaddrByBizparaddrpkMain;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZPARADDRPK_DELIVERY")
    public Bizparaddr getBizparaddrByBizparaddrpkDelivery() {
        return this.bizparaddrByBizparaddrpkDelivery;
    }
    
    public void setBizparaddrByBizparaddrpkDelivery(Bizparaddr bizparaddrByBizparaddrpkDelivery) {
        this.bizparaddrByBizparaddrpkDelivery = bizparaddrByBizparaddrpkDelivery;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZPARADDRPK_INVOICE")
    public Bizparaddr getBizparaddrByBizparaddrpkInvoice() {
        return this.bizparaddrByBizparaddrpkInvoice;
    }
    
    public void setBizparaddrByBizparaddrpkInvoice(Bizparaddr bizparaddrByBizparaddrpkInvoice) {
        this.bizparaddrByBizparaddrpkInvoice = bizparaddrByBizparaddrpkInvoice;
    }

    
    @Column(name="PARTNERNR", unique=true, nullable=false, length=20)
    public String getPartnernr() {
        return this.partnernr;
    }
    
    public void setPartnernr(String partnernr) {
        this.partnernr = partnernr;
    }

    
    @Column(name="LANGUAGE", length=3)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    
    @Column(name="EANNR", length=20)
    public String getEannr() {
        return this.eannr;
    }
    
    public void setEannr(String eannr) {
        this.eannr = eannr;
    }

    
    @Column(name="CUSTOMERIHABRICK", length=4)
    public String getCustomerihabrick() {
        return this.customerihabrick;
    }
    
    public void setCustomerihabrick(String customerihabrick) {
        this.customerihabrick = customerihabrick;
    }

    
    @Column(name="CUSTOMERGROUP", length=10)
    public String getCustomergroup() {
        return this.customergroup;
    }
    
    public void setCustomergroup(String customergroup) {
        this.customergroup = customergroup;
    }

    
    @Column(name="CUSTOMERGROUPDESC", length=50)
    public String getCustomergroupdesc() {
        return this.customergroupdesc;
    }
    
    public void setCustomergroupdesc(String customergroupdesc) {
        this.customergroupdesc = customergroupdesc;
    }

    
    @Column(name="SUBCUSTOMERGROUP", length=10)
    public String getSubcustomergroup() {
        return this.subcustomergroup;
    }
    
    public void setSubcustomergroup(String subcustomergroup) {
        this.subcustomergroup = subcustomergroup;
    }

    
    @Column(name="SUBCUSTOMERGROUPDESC", length=50)
    public String getSubcustomergroupdesc() {
        return this.subcustomergroupdesc;
    }
    
    public void setSubcustomergroupdesc(String subcustomergroupdesc) {
        this.subcustomergroupdesc = subcustomergroupdesc;
    }

    
    @Column(name="BTMAUTHORIZATION", length=1)
    public String getBtmauthorization() {
        return this.btmauthorization;
    }
    
    public void setBtmauthorization(String btmauthorization) {
        this.btmauthorization = btmauthorization;
    }

    
    @Column(name="VATNUMBER", length=20)
    public String getVatnumber() {
        return this.vatnumber;
    }
    
    public void setVatnumber(String vatnumber) {
        this.vatnumber = vatnumber;
    }

    
    @Column(name="MERGEINVOICINGFLAG", length=1)
    public String getMergeinvoicingflag() {
        return this.mergeinvoicingflag;
    }
    
    public void setMergeinvoicingflag(String mergeinvoicingflag) {
        this.mergeinvoicingflag = mergeinvoicingflag;
    }

    
    @Column(name="PERIODICINVOICINGFLAG", length=1)
    public String getPeriodicinvoicingflag() {
        return this.periodicinvoicingflag;
    }
    
    public void setPeriodicinvoicingflag(String periodicinvoicingflag) {
        this.periodicinvoicingflag = periodicinvoicingflag;
    }

    
    @Column(name="MANNEROFTRANSPORT", length=3)
    public String getManneroftransport() {
        return this.manneroftransport;
    }
    
    public void setManneroftransport(String manneroftransport) {
        this.manneroftransport = manneroftransport;
    }

    
    @Column(name="TERMSOFPAYMENT", length=3)
    public String getTermsofpayment() {
        return this.termsofpayment;
    }
    
    public void setTermsofpayment(String termsofpayment) {
        this.termsofpayment = termsofpayment;
    }

    
    @Column(name="PHONENUMBER", length=40)
    public String getPhonenumber() {
        return this.phonenumber;
    }
    
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    
    @Column(name="FAXNUMBER", length=40)
    public String getFaxnumber() {
        return this.faxnumber;
    }
    
    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    
    @Column(name="STANDARDEMAIL", length=40)
    public String getStandardemail() {
        return this.standardemail;
    }
    
    public void setStandardemail(String standardemail) {
        this.standardemail = standardemail;
    }

    
    @Column(name="EPLATFORMACCESSFLAG", length=1)
    public String getEplatformaccessflag() {
        return this.eplatformaccessflag;
    }
    
    public void setEplatformaccessflag(String eplatformaccessflag) {
        this.eplatformaccessflag = eplatformaccessflag;
    }

    
    @Column(name="STATUS", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpmaster")
    public Set<Bizpitgaut> getBizpitgauts() {
        return this.bizpitgauts;
    }
    
    public void setBizpitgauts(Set<Bizpitgaut> bizpitgauts) {
        this.bizpitgauts = bizpitgauts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpmaster")
    public Set<Bizparaddr> getBizparaddrs() {
        return this.bizparaddrs;
    }
    
    public void setBizparaddrs(Set<Bizparaddr> bizparaddrs) {
        this.bizparaddrs = bizparaddrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpmaster")
    public Set<Bizpconaut> getBizpconauts() {
        return this.bizpconauts;
    }
    
    public void setBizpconauts(Set<Bizpconaut> bizpconauts) {
        this.bizpconauts = bizpconauts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpmaster")
    public Set<Bizpwebcl> getBizpwebcls() {
        return this.bizpwebcls;
    }
    
    public void setBizpwebcls(Set<Bizpwebcl> bizpwebcls) {
        this.bizpwebcls = bizpwebcls;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpmaster")
    public Set<Ctrbizpcls> getCtrbizpclses() {
        return this.ctrbizpclses;
    }
    
    public void setCtrbizpclses(Set<Ctrbizpcls> ctrbizpclses) {
        this.ctrbizpclses = ctrbizpclses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="bizpmaster")
    public Set<Contrdef> getContrdefs() {
        return this.contrdefs;
    }
    
    public void setContrdefs(Set<Contrdef> contrdefs) {
        this.contrdefs = contrdefs;
    }




}


