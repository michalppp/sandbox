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
 * Consordhdr generated by hbm2java
 */
@Entity
@Table(name="CONSORDHDR"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Consordhdr  implements java.io.Serializable {


     private long pk;
     private Contrdef contrdef;
     private long consignmentnr;
     private Date orderdate;
     private String salesorganisation;
     private String salesorganisationdesc;
     private String primarycurrency;
     private BigDecimal discountbase;
     private BigDecimal orderlinestotal;
     private BigDecimal ordertotal;
     private BigDecimal totalamountexcludingvat;
     private BigDecimal vatamount;
     private BigDecimal totalamountincludingvat;
     private BigDecimal totaldiscountamount;
     private String vathandlingcode1;
     private BigDecimal vathandlingcode1percentage;
     private BigDecimal vathandlingcode1amount;
     private String vathandlingcode2;
     private BigDecimal vathandlingcode2percentage;
     private BigDecimal vathandlingcode2amount;
     private Integer timedatepk;
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
     private String backendreleased;
     private String outboundignore;
     private String transactionid;
     private String recordprocessedflag;
     private Date recordprocessingtime;
     private Date recordlastchangetime;
     private Date recordcreationtime;
     private Set<Consordldt> consordldts = new HashSet<Consordldt>(0);
     private Set<Consordlin> consordlins = new HashSet<Consordlin>(0);

    public Consordhdr() {
    }

	
    public Consordhdr(long pk, Contrdef contrdef, long consignmentnr, Date orderdate, String backendreleased, String outboundignore, String recordprocessedflag, Date recordcreationtime) {
        this.pk = pk;
        this.contrdef = contrdef;
        this.consignmentnr = consignmentnr;
        this.orderdate = orderdate;
        this.backendreleased = backendreleased;
        this.outboundignore = outboundignore;
        this.recordprocessedflag = recordprocessedflag;
        this.recordcreationtime = recordcreationtime;
    }
    public Consordhdr(long pk, Contrdef contrdef, long consignmentnr, Date orderdate, String salesorganisation, String salesorganisationdesc, String primarycurrency, BigDecimal discountbase, BigDecimal orderlinestotal, BigDecimal ordertotal, BigDecimal totalamountexcludingvat, BigDecimal vatamount, BigDecimal totalamountincludingvat, BigDecimal totaldiscountamount, String vathandlingcode1, BigDecimal vathandlingcode1percentage, BigDecimal vathandlingcode1amount, String vathandlingcode2, BigDecimal vathandlingcode2percentage, BigDecimal vathandlingcode2amount, Integer timedatepk, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String backendreleased, String outboundignore, String transactionid, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime, Set<Consordldt> consordldts, Set<Consordlin> consordlins) {
       this.pk = pk;
       this.contrdef = contrdef;
       this.consignmentnr = consignmentnr;
       this.orderdate = orderdate;
       this.salesorganisation = salesorganisation;
       this.salesorganisationdesc = salesorganisationdesc;
       this.primarycurrency = primarycurrency;
       this.discountbase = discountbase;
       this.orderlinestotal = orderlinestotal;
       this.ordertotal = ordertotal;
       this.totalamountexcludingvat = totalamountexcludingvat;
       this.vatamount = vatamount;
       this.totalamountincludingvat = totalamountincludingvat;
       this.totaldiscountamount = totaldiscountamount;
       this.vathandlingcode1 = vathandlingcode1;
       this.vathandlingcode1percentage = vathandlingcode1percentage;
       this.vathandlingcode1amount = vathandlingcode1amount;
       this.vathandlingcode2 = vathandlingcode2;
       this.vathandlingcode2percentage = vathandlingcode2percentage;
       this.vathandlingcode2amount = vathandlingcode2amount;
       this.timedatepk = timedatepk;
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
       this.backendreleased = backendreleased;
       this.outboundignore = outboundignore;
       this.transactionid = transactionid;
       this.recordprocessedflag = recordprocessedflag;
       this.recordprocessingtime = recordprocessingtime;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
       this.consordldts = consordldts;
       this.consordlins = consordlins;
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
    @JoinColumn(name="CONTRDEFPK", nullable=false)
    public Contrdef getContrdef() {
        return this.contrdef;
    }
    
    public void setContrdef(Contrdef contrdef) {
        this.contrdef = contrdef;
    }

    
    @Column(name="CONSIGNMENTNR", nullable=false, precision=12, scale=0)
    public long getConsignmentnr() {
        return this.consignmentnr;
    }
    
    public void setConsignmentnr(long consignmentnr) {
        this.consignmentnr = consignmentnr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ORDERDATE", nullable=false, length=26)
    public Date getOrderdate() {
        return this.orderdate;
    }
    
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    
    @Column(name="SALESORGANISATION", length=30)
    public String getSalesorganisation() {
        return this.salesorganisation;
    }
    
    public void setSalesorganisation(String salesorganisation) {
        this.salesorganisation = salesorganisation;
    }

    
    @Column(name="SALESORGANISATIONDESC", length=50)
    public String getSalesorganisationdesc() {
        return this.salesorganisationdesc;
    }
    
    public void setSalesorganisationdesc(String salesorganisationdesc) {
        this.salesorganisationdesc = salesorganisationdesc;
    }

    
    @Column(name="PRIMARYCURRENCY", length=4)
    public String getPrimarycurrency() {
        return this.primarycurrency;
    }
    
    public void setPrimarycurrency(String primarycurrency) {
        this.primarycurrency = primarycurrency;
    }

    
    @Column(name="DISCOUNTBASE", precision=17, scale=4)
    public BigDecimal getDiscountbase() {
        return this.discountbase;
    }
    
    public void setDiscountbase(BigDecimal discountbase) {
        this.discountbase = discountbase;
    }

    
    @Column(name="ORDERLINESTOTAL", precision=17, scale=4)
    public BigDecimal getOrderlinestotal() {
        return this.orderlinestotal;
    }
    
    public void setOrderlinestotal(BigDecimal orderlinestotal) {
        this.orderlinestotal = orderlinestotal;
    }

    
    @Column(name="ORDERTOTAL", precision=17, scale=4)
    public BigDecimal getOrdertotal() {
        return this.ordertotal;
    }
    
    public void setOrdertotal(BigDecimal ordertotal) {
        this.ordertotal = ordertotal;
    }

    
    @Column(name="TOTALAMOUNTEXCLUDINGVAT", precision=17, scale=4)
    public BigDecimal getTotalamountexcludingvat() {
        return this.totalamountexcludingvat;
    }
    
    public void setTotalamountexcludingvat(BigDecimal totalamountexcludingvat) {
        this.totalamountexcludingvat = totalamountexcludingvat;
    }

    
    @Column(name="VATAMOUNT", precision=17, scale=4)
    public BigDecimal getVatamount() {
        return this.vatamount;
    }
    
    public void setVatamount(BigDecimal vatamount) {
        this.vatamount = vatamount;
    }

    
    @Column(name="TOTALAMOUNTINCLUDINGVAT", precision=17, scale=4)
    public BigDecimal getTotalamountincludingvat() {
        return this.totalamountincludingvat;
    }
    
    public void setTotalamountincludingvat(BigDecimal totalamountincludingvat) {
        this.totalamountincludingvat = totalamountincludingvat;
    }

    
    @Column(name="TOTALDISCOUNTAMOUNT", precision=17, scale=4)
    public BigDecimal getTotaldiscountamount() {
        return this.totaldiscountamount;
    }
    
    public void setTotaldiscountamount(BigDecimal totaldiscountamount) {
        this.totaldiscountamount = totaldiscountamount;
    }

    
    @Column(name="VATHANDLINGCODE1", length=4)
    public String getVathandlingcode1() {
        return this.vathandlingcode1;
    }
    
    public void setVathandlingcode1(String vathandlingcode1) {
        this.vathandlingcode1 = vathandlingcode1;
    }

    
    @Column(name="VATHANDLINGCODE1PERCENTAGE", precision=5)
    public BigDecimal getVathandlingcode1percentage() {
        return this.vathandlingcode1percentage;
    }
    
    public void setVathandlingcode1percentage(BigDecimal vathandlingcode1percentage) {
        this.vathandlingcode1percentage = vathandlingcode1percentage;
    }

    
    @Column(name="VATHANDLINGCODE1AMOUNT", precision=17, scale=4)
    public BigDecimal getVathandlingcode1amount() {
        return this.vathandlingcode1amount;
    }
    
    public void setVathandlingcode1amount(BigDecimal vathandlingcode1amount) {
        this.vathandlingcode1amount = vathandlingcode1amount;
    }

    
    @Column(name="VATHANDLINGCODE2", length=4)
    public String getVathandlingcode2() {
        return this.vathandlingcode2;
    }
    
    public void setVathandlingcode2(String vathandlingcode2) {
        this.vathandlingcode2 = vathandlingcode2;
    }

    
    @Column(name="VATHANDLINGCODE2PERCENTAGE", precision=5)
    public BigDecimal getVathandlingcode2percentage() {
        return this.vathandlingcode2percentage;
    }
    
    public void setVathandlingcode2percentage(BigDecimal vathandlingcode2percentage) {
        this.vathandlingcode2percentage = vathandlingcode2percentage;
    }

    
    @Column(name="VATHANDLINGCODE2AMOUNT", precision=17, scale=4)
    public BigDecimal getVathandlingcode2amount() {
        return this.vathandlingcode2amount;
    }
    
    public void setVathandlingcode2amount(BigDecimal vathandlingcode2amount) {
        this.vathandlingcode2amount = vathandlingcode2amount;
    }

    
    @Column(name="TIMEDATEPK", precision=8, scale=0)
    public Integer getTimedatepk() {
        return this.timedatepk;
    }
    
    public void setTimedatepk(Integer timedatepk) {
        this.timedatepk = timedatepk;
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

    
    @Column(name="BACKENDRELEASED", nullable=false, length=1)
    public String getBackendreleased() {
        return this.backendreleased;
    }
    
    public void setBackendreleased(String backendreleased) {
        this.backendreleased = backendreleased;
    }

    
    @Column(name="OUTBOUNDIGNORE", nullable=false, length=1)
    public String getOutboundignore() {
        return this.outboundignore;
    }
    
    public void setOutboundignore(String outboundignore) {
        this.outboundignore = outboundignore;
    }

    
    @Column(name="TRANSACTIONID", length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    
    @Column(name="RECORDPROCESSEDFLAG", nullable=false, length=1)
    public String getRecordprocessedflag() {
        return this.recordprocessedflag;
    }
    
    public void setRecordprocessedflag(String recordprocessedflag) {
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="consordhdr")
    public Set<Consordldt> getConsordldts() {
        return this.consordldts;
    }
    
    public void setConsordldts(Set<Consordldt> consordldts) {
        this.consordldts = consordldts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="consordhdr")
    public Set<Consordlin> getConsordlins() {
        return this.consordlins;
    }
    
    public void setConsordlins(Set<Consordlin> consordlins) {
        this.consordlins = consordlins;
    }




}


