package com.galexis.alloga2mysql.model;

// Generated Mar 4, 2013 4:41:13 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Az103aggId generated by hbm2java
 */
@Embeddable
public class Az103aggId implements java.io.Serializable {

	private long contrdefpk;

	private short tdyear;

	private byte tdmonth;

	private int actualperiod;

	private String itemnr;

	private String itemnrcontractor;

	private Long bizparaddrpkDelivery;

	private Long bizparaddrpkInvoice;

	private BigDecimal grosssales;

	private BigDecimal netsales;

	private BigDecimal qtyinvoiced;

	private BigDecimal focqtysamples;

	private BigDecimal focqtybonus;

	private BigDecimal focqtyreplacement;

	private BigDecimal focqtynoreason;

	private BigDecimal focqtyotherreasons;

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

	private String recordprocessedflag;

	private Date recordprocessingtime;

	private Date recordlastchangetime;

	private Date recordcreationtime;

	public Az103aggId() {
	}

	public Az103aggId(long contrdefpk, short tdyear, byte tdmonth, int actualperiod, String itemnr, String outboundignore, String recordprocessedflag, Date recordcreationtime) {
		this.contrdefpk = contrdefpk;
		this.tdyear = tdyear;
		this.tdmonth = tdmonth;
		this.actualperiod = actualperiod;
		this.itemnr = itemnr;
		this.outboundignore = outboundignore;
		this.recordprocessedflag = recordprocessedflag;
		this.recordcreationtime = recordcreationtime;
	}

	public Az103aggId(long contrdefpk, short tdyear, byte tdmonth, int actualperiod, String itemnr, String itemnrcontractor, Long bizparaddrpkDelivery, Long bizparaddrpkInvoice,
	        BigDecimal grosssales, BigDecimal netsales, BigDecimal qtyinvoiced, BigDecimal focqtysamples, BigDecimal focqtybonus, BigDecimal focqtyreplacement,
	        BigDecimal focqtynoreason, BigDecimal focqtyotherreasons, String processingflag1, String processingflag2, String processingflag3, String processingflag4,
	        String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore,
	        String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
		this.contrdefpk = contrdefpk;
		this.tdyear = tdyear;
		this.tdmonth = tdmonth;
		this.actualperiod = actualperiod;
		this.itemnr = itemnr;
		this.itemnrcontractor = itemnrcontractor;
		this.bizparaddrpkDelivery = bizparaddrpkDelivery;
		this.bizparaddrpkInvoice = bizparaddrpkInvoice;
		this.grosssales = grosssales;
		this.netsales = netsales;
		this.qtyinvoiced = qtyinvoiced;
		this.focqtysamples = focqtysamples;
		this.focqtybonus = focqtybonus;
		this.focqtyreplacement = focqtyreplacement;
		this.focqtynoreason = focqtynoreason;
		this.focqtyotherreasons = focqtyotherreasons;
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
		this.recordprocessedflag = recordprocessedflag;
		this.recordprocessingtime = recordprocessingtime;
		this.recordlastchangetime = recordlastchangetime;
		this.recordcreationtime = recordcreationtime;
	}

	@Column(name = "CONTRDEFPK", nullable = false, precision = 12, scale = 0)
	public long getContrdefpk() {
		return this.contrdefpk;
	}

	public void setContrdefpk(long contrdefpk) {
		this.contrdefpk = contrdefpk;
	}

	@Column(name = "TDYEAR", nullable = false, precision = 4, scale = 0)
	public short getTdyear() {
		return this.tdyear;
	}

	public void setTdyear(short tdyear) {
		this.tdyear = tdyear;
	}

	@Column(name = "TDMONTH", nullable = false, precision = 2, scale = 0)
	public byte getTdmonth() {
		return this.tdmonth;
	}

	public void setTdmonth(byte tdmonth) {
		this.tdmonth = tdmonth;
	}

	@Column(name = "ACTUALPERIOD", nullable = false, precision = 6, scale = 0)
	public int getActualperiod() {
		return this.actualperiod;
	}

