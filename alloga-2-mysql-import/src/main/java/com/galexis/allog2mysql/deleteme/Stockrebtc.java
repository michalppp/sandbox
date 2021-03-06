package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Stockrebtc generated by hbm2java
 */
@Entity
@Table(name="STOCKREBTC"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Stockrebtc  implements java.io.Serializable {


     private long pk;
     private Contrdef contrdef;
     private Itemmaster itemmaster;
     private Timedate timedateByIpTimedatepkReporting;
     private Bizparaddr bizparaddrByBizparaddrpkOrder;
     private Bizparaddr bizparaddrByBizparaddrpkDelivery;
     private Bizparaddr bizparaddrByBizparaddrpkInvoice;
     private Timedate timedateByTimedatepk;
     private Date extractiondate;
     private String itemnr;
     private String itemnrcontractor;
     private String batchid;
     private Date batchexpirydate;
     private String batchidcontractor;
     private String warehouse;
     private BigDecimal quantity;
     private String stockkeepingunit;
     private Date reservationdate;
     private Byte recordtype;
     private Long salesordernr;
     private Integer salesorderline;
     private String salesordertype;
     private String salesordercustomernr;
     private Date salesorderdate;
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

    public Stockrebtc() {
    }

	
    public Stockrebtc(long pk, Contrdef contrdef, Itemmaster itemmaster, Date extractiondate, String itemnr, String backendreleased, String outboundignore, String recordprocessedflag, Date recordcreationtime) {
        this.pk = pk;
        this.contrdef = contrdef;
        this.itemmaster = itemmaster;
        this.extractiondate = extractiondate;
        this.itemnr = itemnr;
        this.backendreleased = backendreleased;
        this.outboundignore = outboundignore;
        this.recordprocessedflag = recordprocessedflag;
        this.recordcreationtime = recordcreationtime;
    }
    public Stockrebtc(long pk, Contrdef contrdef, Itemmaster itemmaster, Timedate timedateByIpTimedatepkReporting, Bizparaddr bizparaddrByBizparaddrpkOrder, Bizparaddr bizparaddrByBizparaddrpkDelivery, Bizparaddr bizparaddrByBizparaddrpkInvoice, Timedate timedateByTimedatepk, Date extractiondate, String itemnr, String itemnrcontractor, String batchid, Date batchexpirydate, String batchidcontractor, String warehouse, BigDecimal quantity, String stockkeepingunit, Date reservationdate, Byte recordtype, Long salesordernr, Integer salesorderline, String salesordertype, String salesordercustomernr, Date salesorderdate, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String backendreleased, String outboundignore, String transactionid, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.contrdef = contrdef;
       this.itemmaster = itemmaster;
       this.timedateByIpTimedatepkReporting = timedateByIpTimedatepkReporting;
       this.bizparaddrByBizparaddrpkOrder = bizparaddrByBizparaddrpkOrder;
       this.bizparaddrByBizparaddrpkDelivery = bizparaddrByBizparaddrpkDelivery;
       this.bizparaddrByBizparaddrpkInvoice = bizparaddrByBizparaddrpkInvoice;
       this.timedateByTimedatepk = timedateByTimedatepk;
       this.extractiondate = extractiondate;
       this.itemnr = itemnr;
       this.itemnrcontractor = itemnrcontractor;
       this.batchid = batchid;
       this.batchexpirydate = batchexpirydate;
       this.batchidcontractor = batchidcontractor;
       this.warehouse = warehouse;
       this.quantity = quantity;
       this.stockkeepingunit = stockkeepingunit;
       this.reservationdate = reservationdate;
       this.recordtype = recordtype;
       this.salesordernr = salesordernr;
       this.salesorderline = salesorderline;
       this.salesordertype = salesordertype;
       this.salesordercustomernr = salesordercustomernr;
       this.salesorderdate = salesorderdate;
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
    @JoinColumn(name="ITEMMASTERPK", nullable=false)
    public Itemmaster getItemmaster() {
        return this.itemmaster;
    }
    
    public void setItemmaster(Itemmaster itemmaster) {
        this.itemmaster = itemmaster;
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
    @JoinColumn(name="BIZPARADDRPK_ORDER")
    public Bizparaddr getBizparaddrByBizparaddrpkOrder() {
        return this.bizparaddrByBizparaddrpkOrder;
    }
    
    public void setBizparaddrByBizparaddrpkOrder(Bizparaddr bizparaddrByBizparaddrpkOrder) {
        this.bizparaddrByBizparaddrpkOrder = bizparaddrByBizparaddrpkOrder;
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIMEDATEPK")
    public Timedate getTimedateByTimedatepk() {
        return this.timedateByTimedatepk;
    }
    
    public void setTimedateByTimedatepk(Timedate timedateByTimedatepk) {
        this.timedateByTimedatepk = timedateByTimedatepk;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EXTRACTIONDATE", nullable=false, length=26)
    public Date getExtractiondate() {
        return this.extractiondate;
    }
    
    public void setExtractiondate(Date extractiondate) {
        this.extractiondate = extractiondate;
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

    
    @Column(name="BATCHID", length=20)
    public String getBatchid() {
        return this.batchid;
    }
    
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="BATCHEXPIRYDATE", length=26)
    public Date getBatchexpirydate() {
        return this.batchexpirydate;
    }
    
    public void setBatchexpirydate(Date batchexpirydate) {
        this.batchexpirydate = batchexpirydate;
    }

    
    @Column(name="BATCHIDCONTRACTOR", length=20)
    public String getBatchidcontractor() {
        return this.batchidcontractor;
    }
    
    public void setBatchidcontractor(String batchidcontractor) {
        this.batchidcontractor = batchidcontractor;
    }

    
    @Column(name="WAREHOUSE", length=10)
    public String getWarehouse() {
        return this.warehouse;
    }
    
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    
    @Column(name="QUANTITY", precision=15, scale=3)
    public BigDecimal getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
    @Column(name="STOCKKEEPINGUNIT", length=5)
    public String getStockkeepingunit() {
        return this.stockkeepingunit;
    }
    
    public void setStockkeepingunit(String stockkeepingunit) {
        this.stockkeepingunit = stockkeepingunit;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RESERVATIONDATE", length=26)
    public Date getReservationdate() {
        return this.reservationdate;
    }
    
    public void setReservationdate(Date reservationdate) {
        this.reservationdate = reservationdate;
    }

    
    @Column(name="RECORDTYPE", precision=2, scale=0)
    public Byte getRecordtype() {
        return this.recordtype;
    }
    
    public void setRecordtype(Byte recordtype) {
        this.recordtype = recordtype;
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

    
    @Column(name="SALESORDERCUSTOMERNR", length=20)
    public String getSalesordercustomernr() {
        return this.salesordercustomernr;
    }
    
    public void setSalesordercustomernr(String salesordercustomernr) {
        this.salesordercustomernr = salesordercustomernr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="SALESORDERDATE", length=26)
    public Date getSalesorderdate() {
        return this.salesorderdate;
    }
    
    public void setSalesorderdate(Date salesorderdate) {
        this.salesorderdate = salesorderdate;
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




}


