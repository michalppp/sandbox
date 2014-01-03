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
 * Grehdr generated by hbm2java
 */
@Entity
@Table(name="GREHDR"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Grehdr  implements java.io.Serializable {


     private long pk;
     private Contrdef contrdef;
     private Bizparaddr bizparaddr;
     private Timedate timedateByIpTimedatepkReporting;
     private Timedate timedateByTimedatepk;
     private String deliverynr;
     private String deliverytype;
     private String salesorganisation;
     private String salesorganisationdesc;
     private Date deliverydate;
     private String purchaseordernr;
     private String purchaseordertype;
     private Date purchaseorderdate;
     private String vendornr;
     private String vendorname;
     private String vendoraddress1;
     private String vendoraddress2;
     private String vendoraddress3;
     private String vendoraddress4;
     private String vendortown;
     private String vendorzip;
     private String vendorcountry;
     private String vendorstate;
     private String shippingnote;
     private String suppliernr;
     private String suppliername;
     private String supplieraddress1;
     private String supplieraddress2;
     private String supplieraddress3;
     private String supplieraddress4;
     private String suppliertown;
     private String supplierzip;
     private String suppliercountry;
     private String supplierstate;
     private String supplierreference;
     private String termsofdelivery;
     private String termsofdeliverydesc;
     private String manneroftransport;
     private String manneroftransportdesc;
     private BigDecimal ordervalue;
     private String ordervaluecurrency;
     private String goodsmarking;
     private Integer ipPurchaseordertype;
     private String purchaseordernrDelann;
     private String textfield101;
     private String textfield102;
     private String textfield103;
     private String textfield351;
     private String textfield352;
     private String textfield353;
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
     private Set<Grelinbtc> grelinbtcs = new HashSet<Grelinbtc>(0);
     private Set<Grelin> grelins = new HashSet<Grelin>(0);

    public Grehdr() {
    }

	
    public Grehdr(long pk, Contrdef contrdef, Bizparaddr bizparaddr, String purchaseordernr, String purchaseordertype, String backendreleased, String outboundignore, String recordprocessedflag, Date recordcreationtime) {
        this.pk = pk;
        this.contrdef = contrdef;
        this.bizparaddr = bizparaddr;
        this.purchaseordernr = purchaseordernr;
        this.purchaseordertype = purchaseordertype;
        this.backendreleased = backendreleased;
        this.outboundignore = outboundignore;
        this.recordprocessedflag = recordprocessedflag;
        this.recordcreationtime = recordcreationtime;
    }
    public Grehdr(long pk, Contrdef contrdef, Bizparaddr bizparaddr, Timedate timedateByIpTimedatepkReporting, Timedate timedateByTimedatepk, String deliverynr, String deliverytype, String salesorganisation, String salesorganisationdesc, Date deliverydate, String purchaseordernr, String purchaseordertype, Date purchaseorderdate, String vendornr, String vendorname, String vendoraddress1, String vendoraddress2, String vendoraddress3, String vendoraddress4, String vendortown, String vendorzip, String vendorcountry, String vendorstate, String shippingnote, String suppliernr, String suppliername, String supplieraddress1, String supplieraddress2, String supplieraddress3, String supplieraddress4, String suppliertown, String supplierzip, String suppliercountry, String supplierstate, String supplierreference, String termsofdelivery, String termsofdeliverydesc, String manneroftransport, String manneroftransportdesc, BigDecimal ordervalue, String ordervaluecurrency, String goodsmarking, Integer ipPurchaseordertype, String purchaseordernrDelann, String textfield101, String textfield102, String textfield103, String textfield351, String textfield352, String textfield353, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String backendreleased, String outboundignore, String transactionid, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime, Set<Grelinbtc> grelinbtcs, Set<Grelin> grelins) {
       this.pk = pk;
       this.contrdef = contrdef;
       this.bizparaddr = bizparaddr;
       this.timedateByIpTimedatepkReporting = timedateByIpTimedatepkReporting;
       this.timedateByTimedatepk = timedateByTimedatepk;
       this.deliverynr = deliverynr;
       this.deliverytype = deliverytype;
       this.salesorganisation = salesorganisation;
       this.salesorganisationdesc = salesorganisationdesc;
       this.deliverydate = deliverydate;
       this.purchaseordernr = purchaseordernr;
       this.purchaseordertype = purchaseordertype;
       this.purchaseorderdate = purchaseorderdate;
       this.vendornr = vendornr;
       this.vendorname = vendorname;
       this.vendoraddress1 = vendoraddress1;
       this.vendoraddress2 = vendoraddress2;
       this.vendoraddress3 = vendoraddress3;
       this.vendoraddress4 = vendoraddress4;
       this.vendortown = vendortown;
       this.vendorzip = vendorzip;
       this.vendorcountry = vendorcountry;
       this.vendorstate = vendorstate;
       this.shippingnote = shippingnote;
       this.suppliernr = suppliernr;
       this.suppliername = suppliername;
       this.supplieraddress1 = supplieraddress1;
       this.supplieraddress2 = supplieraddress2;
       this.supplieraddress3 = supplieraddress3;
       this.supplieraddress4 = supplieraddress4;
       this.suppliertown = suppliertown;
       this.supplierzip = supplierzip;
       this.suppliercountry = suppliercountry;
       this.supplierstate = supplierstate;
       this.supplierreference = supplierreference;
       this.termsofdelivery = termsofdelivery;
       this.termsofdeliverydesc = termsofdeliverydesc;
       this.manneroftransport = manneroftransport;
       this.manneroftransportdesc = manneroftransportdesc;
       this.ordervalue = ordervalue;
       this.ordervaluecurrency = ordervaluecurrency;
       this.goodsmarking = goodsmarking;
       this.ipPurchaseordertype = ipPurchaseordertype;
       this.purchaseordernrDelann = purchaseordernrDelann;
       this.textfield101 = textfield101;
       this.textfield102 = textfield102;
       this.textfield103 = textfield103;
       this.textfield351 = textfield351;
       this.textfield352 = textfield352;
       this.textfield353 = textfield353;
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
       this.grelinbtcs = grelinbtcs;
       this.grelins = grelins;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BIZPARADDRPK", nullable=false)
    public Bizparaddr getBizparaddr() {
        return this.bizparaddr;
    }
    
    public void setBizparaddr(Bizparaddr bizparaddr) {
        this.bizparaddr = bizparaddr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IP_TIMEDATEPK_REPORTING")
    public Timedate getTimedateByIpTimedatepkReporting() {
        return this.timedateByIpTimedatepkReporting;
    }
    
    public void setTimedateByIpTimedatepkReporting(Timedate timedateByIpTimedatepkReporting) {
        this.timedateByIpTimedatepkReporting = timedateByIpTimedatepkReporting;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIMEDATEPK")
    public Timedate getTimedateByTimedatepk() {
        return this.timedateByTimedatepk;
    }
    
    public void setTimedateByTimedatepk(Timedate timedateByTimedatepk) {
        this.timedateByTimedatepk = timedateByTimedatepk;
    }

    
    @Column(name="DELIVERYNR", length=35)
    public String getDeliverynr() {
        return this.deliverynr;
    }
    
    public void setDeliverynr(String deliverynr) {
        this.deliverynr = deliverynr;
    }

    
    @Column(name="DELIVERYTYPE", length=10)
    public String getDeliverytype() {
        return this.deliverytype;
    }
    
    public void setDeliverytype(String deliverytype) {
        this.deliverytype = deliverytype;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DELIVERYDATE", length=26)
    public Date getDeliverydate() {
        return this.deliverydate;
    }
    
    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    
    @Column(name="PURCHASEORDERNR", nullable=false, length=35)
    public String getPurchaseordernr() {
        return this.purchaseordernr;
    }
    
    public void setPurchaseordernr(String purchaseordernr) {
        this.purchaseordernr = purchaseordernr;
    }

    
    @Column(name="PURCHASEORDERTYPE", nullable=false, length=10)
    public String getPurchaseordertype() {
        return this.purchaseordertype;
    }
    
    public void setPurchaseordertype(String purchaseordertype) {
        this.purchaseordertype = purchaseordertype;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="PURCHASEORDERDATE", length=26)
    public Date getPurchaseorderdate() {
        return this.purchaseorderdate;
    }
    
    public void setPurchaseorderdate(Date purchaseorderdate) {
        this.purchaseorderdate = purchaseorderdate;
    }

    
    @Column(name="VENDORNR", length=20)
    public String getVendornr() {
        return this.vendornr;
    }
    
    public void setVendornr(String vendornr) {
        this.vendornr = vendornr;
    }

    
    @Column(name="VENDORNAME", length=35)
    public String getVendorname() {
        return this.vendorname;
    }
    
    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    
    @Column(name="VENDORADDRESS1", length=35)
    public String getVendoraddress1() {
        return this.vendoraddress1;
    }
    
    public void setVendoraddress1(String vendoraddress1) {
        this.vendoraddress1 = vendoraddress1;
    }

    
    @Column(name="VENDORADDRESS2", length=35)
    public String getVendoraddress2() {
        return this.vendoraddress2;
    }
    
    public void setVendoraddress2(String vendoraddress2) {
        this.vendoraddress2 = vendoraddress2;
    }

    
    @Column(name="VENDORADDRESS3", length=35)
    public String getVendoraddress3() {
        return this.vendoraddress3;
    }
    
    public void setVendoraddress3(String vendoraddress3) {
        this.vendoraddress3 = vendoraddress3;
    }

    
    @Column(name="VENDORADDRESS4", length=35)
    public String getVendoraddress4() {
        return this.vendoraddress4;
    }
    
    public void setVendoraddress4(String vendoraddress4) {
        this.vendoraddress4 = vendoraddress4;
    }

    
    @Column(name="VENDORTOWN", length=35)
    public String getVendortown() {
        return this.vendortown;
    }
    
    public void setVendortown(String vendortown) {
        this.vendortown = vendortown;
    }

    
    @Column(name="VENDORZIP", length=16)
    public String getVendorzip() {
        return this.vendorzip;
    }
    
    public void setVendorzip(String vendorzip) {
        this.vendorzip = vendorzip;
    }

    
    @Column(name="VENDORCOUNTRY", length=4)
    public String getVendorcountry() {
        return this.vendorcountry;
    }
    
    public void setVendorcountry(String vendorcountry) {
        this.vendorcountry = vendorcountry;
    }

    
    @Column(name="VENDORSTATE", length=2)
    public String getVendorstate() {
        return this.vendorstate;
    }
    
    public void setVendorstate(String vendorstate) {
        this.vendorstate = vendorstate;
    }

    
    @Column(name="SHIPPINGNOTE", length=35)
    public String getShippingnote() {
        return this.shippingnote;
    }
    
    public void setShippingnote(String shippingnote) {
        this.shippingnote = shippingnote;
    }

    
    @Column(name="SUPPLIERNR", length=20)
    public String getSuppliernr() {
        return this.suppliernr;
    }
    
    public void setSuppliernr(String suppliernr) {
        this.suppliernr = suppliernr;
    }

    
    @Column(name="SUPPLIERNAME", length=35)
    public String getSuppliername() {
        return this.suppliername;
    }
    
    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    
    @Column(name="SUPPLIERADDRESS1", length=35)
    public String getSupplieraddress1() {
        return this.supplieraddress1;
    }
    
    public void setSupplieraddress1(String supplieraddress1) {
        this.supplieraddress1 = supplieraddress1;
    }

    
    @Column(name="SUPPLIERADDRESS2", length=35)
    public String getSupplieraddress2() {
        return this.supplieraddress2;
    }
    
    public void setSupplieraddress2(String supplieraddress2) {
        this.supplieraddress2 = supplieraddress2;
    }

    
    @Column(name="SUPPLIERADDRESS3", length=35)
    public String getSupplieraddress3() {
        return this.supplieraddress3;
    }
    
    public void setSupplieraddress3(String supplieraddress3) {
        this.supplieraddress3 = supplieraddress3;
    }

    
    @Column(name="SUPPLIERADDRESS4", length=35)
    public String getSupplieraddress4() {
        return this.supplieraddress4;
    }
    
    public void setSupplieraddress4(String supplieraddress4) {
        this.supplieraddress4 = supplieraddress4;
    }

    
    @Column(name="SUPPLIERTOWN", length=35)
    public String getSuppliertown() {
        return this.suppliertown;
    }
    
    public void setSuppliertown(String suppliertown) {
        this.suppliertown = suppliertown;
    }

    
    @Column(name="SUPPLIERZIP", length=16)
    public String getSupplierzip() {
        return this.supplierzip;
    }
    
    public void setSupplierzip(String supplierzip) {
        this.supplierzip = supplierzip;
    }

    
    @Column(name="SUPPLIERCOUNTRY", length=4)
    public String getSuppliercountry() {
        return this.suppliercountry;
    }
    
    public void setSuppliercountry(String suppliercountry) {
        this.suppliercountry = suppliercountry;
    }

    
    @Column(name="SUPPLIERSTATE", length=2)
    public String getSupplierstate() {
        return this.supplierstate;
    }
    
    public void setSupplierstate(String supplierstate) {
        this.supplierstate = supplierstate;
    }

    
    @Column(name="SUPPLIERREFERENCE", length=50)
    public String getSupplierreference() {
        return this.supplierreference;
    }
    
    public void setSupplierreference(String supplierreference) {
        this.supplierreference = supplierreference;
    }

    
    @Column(name="TERMSOFDELIVERY", length=10)
    public String getTermsofdelivery() {
        return this.termsofdelivery;
    }
    
    public void setTermsofdelivery(String termsofdelivery) {
        this.termsofdelivery = termsofdelivery;
    }

    
    @Column(name="TERMSOFDELIVERYDESC", length=50)
    public String getTermsofdeliverydesc() {
        return this.termsofdeliverydesc;
    }
    
    public void setTermsofdeliverydesc(String termsofdeliverydesc) {
        this.termsofdeliverydesc = termsofdeliverydesc;
    }

    
    @Column(name="MANNEROFTRANSPORT", length=10)
    public String getManneroftransport() {
        return this.manneroftransport;
    }
    
    public void setManneroftransport(String manneroftransport) {
        this.manneroftransport = manneroftransport;
    }

    
    @Column(name="MANNEROFTRANSPORTDESC", length=50)
    public String getManneroftransportdesc() {
        return this.manneroftransportdesc;
    }
    
    public void setManneroftransportdesc(String manneroftransportdesc) {
        this.manneroftransportdesc = manneroftransportdesc;
    }

    
    @Column(name="ORDERVALUE", precision=17, scale=4)
    public BigDecimal getOrdervalue() {
        return this.ordervalue;
    }
    
    public void setOrdervalue(BigDecimal ordervalue) {
        this.ordervalue = ordervalue;
    }

    
    @Column(name="ORDERVALUECURRENCY", length=3)
    public String getOrdervaluecurrency() {
        return this.ordervaluecurrency;
    }
    
    public void setOrdervaluecurrency(String ordervaluecurrency) {
        this.ordervaluecurrency = ordervaluecurrency;
    }

    
    @Column(name="GOODSMARKING", length=50)
    public String getGoodsmarking() {
        return this.goodsmarking;
    }
    
    public void setGoodsmarking(String goodsmarking) {
        this.goodsmarking = goodsmarking;
    }

    
    @Column(name="IP_PURCHASEORDERTYPE", precision=5, scale=0)
    public Integer getIpPurchaseordertype() {
        return this.ipPurchaseordertype;
    }
    
    public void setIpPurchaseordertype(Integer ipPurchaseordertype) {
        this.ipPurchaseordertype = ipPurchaseordertype;
    }

    
    @Column(name="PURCHASEORDERNR_DELANN", length=35)
    public String getPurchaseordernrDelann() {
        return this.purchaseordernrDelann;
    }
    
    public void setPurchaseordernrDelann(String purchaseordernrDelann) {
        this.purchaseordernrDelann = purchaseordernrDelann;
    }

    
    @Column(name="TEXTFIELD10_1", length=10)
    public String getTextfield101() {
        return this.textfield101;
    }
    
    public void setTextfield101(String textfield101) {
        this.textfield101 = textfield101;
    }

    
    @Column(name="TEXTFIELD10_2", length=10)
    public String getTextfield102() {
        return this.textfield102;
    }
    
    public void setTextfield102(String textfield102) {
        this.textfield102 = textfield102;
    }

    
    @Column(name="TEXTFIELD10_3", length=10)
    public String getTextfield103() {
        return this.textfield103;
    }
    
    public void setTextfield103(String textfield103) {
        this.textfield103 = textfield103;
    }

    
    @Column(name="TEXTFIELD35_1", length=35)
    public String getTextfield351() {
        return this.textfield351;
    }
    
    public void setTextfield351(String textfield351) {
        this.textfield351 = textfield351;
    }

    
    @Column(name="TEXTFIELD35_2", length=35)
    public String getTextfield352() {
        return this.textfield352;
    }
    
    public void setTextfield352(String textfield352) {
        this.textfield352 = textfield352;
    }

    
    @Column(name="TEXTFIELD35_3", length=35)
    public String getTextfield353() {
        return this.textfield353;
    }
    
    public void setTextfield353(String textfield353) {
        this.textfield353 = textfield353;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="grehdr")
    public Set<Grelinbtc> getGrelinbtcs() {
        return this.grelinbtcs;
    }
    
    public void setGrelinbtcs(Set<Grelinbtc> grelinbtcs) {
        this.grelinbtcs = grelinbtcs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grehdr")
    public Set<Grelin> getGrelins() {
        return this.grelins;
    }
    
    public void setGrelins(Set<Grelin> grelins) {
        this.grelins = grelins;
    }




}


