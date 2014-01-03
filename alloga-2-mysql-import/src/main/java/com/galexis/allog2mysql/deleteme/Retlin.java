package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
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

/**
 * Retlin generated by hbm2java
 */
@Entity
@Table(name="RETLIN"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Retlin  implements java.io.Serializable {


     private long pk;
     private Itemmaster itemmaster;
     private Rethdr rethdr;
     private Dellin dellin;
     private int incidentline;
     private Long salesordernr;
     private Integer salesorderline;
     private String salesordertype;
     private Date orderdate;
     private Long invoicenr;
     private Integer invoicelinenr;
     private String itemnr;
     private String itemnrcontractor;
     private BigDecimal returnedqty;
     private String unit;
     private String problemcode;
     private String problemcodedesc;
     private String resolutioncode;
     private String batchcontrolledflag;
     private String qualitycontrolperformedflag;
     private Date qualitycontroldate;
     private Long newordernr;
     private Integer neworderline;
     private BigDecimal refundpercentage;
     private String freeofchargereasoncode;
     private Integer ipSalesordertype;
     private Integer ipInvoicetype;
     private Integer ipFreeofchargereasoncode;
     private String ipGroupingcriteria1;
     private String ipGroupingcriteria2;
     private String ipGroupingcriteria3;
     private String ipGroupingcriteria4;
     private String ipGroupingcriteria5;
     private String programname;
     private String filename;
     private String processingflag1;
     private String processingflag2;
     private String processingflag3;
     private String processingflag4;
     private String processingflag5;
     private String processingflag6;
     private String processingflag7;
     private String processingflag8;
     private String processingflag9;
     private String processingflag10;
     private String outboundignore;
     private Date recordlastchangetime;
     private Date recordcreationtime;
     private Set<Custopolin> custopolins = new HashSet<Custopolin>(0);
     private Set<Retlinbtc> retlinbtcs = new HashSet<Retlinbtc>(0);

    public Retlin() {
    }

	
    public Retlin(long pk, Itemmaster itemmaster, Rethdr rethdr, int incidentline, String itemnr, String outboundignore, Date recordcreationtime) {
        this.pk = pk;
        this.itemmaster = itemmaster;
        this.rethdr = rethdr;
        this.incidentline = incidentline;
        this.itemnr = itemnr;
        this.outboundignore = outboundignore;
        this.recordcreationtime = recordcreationtime;
    }
    public Retlin(long pk, Itemmaster itemmaster, Rethdr rethdr, Dellin dellin, int incidentline, Long salesordernr, Integer salesorderline, String salesordertype, Date orderdate, Long invoicenr, Integer invoicelinenr, String itemnr, String itemnrcontractor, BigDecimal returnedqty, String unit, String problemcode, String problemcodedesc, String resolutioncode, String batchcontrolledflag, String qualitycontrolperformedflag, Date qualitycontroldate, Long newordernr, Integer neworderline, BigDecimal refundpercentage, String freeofchargereasoncode, Integer ipSalesordertype, Integer ipInvoicetype, Integer ipFreeofchargereasoncode, String ipGroupingcriteria1, String ipGroupingcriteria2, String ipGroupingcriteria3, String ipGroupingcriteria4, String ipGroupingcriteria5, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime, Set<Custopolin> custopolins, Set<Retlinbtc> retlinbtcs) {
       this.pk = pk;
       this.itemmaster = itemmaster;
       this.rethdr = rethdr;
       this.dellin = dellin;
       this.incidentline = incidentline;
       this.salesordernr = salesordernr;
       this.salesorderline = salesorderline;
       this.salesordertype = salesordertype;
       this.orderdate = orderdate;
       this.invoicenr = invoicenr;
       this.invoicelinenr = invoicelinenr;
       this.itemnr = itemnr;
       this.itemnrcontractor = itemnrcontractor;
       this.returnedqty = returnedqty;
       this.unit = unit;
       this.problemcode = problemcode;
       this.problemcodedesc = problemcodedesc;
       this.resolutioncode = resolutioncode;
       this.batchcontrolledflag = batchcontrolledflag;
       this.qualitycontrolperformedflag = qualitycontrolperformedflag;
       this.qualitycontroldate = qualitycontroldate;
       this.newordernr = newordernr;
       this.neworderline = neworderline;
       this.refundpercentage = refundpercentage;
       this.freeofchargereasoncode = freeofchargereasoncode;
       this.ipSalesordertype = ipSalesordertype;
       this.ipInvoicetype = ipInvoicetype;
       this.ipFreeofchargereasoncode = ipFreeofchargereasoncode;
       this.ipGroupingcriteria1 = ipGroupingcriteria1;
       this.ipGroupingcriteria2 = ipGroupingcriteria2;
       this.ipGroupingcriteria3 = ipGroupingcriteria3;
       this.ipGroupingcriteria4 = ipGroupingcriteria4;
       this.ipGroupingcriteria5 = ipGroupingcriteria5;
       this.programname = programname;
       this.filename = filename;
       this.processingflag1 = processingflag1;
       this.processingflag2 = processingflag2;
       this.processingflag3 = processingflag3;
       this.processingflag4 = processingflag4;
       this.processingflag5 = processingflag5;
       this.processingflag6 = processingflag6;
       this.processingflag7 = processingflag7;
       this.processingflag8 = processingflag8;
       this.processingflag9 = processingflag9;
       this.processingflag10 = processingflag10;
       this.outboundignore = outboundignore;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
       this.custopolins = custopolins;
       this.retlinbtcs = retlinbtcs;
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
    @JoinColumn(name="ITEMMASTERPK", nullable=false)
    public Itemmaster getItemmaster() {
        return this.itemmaster;
    }
    
    public void setItemmaster(Itemmaster itemmaster) {
        this.itemmaster = itemmaster;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RETHDRPK", nullable=false)
    public Rethdr getRethdr() {
        return this.rethdr;
    }
    
    public void setRethdr(Rethdr rethdr) {
        this.rethdr = rethdr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DELLINPK")
    public Dellin getDellin() {
        return this.dellin;
    }
    
    public void setDellin(Dellin dellin) {
        this.dellin = dellin;
    }

    
    @Column(name="INCIDENTLINE", nullable=false, precision=5, scale=0)
    public int getIncidentline() {
        return this.incidentline;
    }
    
    public void setIncidentline(int incidentline) {
        this.incidentline = incidentline;
    }

    
    @Column(name="SALESORDERNR", precision=12, scale=0)
    public Long getSalesordernr() {
        return this.salesordernr;
    }
    
    public void setSalesordernr(Long salesordernr) {
        this.salesordernr = salesordernr;
    }

    
    @Column(name="SALESORDERLINE", precision=5, scale=0)
    public Integer getSalesorderline() {
        return this.salesorderline;
    }
    
    public void setSalesorderline(Integer salesorderline) {
        this.salesorderline = salesorderline;
    }

    
    @Column(name="SALESORDERTYPE", length=2)
    public String getSalesordertype() {
        return this.salesordertype;
    }
    
    public void setSalesordertype(String salesordertype) {
        this.salesordertype = salesordertype;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ORDERDATE", length=26)
    public Date getOrderdate() {
        return this.orderdate;
    }
    
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    
    @Column(name="INVOICENR", precision=12, scale=0)
    public Long getInvoicenr() {
        return this.invoicenr;
    }
    
    public void setInvoicenr(Long invoicenr) {
        this.invoicenr = invoicenr;
    }

    
    @Column(name="INVOICELINENR", precision=5, scale=0)
    public Integer getInvoicelinenr() {
        return this.invoicelinenr;
    }
    
    public void setInvoicelinenr(Integer invoicelinenr) {
        this.invoicelinenr = invoicelinenr;
    }

    
    @Column(name="ITEMNR", nullable=false, length=35)
    public String getItemnr() {
        return this.itemnr;
    }
    
    public void setItemnr(String itemnr) {
        this.itemnr = itemnr;
    }

    
    @Column(name="ITEMNRCONTRACTOR", length=35)
    public String getItemnrcontractor() {
        return this.itemnrcontractor;
    }
    
    public void setItemnrcontractor(String itemnrcontractor) {
        this.itemnrcontractor = itemnrcontractor;
    }

    
    @Column(name="RETURNEDQTY", precision=15, scale=3)
    public BigDecimal getReturnedqty() {
        return this.returnedqty;
    }
    
    public void setReturnedqty(BigDecimal returnedqty) {
        this.returnedqty = returnedqty;
    }

    
    @Column(name="UNIT", length=5)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    
    @Column(name="PROBLEMCODE", length=10)
    public String getProblemcode() {
        return this.problemcode;
    }
    
    public void setProblemcode(String problemcode) {
        this.problemcode = problemcode;
    }

    
    @Column(name="PROBLEMCODEDESC", length=50)
    public String getProblemcodedesc() {
        return this.problemcodedesc;
    }
    
    public void setProblemcodedesc(String problemcodedesc) {
        this.problemcodedesc = problemcodedesc;
    }

    
    @Column(name="RESOLUTIONCODE", length=10)
    public String getResolutioncode() {
        return this.resolutioncode;
    }
    
    public void setResolutioncode(String resolutioncode) {
        this.resolutioncode = resolutioncode;
    }

    
    @Column(name="BATCHCONTROLLEDFLAG", length=1)
    public String getBatchcontrolledflag() {
        return this.batchcontrolledflag;
    }
    
    public void setBatchcontrolledflag(String batchcontrolledflag) {
        this.batchcontrolledflag = batchcontrolledflag;
    }

    
    @Column(name="QUALITYCONTROLPERFORMEDFLAG", length=1)
    public String getQualitycontrolperformedflag() {
        return this.qualitycontrolperformedflag;
    }
    
    public void setQualitycontrolperformedflag(String qualitycontrolperformedflag) {
        this.qualitycontrolperformedflag = qualitycontrolperformedflag;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="QUALITYCONTROLDATE", length=26)
    public Date getQualitycontroldate() {
        return this.qualitycontroldate;
    }
    
    public void setQualitycontroldate(Date qualitycontroldate) {
        this.qualitycontroldate = qualitycontroldate;
    }

    
    @Column(name="NEWORDERNR", precision=12, scale=0)
    public Long getNewordernr() {
        return this.newordernr;
    }
    
    public void setNewordernr(Long newordernr) {
        this.newordernr = newordernr;
    }

    
    @Column(name="NEWORDERLINE", precision=5, scale=0)
    public Integer getNeworderline() {
        return this.neworderline;
    }
    
    public void setNeworderline(Integer neworderline) {
        this.neworderline = neworderline;
    }

    
    @Column(name="REFUNDPERCENTAGE", precision=5)
    public BigDecimal getRefundpercentage() {
        return this.refundpercentage;
    }
    
    public void setRefundpercentage(BigDecimal refundpercentage) {
        this.refundpercentage = refundpercentage;
    }

    
    @Column(name="FREEOFCHARGEREASONCODE", length=2)
    public String getFreeofchargereasoncode() {
        return this.freeofchargereasoncode;
    }
    
    public void setFreeofchargereasoncode(String freeofchargereasoncode) {
        this.freeofchargereasoncode = freeofchargereasoncode;
    }

    
    @Column(name="IP_SALESORDERTYPE", precision=5, scale=0)
    public Integer getIpSalesordertype() {
        return this.ipSalesordertype;
    }
    
    public void setIpSalesordertype(Integer ipSalesordertype) {
        this.ipSalesordertype = ipSalesordertype;
    }

    
    @Column(name="IP_INVOICETYPE", precision=5, scale=0)
    public Integer getIpInvoicetype() {
        return this.ipInvoicetype;
    }
    
    public void setIpInvoicetype(Integer ipInvoicetype) {
        this.ipInvoicetype = ipInvoicetype;
    }

    
    @Column(name="IP_FREEOFCHARGEREASONCODE", precision=5, scale=0)
    public Integer getIpFreeofchargereasoncode() {
        return this.ipFreeofchargereasoncode;
    }
    
    public void setIpFreeofchargereasoncode(Integer ipFreeofchargereasoncode) {
        this.ipFreeofchargereasoncode = ipFreeofchargereasoncode;
    }

    
    @Column(name="IP_GROUPINGCRITERIA1")
    public String getIpGroupingcriteria1() {
        return this.ipGroupingcriteria1;
    }
    
    public void setIpGroupingcriteria1(String ipGroupingcriteria1) {
        this.ipGroupingcriteria1 = ipGroupingcriteria1;
    }

    
    @Column(name="IP_GROUPINGCRITERIA2")
    public String getIpGroupingcriteria2() {
        return this.ipGroupingcriteria2;
    }
    
    public void setIpGroupingcriteria2(String ipGroupingcriteria2) {
        this.ipGroupingcriteria2 = ipGroupingcriteria2;
    }

    
    @Column(name="IP_GROUPINGCRITERIA3")
    public String getIpGroupingcriteria3() {
        return this.ipGroupingcriteria3;
    }
    
    public void setIpGroupingcriteria3(String ipGroupingcriteria3) {
        this.ipGroupingcriteria3 = ipGroupingcriteria3;
    }

    
    @Column(name="IP_GROUPINGCRITERIA4")
    public String getIpGroupingcriteria4() {
        return this.ipGroupingcriteria4;
    }
    
    public void setIpGroupingcriteria4(String ipGroupingcriteria4) {
        this.ipGroupingcriteria4 = ipGroupingcriteria4;
    }

    
    @Column(name="IP_GROUPINGCRITERIA5")
    public String getIpGroupingcriteria5() {
        return this.ipGroupingcriteria5;
    }
    
    public void setIpGroupingcriteria5(String ipGroupingcriteria5) {
        this.ipGroupingcriteria5 = ipGroupingcriteria5;
    }

    
    @Column(name="PROGRAMNAME", length=10)
    public String getProgramname() {
        return this.programname;
    }
    
    public void setProgramname(String programname) {
        this.programname = programname;
    }

    
    @Column(name="FILENAME", length=10)
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }

    
    @Column(name="PROCESSINGFLAG1", length=1)
    public String getProcessingflag1() {
        return this.processingflag1;
    }
    
    public void setProcessingflag1(String processingflag1) {
        this.processingflag1 = processingflag1;
    }

    
    @Column(name="PROCESSINGFLAG2", length=1)
    public String getProcessingflag2() {
        return this.processingflag2;
    }
    
    public void setProcessingflag2(String processingflag2) {
        this.processingflag2 = processingflag2;
    }

    
    @Column(name="PROCESSINGFLAG3", length=1)
    public String getProcessingflag3() {
        return this.processingflag3;
    }
    
    public void setProcessingflag3(String processingflag3) {
        this.processingflag3 = processingflag3;
    }

    
    @Column(name="PROCESSINGFLAG4", length=1)
    public String getProcessingflag4() {
        return this.processingflag4;
    }
    
    public void setProcessingflag4(String processingflag4) {
        this.processingflag4 = processingflag4;
    }

    
    @Column(name="PROCESSINGFLAG5", length=1)
    public String getProcessingflag5() {
        return this.processingflag5;
    }
    
    public void setProcessingflag5(String processingflag5) {
        this.processingflag5 = processingflag5;
    }

    
    @Column(name="PROCESSINGFLAG6", length=1)
    public String getProcessingflag6() {
        return this.processingflag6;
    }
    
    public void setProcessingflag6(String processingflag6) {
        this.processingflag6 = processingflag6;
    }

    
    @Column(name="PROCESSINGFLAG7", length=1)
    public String getProcessingflag7() {
        return this.processingflag7;
    }
    
    public void setProcessingflag7(String processingflag7) {
        this.processingflag7 = processingflag7;
    }

    
    @Column(name="PROCESSINGFLAG8", length=1)
    public String getProcessingflag8() {
        return this.processingflag8;
    }
    
    public void setProcessingflag8(String processingflag8) {
        this.processingflag8 = processingflag8;
    }

    
    @Column(name="PROCESSINGFLAG9", length=1)
    public String getProcessingflag9() {
        return this.processingflag9;
    }
    
    public void setProcessingflag9(String processingflag9) {
        this.processingflag9 = processingflag9;
    }

    
    @Column(name="PROCESSINGFLAG10", length=1)
    public String getProcessingflag10() {
        return this.processingflag10;
    }
    
    public void setProcessingflag10(String processingflag10) {
        this.processingflag10 = processingflag10;
    }

    
    @Column(name="OUTBOUNDIGNORE", nullable=false, length=1)
    public String getOutboundignore() {
        return this.outboundignore;
    }
    
    public void setOutboundignore(String outboundignore) {
        this.outboundignore = outboundignore;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="retlin")
    public Set<Custopolin> getCustopolins() {
        return this.custopolins;
    }
    
    public void setCustopolins(Set<Custopolin> custopolins) {
        this.custopolins = custopolins;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="retlin")
    public Set<Retlinbtc> getRetlinbtcs() {
        return this.retlinbtcs;
    }
    
    public void setRetlinbtcs(Set<Retlinbtc> retlinbtcs) {
        this.retlinbtcs = retlinbtcs;
    }




}


