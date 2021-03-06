package com.galexis.alloga2mysql.model;

// Generated Mar 4, 2013 4:41:13 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Delhdr generated by hbm2java
 */
@Entity
@Table(name = "DELHDR")
public class Delhdr implements java.io.Serializable {

	private long pk;

	private long contrdefpk;

	private String deliverynr;

	private String salesorganisation;

	private String salesorganisationdesc;

	private long salesordernr;

	private String salesordertype;

	private String salesordertypedescription;

	private long bizparaddrpkOrder;

	private Long bizparaddrpkInvoice;

	private Long bizparaddrpkDelivery;

	private String salesordercustomernr;

	private String contractorordercustomernr;

	private String contractorinvoicecustomernr;

	private String contractordeliverycustomernr;

	private String customerreference;

	private String customerordernredifact;

	private String manneroftransport;

	private String manneroftransportdesc;

	private String termsofdelivery;

	private String termsofdeliverydesc;

	private Date orderdate;

	private String orderSourceCode;

	private String transportnotenr;

	private String customerreference1;

	private String customerreference2;

	private String customerreference3;

	private String customerreference4;

	private String customerreference5;

	private Integer ipSalesordertype;

	private Integer ipInvoicetype;

	private Integer timedatepk;

	private Integer ipTimedatepkReporting;

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

	public Delhdr() {
	}

	public Delhdr(long pk, long contrdefpk, long salesordernr, String salesordertype, long bizparaddrpkOrder, Date orderdate, String backendreleased, String outboundignore,
	        String recordprocessedflag, Date recordcreationtime) {
		this.pk = pk;
		this.contrdefpk = contrdefpk;
		this.salesordernr = salesordernr;
		this.salesordertype = salesordertype;
		this.bizparaddrpkOrder = bizparaddrpkOrder;
		this.orderdate = orderdate;
		this.backendreleased = backendreleased;
		this.outboundignore = outboundignore;
		this.recordprocessedflag = recordprocessedflag;
		this.recordcreationtime = recordcreationtime;
	}

