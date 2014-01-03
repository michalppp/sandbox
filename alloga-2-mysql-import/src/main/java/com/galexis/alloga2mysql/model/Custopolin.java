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
 * Custopolin generated by hbm2java
 */
@Entity
@Table(name = "CUSTOPOLIN")
public class Custopolin implements java.io.Serializable {

	private long pk;

	private long custopohdrpk;

	private int orderline;

	private Integer deliverylinenr;

	private Byte orderlinestatus;

	private long itemmasterpk;

	private String itemnr;

	private String itemnrcontractor;

	private String salesrepresentative;

	private Date requesteddeliverydate;

	private String freeofchargeflag;

	private String freeofchargereasoncode;

	private BigDecimal orderquantity;

	private BigDecimal deliveredquantity;

	private BigDecimal remainingquantity;

	private BigDecimal invoicequantity;

	private String unit;

	private String requestedbatchid;

	private Date batchexpirydate;

	private BigDecimal salesprice;

	private BigDecimal netsalesprice;

	private Long incidentnr;

	private Integer incidentline;

	private Long retlinpk;

	private String backloggedflag;

	private Integer ipFreeofchargereasoncode;

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

	public Custopolin() {
	}

	public Custopolin(long pk, long custopohdrpk, int orderline, long itemmasterpk, String itemnr, String outboundignore, Date recordcreationtime) {
		this.pk = pk;
		this.custopohdrpk = custopohdrpk;
		this.orderline = orderline;
		this.itemmasterpk = itemmasterpk;
		this.itemnr = itemnr;
		this.outboundignore = outboundignore;
		this.recordcreationtime = recordcreationtime;
	}

	public Custopolin(long pk, long custopohdrpk, int orderline, Integer deliverylinenr, Byte orderlinestatus, long itemmasterpk, String itemnr, String itemnrcontractor,
	        String salesrepresentative, Date requesteddeliverydate, String freeofchargeflag, String freeofchargereasoncode, BigDecimal orderquantity, BigDecimal deliveredquantity,
	        BigDecimal remainingquantity, BigDecimal invoicequantity, String unit, String requestedbatchid, Date batchexpirydate, BigDecimal salesprice, BigDecimal netsalesprice,
	        Long incidentnr, Integer incidentline, Long retlinpk, String backloggedflag, Integer ipFreeofchargereasoncode, String programname, String filename,
	        String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7,
	        String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime) {
		this.pk = pk;
		this.custopohdrpk = custopohdrpk;
		this.orderline = orderline;
		this.deliverylinenr = deliverylinenr;
		this.orderlinestatus = orderlinestatus;
		this.itemmasterpk = itemmasterpk;
		this.itemnr = itemnr;
		this.itemnrcontractor = itemnrcontractor;
		this.salesrepresentative = salesrepresentative;
		this.requesteddeliverydate = requesteddeliverydate;
		this.freeofchargeflag = freeofchargeflag;
		this.freeofchargereasoncode = freeofchargereasoncode;
		this.orderquantity = orderquantity;
		this.deliveredquantity = deliveredquantity;
		this.remainingquantity = remainingquantity;
		this.invoicequantity = invoicequantity;
		this.unit = unit;
		this.requestedbatchid = requestedbatchid;
		this.batchexpirydate = batchexpirydate;
		this.salesprice = salesprice;
		this.netsalesprice = netsalesprice;
		this.incidentnr = incidentnr;
		this.incidentline = incidentline;
		this.retlinpk = retlinpk;
		this.backloggedflag = backloggedflag;
		this.ipFreeofchargereasoncode = ipFreeofchargereasoncode;
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
	}

	@Id
	@Column(name = "PK", unique = true, nullable = false, precision = 12, scale = 0)
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	@Column(name = "CUSTOPOHDRPK", nullable = false, precision = 12, scale = 0)
	public long getCustopohdrpk() {
		return this.custopohdrpk;
	}

	public void setCustopohdrpk(long custopohdrpk) {
		this.custopohdrpk = custopohdrpk;
	}

	@Column(name = "ORDERLINE", nullable = false, precision = 5, scale = 0)
	public int getOrderline() {
		return this.orderline;
	}

	public void setOrderline(int orderline) {
		this.orderline = orderline;
	}

	@Column(name = "DELIVERYLINENR", precision = 5, scale = 0)
	public Integer getDeliverylinenr() {
		return this.deliverylinenr;
	}

	public void setDeliverylinenr(Integer deliverylinenr) {
		this.deliverylinenr = deliverylinenr;
	}

	@Column(name = "ORDERLINESTATUS", precision = 2, scale = 0)
	public Byte getOrderlinestatus() {
		return this.orderlinestatus;
	}

	public void setOrderlinestatus(Byte orderlinestatus) {
		this.orderlinestatus = orderlinestatus;
	}

	@Column(name = "ITEMMASTERPK", nullable = false, precision = 12, scale = 0)
	public long getItemmasterpk() {
		return this.itemmasterpk;
	}

	public void setItemmasterpk(long itemmasterpk) {
		this.itemmasterpk = itemmasterpk;
	}

	@Column(name = "ITEMNR", nullable = false, length = 35)
	public String getItemnr() {
		return this.itemnr;
	}

	public void setItemnr(String itemnr) {
		this.itemnr = itemnr;
	}

