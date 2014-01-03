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
 * Invmovmap generated by hbm2java
 */
@Entity
@Table(name = "INVMOVMAP")
public class Invmovmap implements java.io.Serializable {

	private long pk;

	private long invmovmntpk;

	private Long invmovconpk;

	private String plantfrom;

	private String plantto;

	private String storagelocationfrom;

	private String storagelocationto;

	private String stockstatusfrom;

	private String stockstatusto;

	private String movementcode;

	private String reasoncode;

	private String salesorganisation;

	private String reference;

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

	public Invmovmap() {
	}

	public Invmovmap(long pk, long invmovmntpk, String outboundignore) {
		this.pk = pk;
		this.invmovmntpk = invmovmntpk;
		this.outboundignore = outboundignore;
	}

	public Invmovmap(long pk, long invmovmntpk, Long invmovconpk, String plantfrom, String plantto, String storagelocationfrom, String storagelocationto, String stockstatusfrom,
	        String stockstatusto, String movementcode, String reasoncode, String salesorganisation, String reference, String programname, String filename, String processingflag1,
	        String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8,
	        String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime) {
		this.pk = pk;
		this.invmovmntpk = invmovmntpk;
		this.invmovconpk = invmovconpk;
		this.plantfrom = plantfrom;
		this.plantto = plantto;
		this.storagelocationfrom = storagelocationfrom;
		this.storagelocationto = storagelocationto;
		this.stockstatusfrom = stockstatusfrom;
		this.stockstatusto = stockstatusto;
		this.movementcode = movementcode;
		this.reasoncode = reasoncode;
		this.salesorganisation = salesorganisation;
		this.reference = reference;
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

	@Column(name = "INVMOVMNTPK", nullable = false, precision = 12, scale = 0)
	public long getInvmovmntpk() {
		return this.invmovmntpk;
	}

	public void setInvmovmntpk(long invmovmntpk) {
		this.invmovmntpk = invmovmntpk;
	}

	@Column(name = "INVMOVCONPK", precision = 12, scale = 0)
	public Long getInvmovconpk() {
		return this.invmovconpk;
	}

	public void setInvmovconpk(Long invmovconpk) {
		this.invmovconpk = invmovconpk;
	}

	@Column(name = "PLANTFROM", length = 20)
	public String getPlantfrom() {
		return this.plantfrom;
	}

	public void setPlantfrom(String plantfrom) {
		this.plantfrom = plantfrom;
	}

	@Column(name = "PLANTTO", length = 20)
	public String getPlantto() {
		return this.plantto;
	}

	public void setPlantto(String plantto) {
		this.plantto = plantto;
	}

	@Column(name = "STORAGELOCATIONFROM", length = 20)
	public String getStoragelocationfrom() {
		return this.storagelocationfrom;
	}

	public void setStoragelocationfrom(String storagelocationfrom) {
		this.storagelocationfrom = storagelocationfrom;
	}

	@Column(name = "STORAGELOCATIONTO", length = 20)
	public String getStoragelocationto() {
		return this.storagelocationto;
	}

	public void setStoragelocationto(String storagelocationto) {
		this.storagelocationto = storagelocationto;
	}

	@Column(name = "STOCKSTATUSFROM", length = 20)
	public String getStockstatusfrom() {
		return this.stockstatusfrom;
	}

	public void setStockstatusfrom(String stockstatusfrom) {
		this.stockstatusfrom = stockstatusfrom;
	}

	@Column(name = "STOCKSTATUSTO", length = 20)
	public String getStockstatusto() {
		return this.stockstatusto;
	}

	public void setStockstatusto(String stockstatusto) {
		this.stockstatusto = stockstatusto;
	}

	@Column(name = "MOVEMENTCODE", length = 20)
	public String getMovementcode() {
		return this.movementcode;
	}

	public void setMovementcode(String movementcode) {
		this.movementcode = movementcode;
	}

	@Column(name = "REASONCODE", length = 20)
	public String getReasoncode() {
		return this.reasoncode;
	}

	public void setReasoncode(String reasoncode) {
		this.reasoncode = reasoncode;
	}

	@Column(name = "SALESORGANISATION", length = 20)
	public String getSalesorganisation() {
		return this.salesorganisation;
	}

	public void setSalesorganisation(String salesorganisation) {
		this.salesorganisation = salesorganisation;
	}

	@Column(name = "REFERENCE", length = 50)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
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
	@Column(name = "RECORDCREATIONTIME", length = 19)
	public Date getRecordcreationtime() {
		return this.recordcreationtime;
	}

	public void setRecordcreationtime(Date recordcreationtime) {
		this.recordcreationtime = recordcreationtime;
	}

}