	public Delhdr(long pk, long contrdefpk, String deliverynr, String salesorganisation, String salesorganisationdesc, long salesordernr, String salesordertype,
	        String salesordertypedescription, long bizparaddrpkOrder, Long bizparaddrpkInvoice, Long bizparaddrpkDelivery, String salesordercustomernr,
	        String contractorordercustomernr, String contractorinvoicecustomernr, String contractordeliverycustomernr, String customerreference, String customerordernredifact,
	        String manneroftransport, String manneroftransportdesc, String termsofdelivery, String termsofdeliverydesc, Date orderdate, String orderSourceCode,
	        String transportnotenr, String customerreference1, String customerreference2, String customerreference3, String customerreference4, String customerreference5,
	        Integer ipSalesordertype, Integer ipInvoicetype, Integer timedatepk, Integer ipTimedatepkReporting, String programname, String filename, String processingflag1,
	        String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8,
	        String processingflag9, String processingflag10, String backendreleased, String outboundignore, String transactionid, String recordprocessedflag,
	        Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
		this.pk = pk;
		this.contrdefpk = contrdefpk;
		this.deliverynr = deliverynr;
		this.salesorganisation = salesorganisation;
		this.salesorganisationdesc = salesorganisationdesc;
		this.salesordernr = salesordernr;
		this.salesordertype = salesordertype;
		this.salesordertypedescription = salesordertypedescription;
		this.bizparaddrpkOrder = bizparaddrpkOrder;
		this.bizparaddrpkInvoice = bizparaddrpkInvoice;
		this.bizparaddrpkDelivery = bizparaddrpkDelivery;
		this.salesordercustomernr = salesordercustomernr;
		this.contractorordercustomernr = contractorordercustomernr;
		this.contractorinvoicecustomernr = contractorinvoicecustomernr;
		this.contractordeliverycustomernr = contractordeliverycustomernr;
		this.customerreference = customerreference;
		this.customerordernredifact = customerordernredifact;
		this.manneroftransport = manneroftransport;
		this.manneroftransportdesc = manneroftransportdesc;
		this.termsofdelivery = termsofdelivery;
		this.termsofdeliverydesc = termsofdeliverydesc;
		this.orderdate = orderdate;
		this.orderSourceCode = orderSourceCode;
		this.transportnotenr = transportnotenr;
		this.customerreference1 = customerreference1;
		this.customerreference2 = customerreference2;
		this.customerreference3 = customerreference3;
		this.customerreference4 = customerreference4;
		this.customerreference5 = customerreference5;
		this.ipSalesordertype = ipSalesordertype;
		this.ipInvoicetype = ipInvoicetype;
		this.timedatepk = timedatepk;
		this.ipTimedatepkReporting = ipTimedatepkReporting;
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
	@Column(name = "PK", unique = true, nullable = false, precision = 12, scale = 0)
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	@Column(name = "CONTRDEFPK", nullable = false, precision = 12, scale = 0)
	public long getContrdefpk() {
		return this.contrdefpk;
	}

	public void setContrdefpk(long contrdefpk) {
		this.contrdefpk = contrdefpk;
	}

	@Column(name = "DELIVERYNR", length = 35)
	public String getDeliverynr() {
		return this.deliverynr;
	}

	public void setDeliverynr(String deliverynr) {
		this.deliverynr = deliverynr;
	}

	@Column(name = "SALESORGANISATION", length = 30)
	public String getSalesorganisation() {
		return this.salesorganisation;
	}

	public void setSalesorganisation(String salesorganisation) {
		this.salesorganisation = salesorganisation;
	}

	@Column(name = "SALESORGANISATIONDESC", length = 50)
	public String getSalesorganisationdesc() {
		return this.salesorganisationdesc;
	}

	public void setSalesorganisationdesc(String salesorganisationdesc) {
		this.salesorganisationdesc = salesorganisationdesc;
	}

	@Column(name = "SALESORDERNR", nullable = false, precision = 12, scale = 0)
	public long getSalesordernr() {
		return this.salesordernr;
	}

	public void setSalesordernr(long salesordernr) {
		this.salesordernr = salesordernr;
	}

	@Column(name = "SALESORDERTYPE", nullable = false, length = 2)
	public String getSalesordertype() {
		return this.salesordertype;
	}

	public void setSalesordertype(String salesordertype) {
		this.salesordertype = salesordertype;
	}

	@Column(name = "SALESORDERTYPEDESCRIPTION", length = 50)
	public String getSalesordertypedescription() {
		return this.salesordertypedescription;
	}

	public void setSalesordertypedescription(String salesordertypedescription) {
		this.salesordertypedescription = salesordertypedescription;
	}

	@Column(name = "BIZPARADDRPK_ORDER", nullable = false, precision = 12, scale = 0)
	public long getBizparaddrpkOrder() {
		return this.bizparaddrpkOrder;
	}

	public void setBizparaddrpkOrder(long bizparaddrpkOrder) {
		this.bizparaddrpkOrder = bizparaddrpkOrder;
	}

	@Column(name = "BIZPARADDRPK_INVOICE", precision = 12, scale = 0)
	public Long getBizparaddrpkInvoice() {
		return this.bizparaddrpkInvoice;
	}

	public void setBizparaddrpkInvoice(Long bizparaddrpkInvoice) {
		this.bizparaddrpkInvoice = bizparaddrpkInvoice;
	}

	@Column(name = "BIZPARADDRPK_DELIVERY", precision = 12, scale = 0)
	public Long getBizparaddrpkDelivery() {
		return this.bizparaddrpkDelivery;
	}

	public void setBizparaddrpkDelivery(Long bizparaddrpkDelivery) {
		this.bizparaddrpkDelivery = bizparaddrpkDelivery;
	}

	@Column(name = "SALESORDERCUSTOMERNR", length = 20)
	public String getSalesordercustomernr() {
		return this.salesordercustomernr;
	}

	public void setSalesordercustomernr(String salesordercustomernr) {
		this.salesordercustomernr = salesordercustomernr;
	}

	@Column(name = "CONTRACTORORDERCUSTOMERNR", length = 30)
	public String getContractorordercustomernr() {
		return this.contractorordercustomernr;
	}

	public void setContractorordercustomernr(String contractorordercustomernr) {
		this.contractorordercustomernr = contractorordercustomernr;
	}

	@Column(name = "CONTRACTORINVOICECUSTOMERNR", length = 30)
	public String getContractorinvoicecustomernr() {
		return this.contractorinvoicecustomernr;
	}

	public void setContractorinvoicecustomernr(String contractorinvoicecustomernr) {
		this.contractorinvoicecustomernr = contractorinvoicecustomernr;
	}

	@Column(name = "CONTRACTORDELIVERYCUSTOMERNR", length = 30)
	public String getContractordeliverycustomernr() {
		return this.contractordeliverycustomernr;
	}

	public void setContractordeliverycustomernr(String contractordeliverycustomernr) {
		this.contractordeliverycustomernr = contractordeliverycustomernr;
	}

	@Column(name = "CUSTOMERREFERENCE", length = 30)
	public String getCustomerreference() {
		return this.customerreference;
	}

	public void setCustomerreference(String customerreference) {
		this.customerreference = customerreference;
	}

	@Column(name = "CUSTOMERORDERNREDIFACT", length = 35)
	public String getCustomerordernredifact() {
		return this.customerordernredifact;
	}

	public void setCustomerordernredifact(String customerordernredifact) {
		this.customerordernredifact = customerordernredifact;
	}

	@Column(name = "MANNEROFTRANSPORT", length = 10)
	public String getManneroftransport() {
		return this.manneroftransport;
	}

	public void setManneroftransport(String manneroftransport) {
		this.manneroftransport = manneroftransport;
	}

	@Column(name = "MANNEROFTRANSPORTDESC", length = 50)
	public String getManneroftransportdesc() {
		return this.manneroftransportdesc;
	}

	public void setManneroftransportdesc(String manneroftransportdesc) {
		this.manneroftransportdesc = manneroftransportdesc;
	}

	@Column(name = "TERMSOFDELIVERY", length = 10)
	public String getTermsofdelivery() {
		return this.termsofdelivery;
	}

	public void setTermsofdelivery(String termsofdelivery) {
		this.termsofdelivery = termsofdelivery;
	}

	@Column(name = "TERMSOFDELIVERYDESC", length = 50)
	public String getTermsofdeliverydesc() {
		return this.termsofdeliverydesc;
	}

	public void setTermsofdeliverydesc(String termsofdeliverydesc) {
		this.termsofdeliverydesc = termsofdeliverydesc;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ORDERDATE", nullable = false, length = 19)
	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	@Column(name = "ORDER_SOURCE_CODE", length = 20)
	public String getOrderSourceCode() {
		return this.orderSourceCode;
	}

	public void setOrderSourceCode(String orderSourceCode) {
		this.orderSourceCode = orderSourceCode;
	}

	@Column(name = "TRANSPORTNOTENR", length = 35)
	public String getTransportnotenr() {
		return this.transportnotenr;
	}

	public void setTransportnotenr(String transportnotenr) {
		this.transportnotenr = transportnotenr;
	}

	@Column(name = "CUSTOMERREFERENCE1", length = 35)
	public String getCustomerreference1() {
		return this.customerreference1;
	}

	public void setCustomerreference1(String customerreference1) {
		this.customerreference1 = customerreference1;
	}

	@Column(name = "CUSTOMERREFERENCE2", length = 35)
	public String getCustomerreference2() {
		return this.customerreference2;
	}

	public void setCustomerreference2(String customerreference2) {
		this.customerreference2 = customerreference2;
	}

	@Column(name = "CUSTOMERREFERENCE3", length = 35)
	public String getCustomerreference3() {
		return this.customerreference3;
	}

	public void setCustomerreference3(String customerreference3) {
		this.customerreference3 = customerreference3;
	}

	@Column(name = "CUSTOMERREFERENCE4", length = 35)
	public String getCustomerreference4() {
		return this.customerreference4;
	}

	public void setCustomerreference4(String customerreference4) {
		this.customerreference4 = customerreference4;
	}

	@Column(name = "CUSTOMERREFERENCE5", length = 35)
	public String getCustomerreference5() {
		return this.customerreference5;
	}

	public void setCustomerreference5(String customerreference5) {
		this.customerreference5 = customerreference5;
	}

	@Column(name = "IP_SALESORDERTYPE", precision = 5, scale = 0)
	public Integer getIpSalesordertype() {
		return this.ipSalesordertype;
	}

	public void setIpSalesordertype(Integer ipSalesordertype) {
		this.ipSalesordertype = ipSalesordertype;
	}

	@Column(name = "IP_INVOICETYPE", precision = 5, scale = 0)
	public Integer getIpInvoicetype() {
		return this.ipInvoicetype;
	}

	public void setIpInvoicetype(Integer ipInvoicetype) {
		this.ipInvoicetype = ipInvoicetype;
	}

	@Column(name = "TIMEDATEPK", precision = 8, scale = 0)
	public Integer getTimedatepk() {
		return this.timedatepk;
	}

	public void setTimedatepk(Integer timedatepk) {
		this.timedatepk = timedatepk;
	}

	@Column(name = "IP_TIMEDATEPK_REPORTING", precision = 8, scale = 0)
	public Integer getIpTimedatepkReporting() {
		return this.ipTimedatepkReporting;
	}

	public void setIpTimedatepkReporting(Integer ipTimedatepkReporting) {
		this.ipTimedatepkReporting = ipTimedatepkReporting;
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

	@Column(name = "BACKENDRELEASED", nullable = false, length = 1)
	public String getBackendreleased() {
		return this.backendreleased;
	}

	public void setBackendreleased(String backendreleased) {
		this.backendreleased = backendreleased;
	}

	@Column(name = "OUTBOUNDIGNORE", nullable = false, length = 1)
	public String getOutboundignore() {
		return this.outboundignore;
	}

	public void setOutboundignore(String outboundignore) {
		this.outboundignore = outboundignore;
	}

	@Column(name = "TRANSACTIONID", length = 50)
	public String getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	@Column(name = "RECORDPROCESSEDFLAG", nullable = false, length = 1)
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
