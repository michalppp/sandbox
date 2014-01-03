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
 * Dellin generated by hbm2java
 */
@Entity
@Table(name = "DELLIN")
public class Dellin implements java.io.Serializable {

	private long pk;

	private long delhdrpk;

	private long salesordernr;

	private int deliveryline;

	private int salesorderline;

	private Long itemmasterpk;

	private String itemnr;

	private String itemnrcontractor;

	private String itemnrcontractor2;

	private BigDecimal deliveredqty;

	private BigDecimal requestedqty;

	private BigDecimal openqty;

	private BigDecimal backloggedqty;

	private String stockkeepingunit;

	private Date deliverydate;

	private Long picklistnr;

	private Integer picklistline;

	private Long pickconsolidationnr;

	private Long shipmentnr;

	private Date requesteddeliverydate;

	private String manneroftransport;

	private String freeofchargeflag;

	private String freeofchargereasoncode;

	private String salesrepresentative;

	private BigDecimal standardcost;

	private Long reforiginalordernr;

	private Integer reforiginalorderline;

	private String itemnarcoticcategory;

	private BigDecimal weight;

	private BigDecimal volume;

	private String orderingpartypurchordnumber;

	private String orderingpartypurchordline;

	private String customerorderreference;

	private String customerorderreferenceline;

	private String customerreference1;

	private String customerreference2;

	private String customerreference3;

	private String customerreference4;

	private String customerreference5;

	private Integer superiorpositionlinenr;

	private String messageid;

	private String messagedescription;

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

	private Date diinboundtime;

	private Date inhouseinterfacetime;

	private Date sointerfacetime;

	private Date neworderlinetime;

	private Date picklistcreationtime;

	private Date packinglistprinttime;

	private Date picklistconfirmationtime;

	private String outboundignore;

	private Date recordlastchangetime;

	private Date recordcreationtime;

	public Dellin() {
	}

	public Dellin(long pk, long delhdrpk, long salesordernr, int deliveryline, int salesorderline, Date deliverydate, String outboundignore, Date recordcreationtime) {
		this.pk = pk;
		this.delhdrpk = delhdrpk;
		this.salesordernr = salesordernr;
		this.deliveryline = deliveryline;
		this.salesorderline = salesorderline;
		this.deliverydate = deliverydate;
		this.outboundignore = outboundignore;
		this.recordcreationtime = recordcreationtime;
	}