	public void setActualperiod(int actualperiod) {
		this.actualperiod = actualperiod;
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

	@Column(name = "BIZPARADDRPK_DELIVERY", precision = 12, scale = 0)
	public Long getBizparaddrpkDelivery() {
		return this.bizparaddrpkDelivery;
	}

	public void setBizparaddrpkDelivery(Long bizparaddrpkDelivery) {
		this.bizparaddrpkDelivery = bizparaddrpkDelivery;
	}

	@Column(name = "BIZPARADDRPK_INVOICE", precision = 12, scale = 0)
	public Long getBizparaddrpkInvoice() {
		return this.bizparaddrpkInvoice;
	}

	public void setBizparaddrpkInvoice(Long bizparaddrpkInvoice) {
		this.bizparaddrpkInvoice = bizparaddrpkInvoice;
	}

	@Column(name = "GROSSSALES", precision = 17, scale = 4)
	public BigDecimal getGrosssales() {
		return this.grosssales;
	}

	public void setGrosssales(BigDecimal grosssales) {
		this.grosssales = grosssales;
	}

	@Column(name = "NETSALES", precision = 17, scale = 4)
	public BigDecimal getNetsales() {
		return this.netsales;
	}

	public void setNetsales(BigDecimal netsales) {
		this.netsales = netsales;
	}

	@Column(name = "QTYINVOICED", precision = 15, scale = 3)
	public BigDecimal getQtyinvoiced() {
		return this.qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}

	@Column(name = "FOCQTYSAMPLES", precision = 15, scale = 3)
	public BigDecimal getFocqtysamples() {
		return this.focqtysamples;
	}

	public void setFocqtysamples(BigDecimal focqtysamples) {
		this.focqtysamples = focqtysamples;
	}

	@Column(name = "FOCQTYBONUS", precision = 15, scale = 3)
	public BigDecimal getFocqtybonus() {
		return this.focqtybonus;
	}

	public void setFocqtybonus(BigDecimal focqtybonus) {
		this.focqtybonus = focqtybonus;
	}

	@Column(name = "FOCQTYREPLACEMENT", precision = 15, scale = 3)
	public BigDecimal getFocqtyreplacement() {
		return this.focqtyreplacement;
	}

	public void setFocqtyreplacement(BigDecimal focqtyreplacement) {
		this.focqtyreplacement = focqtyreplacement;
	}

	@Column(name = "FOCQTYNOREASON", precision = 15, scale = 3)
	public BigDecimal getFocqtynoreason() {
		return this.focqtynoreason;
	}

	public void setFocqtynoreason(BigDecimal focqtynoreason) {
		this.focqtynoreason = focqtynoreason;
	}

	@Column(name = "FOCQTYOTHERREASONS", precision = 15, scale = 3)
	public BigDecimal getFocqtyotherreasons() {
		return this.focqtyotherreasons;
	}

	public void setFocqtyotherreasons(BigDecimal focqtyotherreasons) {
		this.focqtyotherreasons = focqtyotherreasons;
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

	@Column(name = "RECORDPROCESSEDFLAG", nullable = false, length = 1)
	public String getRecordprocessedflag() {
		return this.recordprocessedflag;
	}

	public void setRecordprocessedflag(String recordprocessedflag) {
		this.recordprocessedflag = recordprocessedflag;
	}

	@Column(name = "RECORDPROCESSINGTIME", length = 19)
	public Date getRecordprocessingtime() {
		return this.recordprocessingtime;
	}

	public void setRecordprocessingtime(Date recordprocessingtime) {
		this.recordprocessingtime = recordprocessingtime;
	}

	@Column(name = "RECORDLASTCHANGETIME", length = 19)
	public Date getRecordlastchangetime() {
		return this.recordlastchangetime;
	}

	public void setRecordlastchangetime(Date recordlastchangetime) {
		this.recordlastchangetime = recordlastchangetime;
	}

	@Column(name = "RECORDCREATIONTIME", nullable = false, length = 19)
	public Date getRecordcreationtime() {
		return this.recordcreationtime;
	}

	public void setRecordcreationtime(Date recordcreationtime) {
		this.recordcreationtime = recordcreationtime;
	}

	public boolean equals(Object other) {
		if ((this == other)) return true;
		if ((other == null)) return false;
		if (!(other instanceof Az103aggId)) return false;
		Az103aggId castOther = (Az103aggId) other;

		return (this.getContrdefpk() == castOther.getContrdefpk())
		        && (this.getTdyear() == castOther.getTdyear())
		        && (this.getTdmonth() == castOther.getTdmonth())
		        && (this.getActualperiod() == castOther.getActualperiod())
		        && ((this.getItemnr() == castOther.getItemnr()) || (this.getItemnr() != null && castOther.getItemnr() != null && this.getItemnr().equals(castOther.getItemnr())))
		        && ((this.getItemnrcontractor() == castOther.getItemnrcontractor()) || (this.getItemnrcontractor() != null && castOther.getItemnrcontractor() != null && this
		                .getItemnrcontractor().equals(castOther.getItemnrcontractor())))
		        && ((this.getBizparaddrpkDelivery() == castOther.getBizparaddrpkDelivery()) || (this.getBizparaddrpkDelivery() != null
		                && castOther.getBizparaddrpkDelivery() != null && this.getBizparaddrpkDelivery().equals(castOther.getBizparaddrpkDelivery())))
		        && ((this.getBizparaddrpkInvoice() == castOther.getBizparaddrpkInvoice()) || (this.getBizparaddrpkInvoice() != null && castOther.getBizparaddrpkInvoice() != null && this
		                .getBizparaddrpkInvoice().equals(castOther.getBizparaddrpkInvoice())))
		        && ((this.getGrosssales() == castOther.getGrosssales()) || (this.getGrosssales() != null && castOther.getGrosssales() != null && this.getGrosssales().equals(
		                castOther.getGrosssales())))
		        && ((this.getNetsales() == castOther.getNetsales()) || (this.getNetsales() != null && castOther.getNetsales() != null && this.getNetsales().equals(
		                castOther.getNetsales())))
		        && ((this.getQtyinvoiced() == castOther.getQtyinvoiced()) || (this.getQtyinvoiced() != null && castOther.getQtyinvoiced() != null && this.getQtyinvoiced().equals(
		                castOther.getQtyinvoiced())))
		        && ((this.getFocqtysamples() == castOther.getFocqtysamples()) || (this.getFocqtysamples() != null && castOther.getFocqtysamples() != null && this
		                .getFocqtysamples().equals(castOther.getFocqtysamples())))
		        && ((this.getFocqtybonus() == castOther.getFocqtybonus()) || (this.getFocqtybonus() != null && castOther.getFocqtybonus() != null && this.getFocqtybonus().equals(
		                castOther.getFocqtybonus())))
		        && ((this.getFocqtyreplacement() == castOther.getFocqtyreplacement()) || (this.getFocqtyreplacement() != null && castOther.getFocqtyreplacement() != null && this
		                .getFocqtyreplacement().equals(castOther.getFocqtyreplacement())))
		        && ((this.getFocqtynoreason() == castOther.getFocqtynoreason()) || (this.getFocqtynoreason() != null && castOther.getFocqtynoreason() != null && this
		                .getFocqtynoreason().equals(castOther.getFocqtynoreason())))
		        && ((this.getFocqtyotherreasons() == castOther.getFocqtyotherreasons()) || (this.getFocqtyotherreasons() != null && castOther.getFocqtyotherreasons() != null && this
		                .getFocqtyotherreasons().equals(castOther.getFocqtyotherreasons())))
		        && ((this.getProcessingflag1() == castOther.getProcessingflag1()) || (this.getProcessingflag1() != null && castOther.getProcessingflag1() != null && this
		                .getProcessingflag1().equals(castOther.getProcessingflag1())))
		        && ((this.getProcessingflag2() == castOther.getProcessingflag2()) || (this.getProcessingflag2() != null && castOther.getProcessingflag2() != null && this
		                .getProcessingflag2().equals(castOther.getProcessingflag2())))
		        && ((this.getProcessingflag3() == castOther.getProcessingflag3()) || (this.getProcessingflag3() != null && castOther.getProcessingflag3() != null && this
		                .getProcessingflag3().equals(castOther.getProcessingflag3())))
		        && ((this.getProcessingflag4() == castOther.getProcessingflag4()) || (this.getProcessingflag4() != null && castOther.getProcessingflag4() != null && this
		                .getProcessingflag4().equals(castOther.getProcessingflag4())))
		        && ((this.getProcessingflag5() == castOther.getProcessingflag5()) || (this.getProcessingflag5() != null && castOther.getProcessingflag5() != null && this
		                .getProcessingflag5().equals(castOther.getProcessingflag5())))
		        && ((this.getProcessingflag6() == castOther.getProcessingflag6()) || (this.getProcessingflag6() != null && castOther.getProcessingflag6() != null && this
		                .getProcessingflag6().equals(castOther.getProcessingflag6())))
		        && ((this.getProcessingflag7() == castOther.getProcessingflag7()) || (this.getProcessingflag7() != null && castOther.getProcessingflag7() != null && this
		                .getProcessingflag7().equals(castOther.getProcessingflag7())))
		        && ((this.getProcessingflag8() == castOther.getProcessingflag8()) || (this.getProcessingflag8() != null && castOther.getProcessingflag8() != null && this
		                .getProcessingflag8().equals(castOther.getProcessingflag8())))
		        && ((this.getProcessingflag9() == castOther.getProcessingflag9()) || (this.getProcessingflag9() != null && castOther.getProcessingflag9() != null && this
		                .getProcessingflag9().equals(castOther.getProcessingflag9())))
		        && ((this.getProcessingflag10() == castOther.getProcessingflag10()) || (this.getProcessingflag10() != null && castOther.getProcessingflag10() != null && this
		                .getProcessingflag10().equals(castOther.getProcessingflag10())))
		        && ((this.getOutboundignore() == castOther.getOutboundignore()) || (this.getOutboundignore() != null && castOther.getOutboundignore() != null && this
		                .getOutboundignore().equals(castOther.getOutboundignore())))
		        && ((this.getRecordprocessedflag() == castOther.getRecordprocessedflag()) || (this.getRecordprocessedflag() != null && castOther.getRecordprocessedflag() != null && this
		                .getRecordprocessedflag().equals(castOther.getRecordprocessedflag())))
		        && ((this.getRecordprocessingtime() == castOther.getRecordprocessingtime()) || (this.getRecordprocessingtime() != null
		                && castOther.getRecordprocessingtime() != null && this.getRecordprocessingtime().equals(castOther.getRecordprocessingtime())))
		        && ((this.getRecordlastchangetime() == castOther.getRecordlastchangetime()) || (this.getRecordlastchangetime() != null
		                && castOther.getRecordlastchangetime() != null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime())))
		        && ((this.getRecordcreationtime() == castOther.getRecordcreationtime()) || (this.getRecordcreationtime() != null && castOther.getRecordcreationtime() != null && this
		                .getRecordcreationtime().equals(castOther.getRecordcreationtime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getContrdefpk();
		result = 37 * result + this.getTdyear();
		result = 37 * result + this.getTdmonth();
		result = 37 * result + this.getActualperiod();
		result = 37 * result + (getItemnr() == null ? 0 : this.getItemnr().hashCode());
		result = 37 * result + (getItemnrcontractor() == null ? 0 : this.getItemnrcontractor().hashCode());
		result = 37 * result + (getBizparaddrpkDelivery() == null ? 0 : this.getBizparaddrpkDelivery().hashCode());
		result = 37 * result + (getBizparaddrpkInvoice() == null ? 0 : this.getBizparaddrpkInvoice().hashCode());
		result = 37 * result + (getGrosssales() == null ? 0 : this.getGrosssales().hashCode());
		result = 37 * result + (getNetsales() == null ? 0 : this.getNetsales().hashCode());
		result = 37 * result + (getQtyinvoiced() == null ? 0 : this.getQtyinvoiced().hashCode());
		result = 37 * result + (getFocqtysamples() == null ? 0 : this.getFocqtysamples().hashCode());
		result = 37 * result + (getFocqtybonus() == null ? 0 : this.getFocqtybonus().hashCode());
		result = 37 * result + (getFocqtyreplacement() == null ? 0 : this.getFocqtyreplacement().hashCode());
		result = 37 * result + (getFocqtynoreason() == null ? 0 : this.getFocqtynoreason().hashCode());
		result = 37 * result + (getFocqtyotherreasons() == null ? 0 : this.getFocqtyotherreasons().hashCode());
		result = 37 * result + (getProcessingflag1() == null ? 0 : this.getProcessingflag1().hashCode());
		result = 37 * result + (getProcessingflag2() == null ? 0 : this.getProcessingflag2().hashCode());
		result = 37 * result + (getProcessingflag3() == null ? 0 : this.getProcessingflag3().hashCode());
		result = 37 * result + (getProcessingflag4() == null ? 0 : this.getProcessingflag4().hashCode());
		result = 37 * result + (getProcessingflag5() == null ? 0 : this.getProcessingflag5().hashCode());
		result = 37 * result + (getProcessingflag6() == null ? 0 : this.getProcessingflag6().hashCode());
		result = 37 * result + (getProcessingflag7() == null ? 0 : this.getProcessingflag7().hashCode());
		result = 37 * result + (getProcessingflag8() == null ? 0 : this.getProcessingflag8().hashCode());
		result = 37 * result + (getProcessingflag9() == null ? 0 : this.getProcessingflag9().hashCode());
		result = 37 * result + (getProcessingflag10() == null ? 0 : this.getProcessingflag10().hashCode());
		result = 37 * result + (getOutboundignore() == null ? 0 : this.getOutboundignore().hashCode());
		result = 37 * result + (getRecordprocessedflag() == null ? 0 : this.getRecordprocessedflag().hashCode());
		result = 37 * result + (getRecordprocessingtime() == null ? 0 : this.getRecordprocessingtime().hashCode());
		result = 37 * result + (getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode());
		result = 37 * result + (getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode());
		return result;
	}

}
