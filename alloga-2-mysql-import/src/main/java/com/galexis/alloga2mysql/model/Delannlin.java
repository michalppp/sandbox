package com.galexis.alloga2mysql.model;

// Generated Mar 4, 2013 4:41:13 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Delannlin generated by hbm2java
 */
@Entity
@Table(name = "DELANNLIN")
public class Delannlin implements java.io.Serializable {

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

	public Delannlin() {
	}

	public Delannlin(long pk, Date recordcreationtime) {
		this.pk = pk;
		this.recordcreationtime = recordcreationtime;
	}

	public Delannlin(long pk, Long delannhdrpk, String inbounddeliverynr, Integer inbounddeliveryline, String materialnr, String marketmaterialnr, BigDecimal purchaseqty,
	        BigDecimal confirmedqty, String unitofqty, BigDecimal grossweight, String unitofweight, Integer confirmeddeliverydate, String purchaseordernr,
	        String purchaseorderline, String batchid, String expirydate, String uniqueid, String itemnr, String mainsuppliernr, String recordstatus, String textfield101,
	        String textfield102, String textfield103, String textfield351, String textfield352, String textfield353, Date deliverydonetime, Date timestampreceived, String status,
	        String transactionid, Date timestampconfirmation, String programname, String processingflag1, String processingflag2, String processingflag3, String processingflag4,
	        String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10,
	        String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
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

	@Id
	@Column(name = "PK", unique = true, nullable = false, precision = 12, scale = 0)
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	@Column(name = "DELANNHDRPK", precision = 12, scale = 0)
	public Long getDelannhdrpk() {
		return this.delannhdrpk;
	}

	public void setDelannhdrpk(Long delannhdrpk) {
		this.delannhdrpk = delannhdrpk;
	}

	@Column(name = "INBOUNDDELIVERYNR", length = 35)
	public String getInbounddeliverynr() {
		return this.inbounddeliverynr;
	}

	public void setInbounddeliverynr(String inbounddeliverynr) {
		this.inbounddeliverynr = inbounddeliverynr;
	}

	@Column(name = "INBOUNDDELIVERYLINE", precision = 6, scale = 0)
	public Integer getInbounddeliveryline() {
		return this.inbounddeliveryline;
	}

	public void setInbounddeliveryline(Integer inbounddeliveryline) {
		this.inbounddeliveryline = inbounddeliveryline;
	}

	@Column(name = "MATERIALNR", length = 35)
	public String getMaterialnr() {
		return this.materialnr;
	}

	public void setMaterialnr(String materialnr) {
		this.materialnr = materialnr;
	}

	@Column(name = "MARKETMATERIALNR", length = 35)
	public String getMarketmaterialnr() {
		return this.marketmaterialnr;
	}

	public void setMarketmaterialnr(String marketmaterialnr) {
		this.marketmaterialnr = marketmaterialnr;
	}

	@Column(name = "PURCHASEQTY", precision = 15, scale = 3)
	public BigDecimal getPurchaseqty() {
		return this.purchaseqty;
	}

	public void setPurchaseqty(BigDecimal purchaseqty) {
		this.purchaseqty = purchaseqty;
	}

	@Column(name = "CONFIRMEDQTY", precision = 15, scale = 3)
	public BigDecimal getConfirmedqty() {
		return this.confirmedqty;
	}

	public void setConfirmedqty(BigDecimal confirmedqty) {
		this.confirmedqty = confirmedqty;
	}

	@Column(name = "UNITOFQTY", length = 3)
	public String getUnitofqty() {
		return this.unitofqty;
	}

	public void setUnitofqty(String unitofqty) {
		this.unitofqty = unitofqty;
	}

	@Column(name = "GROSSWEIGHT", precision = 15, scale = 3)
	public BigDecimal getGrossweight() {
		return this.grossweight;
	}

	public void setGrossweight(BigDecimal grossweight) {
		this.grossweight = grossweight;
	}

	@Column(name = "UNITOFWEIGHT", length = 3)
	public String getUnitofweight() {
		return this.unitofweight;
	}

	public void setUnitofweight(String unitofweight) {
		this.unitofweight = unitofweight;
	}

	@Column(name = "CONFIRMEDDELIVERYDATE", precision = 8, scale = 0)
	public Integer getConfirmeddeliverydate() {
		return this.confirmeddeliverydate;
	}

	public void setConfirmeddeliverydate(Integer confirmeddeliverydate) {
		this.confirmeddeliverydate = confirmeddeliverydate;
	}

	@Column(name = "PURCHASEORDERNR", length = 35)
	public String getPurchaseordernr() {
		return this.purchaseordernr;
	}

	public void setPurchaseordernr(String purchaseordernr) {
		this.purchaseordernr = purchaseordernr;
	}

	@Column(name = "PURCHASEORDERLINE", length = 6)
	public String getPurchaseorderline() {
		return this.purchaseorderline;
	}

	public void setPurchaseorderline(String purchaseorderline) {
		this.purchaseorderline = purchaseorderline;
	}

	@Column(name = "BATCHID", length = 10)
	public String getBatchid() {
		return this.batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	@Column(name = "EXPIRYDATE", length = 8)
	public String getExpirydate() {
		return this.expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	@Column(name = "UNIQUEID", length = 15)
	public String getUniqueid() {
		return this.uniqueid;
	}

	public void setUniqueid(String uniqueid) {
		this.uniqueid = uniqueid;
	}

	@Column(name = "ITEMNR", length = 35)
	public String getItemnr() {
		return this.itemnr;
	}

	public void setItemnr(String itemnr) {
		this.itemnr = itemnr;
	}

	@Column(name = "MAINSUPPLIERNR", length = 11)
	public String getMainsuppliernr() {
		return this.mainsuppliernr;
	}

	public void setMainsuppliernr(String mainsuppliernr) {
		this.mainsuppliernr = mainsuppliernr;
	}

	@Column(name = "RECORDSTATUS", length = 1)
	public String getRecordstatus() {
		return this.recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	@Column(name = "TEXTFIELD10_1", length = 10)
	public String getTextfield101() {
		return this.textfield101;
	}

	public void setTextfield101(String textfield101) {
		this.textfield101 = textfield101;
	}

	@Column(name = "TEXTFIELD10_2", length = 10)
	public String getTextfield102() {
		return this.textfield102;
	}

	public void setTextfield102(String textfield102) {
		this.textfield102 = textfield102;
	}

	@Column(name = "TEXTFIELD10_3", length = 10)
	public String getTextfield103() {
		return this.textfield103;
	}

	public void setTextfield103(String textfield103) {
		this.textfield103 = textfield103;
	}

	@Column(name = "TEXTFIELD35_1", length = 35)
	public String getTextfield351() {
		return this.textfield351;
	}

	public void setTextfield351(String textfield351) {
		this.textfield351 = textfield351;
	}

	@Column(name = "TEXTFIELD35_2", length = 35)
	public String getTextfield352() {
		return this.textfield352;
	}

	public void setTextfield352(String textfield352) {
		this.textfield352 = textfield352;
	}

	@Column(name = "TEXTFIELD35_3", length = 35)
	public String getTextfield353() {
		return this.textfield353;
	}

	public void setTextfield353(String textfield353) {
		this.textfield353 = textfield353;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DELIVERYDONETIME", length = 19)
	public Date getDeliverydonetime() {
		return this.deliverydonetime;
	}

	public void setDeliverydonetime(Date deliverydonetime) {
		this.deliverydonetime = deliverydonetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIMESTAMPRECEIVED", length = 19)
	public Date getTimestampreceived() {
		return this.timestampreceived;
	}

	public void setTimestampreceived(Date timestampreceived) {
		this.timestampreceived = timestampreceived;
	}

	@Column(name = "STATUS", length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "TRANSACTIONID", length = 50)
	public String getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIMESTAMPCONFIRMATION", length = 19)
	public Date getTimestampconfirmation() {
		return this.timestampconfirmation;
	}

	public void setTimestampconfirmation(Date timestampconfirmation) {
		this.timestampconfirmation = timestampconfirmation;
	}

	@Column(name = "PROGRAMNAME", length = 10)
	public String getProgramname() {
		return this.programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}

	@Column(name = "PROCESSINGFLAG1", length = 1)
	public String getProcessingflag1() {
		return this.processingflag1;
	}

	public void setProcessingflag1(String processingflag1) {
		this.processingflag1 = processingflag1;
	}

	@Column(name = "PROCESSINGFLAG2", length = 1)
	public String getProcessingflag2() {
		return this.processingflag2;
	}

	public void setProcessingflag2(String processingflag2) {
		this.processingflag2 = processingflag2;
	}

	@Column(name = "PROCESSINGFLAG3", length = 1)
	public String getProcessingflag3() {
		return this.processingflag3;
	}

	public void setProcessingflag3(String processingflag3) {
		this.processingflag3 = processingflag3;
	}

	@Column(name = "PROCESSINGFLAG4", length = 1)
	public String getProcessingflag4() {
		return this.processingflag4;
	}

	public void setProcessingflag4(String processingflag4) {
		this.processingflag4 = processingflag4;
	}

	@Column(name = "PROCESSINGFLAG5", length = 1)
	public String getProcessingflag5() {
		return this.processingflag5;
	}

	public void setProcessingflag5(String processingflag5) {
		this.processingflag5 = processingflag5;
	}

	@Column(name = "PROCESSINGFLAG6", length = 1)
	public String getProcessingflag6() {
		return this.processingflag6;
	}

	public void setProcessingflag6(String processingflag6) {
		this.processingflag6 = processingflag6;
	}

	@Column(name = "PROCESSINGFLAG7", length = 1)
	public String getProcessingflag7() {
		return this.processingflag7;
	}

	public void setProcessingflag7(String processingflag7) {
		this.processingflag7 = processingflag7;
	}

	@Column(name = "PROCESSINGFLAG8", length = 1)
	public String getProcessingflag8() {
		return this.processingflag8;
	}

	public void setProcessingflag8(String processingflag8) {
		this.processingflag8 = processingflag8;
	}

	@Column(name = "PROCESSINGFLAG9", length = 1)
	public String getProcessingflag9() {
		return this.processingflag9;
	}

	public void setProcessingflag9(String processingflag9) {
		this.processingflag9 = processingflag9;
	}

	@Column(name = "PROCESSINGFLAG10", length = 1)
	public String getProcessingflag10() {
		return this.processingflag10;
	}

	public void setProcessingflag10(String processingflag10) {
		this.processingflag10 = processingflag10;
	}

	@Column(name = "RECORDPROCESSEDFLAG", length = 1)
	public String getRecordprocessedflag() {
		return this.recordprocessedflag;
	}

	public void setRecordprocessedflag(String recordprocessedflag) {
		this.recordprocessedflag = recordprocessedflag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECORDPROCESSINGTIME", length = 19)
	public Date getRecordprocessingtime() {
		return this.recordprocessingtime;
	}

	public void setRecordprocessingtime(Date recordprocessingtime) {
		this.recordprocessingtime = recordprocessingtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECORDLASTCHANGETIME", length = 19)
	public Date getRecordlastchangetime() {
		return this.recordlastchangetime;
	}

	public void setRecordlastchangetime(Date recordlastchangetime) {
		this.recordlastchangetime = recordlastchangetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECORDCREATIONTIME", nullable = false, length = 19)
	public Date getRecordcreationtime() {
		return this.recordcreationtime;
	}

	public void setRecordcreationtime(Date recordcreationtime) {
		this.recordcreationtime = recordcreationtime;
	}

}
