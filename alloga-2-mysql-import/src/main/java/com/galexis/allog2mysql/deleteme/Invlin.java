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
 * Invlin generated by hbm2java
 */
@Entity
@Table(name="INVLIN"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Invlin  implements java.io.Serializable {


     private long pk;
     private Invhdr invhdr;
     private Itemmaster itemmaster;
     private Dellin dellin;
     private int invoiceline;
     private Integer accountingperiod;
     private Long salesordernr;
     private Integer orderline;
     private String itemnr;
     private String itemnrcontractor;
     private String itemnrcontractor2;
     private BigDecimal invoicedqty;
     private BigDecimal orderqty;
     private BigDecimal deliveredqty;
     private BigDecimal naturaldiscountqty;
     private String unit;
     private String batchcontrolledflag;
     private BigDecimal salesprice;
     private BigDecimal salesamount;
     private BigDecimal netprice;
     private BigDecimal netsalesvalue;
     private BigDecimal orderdiscountpercentage;
     private String freeofchargeflag;
     private String freeofchargereasoncode;
     private String itempricecode;
     private String itempricecodedesc;
     private String salesrepresentative;
     private BigDecimal standardcost;
     private BigDecimal totalamountexcludingvat;
     private BigDecimal totalamountincludingvat;
     private BigDecimal vatamount;
     private String vathandlingcode;
     private String vathandlingcodedesc;
     private BigDecimal vathandlingcodepercentage;
     private String vatcodeflag;
     private String vatincludedinpricesflag;
     private String validfororderdiscountflag;
     private Long generaldiscountkey;
     private Long salespricecalculationref;
     private BigDecimal linecostvalue;
     private String backorderflag;
     private String reasoncode;
     private String reasoncodedesc;
     private Long reforiginalordernr;
     private Integer reforiginalorderline;
     private Long reforiginalinvoicenr;
     private Long incidentnumber;
     private Integer incidentline;
     private String incidentreasoncode;
     private String orderingpartypurchordnumber;
     private String orderingpartypurchordline;
     private String itemnarcoticcategory;
     private String transitdeliveryflag;
     private String directdeliveryflag;
     private Short itemcompanynumber;
     private String pricelist;
     private String pricelistdesc;
     private BigDecimal priceaccordingtopricelist;
     private BigDecimal priceaccordingtocustpricelist;
     private BigDecimal manuallyenteredprice;
     private BigDecimal totaldiscountpercentage;
     private String updatestockonhandflag;
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
     private Set<Invlinbtc> invlinbtcs = new HashSet<Invlinbtc>(0);

    public Invlin() {
    }

	
    public Invlin(long pk, Invhdr invhdr, Itemmaster itemmaster, int invoiceline, String itemnr, String outboundignore, Date recordcreationtime) {
        this.pk = pk;
        this.invhdr = invhdr;
        this.itemmaster = itemmaster;
        this.invoiceline = invoiceline;
        this.itemnr = itemnr;
        this.outboundignore = outboundignore;
        this.recordcreationtime = recordcreationtime;
    }
    public Invlin(long pk, Invhdr invhdr, Itemmaster itemmaster, Dellin dellin, int invoiceline, Integer accountingperiod, Long salesordernr, Integer orderline, String itemnr, String itemnrcontractor, String itemnrcontractor2, BigDecimal invoicedqty, BigDecimal orderqty, BigDecimal deliveredqty, BigDecimal naturaldiscountqty, String unit, String batchcontrolledflag, BigDecimal salesprice, BigDecimal salesamount, BigDecimal netprice, BigDecimal netsalesvalue, BigDecimal orderdiscountpercentage, String freeofchargeflag, String freeofchargereasoncode, String itempricecode, String itempricecodedesc, String salesrepresentative, BigDecimal standardcost, BigDecimal totalamountexcludingvat, BigDecimal totalamountincludingvat, BigDecimal vatamount, String vathandlingcode, String vathandlingcodedesc, BigDecimal vathandlingcodepercentage, String vatcodeflag, String vatincludedinpricesflag, String validfororderdiscountflag, Long generaldiscountkey, Long salespricecalculationref, BigDecimal linecostvalue, String backorderflag, String reasoncode, String reasoncodedesc, Long reforiginalordernr, Integer reforiginalorderline, Long reforiginalinvoicenr, Long incidentnumber, Integer incidentline, String incidentreasoncode, String orderingpartypurchordnumber, String orderingpartypurchordline, String itemnarcoticcategory, String transitdeliveryflag, String directdeliveryflag, Short itemcompanynumber, String pricelist, String pricelistdesc, BigDecimal priceaccordingtopricelist, BigDecimal priceaccordingtocustpricelist, BigDecimal manuallyenteredprice, BigDecimal totaldiscountpercentage, String updatestockonhandflag, Integer ipFreeofchargereasoncode, String ipGroupingcriteria1, String ipGroupingcriteria2, String ipGroupingcriteria3, String ipGroupingcriteria4, String ipGroupingcriteria5, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime, Set<Invlinbtc> invlinbtcs) {
       this.pk = pk;
       this.invhdr = invhdr;
       this.itemmaster = itemmaster;
       this.dellin = dellin;
       this.invoiceline = invoiceline;
       this.accountingperiod = accountingperiod;
       this.salesordernr = salesordernr;
       this.orderline = orderline;
       this.itemnr = itemnr;
       this.itemnrcontractor = itemnrcontractor;
       this.itemnrcontractor2 = itemnrcontractor2;
       this.invoicedqty = invoicedqty;
       this.orderqty = orderqty;
       this.deliveredqty = deliveredqty;
       this.naturaldiscountqty = naturaldiscountqty;
       this.unit = unit;
       this.batchcontrolledflag = batchcontrolledflag;
       this.salesprice = salesprice;
       this.salesamount = salesamount;
       this.netprice = netprice;
       this.netsalesvalue = netsalesvalue;
       this.orderdiscountpercentage = orderdiscountpercentage;
       this.freeofchargeflag = freeofchargeflag;
       this.freeofchargereasoncode = freeofchargereasoncode;
       this.itempricecode = itempricecode;
       this.itempricecodedesc = itempricecodedesc;
       this.salesrepresentative = salesrepresentative;
       this.standardcost = standardcost;
       this.totalamountexcludingvat = totalamountexcludingvat;
       this.totalamountincludingvat = totalamountincludingvat;
       this.vatamount = vatamount;
       this.vathandlingcode = vathandlingcode;
       this.vathandlingcodedesc = vathandlingcodedesc;
       this.vathandlingcodepercentage = vathandlingcodepercentage;
       this.vatcodeflag = vatcodeflag;
       this.vatincludedinpricesflag = vatincludedinpricesflag;
       this.validfororderdiscountflag = validfororderdiscountflag;
       this.generaldiscountkey = generaldiscountkey;
       this.salespricecalculationref = salespricecalculationref;
       this.linecostvalue = linecostvalue;
       this.backorderflag = backorderflag;
       this.reasoncode = reasoncode;
       this.reasoncodedesc = reasoncodedesc;
       this.reforiginalordernr = reforiginalordernr;
       this.reforiginalorderline = reforiginalorderline;
       this.reforiginalinvoicenr = reforiginalinvoicenr;
       this.incidentnumber = incidentnumber;
       this.incidentline = incidentline;
       this.incidentreasoncode = incidentreasoncode;
       this.orderingpartypurchordnumber = orderingpartypurchordnumber;
       this.orderingpartypurchordline = orderingpartypurchordline;
       this.itemnarcoticcategory = itemnarcoticcategory;
       this.transitdeliveryflag = transitdeliveryflag;
       this.directdeliveryflag = directdeliveryflag;
       this.itemcompanynumber = itemcompanynumber;
       this.pricelist = pricelist;
       this.pricelistdesc = pricelistdesc;
       this.priceaccordingtopricelist = priceaccordingtopricelist;
       this.priceaccordingtocustpricelist = priceaccordingtocustpricelist;
       this.manuallyenteredprice = manuallyenteredprice;
       this.totaldiscountpercentage = totaldiscountpercentage;
       this.updatestockonhandflag = updatestockonhandflag;
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
       this.invlinbtcs = invlinbtcs;
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
    @JoinColumn(name="INVHDRPK", nullable=false)
    public Invhdr getInvhdr() {
        return this.invhdr;
    }
    
    public void setInvhdr(Invhdr invhdr) {
        this.invhdr = invhdr;
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
    @JoinColumn(name="DELLINPK")
    public Dellin getDellin() {
        return this.dellin;
    }
    
    public void setDellin(Dellin dellin) {
        this.dellin = dellin;
    }

    
    @Column(name="INVOICELINE", nullable=false, precision=5, scale=0)
    public int getInvoiceline() {
        return this.invoiceline;
    }
    
    public void setInvoiceline(int invoiceline) {
        this.invoiceline = invoiceline;
    }

    
    @Column(name="ACCOUNTINGPERIOD", precision=6, scale=0)
    public Integer getAccountingperiod() {
        return this.accountingperiod;
    }
    
    public void setAccountingperiod(Integer accountingperiod) {
        this.accountingperiod = accountingperiod;
    }

    
    @Column(name="SALESORDERNR", precision=12, scale=0)
    public Long getSalesordernr() {
        return this.salesordernr;
    }
    
    public void setSalesordernr(Long salesordernr) {
        this.salesordernr = salesordernr;
    }

    
    @Column(name="ORDERLINE", precision=5, scale=0)
    public Integer getOrderline() {
        return this.orderline;
    }
    
    public void setOrderline(Integer orderline) {
        this.orderline = orderline;
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

    
    @Column(name="INVOICEDQTY", precision=15, scale=3)
    public BigDecimal getInvoicedqty() {
        return this.invoicedqty;
    }
    
    public void setInvoicedqty(BigDecimal invoicedqty) {
        this.invoicedqty = invoicedqty;
    }

    
    @Column(name="ORDERQTY", precision=15, scale=3)
    public BigDecimal getOrderqty() {
        return this.orderqty;
    }
    
    public void setOrderqty(BigDecimal orderqty) {
        this.orderqty = orderqty;
    }

    
    @Column(name="DELIVEREDQTY", precision=15, scale=3)
    public BigDecimal getDeliveredqty() {
        return this.deliveredqty;
    }
    
    public void setDeliveredqty(BigDecimal deliveredqty) {
        this.deliveredqty = deliveredqty;
    }

    
    @Column(name="NATURALDISCOUNTQTY", precision=15, scale=3)
    public BigDecimal getNaturaldiscountqty() {
        return this.naturaldiscountqty;
    }
    
    public void setNaturaldiscountqty(BigDecimal naturaldiscountqty) {
        this.naturaldiscountqty = naturaldiscountqty;
    }

    
    @Column(name="UNIT", length=5)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    
    @Column(name="BATCHCONTROLLEDFLAG", length=1)
    public String getBatchcontrolledflag() {
        return this.batchcontrolledflag;
    }
    
    public void setBatchcontrolledflag(String batchcontrolledflag) {
        this.batchcontrolledflag = batchcontrolledflag;
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

    
    @Column(name="ITEMPRICECODE", length=3)
    public String getItempricecode() {
        return this.itempricecode;
    }
    
    public void setItempricecode(String itempricecode) {
        this.itempricecode = itempricecode;
    }

    
    @Column(name="ITEMPRICECODEDESC", length=50)
    public String getItempricecodedesc() {
        return this.itempricecodedesc;
    }
    
    public void setItempricecodedesc(String itempricecodedesc) {
        this.itempricecodedesc = itempricecodedesc;
    }

    
    @Column(name="SALESREPRESENTATIVE", length=30)
    public String getSalesrepresentative() {
        return this.salesrepresentative;
    }
    
    public void setSalesrepresentative(String salesrepresentative) {
        this.salesrepresentative = salesrepresentative;
    }

    
    @Column(name="STANDARDCOST", precision=17, scale=4)
    public BigDecimal getStandardcost() {
        return this.standardcost;
    }
    
    public void setStandardcost(BigDecimal standardcost) {
        this.standardcost = standardcost;
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

    
    @Column(name="VATHANDLINGCODEDESC", length=50)
    public String getVathandlingcodedesc() {
        return this.vathandlingcodedesc;
    }
    
    public void setVathandlingcodedesc(String vathandlingcodedesc) {
        this.vathandlingcodedesc = vathandlingcodedesc;
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

    
    @Column(name="VALIDFORORDERDISCOUNTFLAG", length=1)
    public String getValidfororderdiscountflag() {
        return this.validfororderdiscountflag;
    }
    
    public void setValidfororderdiscountflag(String validfororderdiscountflag) {
        this.validfororderdiscountflag = validfororderdiscountflag;
    }

    
    @Column(name="GENERALDISCOUNTKEY", precision=15, scale=0)
    public Long getGeneraldiscountkey() {
        return this.generaldiscountkey;
    }
    
    public void setGeneraldiscountkey(Long generaldiscountkey) {
        this.generaldiscountkey = generaldiscountkey;
    }

    
    @Column(name="SALESPRICECALCULATIONREF", precision=15, scale=0)
    public Long getSalespricecalculationref() {
        return this.salespricecalculationref;
    }
    
    public void setSalespricecalculationref(Long salespricecalculationref) {
        this.salespricecalculationref = salespricecalculationref;
    }

    
    @Column(name="LINECOSTVALUE", precision=17, scale=4)
    public BigDecimal getLinecostvalue() {
        return this.linecostvalue;
    }
    
    public void setLinecostvalue(BigDecimal linecostvalue) {
        this.linecostvalue = linecostvalue;
    }

    
    @Column(name="BACKORDERFLAG", length=1)
    public String getBackorderflag() {
        return this.backorderflag;
    }
    
    public void setBackorderflag(String backorderflag) {
        this.backorderflag = backorderflag;
    }

    
    @Column(name="REASONCODE", length=3)
    public String getReasoncode() {
        return this.reasoncode;
    }
    
    public void setReasoncode(String reasoncode) {
        this.reasoncode = reasoncode;
    }

    
    @Column(name="REASONCODEDESC", length=50)
    public String getReasoncodedesc() {
        return this.reasoncodedesc;
    }
    
    public void setReasoncodedesc(String reasoncodedesc) {
        this.reasoncodedesc = reasoncodedesc;
    }

    
    @Column(name="REFORIGINALORDERNR", precision=12, scale=0)
    public Long getReforiginalordernr() {
        return this.reforiginalordernr;
    }
    
    public void setReforiginalordernr(Long reforiginalordernr) {
        this.reforiginalordernr = reforiginalordernr;
    }

    
    @Column(name="REFORIGINALORDERLINE", precision=6, scale=0)
    public Integer getReforiginalorderline() {
        return this.reforiginalorderline;
    }
    
    public void setReforiginalorderline(Integer reforiginalorderline) {
        this.reforiginalorderline = reforiginalorderline;
    }

    
    @Column(name="REFORIGINALINVOICENR", precision=12, scale=0)
    public Long getReforiginalinvoicenr() {
        return this.reforiginalinvoicenr;
    }
    
    public void setReforiginalinvoicenr(Long reforiginalinvoicenr) {
        this.reforiginalinvoicenr = reforiginalinvoicenr;
    }

    
    @Column(name="INCIDENTNUMBER", precision=12, scale=0)
    public Long getIncidentnumber() {
        return this.incidentnumber;
    }
    
    public void setIncidentnumber(Long incidentnumber) {
        this.incidentnumber = incidentnumber;
    }

    
    @Column(name="INCIDENTLINE", precision=6, scale=0)
    public Integer getIncidentline() {
        return this.incidentline;
    }
    
    public void setIncidentline(Integer incidentline) {
        this.incidentline = incidentline;
    }

    
    @Column(name="INCIDENTREASONCODE", length=5)
    public String getIncidentreasoncode() {
        return this.incidentreasoncode;
    }
    
    public void setIncidentreasoncode(String incidentreasoncode) {
        this.incidentreasoncode = incidentreasoncode;
    }

    
    @Column(name="ORDERINGPARTYPURCHORDNUMBER", length=35)
    public String getOrderingpartypurchordnumber() {
        return this.orderingpartypurchordnumber;
    }
    
    public void setOrderingpartypurchordnumber(String orderingpartypurchordnumber) {
        this.orderingpartypurchordnumber = orderingpartypurchordnumber;
    }

    
    @Column(name="ORDERINGPARTYPURCHORDLINE", length=35)
    public String getOrderingpartypurchordline() {
        return this.orderingpartypurchordline;
    }
    
    public void setOrderingpartypurchordline(String orderingpartypurchordline) {
        this.orderingpartypurchordline = orderingpartypurchordline;
    }

    
    @Column(name="ITEMNARCOTICCATEGORY", length=10)
    public String getItemnarcoticcategory() {
        return this.itemnarcoticcategory;
    }
    
    public void setItemnarcoticcategory(String itemnarcoticcategory) {
        this.itemnarcoticcategory = itemnarcoticcategory;
    }

    
    @Column(name="TRANSITDELIVERYFLAG", length=1)
    public String getTransitdeliveryflag() {
        return this.transitdeliveryflag;
    }
    
    public void setTransitdeliveryflag(String transitdeliveryflag) {
        this.transitdeliveryflag = transitdeliveryflag;
    }

    
    @Column(name="DIRECTDELIVERYFLAG", length=1)
    public String getDirectdeliveryflag() {
        return this.directdeliveryflag;
    }
    
    public void setDirectdeliveryflag(String directdeliveryflag) {
        this.directdeliveryflag = directdeliveryflag;
    }

    
    @Column(name="ITEMCOMPANYNUMBER", precision=3, scale=0)
    public Short getItemcompanynumber() {
        return this.itemcompanynumber;
    }
    
    public void setItemcompanynumber(Short itemcompanynumber) {
        this.itemcompanynumber = itemcompanynumber;
    }

    
    @Column(name="PRICELIST", length=5)
    public String getPricelist() {
        return this.pricelist;
    }
    
    public void setPricelist(String pricelist) {
        this.pricelist = pricelist;
    }

    
    @Column(name="PRICELISTDESC", length=50)
    public String getPricelistdesc() {
        return this.pricelistdesc;
    }
    
    public void setPricelistdesc(String pricelistdesc) {
        this.pricelistdesc = pricelistdesc;
    }

    
    @Column(name="PRICEACCORDINGTOPRICELIST", precision=17, scale=4)
    public BigDecimal getPriceaccordingtopricelist() {
        return this.priceaccordingtopricelist;
    }
    
    public void setPriceaccordingtopricelist(BigDecimal priceaccordingtopricelist) {
        this.priceaccordingtopricelist = priceaccordingtopricelist;
    }

    
    @Column(name="PRICEACCORDINGTOCUSTPRICELIST", precision=17, scale=4)
    public BigDecimal getPriceaccordingtocustpricelist() {
        return this.priceaccordingtocustpricelist;
    }
    
    public void setPriceaccordingtocustpricelist(BigDecimal priceaccordingtocustpricelist) {
        this.priceaccordingtocustpricelist = priceaccordingtocustpricelist;
    }

    
    @Column(name="MANUALLYENTEREDPRICE", precision=17, scale=4)
    public BigDecimal getManuallyenteredprice() {
        return this.manuallyenteredprice;
    }
    
    public void setManuallyenteredprice(BigDecimal manuallyenteredprice) {
        this.manuallyenteredprice = manuallyenteredprice;
    }

    
    @Column(name="TOTALDISCOUNTPERCENTAGE", precision=5)
    public BigDecimal getTotaldiscountpercentage() {
        return this.totaldiscountpercentage;
    }
    
    public void setTotaldiscountpercentage(BigDecimal totaldiscountpercentage) {
        this.totaldiscountpercentage = totaldiscountpercentage;
    }

    
    @Column(name="UPDATESTOCKONHANDFLAG", length=1)
    public String getUpdatestockonhandflag() {
        return this.updatestockonhandflag;
    }
    
    public void setUpdatestockonhandflag(String updatestockonhandflag) {
        this.updatestockonhandflag = updatestockonhandflag;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="invlin")
    public Set<Invlinbtc> getInvlinbtcs() {
        return this.invlinbtcs;
    }
    
    public void setInvlinbtcs(Set<Invlinbtc> invlinbtcs) {
        this.invlinbtcs = invlinbtcs;
    }




}


