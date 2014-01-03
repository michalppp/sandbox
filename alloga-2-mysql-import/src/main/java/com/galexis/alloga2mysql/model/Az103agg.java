package com.galexis.alloga2mysql.model;

// Generated Mar 4, 2013 4:41:13 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Az103agg generated by hbm2java
 */
@Entity
@Table(name = "AZ_103AGG")
public class Az103agg implements java.io.Serializable {

	private Az103aggId id;

	public Az103agg() {
	}

	public Az103agg(Az103aggId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "contrdefpk", column = @Column(name = "CONTRDEFPK", nullable = false, precision = 12, scale = 0)),
	        @AttributeOverride(name = "tdyear", column = @Column(name = "TDYEAR", nullable = false, precision = 4, scale = 0)),
	        @AttributeOverride(name = "tdmonth", column = @Column(name = "TDMONTH", nullable = false, precision = 2, scale = 0)),
	        @AttributeOverride(name = "actualperiod", column = @Column(name = "ACTUALPERIOD", nullable = false, precision = 6, scale = 0)),
	        @AttributeOverride(name = "itemnr", column = @Column(name = "ITEMNR", nullable = false, length = 35)),
	        @AttributeOverride(name = "itemnrcontractor", column = @Column(name = "ITEMNRCONTRACTOR", length = 35)),
	        @AttributeOverride(name = "bizparaddrpkDelivery", column = @Column(name = "BIZPARADDRPK_DELIVERY", precision = 12, scale = 0)),
	        @AttributeOverride(name = "bizparaddrpkInvoice", column = @Column(name = "BIZPARADDRPK_INVOICE", precision = 12, scale = 0)),
	        @AttributeOverride(name = "grosssales", column = @Column(name = "GROSSSALES", precision = 17, scale = 4)),
	        @AttributeOverride(name = "netsales", column = @Column(name = "NETSALES", precision = 17, scale = 4)),
	        @AttributeOverride(name = "qtyinvoiced", column = @Column(name = "QTYINVOICED", precision = 15, scale = 3)),
	        @AttributeOverride(name = "focqtysamples", column = @Column(name = "FOCQTYSAMPLES", precision = 15, scale = 3)),
	        @AttributeOverride(name = "focqtybonus", column = @Column(name = "FOCQTYBONUS", precision = 15, scale = 3)),
	        @AttributeOverride(name = "focqtyreplacement", column = @Column(name = "FOCQTYREPLACEMENT", precision = 15, scale = 3)),
	        @AttributeOverride(name = "focqtynoreason", column = @Column(name = "FOCQTYNOREASON", precision = 15, scale = 3)),
	        @AttributeOverride(name = "focqtyotherreasons", column = @Column(name = "FOCQTYOTHERREASONS", precision = 15, scale = 3)),
	        @AttributeOverride(name = "processingflag1", column = @Column(name = "PROCESSINGFLAG1", length = 1)),
	        @AttributeOverride(name = "processingflag2", column = @Column(name = "PROCESSINGFLAG2", length = 1)),
	        @AttributeOverride(name = "processingflag3", column = @Column(name = "PROCESSINGFLAG3", length = 1)),
	        @AttributeOverride(name = "processingflag4", column = @Column(name = "PROCESSINGFLAG4", length = 1)),
	        @AttributeOverride(name = "processingflag5", column = @Column(name = "PROCESSINGFLAG5", length = 1)),
	        @AttributeOverride(name = "processingflag6", column = @Column(name = "PROCESSINGFLAG6", length = 1)),
	        @AttributeOverride(name = "processingflag7", column = @Column(name = "PROCESSINGFLAG7", length = 1)),
	        @AttributeOverride(name = "processingflag8", column = @Column(name = "PROCESSINGFLAG8", length = 1)),
	        @AttributeOverride(name = "processingflag9", column = @Column(name = "PROCESSINGFLAG9", length = 1)),
	        @AttributeOverride(name = "processingflag10", column = @Column(name = "PROCESSINGFLAG10", length = 1)),
	        @AttributeOverride(name = "outboundignore", column = @Column(name = "OUTBOUNDIGNORE", nullable = false, length = 1)),
	        @AttributeOverride(name = "recordprocessedflag", column = @Column(name = "RECORDPROCESSEDFLAG", nullable = false, length = 1)),
	        @AttributeOverride(name = "recordprocessingtime", column = @Column(name = "RECORDPROCESSINGTIME", length = 19)),
	        @AttributeOverride(name = "recordlastchangetime", column = @Column(name = "RECORDLASTCHANGETIME", length = 19)),
	        @AttributeOverride(name = "recordcreationtime", column = @Column(name = "RECORDCREATIONTIME", nullable = false, length = 19)) })
	public Az103aggId getId() {
		return this.id;
	}

	public void setId(Az103aggId id) {
		this.id = id;
	}

}