	public Dellin(long pk, long delhdrpk, long salesordernr, int deliveryline, int salesorderline, Long itemmasterpk, String itemnr, String itemnrcontractor,
	        String itemnrcontractor2, BigDecimal deliveredqty, BigDecimal requestedqty, BigDecimal openqty, BigDecimal backloggedqty, String stockkeepingunit, Date deliverydate,
	        Long picklistnr, Integer picklistline, Long pickconsolidationnr, Long shipmentnr, Date requesteddeliverydate, String manneroftransport, String freeofchargeflag,
	        String freeofchargereasoncode, String salesrepresentative, BigDecimal standardcost, Long reforiginalordernr, Integer reforiginalorderline, String itemnarcoticcategory,
	        BigDecimal weight, BigDecimal volume, String orderingpartypurchordnumber, String orderingpartypurchordline, String customerorderreference,
	        String customerorderreferenceline, String customerreference1, String customerreference2, String customerreference3, String customerreference4,
	        String customerreference5, Integer superiorpositionlinenr, String messageid, String messagedescription, Integer ipFreeofchargereasoncode, String ipGroupingcriteria1,
	        String ipGroupingcriteria2, String ipGroupingcriteria3, String ipGroupingcriteria4, String ipGroupingcriteria5, String programname, String filename,
	        String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7,
	        String processingflag8, String processingflag9, String processingflag10, Date diinboundtime, Date inhouseinterfacetime, Date sointerfacetime, Date neworderlinetime,
	        Date picklistcreationtime, Date packinglistprinttime, Date picklistconfirmationtime, String outboundignore, Date recordlastchangetime, Date recordcreationtime) {
		this.pk = pk;
		this.delhdrpk = delhdrpk;
		this.salesordernr = salesordernr;
		this.deliveryline = deliveryline;
		this.salesorderline = salesorderline;
		this.itemmasterpk = itemmasterpk;
		this.itemnr = itemnr;
		this.itemnrcontractor = itemnrcontractor;
		this.itemnrcontractor2 = itemnrcontractor2;
		this.deliveredqty = deliveredqty;
		this.requestedqty = requestedqty;
		this.openqty = openqty;
		this.backloggedqty = backloggedqty;
		this.stockkeepingunit = stockkeepingunit;
		this.deliverydate = deliverydate;
		this.picklistnr = picklistnr;
		this.picklistline = picklistline;
		this.pickconsolidationnr = pickconsolidationnr;
		this.shipmentnr = shipmentnr;
		this.requesteddeliverydate = requesteddeliverydate;
		this.manneroftransport = manneroftransport;
		this.freeofchargeflag = freeofchargeflag;
		this.freeofchargereasoncode = freeofchargereasoncode;
		this.salesrepresentative = salesrepresentative;
		this.standardcost = standardcost;
		this.reforiginalordernr = reforiginalordernr;
		this.reforiginalorderline = reforiginalorderline;
		this.itemnarcoticcategory = itemnarcoticcategory;
		this.weight = weight;
		this.volume = volume;
		this.orderingpartypurchordnumber = orderingpartypurchordnumber;
		this.orderingpartypurchordline = orderingpartypurchordline;
		this.customerorderreference = customerorderreference;
		this.customerorderreferenceline = customerorderreferenceline;
		this.customerreference1 = customerreference1;
		this.customerreference2 = customerreference2;
		this.customerreference3 = customerreference3;
		this.customerreference4 = customerreference4;
		this.customerreference5 = customerreference5;
		this.superiorpositionlinenr = superiorpositionlinenr;
		this.messageid = messageid;
		this.messagedescription = messagedescription;
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
		this.diinboundtime = diinboundtime;
		this.inhouseinterfacetime = inhouseinterfacetime;
		this.sointerfacetime = sointerfacetime;
		this.neworderlinetime = neworderlinetime;
		this.picklistcreationtime = picklistcreationtime;
		this.packinglistprinttime = packinglistprinttime;
		this.picklistconfirmationtime = picklistconfirmationtime;
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

	@Column(name = "DELHDRPK", nullable = false, precision = 12, scale = 0)
	public long getDelhdrpk() {
		return this.delhdrpk;
	}

	public void setDelhdrpk(long delhdrpk) {
		this.delhdrpk = delhdrpk;
	}

	@Column(name = "SALESORDERNR", nullable = false, precision = 12, scale = 0)
	public long getSalesordernr() {
		return this.salesordernr;
	}

	public void setSalesordernr(long salesordernr) {
		this.salesordernr = salesordernr;
	}

	@Column(name = "DELIVERYLINE", nullable = false, precision = 6, scale = 0)
	public int getDeliveryline() {
		return this.deliveryline;
	}

	public void setDeliveryline(int deliveryline) {
		this.deliveryline = deliveryline;
	}

	@Column(name = "SALESORDERLINE", nullable = false, precision = 6, scale = 0)
	public int getSalesorderline() {
		return this.salesorderline;
	}

	public void setSalesorderline(int salesorderline) {
		this.salesorderline = salesorderline;
	}

	@Column(name = "ITEMMASTERPK", precision = 12, scale = 0)
	public Long getItemmasterpk() {
		return this.itemmasterpk;
	}

	public void setItemmasterpk(Long itemmasterpk) {
		this.itemmasterpk = itemmasterpk;
	}

	@Column(name = "ITEMNR", length = 35)
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

	@Column(name = "ITEMNRCONTRACTOR2", length = 35)
	public String getItemnrcontractor2() {
		return this.itemnrcontractor2;
	}

	public void setItemnrcontractor2(String itemnrcontractor2) {
		this.itemnrcontractor2 = itemnrcontractor2;
	}

	@Column(name = "DELIVEREDQTY", precision = 15, scale = 3)
	public BigDecimal getDeliveredqty() {
		return this.deliveredqty;
	}

	public void setDeliveredqty(BigDecimal deliveredqty) {
		this.deliveredqty = deliveredqty;
	}

	@Column(name = "REQUESTEDQTY", precision = 15, scale = 3)
	public BigDecimal getRequestedqty() {
		return this.requestedqty;
	}

	public void setRequestedqty(BigDecimal requestedqty) {
		this.requestedqty = requestedqty;
	}

	@Column(name = "OPENQTY", precision = 15, scale = 3)
	public BigDecimal getOpenqty() {
		return this.openqty;
	}

	public void setOpenqty(BigDecimal openqty) {
		this.openqty = openqty;
	}

	@Column(name = "BACKLOGGEDQTY", precision = 15, scale = 3)
	public BigDecimal getBackloggedqty() {
		return this.backloggedqty;
	}

	public void setBackloggedqty(BigDecimal backloggedqty) {
		this.backloggedqty = backloggedqty;
	}

	@Column(name = "STOCKKEEPINGUNIT", length = 5)
	public String getStockkeepingunit() {
		return this.stockkeepingunit;
	}

	public void setStockkeepingunit(String stockkeepingunit) {
		this.stockkeepingunit = stockkeepingunit;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DELIVERYDATE", length = 19)
	public Date getDeliverydate() {
		return this.deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	@Column(name = "PICKLISTNR", precision = 12, scale = 0)
	public Long getPicklistnr() {
		return this.picklistnr;
	}

	public void setPicklistnr(Long picklistnr) {
		this.picklistnr = picklistnr;
	}

	@Column(name = "PICKLISTLINE", precision = 6, scale = 0)
	public Integer getPicklistline() {
		return this.picklistline;
	}

	public void setPicklistline(Integer picklistline) {
		this.picklistline = picklistline;
	}

	@Column(name = "PICKCONSOLIDATIONNR", precision = 12, scale = 0)
	public Long getPickconsolidationnr() {
		return this.pickconsolidationnr;
	}

	public void setPickconsolidationnr(Long pickconsolidationnr) {
		this.pickconsolidationnr = pickconsolidationnr;
	}

	@Column(name = "SHIPMENTNR", precision = 12, scale = 0)
	public Long getShipmentnr() {
		return this.shipmentnr;
	}

	public void setShipmentnr(Long shipmentnr) {
		this.shipmentnr = shipmentnr;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUESTEDDELIVERYDATE", length = 19)
	public Date getRequesteddeliverydate() {
		return this.requesteddeliverydate;
	}

	public void setRequesteddeliverydate(Date requesteddeliverydate) {
		this.requesteddeliverydate = requesteddeliverydate;
	}

	@Column(name = "MANNEROFTRANSPORT", length = 10)
	public String getManneroftransport() {
		return this.manneroftransport;
	}

	public void setManneroftransport(String manneroftransport) {
		this.manneroftransport = manneroftransport;
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

	@Column(name = "SALESREPRESENTATIVE", length = 30)
	public String getSalesrepresentative() {
		return this.salesrepresentative;
	}

	public void setSalesrepresentative(String salesrepresentative) {
		this.salesrepresentative = salesrepresentative;
	}

	@Column(name = "STANDARDCOST", precision = 17, scale = 4)
	public BigDecimal getStandardcost() {
		return this.standardcost;
	}

	public void setStandardcost(BigDecimal standardcost) {
		this.standardcost = standardcost;
	}

	@Column(name = "REFORIGINALORDERNR", precision = 12, scale = 0)
	public Long getReforiginalordernr() {
		return this.reforiginalordernr;
	}

	public void setReforiginalordernr(Long reforiginalordernr) {
		this.reforiginalordernr = reforiginalordernr;
	}

	@Column(name = "REFORIGINALORDERLINE", precision = 6, scale = 0)
	public Integer getReforiginalorderline() {
		return this.reforiginalorderline;
	}

	public void setReforiginalorderline(Integer reforiginalorderline) {
		this.reforiginalorderline = reforiginalorderline;
	}

	@Column(name = "ITEMNARCOTICCATEGORY", length = 10)
	public String getItemnarcoticcategory() {
		return this.itemnarcoticcategory;
	}

	public void setItemnarcoticcategory(String itemnarcoticcategory) {
		this.itemnarcoticcategory = itemnarcoticcategory;
	}

	@Column(name = "WEIGHT", precision = 11, scale = 5)
	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Column(name = "VOLUME", precision = 11, scale = 5)
	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	@Column(name = "ORDERINGPARTYPURCHORDNUMBER", length = 35)
	public String getOrderingpartypurchordnumber() {
		return this.orderingpartypurchordnumber;
	}

	public void setOrderingpartypurchordnumber(String orderingpartypurchordnumber) {
		this.orderingpartypurchordnumber = orderingpartypurchordnumber;
	}

	@Column(name = "ORDERINGPARTYPURCHORDLINE", length = 35)
	public String getOrderingpartypurchordline() {
		return this.orderingpartypurchordline;
	}

	public void setOrderingpartypurchordline(String orderingpartypurchordline) {
		this.orderingpartypurchordline = orderingpartypurchordline;
	}

	@Column(name = "CUSTOMERORDERREFERENCE", length = 35)
	public String getCustomerorderreference() {
		return this.customerorderreference;
	}

	public void setCustomerorderreference(String customerorderreference) {
		this.customerorderreference = customerorderreference;
	}

	@Column(name = "CUSTOMERORDERREFERENCELINE", length = 35)
	public String getCustomerorderreferenceline() {
		return this.customerorderreferenceline;
	}

	public void setCustomerorderreferenceline(String customerorderreferenceline) {
		this.customerorderreferenceline = customerorderreferenceline;
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

	@Column(name = "SUPERIORPOSITIONLINENR", precision = 6, scale = 0)
	public Integer getSuperiorpositionlinenr() {
		return this.superiorpositionlinenr;
	}

	public void setSuperiorpositionlinenr(Integer superiorpositionlinenr) {
		this.superiorpositionlinenr = superiorpositionlinenr;
	}

	@Column(name = "MESSAGEID", length = 10)
	public String getMessageid() {
		return this.messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	@Column(name = "MESSAGEDESCRIPTION", length = 100)
	public String getMessagedescription() {
		return this.messagedescription;
	}

	public void setMessagedescription(String messagedescription) {
		this.messagedescription = messagedescription;
	}

	@Column(name = "IP_FREEOFCHARGEREASONCODE", precision = 5, scale = 0)
	public Integer getIpFreeofchargereasoncode() {
		return this.ipFreeofchargereasoncode;
	}

	public void setIpFreeofchargereasoncode(Integer ipFreeofchargereasoncode) {
		this.ipFreeofchargereasoncode = ipFreeofchargereasoncode;
	}

	@Column(name = "IP_GROUPINGCRITERIA1")
	public String getIpGroupingcriteria1() {
		return this.ipGroupingcriteria1;
	}

	public void setIpGroupingcriteria1(String ipGroupingcriteria1) {
		this.ipGroupingcriteria1 = ipGroupingcriteria1;
	}

	@Column(name = "IP_GROUPINGCRITERIA2")
	public String getIpGroupingcriteria2() {
		return this.ipGroupingcriteria2;
	}

	public void setIpGroupingcriteria2(String ipGroupingcriteria2) {
		this.ipGroupingcriteria2 = ipGroupingcriteria2;
	}

	@Column(name = "IP_GROUPINGCRITERIA3")
	public String getIpGroupingcriteria3() {
		return this.ipGroupingcriteria3;
	}

	public void setIpGroupingcriteria3(String ipGroupingcriteria3) {
		this.ipGroupingcriteria3 = ipGroupingcriteria3;
	}

	@Column(name = "IP_GROUPINGCRITERIA4")
	public String getIpGroupingcriteria4() {
		return this.ipGroupingcriteria4;
	}

	public void setIpGroupingcriteria4(String ipGroupingcriteria4) {
		this.ipGroupingcriteria4 = ipGroupingcriteria4;
	}

	@Column(name = "IP_GROUPINGCRITERIA5")
	public String getIpGroupingcriteria5() {
		return this.ipGroupingcriteria5;
	}

	public void setIpGroupingcriteria5(String ipGroupingcriteria5) {
		this.ipGroupingcriteria5 = ipGroupingcriteria5;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DIINBOUNDTIME", length = 19)
	public Date getDiinboundtime() {
		return this.diinboundtime;
	}

	public void setDiinboundtime(Date diinboundtime) {
		this.diinboundtime = diinboundtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INHOUSEINTERFACETIME", length = 19)
	public Date getInhouseinterfacetime() {
		return this.inhouseinterfacetime;
	}

	public void setInhouseinterfacetime(Date inhouseinterfacetime) {
		this.inhouseinterfacetime = inhouseinterfacetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SOINTERFACETIME", length = 19)
	public Date getSointerfacetime() {
		return this.sointerfacetime;
	}

	public void setSointerfacetime(Date sointerfacetime) {
		this.sointerfacetime = sointerfacetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NEWORDERLINETIME", length = 19)
	public Date getNeworderlinetime() {
		return this.neworderlinetime;
	}

	public void setNeworderlinetime(Date neworderlinetime) {
		this.neworderlinetime = neworderlinetime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PICKLISTCREATIONTIME", length = 19)
	public Date getPicklistcreationtime() {
		return this.picklistcreationtime;
	}

	public void setPicklistcreationtime(Date picklistcreationtime) {
		this.picklistcreationtime = picklistcreationtime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PACKINGLISTPRINTTIME", length = 19)
	public Date getPackinglistprinttime() {
		return this.packinglistprinttime;
	}

	public void setPackinglistprinttime(Date packinglistprinttime) {
		this.packinglistprinttime = packinglistprinttime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PICKLISTCONFIRMATIONTIME", length = 19)
	public Date getPicklistconfirmationtime() {
		return this.picklistconfirmationtime;
	}

	public void setPicklistconfirmationtime(Date picklistconfirmationtime) {
		this.picklistconfirmationtime = picklistconfirmationtime;
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