	@Column(name = "ITEMNRCONTRACTOR", length = 35)
	public String getItemnrcontractor() {
		return this.itemnrcontractor;
	}

	public void setItemnrcontractor(String itemnrcontractor) {
		this.itemnrcontractor = itemnrcontractor;
	}

	@Column(name = "SALESREPRESENTATIVE", length = 30)
	public String getSalesrepresentative() {
		return this.salesrepresentative;
	}

	public void setSalesrepresentative(String salesrepresentative) {
		this.salesrepresentative = salesrepresentative;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUESTEDDELIVERYDATE", length = 19)
	public Date getRequesteddeliverydate() {
		return this.requesteddeliverydate;
	}

	public void setRequesteddeliverydate(Date requesteddeliverydate) {
		this.requesteddeliverydate = requesteddeliverydate;
	}

	@Column(name = "FREEOFCHARGEFLAG", length = 1)
	public String getFreeofchargeflag() {
		return this.freeofchargeflag;
	}

	public void setFreeofchargeflag(String freeofchargeflag) {
		this.freeofchargeflag = freeofchargeflag;
	}

	@Column(name = "FREEOFCHARGEREASONCODE", length = 2)
	public String getFreeofchargereasoncode() {
		return this.freeofchargereasoncode;
	}

	public void setFreeofchargereasoncode(String freeofchargereasoncode) {
		this.freeofchargereasoncode = freeofchargereasoncode;
	}

	@Column(name = "ORDERQUANTITY", precision = 15, scale = 3)
	public BigDecimal getOrderquantity() {
		return this.orderquantity;
	}

	public void setOrderquantity(BigDecimal orderquantity) {
		this.orderquantity = orderquantity;
	}

	@Column(name = "DELIVEREDQUANTITY", precision = 15, scale = 3)
	public BigDecimal getDeliveredquantity() {
		return this.deliveredquantity;
	}

	public void setDeliveredquantity(BigDecimal deliveredquantity) {
		this.deliveredquantity = deliveredquantity;
	}

	@Column(name = "REMAININGQUANTITY", precision = 15, scale = 3)
	public BigDecimal getRemainingquantity() {
		return this.remainingquantity;
	}

	public void setRemainingquantity(BigDecimal remainingquantity) {
		this.remainingquantity = remainingquantity;
	}

	@Column(name = "INVOICEQUANTITY", precision = 15, scale = 3)
	public BigDecimal getInvoicequantity() {
		return this.invoicequantity;
	}

	public void setInvoicequantity(BigDecimal invoicequantity) {
		this.invoicequantity = invoicequantity;
	}

	@Column(name = "UNIT", length = 5)
	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Column(name = "REQUESTEDBATCHID", length = 20)
	public String getRequestedbatchid() {
		return this.requestedbatchid;
	}

	public void setRequestedbatchid(String requestedbatchid) {
		this.requestedbatchid = requestedbatchid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BATCHEXPIRYDATE", length = 19)
	public Date getBatchexpirydate() {
		return this.batchexpirydate;
	}

	public void setBatchexpirydate(Date batchexpirydate) {
		this.batchexpirydate = batchexpirydate;
	}

	@Column(name = "SALESPRICE", precision = 17, scale = 4)
	public BigDecimal getSalesprice() {
		return this.salesprice;
	}

	public void setSalesprice(BigDecimal salesprice) {
		this.salesprice = salesprice;
	}

	@Column(name = "NETSALESPRICE", precision = 17, scale = 4)
	public BigDecimal getNetsalesprice() {
		return this.netsalesprice;
	}

	public void setNetsalesprice(BigDecimal netsalesprice) {
		this.netsalesprice = netsalesprice;
	}

	@Column(name = "INCIDENTNR", precision = 12, scale = 0)
	public Long getIncidentnr() {
		return this.incidentnr;
	}

	public void setIncidentnr(Long incidentnr) {
		this.incidentnr = incidentnr;
	}

	@Column(name = "INCIDENTLINE", precision = 5, scale = 0)
	public Integer getIncidentline() {
		return this.incidentline;
	}

	public void setIncidentline(Integer incidentline) {
		this.incidentline = incidentline;
	}

	@Column(name = "RETLINPK", precision = 12, scale = 0)
	public Long getRetlinpk() {
		return this.retlinpk;
	}

	public void setRetlinpk(Long retlinpk) {
		this.retlinpk = retlinpk;
	}

	@Column(name = "BACKLOGGEDFLAG", length = 1)
	public String getBackloggedflag() {
		return this.backloggedflag;
	}

	public void setBackloggedflag(String backloggedflag) {
		this.backloggedflag = backloggedflag;
	}

	@Column(name = "IP_FREEOFCHARGEREASONCODE", precision = 5, scale = 0)
	public Integer getIpFreeofchargereasoncode() {
		return this.ipFreeofchargereasoncode;
	}

	public void setIpFreeofchargereasoncode(Integer ipFreeofchargereasoncode) {
		this.ipFreeofchargereasoncode = ipFreeofchargereasoncode;
	}

	@Column(name = "PROGRAMNAME", length = 10)
	public String getProgramname() {
		return this.programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}

	@Column(name = "FILENAME", length = 10)
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
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

	@Column(name = "OUTBOUNDIGNORE", nullable = false, length = 1)
	public String getOutboundignore() {
		return this.outboundignore;
	}

	public void setOutboundignore(String outboundignore) {
		this.outboundignore = outboundignore;
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