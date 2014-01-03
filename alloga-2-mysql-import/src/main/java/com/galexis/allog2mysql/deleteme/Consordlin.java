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
 * Consordlin generated by hbm2java
 */
@Entity
@Table(name="CONSORDLIN"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Consordlin  implements java.io.Serializable {


     private long pk;
     private Consordhdr consordhdr;
     private long consignmentline;
     private long itemmasterpk;
     private String itemnr;
     private String itemnrcontractor;
     private String itemnrcontractor2;
     private BigDecimal orderqty;
     private BigDecimal invoiceqty;
     private String unit;
     private BigDecimal salesprice;
     private BigDecimal salesamount;
     private BigDecimal netprice;
     private BigDecimal netsalesvalue;
     private BigDecimal orderdiscountpercentage;
     private String freeofchargeflag;
     private String freeofchargereasoncode;
     private BigDecimal totalamountexcludingvat;
     private BigDecimal totalamountincludingvat;
     private BigDecimal vatamount;
     private String vathandlingcode;
     private BigDecimal vathandlingcodepercentage;
     private String vatcodeflag;
     private String vatincludedinpricesflag;
     private BigDecimal exfactoryepaprice;
     private BigDecimal exfactoryepaamount;
     private BigDecimal exfactoryepmprice;
     private BigDecimal exfactoryepmamount;
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
     private Set<Consordldt> consordldts = new HashSet<Consordldt>(0);

    public Consordlin() {
    }

	
    public Consordlin(long pk, Consordhdr consordhdr, long consignmentline, long itemmasterpk, String itemnr, String outboundignore, Date recordcreationtime) {
        this.pk = pk;
        this.consordhdr = consordhdr;
        this.consignmentline = consignmentline;
        this.itemmasterpk = itemmasterpk;
        this.itemnr = itemnr;
        this.outboundignore = outboundignore;
        this.recordcreationtime = recordcreationtime;
    }
    public Consordlin(long pk, Consordhdr consordhdr, long consignmentline, long itemmasterpk, String itemnr, String itemnrcontractor, String itemnrcontractor2, BigDecimal orderqty, BigDecimal invoiceqty, String unit, BigDecimal salesprice, BigDecimal salesamount, BigDecimal netprice, BigDecimal netsalesvalue, BigDecimal orderdiscountpercentage, String freeofchargeflag, String freeofchargereasoncode, BigDecimal totalamountexcludingvat, BigDecimal totalamountincludingvat, BigDecimal vatamount, String vathandlingcode, BigDecimal vathandlingcodepercentage, String vatcodeflag, String vatincludedinpricesflag, BigDecimal exfactoryepaprice, BigDecimal exfactoryepaamount, BigDecimal exfactoryepmprice, BigDecimal exfactoryepmamount, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime, Set<Consordldt> consordldts) {
       this.pk = pk;
       this.consordhdr = consordhdr;
       this.consignmentline = consignmentline;
       this.itemmasterpk = itemmasterpk;
       this.itemnr = itemnr;
       this.itemnrcontractor = itemnrcontractor;
       this.itemnrcontractor2 = itemnrcontractor2;
       this.orderqty = orderqty;
       this.invoiceqty = invoiceqty;
       this.unit = unit;
       this.salesprice = salesprice;
       this.salesamount = salesamount;
       this.netprice = netprice;
       this.netsalesvalue = netsalesvalue;
       this.orderdiscountpercentage = orderdiscountpercentage;
       this.freeofchargeflag = freeofchargeflag;
       this.freeofchargereasoncode = freeofchargereasoncode;
       this.totalamountexcludingvat = totalamountexcludingvat;
       this.totalamountincludingvat = totalamountincludingvat;
       this.vatamount = vatamount;
       this.vathandlingcode = vathandlingcode;
       this.vathandlingcodepercentage = vathandlingcodepercentage;
       this.vatcodeflag = vatcodeflag;
       this.vatincludedinpricesflag = vatincludedinpricesflag;
       this.exfactoryepaprice = exfactoryepaprice;
       this.exfactoryepaamount = exfactoryepaamount;
       this.exfactoryepmprice = exfactoryepmprice;
       this.exfactoryepmamount = exfactoryepmamount;
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
       this.consordldts = consordldts;
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
    @JoinColumn(name="CONSHDRPK", nullable=false)
    public Consordhdr getConsordhdr() {
        return this.consordhdr;
    }
    
    public void setConsordhdr(Consordhdr consordhdr) {
        this.consordhdr = consordhdr;
    }

    
    @Column(name="CONSIGNMENTLINE", nullable=false, precision=12, scale=0)
    public long getConsignmentline() {
        return this.consignmentline;
    }
    
    public void setConsignmentline(long consignmentline) {
        this.consignmentline = consignmentline;
    }

    
    @Column(name="ITEMMASTERPK", nullable=false, precision=12, scale=0)
    public long getItemmasterpk() {
        return this.itemmasterpk;
    }
    
    public void setItemmasterpk(long itemmasterpk) {
        this.itemmasterpk = itemmasterpk;
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

    
    @Column(name="ITEMNRCONTRACTOR2", length=35)
    public String getItemnrcontractor2() {
        return this.itemnrcontractor2;
    }
    
    public void setItemnrcontractor2(String itemnrcontractor2) {
        this.itemnrcontractor2 = itemnrcontractor2;
    }

    
    @Column(name="ORDERQTY", precision=15, scale=3)
    public BigDecimal getOrderqty() {
        return this.orderqty;
    }
    
    public void setOrderqty(BigDecimal orderqty) {
        this.orderqty = orderqty;
    }

    
    @Column(name="INVOICEQTY", precision=15, scale=3)
    public BigDecimal getInvoiceqty() {
        return this.invoiceqty;
    }
    
    public void setInvoiceqty(BigDecimal invoiceqty) {
        this.invoiceqty = invoiceqty;
    }

    
    @Column(name="UNIT", length=5)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    
    @Column(name="SALESPRICE", precision=17, scale=4)
    public BigDecimal getSalesprice() {
        return this.salesprice;
    }
    
    public void setSalesprice(BigDecimal salesprice) {
        this.salesprice = salesprice;
    }

    
    @Column(name="SALESAMOUNT", precision=17, scale=4)
    public BigDecimal getSalesamount() {
        return this.salesamount;
    }
    
    public void setSalesamount(BigDecimal salesamount) {
        this.salesamount = salesamount;
    }

    
    @Column(name="NETPRICE", precision=17, scale=4)
    public BigDecimal getNetprice() {
        return this.netprice;
    }
    
    public void setNetprice(BigDecimal netprice) {
        this.netprice = netprice;
    }

    
    @Column(name="NETSALESVALUE", precision=17, scale=4)
    public BigDecimal getNetsalesvalue() {
        return this.netsalesvalue;
    }
    
    public void setNetsalesvalue(BigDecimal netsalesvalue) {
        this.netsalesvalue = netsalesvalue;
    }

    
    @Column(name="ORDERDISCOUNTPERCENTAGE", precision=5)
    public BigDecimal getOrderdiscountpercentage() {
        return this.orderdiscountpercentage;
    }
    
    public void setOrderdiscountpercentage(BigDecimal orderdiscountpercentage) {
        this.orderdiscountpercentage = orderdiscountpercentage;
    }

    
    @Column(name="FREEOFCHARGEFLAG", length=1)
    public String getFreeofchargeflag() {
        return this.freeofchargeflag;
    }
    
    public void setFreeofchargeflag(String freeofchargeflag) {
        this.freeofchargeflag = freeofchargeflag;
    }

    
    @Column(name="FREEOFCHARGEREASONCODE", length=2)
    public String getFreeofchargereasoncode() {
        return this.freeofchargereasoncode;
    }
    
    public void setFreeofchargereasoncode(String freeofchargereasoncode) {
        this.freeofchargereasoncode = freeofchargereasoncode;
    }

    
    @Column(name="TOTALAMOUNTEXCLUDINGVAT", precision=17, scale=4)
    public BigDecimal getTotalamountexcludingvat() {
        return this.totalamountexcludingvat;
    }
    
    public void setTotalamountexcludingvat(BigDecimal totalamountexcludingvat) {
        this.totalamountexcludingvat = totalamountexcludingvat;
    }

    
    @Column(name="TOTALAMOUNTINCLUDINGVAT", precision=17, scale=4)
    public BigDecimal getTotalamountincludingvat() {
        return this.totalamountincludingvat;
    }
    
    public void setTotalamountincludingvat(BigDecimal totalamountincludingvat) {
        this.totalamountincludingvat = totalamountincludingvat;
    }

    
    @Column(name="VATAMOUNT", precision=17, scale=4)
    public BigDecimal getVatamount() {
        return this.vatamount;
    }
    
    public void setVatamount(BigDecimal vatamount) {
        this.vatamount = vatamount;
    }

    
    @Column(name="VATHANDLINGCODE", length=4)
    public String getVathandlingcode() {
        return this.vathandlingcode;
    }
    
    public void setVathandlingcode(String vathandlingcode) {
        this.vathandlingcode = vathandlingcode;
    }

    
    @Column(name="VATHANDLINGCODEPERCENTAGE", precision=5)
    public BigDecimal getVathandlingcodepercentage() {
        return this.vathandlingcodepercentage;
    }
    
    public void setVathandlingcodepercentage(BigDecimal vathandlingcodepercentage) {
        this.vathandlingcodepercentage = vathandlingcodepercentage;
    }

    
    @Column(name="VATCODEFLAG", length=1)
    public String getVatcodeflag() {
        return this.vatcodeflag;
    }
    
    public void setVatcodeflag(String vatcodeflag) {
        this.vatcodeflag = vatcodeflag;
    }

    
    @Column(name="VATINCLUDEDINPRICESFLAG", length=1)
    public String getVatincludedinpricesflag() {
        return this.vatincludedinpricesflag;
    }
    
    public void setVatincludedinpricesflag(String vatincludedinpricesflag) {
        this.vatincludedinpricesflag = vatincludedinpricesflag;
    }

    
    @Column(name="EXFACTORYEPAPRICE", precision=17, scale=4)
    public BigDecimal getExfactoryepaprice() {
        return this.exfactoryepaprice;
    }
    
    public void setExfactoryepaprice(BigDecimal exfactoryepaprice) {
        this.exfactoryepaprice = exfactoryepaprice;
    }

    
    @Column(name="EXFACTORYEPAAMOUNT", precision=17, scale=4)
    public BigDecimal getExfactoryepaamount() {
        return this.exfactoryepaamount;
    }
    
    public void setExfactoryepaamount(BigDecimal exfactoryepaamount) {
        this.exfactoryepaamount = exfactoryepaamount;
    }

    
    @Column(name="EXFACTORYEPMPRICE", precision=17, scale=4)
    public BigDecimal getExfactoryepmprice() {
        return this.exfactoryepmprice;
    }
    
    public void setExfactoryepmprice(BigDecimal exfactoryepmprice) {
        this.exfactoryepmprice = exfactoryepmprice;
    }

    
    @Column(name="EXFACTORYEPMAMOUNT", precision=17, scale=4)
    public BigDecimal getExfactoryepmamount() {
        return this.exfactoryepmamount;
    }
    
    public void setExfactoryepmamount(BigDecimal exfactoryepmamount) {
        this.exfactoryepmamount = exfactoryepmamount;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="consordlin")
    public Set<Consordldt> getConsordldts() {
        return this.consordldts;
    }
    
    public void setConsordldts(Set<Consordldt> consordldts) {
        this.consordldts = consordldts;
    }




}

