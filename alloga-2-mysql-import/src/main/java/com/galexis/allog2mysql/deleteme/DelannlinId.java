package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DelannlinId generated by hbm2java
 */
@Embeddable
public class DelannlinId  implements java.io.Serializable {


     private long pk;
     private Long delannhdrpk;
     private String inbounddeliverynr;
     private Integer inbounddeliveryline;
     private String materialnr;
     private String marketmaterialnr;
     private BigDecimal purchaseqty;
     private BigDecimal confirmedqty;
     private String unitofqty;
     private BigDecimal grossweight;
     private String unitofweight;
     private Integer confirmeddeliverydate;
     private String purchaseordernr;
     private String purchaseorderline;
     private String batchid;
     private String expirydate;
     private String uniqueid;
     private String itemnr;
     private String mainsuppliernr;
     private String recordstatus;
     private String textfield101;
     private String textfield102;
     private String textfield103;
     private String textfield351;
     private String textfield352;
     private String textfield353;
     private Date deliverydonetime;
     private Date timestampreceived;
     private String status;
     private String transactionid;
     private Date timestampconfirmation;
     private String programname;
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
     private String recordprocessedflag;
     private Date recordprocessingtime;
     private Date recordlastchangetime;
     private Date recordcreationtime;

    public DelannlinId() {
    }

	
    public DelannlinId(long pk, Date recordcreationtime) {
        this.pk = pk;
        this.recordcreationtime = recordcreationtime;
    }
    public DelannlinId(long pk, Long delannhdrpk, String inbounddeliverynr, Integer inbounddeliveryline, String materialnr, String marketmaterialnr, BigDecimal purchaseqty, BigDecimal confirmedqty, String unitofqty, BigDecimal grossweight, String unitofweight, Integer confirmeddeliverydate, String purchaseordernr, String purchaseorderline, String batchid, String expirydate, String uniqueid, String itemnr, String mainsuppliernr, String recordstatus, String textfield101, String textfield102, String textfield103, String textfield351, String textfield352, String textfield353, Date deliverydonetime, Date timestampreceived, String status, String transactionid, Date timestampconfirmation, String programname, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.delannhdrpk = delannhdrpk;
       this.inbounddeliverynr = inbounddeliverynr;
       this.inbounddeliveryline = inbounddeliveryline;
       this.materialnr = materialnr;
       this.marketmaterialnr = marketmaterialnr;
       this.purchaseqty = purchaseqty;
       this.confirmedqty = confirmedqty;
       this.unitofqty = unitofqty;
       this.grossweight = grossweight;
       this.unitofweight = unitofweight;
       this.confirmeddeliverydate = confirmeddeliverydate;
       this.purchaseordernr = purchaseordernr;
       this.purchaseorderline = purchaseorderline;
       this.batchid = batchid;
       this.expirydate = expirydate;
       this.uniqueid = uniqueid;
       this.itemnr = itemnr;
       this.mainsuppliernr = mainsuppliernr;
       this.recordstatus = recordstatus;
       this.textfield101 = textfield101;
       this.textfield102 = textfield102;
       this.textfield103 = textfield103;
       this.textfield351 = textfield351;
       this.textfield352 = textfield352;
       this.textfield353 = textfield353;
       this.deliverydonetime = deliverydonetime;
       this.timestampreceived = timestampreceived;
       this.status = status;
       this.transactionid = transactionid;
       this.timestampconfirmation = timestampconfirmation;
       this.programname = programname;
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
       this.recordprocessedflag = recordprocessedflag;
       this.recordprocessingtime = recordprocessingtime;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
    }
   


    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="DELANNHDRPK", precision=12, scale=0)
    public Long getDelannhdrpk() {
        return this.delannhdrpk;
    }
    
    public void setDelannhdrpk(Long delannhdrpk) {
        this.delannhdrpk = delannhdrpk;
    }


    @Column(name="INBOUNDDELIVERYNR", length=35)
    public String getInbounddeliverynr() {
        return this.inbounddeliverynr;
    }
    
    public void setInbounddeliverynr(String inbounddeliverynr) {
        this.inbounddeliverynr = inbounddeliverynr;
    }


    @Column(name="INBOUNDDELIVERYLINE", precision=6, scale=0)
    public Integer getInbounddeliveryline() {
        return this.inbounddeliveryline;
    }
    
    public void setInbounddeliveryline(Integer inbounddeliveryline) {
        this.inbounddeliveryline = inbounddeliveryline;
    }


    @Column(name="MATERIALNR", length=35)
    public String getMaterialnr() {
        return this.materialnr;
    }
    
    public void setMaterialnr(String materialnr) {
        this.materialnr = materialnr;
    }


    @Column(name="MARKETMATERIALNR", length=35)
    public String getMarketmaterialnr() {
        return this.marketmaterialnr;
    }
    
    public void setMarketmaterialnr(String marketmaterialnr) {
        this.marketmaterialnr = marketmaterialnr;
    }


    @Column(name="PURCHASEQTY", precision=15, scale=3)
    public BigDecimal getPurchaseqty() {
        return this.purchaseqty;
    }
    
    public void setPurchaseqty(BigDecimal purchaseqty) {
        this.purchaseqty = purchaseqty;
    }


    @Column(name="CONFIRMEDQTY", precision=15, scale=3)
    public BigDecimal getConfirmedqty() {
        return this.confirmedqty;
    }
    
    public void setConfirmedqty(BigDecimal confirmedqty) {
        this.confirmedqty = confirmedqty;
    }


    @Column(name="UNITOFQTY", length=3)
    public String getUnitofqty() {
        return this.unitofqty;
    }
    
    public void setUnitofqty(String unitofqty) {
        this.unitofqty = unitofqty;
    }


    @Column(name="GROSSWEIGHT", precision=15, scale=3)
    public BigDecimal getGrossweight() {
        return this.grossweight;
    }
    
    public void setGrossweight(BigDecimal grossweight) {
        this.grossweight = grossweight;
    }


    @Column(name="UNITOFWEIGHT", length=3)
    public String getUnitofweight() {
        return this.unitofweight;
    }
    
    public void setUnitofweight(String unitofweight) {
        this.unitofweight = unitofweight;
    }


    @Column(name="CONFIRMEDDELIVERYDATE", precision=8, scale=0)
    public Integer getConfirmeddeliverydate() {
        return this.confirmeddeliverydate;
    }
    
    public void setConfirmeddeliverydate(Integer confirmeddeliverydate) {
        this.confirmeddeliverydate = confirmeddeliverydate;
    }


    @Column(name="PURCHASEORDERNR", length=35)
    public String getPurchaseordernr() {
        return this.purchaseordernr;
    }
    
    public void setPurchaseordernr(String purchaseordernr) {
        this.purchaseordernr = purchaseordernr;
    }


    @Column(name="PURCHASEORDERLINE", length=6)
    public String getPurchaseorderline() {
        return this.purchaseorderline;
    }
    
    public void setPurchaseorderline(String purchaseorderline) {
        this.purchaseorderline = purchaseorderline;
    }


    @Column(name="BATCHID", length=10)
    public String getBatchid() {
        return this.batchid;
    }
    
    public void setBatchid(String batchid) {
        this.batchid = batchid;
    }


    @Column(name="EXPIRYDATE", length=8)
    public String getExpirydate() {
        return this.expirydate;
    }
    
    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }


    @Column(name="UNIQUEID", length=15)
    public String getUniqueid() {
        return this.uniqueid;
    }
    
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }


    @Column(name="ITEMNR", length=35)
    public String getItemnr() {
        return this.itemnr;
    }
    
    public void setItemnr(String itemnr) {
        this.itemnr = itemnr;
    }


    @Column(name="MAINSUPPLIERNR", length=11)
    public String getMainsuppliernr() {
        return this.mainsuppliernr;
    }
    
    public void setMainsuppliernr(String mainsuppliernr) {
        this.mainsuppliernr = mainsuppliernr;
    }


    @Column(name="RECORDSTATUS", length=1)
    public String getRecordstatus() {
        return this.recordstatus;
    }
    
    public void setRecordstatus(String recordstatus) {
        this.recordstatus = recordstatus;
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


    @Column(name="DELIVERYDONETIME", length=26)
    public Date getDeliverydonetime() {
        return this.deliverydonetime;
    }
    
    public void setDeliverydonetime(Date deliverydonetime) {
        this.deliverydonetime = deliverydonetime;
    }


    @Column(name="TIMESTAMPRECEIVED", length=26)
    public Date getTimestampreceived() {
        return this.timestampreceived;
    }
    
    public void setTimestampreceived(Date timestampreceived) {
        this.timestampreceived = timestampreceived;
    }


    @Column(name="STATUS", length=1)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }


    @Column(name="TRANSACTIONID", length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }


    @Column(name="TIMESTAMPCONFIRMATION", length=26)
    public Date getTimestampconfirmation() {
        return this.timestampconfirmation;
    }
    
    public void setTimestampconfirmation(Date timestampconfirmation) {
        this.timestampconfirmation = timestampconfirmation;
    }


    @Column(name="PROGRAMNAME", length=10)
    public String getProgramname() {
        return this.programname;
    }
    
    public void setProgramname(String programname) {
        this.programname = programname;
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


    @Column(name="RECORDPROCESSEDFLAG", length=1)
    public String getRecordprocessedflag() {
        return this.recordprocessedflag;
    }
    
    public void setRecordprocessedflag(String recordprocessedflag) {
        this.recordprocessedflag = recordprocessedflag;
    }


    @Column(name="RECORDPROCESSINGTIME", length=26)
    public Date getRecordprocessingtime() {
        return this.recordprocessingtime;
    }
    
    public void setRecordprocessingtime(Date recordprocessingtime) {
        this.recordprocessingtime = recordprocessingtime;
    }


    @Column(name="RECORDLASTCHANGETIME", length=26)
    public Date getRecordlastchangetime() {
        return this.recordlastchangetime;
    }
    
    public void setRecordlastchangetime(Date recordlastchangetime) {
        this.recordlastchangetime = recordlastchangetime;
    }


    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DelannlinId) ) return false;
		 DelannlinId castOther = ( DelannlinId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && ( (this.getDelannhdrpk()==castOther.getDelannhdrpk()) || ( this.getDelannhdrpk()!=null && castOther.getDelannhdrpk()!=null && this.getDelannhdrpk().equals(castOther.getDelannhdrpk()) ) )
 && ( (this.getInbounddeliverynr()==castOther.getInbounddeliverynr()) || ( this.getInbounddeliverynr()!=null && castOther.getInbounddeliverynr()!=null && this.getInbounddeliverynr().equals(castOther.getInbounddeliverynr()) ) )
 && ( (this.getInbounddeliveryline()==castOther.getInbounddeliveryline()) || ( this.getInbounddeliveryline()!=null && castOther.getInbounddeliveryline()!=null && this.getInbounddeliveryline().equals(castOther.getInbounddeliveryline()) ) )
 && ( (this.getMaterialnr()==castOther.getMaterialnr()) || ( this.getMaterialnr()!=null && castOther.getMaterialnr()!=null && this.getMaterialnr().equals(castOther.getMaterialnr()) ) )
 && ( (this.getMarketmaterialnr()==castOther.getMarketmaterialnr()) || ( this.getMarketmaterialnr()!=null && castOther.getMarketmaterialnr()!=null && this.getMarketmaterialnr().equals(castOther.getMarketmaterialnr()) ) )
 && ( (this.getPurchaseqty()==castOther.getPurchaseqty()) || ( this.getPurchaseqty()!=null && castOther.getPurchaseqty()!=null && this.getPurchaseqty().equals(castOther.getPurchaseqty()) ) )
 && ( (this.getConfirmedqty()==castOther.getConfirmedqty()) || ( this.getConfirmedqty()!=null && castOther.getConfirmedqty()!=null && this.getConfirmedqty().equals(castOther.getConfirmedqty()) ) )
 && ( (this.getUnitofqty()==castOther.getUnitofqty()) || ( this.getUnitofqty()!=null && castOther.getUnitofqty()!=null && this.getUnitofqty().equals(castOther.getUnitofqty()) ) )
 && ( (this.getGrossweight()==castOther.getGrossweight()) || ( this.getGrossweight()!=null && castOther.getGrossweight()!=null && this.getGrossweight().equals(castOther.getGrossweight()) ) )
 && ( (this.getUnitofweight()==castOther.getUnitofweight()) || ( this.getUnitofweight()!=null && castOther.getUnitofweight()!=null && this.getUnitofweight().equals(castOther.getUnitofweight()) ) )
 && ( (this.getConfirmeddeliverydate()==castOther.getConfirmeddeliverydate()) || ( this.getConfirmeddeliverydate()!=null && castOther.getConfirmeddeliverydate()!=null && this.getConfirmeddeliverydate().equals(castOther.getConfirmeddeliverydate()) ) )
 && ( (this.getPurchaseordernr()==castOther.getPurchaseordernr()) || ( this.getPurchaseordernr()!=null && castOther.getPurchaseordernr()!=null && this.getPurchaseordernr().equals(castOther.getPurchaseordernr()) ) )
 && ( (this.getPurchaseorderline()==castOther.getPurchaseorderline()) || ( this.getPurchaseorderline()!=null && castOther.getPurchaseorderline()!=null && this.getPurchaseorderline().equals(castOther.getPurchaseorderline()) ) )
 && ( (this.getBatchid()==castOther.getBatchid()) || ( this.getBatchid()!=null && castOther.getBatchid()!=null && this.getBatchid().equals(castOther.getBatchid()) ) )
 && ( (this.getExpirydate()==castOther.getExpirydate()) || ( this.getExpirydate()!=null && castOther.getExpirydate()!=null && this.getExpirydate().equals(castOther.getExpirydate()) ) )
 && ( (this.getUniqueid()==castOther.getUniqueid()) || ( this.getUniqueid()!=null && castOther.getUniqueid()!=null && this.getUniqueid().equals(castOther.getUniqueid()) ) )
 && ( (this.getItemnr()==castOther.getItemnr()) || ( this.getItemnr()!=null && castOther.getItemnr()!=null && this.getItemnr().equals(castOther.getItemnr()) ) )
 && ( (this.getMainsuppliernr()==castOther.getMainsuppliernr()) || ( this.getMainsuppliernr()!=null && castOther.getMainsuppliernr()!=null && this.getMainsuppliernr().equals(castOther.getMainsuppliernr()) ) )
 && ( (this.getRecordstatus()==castOther.getRecordstatus()) || ( this.getRecordstatus()!=null && castOther.getRecordstatus()!=null && this.getRecordstatus().equals(castOther.getRecordstatus()) ) )
 && ( (this.getTextfield101()==castOther.getTextfield101()) || ( this.getTextfield101()!=null && castOther.getTextfield101()!=null && this.getTextfield101().equals(castOther.getTextfield101()) ) )
 && ( (this.getTextfield102()==castOther.getTextfield102()) || ( this.getTextfield102()!=null && castOther.getTextfield102()!=null && this.getTextfield102().equals(castOther.getTextfield102()) ) )
 && ( (this.getTextfield103()==castOther.getTextfield103()) || ( this.getTextfield103()!=null && castOther.getTextfield103()!=null && this.getTextfield103().equals(castOther.getTextfield103()) ) )
 && ( (this.getTextfield351()==castOther.getTextfield351()) || ( this.getTextfield351()!=null && castOther.getTextfield351()!=null && this.getTextfield351().equals(castOther.getTextfield351()) ) )
 && ( (this.getTextfield352()==castOther.getTextfield352()) || ( this.getTextfield352()!=null && castOther.getTextfield352()!=null && this.getTextfield352().equals(castOther.getTextfield352()) ) )
 && ( (this.getTextfield353()==castOther.getTextfield353()) || ( this.getTextfield353()!=null && castOther.getTextfield353()!=null && this.getTextfield353().equals(castOther.getTextfield353()) ) )
 && ( (this.getDeliverydonetime()==castOther.getDeliverydonetime()) || ( this.getDeliverydonetime()!=null && castOther.getDeliverydonetime()!=null && this.getDeliverydonetime().equals(castOther.getDeliverydonetime()) ) )
 && ( (this.getTimestampreceived()==castOther.getTimestampreceived()) || ( this.getTimestampreceived()!=null && castOther.getTimestampreceived()!=null && this.getTimestampreceived().equals(castOther.getTimestampreceived()) ) )
 && ( (this.getStatus()==castOther.getStatus()) || ( this.getStatus()!=null && castOther.getStatus()!=null && this.getStatus().equals(castOther.getStatus()) ) )
 && ( (this.getTransactionid()==castOther.getTransactionid()) || ( this.getTransactionid()!=null && castOther.getTransactionid()!=null && this.getTransactionid().equals(castOther.getTransactionid()) ) )
 && ( (this.getTimestampconfirmation()==castOther.getTimestampconfirmation()) || ( this.getTimestampconfirmation()!=null && castOther.getTimestampconfirmation()!=null && this.getTimestampconfirmation().equals(castOther.getTimestampconfirmation()) ) )
 && ( (this.getProgramname()==castOther.getProgramname()) || ( this.getProgramname()!=null && castOther.getProgramname()!=null && this.getProgramname().equals(castOther.getProgramname()) ) )
 && ( (this.getProcessingflag1()==castOther.getProcessingflag1()) || ( this.getProcessingflag1()!=null && castOther.getProcessingflag1()!=null && this.getProcessingflag1().equals(castOther.getProcessingflag1()) ) )
 && ( (this.getProcessingflag2()==castOther.getProcessingflag2()) || ( this.getProcessingflag2()!=null && castOther.getProcessingflag2()!=null && this.getProcessingflag2().equals(castOther.getProcessingflag2()) ) )
 && ( (this.getProcessingflag3()==castOther.getProcessingflag3()) || ( this.getProcessingflag3()!=null && castOther.getProcessingflag3()!=null && this.getProcessingflag3().equals(castOther.getProcessingflag3()) ) )
 && ( (this.getProcessingflag4()==castOther.getProcessingflag4()) || ( this.getProcessingflag4()!=null && castOther.getProcessingflag4()!=null && this.getProcessingflag4().equals(castOther.getProcessingflag4()) ) )
 && ( (this.getProcessingflag5()==castOther.getProcessingflag5()) || ( this.getProcessingflag5()!=null && castOther.getProcessingflag5()!=null && this.getProcessingflag5().equals(castOther.getProcessingflag5()) ) )
 && ( (this.getProcessingflag6()==castOther.getProcessingflag6()) || ( this.getProcessingflag6()!=null && castOther.getProcessingflag6()!=null && this.getProcessingflag6().equals(castOther.getProcessingflag6()) ) )
 && ( (this.getProcessingflag7()==castOther.getProcessingflag7()) || ( this.getProcessingflag7()!=null && castOther.getProcessingflag7()!=null && this.getProcessingflag7().equals(castOther.getProcessingflag7()) ) )
 && ( (this.getProcessingflag8()==castOther.getProcessingflag8()) || ( this.getProcessingflag8()!=null && castOther.getProcessingflag8()!=null && this.getProcessingflag8().equals(castOther.getProcessingflag8()) ) )
 && ( (this.getProcessingflag9()==castOther.getProcessingflag9()) || ( this.getProcessingflag9()!=null && castOther.getProcessingflag9()!=null && this.getProcessingflag9().equals(castOther.getProcessingflag9()) ) )
 && ( (this.getProcessingflag10()==castOther.getProcessingflag10()) || ( this.getProcessingflag10()!=null && castOther.getProcessingflag10()!=null && this.getProcessingflag10().equals(castOther.getProcessingflag10()) ) )
 && ( (this.getRecordprocessedflag()==castOther.getRecordprocessedflag()) || ( this.getRecordprocessedflag()!=null && castOther.getRecordprocessedflag()!=null && this.getRecordprocessedflag().equals(castOther.getRecordprocessedflag()) ) )
 && ( (this.getRecordprocessingtime()==castOther.getRecordprocessingtime()) || ( this.getRecordprocessingtime()!=null && castOther.getRecordprocessingtime()!=null && this.getRecordprocessingtime().equals(castOther.getRecordprocessingtime()) ) )
 && ( (this.getRecordlastchangetime()==castOther.getRecordlastchangetime()) || ( this.getRecordlastchangetime()!=null && castOther.getRecordlastchangetime()!=null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime()) ) )
 && ( (this.getRecordcreationtime()==castOther.getRecordcreationtime()) || ( this.getRecordcreationtime()!=null && castOther.getRecordcreationtime()!=null && this.getRecordcreationtime().equals(castOther.getRecordcreationtime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + ( getDelannhdrpk() == null ? 0 : this.getDelannhdrpk().hashCode() );
         result = 37 * result + ( getInbounddeliverynr() == null ? 0 : this.getInbounddeliverynr().hashCode() );
         result = 37 * result + ( getInbounddeliveryline() == null ? 0 : this.getInbounddeliveryline().hashCode() );
         result = 37 * result + ( getMaterialnr() == null ? 0 : this.getMaterialnr().hashCode() );
         result = 37 * result + ( getMarketmaterialnr() == null ? 0 : this.getMarketmaterialnr().hashCode() );
         result = 37 * result + ( getPurchaseqty() == null ? 0 : this.getPurchaseqty().hashCode() );
         result = 37 * result + ( getConfirmedqty() == null ? 0 : this.getConfirmedqty().hashCode() );
         result = 37 * result + ( getUnitofqty() == null ? 0 : this.getUnitofqty().hashCode() );
         result = 37 * result + ( getGrossweight() == null ? 0 : this.getGrossweight().hashCode() );
         result = 37 * result + ( getUnitofweight() == null ? 0 : this.getUnitofweight().hashCode() );
         result = 37 * result + ( getConfirmeddeliverydate() == null ? 0 : this.getConfirmeddeliverydate().hashCode() );
         result = 37 * result + ( getPurchaseordernr() == null ? 0 : this.getPurchaseordernr().hashCode() );
         result = 37 * result + ( getPurchaseorderline() == null ? 0 : this.getPurchaseorderline().hashCode() );
         result = 37 * result + ( getBatchid() == null ? 0 : this.getBatchid().hashCode() );
         result = 37 * result + ( getExpirydate() == null ? 0 : this.getExpirydate().hashCode() );
         result = 37 * result + ( getUniqueid() == null ? 0 : this.getUniqueid().hashCode() );
         result = 37 * result + ( getItemnr() == null ? 0 : this.getItemnr().hashCode() );
         result = 37 * result + ( getMainsuppliernr() == null ? 0 : this.getMainsuppliernr().hashCode() );
         result = 37 * result + ( getRecordstatus() == null ? 0 : this.getRecordstatus().hashCode() );
         result = 37 * result + ( getTextfield101() == null ? 0 : this.getTextfield101().hashCode() );
         result = 37 * result + ( getTextfield102() == null ? 0 : this.getTextfield102().hashCode() );
         result = 37 * result + ( getTextfield103() == null ? 0 : this.getTextfield103().hashCode() );
         result = 37 * result + ( getTextfield351() == null ? 0 : this.getTextfield351().hashCode() );
         result = 37 * result + ( getTextfield352() == null ? 0 : this.getTextfield352().hashCode() );
         result = 37 * result + ( getTextfield353() == null ? 0 : this.getTextfield353().hashCode() );
         result = 37 * result + ( getDeliverydonetime() == null ? 0 : this.getDeliverydonetime().hashCode() );
         result = 37 * result + ( getTimestampreceived() == null ? 0 : this.getTimestampreceived().hashCode() );
         result = 37 * result + ( getStatus() == null ? 0 : this.getStatus().hashCode() );
         result = 37 * result + ( getTransactionid() == null ? 0 : this.getTransactionid().hashCode() );
         result = 37 * result + ( getTimestampconfirmation() == null ? 0 : this.getTimestampconfirmation().hashCode() );
         result = 37 * result + ( getProgramname() == null ? 0 : this.getProgramname().hashCode() );
         result = 37 * result + ( getProcessingflag1() == null ? 0 : this.getProcessingflag1().hashCode() );
         result = 37 * result + ( getProcessingflag2() == null ? 0 : this.getProcessingflag2().hashCode() );
         result = 37 * result + ( getProcessingflag3() == null ? 0 : this.getProcessingflag3().hashCode() );
         result = 37 * result + ( getProcessingflag4() == null ? 0 : this.getProcessingflag4().hashCode() );
         result = 37 * result + ( getProcessingflag5() == null ? 0 : this.getProcessingflag5().hashCode() );
         result = 37 * result + ( getProcessingflag6() == null ? 0 : this.getProcessingflag6().hashCode() );
         result = 37 * result + ( getProcessingflag7() == null ? 0 : this.getProcessingflag7().hashCode() );
         result = 37 * result + ( getProcessingflag8() == null ? 0 : this.getProcessingflag8().hashCode() );
         result = 37 * result + ( getProcessingflag9() == null ? 0 : this.getProcessingflag9().hashCode() );
         result = 37 * result + ( getProcessingflag10() == null ? 0 : this.getProcessingflag10().hashCode() );
         result = 37 * result + ( getRecordprocessedflag() == null ? 0 : this.getRecordprocessedflag().hashCode() );
         result = 37 * result + ( getRecordprocessingtime() == null ? 0 : this.getRecordprocessingtime().hashCode() );
         result = 37 * result + ( getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode() );
         result = 37 * result + ( getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode() );
         return result;
   }   


}


