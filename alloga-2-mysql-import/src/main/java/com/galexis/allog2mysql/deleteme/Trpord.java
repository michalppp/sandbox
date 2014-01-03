package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Trpord generated by hbm2java
 */
@Entity
@Table(name="TRPORD"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Trpord  implements java.io.Serializable {


     private long pk;
     private String transportordernumber;
     private Long picklistnr;
     private long packlist;
     private BigDecimal weight;
     private long bundle;
     private long bundlecount;
     private long carrierContrdefpk;
     private String addressline1;
     private String addressline2;
     private String street;
     private String mailbox;
     private long zip;
     private String town;
     private Long trpordinfopk;
     private String gasidentification;
     private Long scanbundle;
     private String itemcategory;
     private String recipientsgln;
     private String sendersgln;
     private String packingidentification;
     private String shippingmodule;
     private String plannedmot1;
     private String plannedmot2;
     private String plannedmot3;
     private String plannedmot4;
     private String plannedmot5;
     private String actualmot1;
     private String actualmot2;
     private String actualmot3;
     private String actualmot4;
     private String actualmot5;
     private Integer timedatepk;
     private Integer ipTimedatepkReporting;
     private String transactionidInbound;
     private String transactionidOutboundPartner;
     private String transactionidOutboundCarrier;
     private String recordprocessedflagOutboundPartner;
     private String recordprocessedflagOutboundCarrier;
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
     private Date recordcreationtime;

    public Trpord() {
    }

	
    public Trpord(long pk, String transportordernumber, long packlist, BigDecimal weight, long bundle, long bundlecount, long carrierContrdefpk, String addressline1, String addressline2, String street, long zip, String town, Date recordcreationtime) {
        this.pk = pk;
        this.transportordernumber = transportordernumber;
        this.packlist = packlist;
        this.weight = weight;
        this.bundle = bundle;
        this.bundlecount = bundlecount;
        this.carrierContrdefpk = carrierContrdefpk;
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
        this.street = street;
        this.zip = zip;
        this.town = town;
        this.recordcreationtime = recordcreationtime;
    }
    public Trpord(long pk, String transportordernumber, Long picklistnr, long packlist, BigDecimal weight, long bundle, long bundlecount, long carrierContrdefpk, String addressline1, String addressline2, String street, String mailbox, long zip, String town, Long trpordinfopk, String gasidentification, Long scanbundle, String itemcategory, String recipientsgln, String sendersgln, String packingidentification, String shippingmodule, String plannedmot1, String plannedmot2, String plannedmot3, String plannedmot4, String plannedmot5, String actualmot1, String actualmot2, String actualmot3, String actualmot4, String actualmot5, Integer timedatepk, Integer ipTimedatepkReporting, String transactionidInbound, String transactionidOutboundPartner, String transactionidOutboundCarrier, String recordprocessedflagOutboundPartner, String recordprocessedflagOutboundCarrier, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, Date recordcreationtime) {
       this.pk = pk;
       this.transportordernumber = transportordernumber;
       this.picklistnr = picklistnr;
       this.packlist = packlist;
       this.weight = weight;
       this.bundle = bundle;
       this.bundlecount = bundlecount;
       this.carrierContrdefpk = carrierContrdefpk;
       this.addressline1 = addressline1;
       this.addressline2 = addressline2;
       this.street = street;
       this.mailbox = mailbox;
       this.zip = zip;
       this.town = town;
       this.trpordinfopk = trpordinfopk;
       this.gasidentification = gasidentification;
       this.scanbundle = scanbundle;
       this.itemcategory = itemcategory;
       this.recipientsgln = recipientsgln;
       this.sendersgln = sendersgln;
       this.packingidentification = packingidentification;
       this.shippingmodule = shippingmodule;
       this.plannedmot1 = plannedmot1;
       this.plannedmot2 = plannedmot2;
       this.plannedmot3 = plannedmot3;
       this.plannedmot4 = plannedmot4;
       this.plannedmot5 = plannedmot5;
       this.actualmot1 = actualmot1;
       this.actualmot2 = actualmot2;
       this.actualmot3 = actualmot3;
       this.actualmot4 = actualmot4;
       this.actualmot5 = actualmot5;
       this.timedatepk = timedatepk;
       this.ipTimedatepkReporting = ipTimedatepkReporting;
       this.transactionidInbound = transactionidInbound;
       this.transactionidOutboundPartner = transactionidOutboundPartner;
       this.transactionidOutboundCarrier = transactionidOutboundCarrier;
       this.recordprocessedflagOutboundPartner = recordprocessedflagOutboundPartner;
       this.recordprocessedflagOutboundCarrier = recordprocessedflagOutboundCarrier;
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

    
    @Column(name="TRANSPORTORDERNUMBER", nullable=false, length=40)
    public String getTransportordernumber() {
        return this.transportordernumber;
    }
    
    public void setTransportordernumber(String transportordernumber) {
        this.transportordernumber = transportordernumber;
    }

    
    @Column(name="PICKLISTNR", precision=12, scale=0)
    public Long getPicklistnr() {
        return this.picklistnr;
    }
    
    public void setPicklistnr(Long picklistnr) {
        this.picklistnr = picklistnr;
    }

    
    @Column(name="PACKLIST", nullable=false, precision=11, scale=0)
    public long getPacklist() {
        return this.packlist;
    }
    
    public void setPacklist(long packlist) {
        this.packlist = packlist;
    }

    
    @Column(name="WEIGHT", nullable=false, precision=11, scale=5)
    public BigDecimal getWeight() {
        return this.weight;
    }
    
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    
    @Column(name="BUNDLE", nullable=false, precision=12, scale=0)
    public long getBundle() {
        return this.bundle;
    }
    
    public void setBundle(long bundle) {
        this.bundle = bundle;
    }

    
    @Column(name="BUNDLECOUNT", nullable=false, precision=12, scale=0)
    public long getBundlecount() {
        return this.bundlecount;
    }
    
    public void setBundlecount(long bundlecount) {
        this.bundlecount = bundlecount;
    }

    
    @Column(name="CARRIER_CONTRDEFPK", nullable=false, precision=12, scale=0)
    public long getCarrierContrdefpk() {
        return this.carrierContrdefpk;
    }
    
    public void setCarrierContrdefpk(long carrierContrdefpk) {
        this.carrierContrdefpk = carrierContrdefpk;
    }

    
    @Column(name="ADDRESSLINE1", nullable=false, length=50)
    public String getAddressline1() {
        return this.addressline1;
    }
    
    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    
    @Column(name="ADDRESSLINE2", nullable=false, length=50)
    public String getAddressline2() {
        return this.addressline2;
    }
    
    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }

    
    @Column(name="STREET", nullable=false, length=50)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="MAILBOX", length=50)
    public String getMailbox() {
        return this.mailbox;
    }
    
    public void setMailbox(String mailbox) {
        this.mailbox = mailbox;
    }

    
    @Column(name="ZIP", nullable=false, precision=16, scale=0)
    public long getZip() {
        return this.zip;
    }
    
    public void setZip(long zip) {
        this.zip = zip;
    }

    
    @Column(name="TOWN", nullable=false, length=35)
    public String getTown() {
        return this.town;
    }
    
    public void setTown(String town) {
        this.town = town;
    }

    
    @Column(name="TRPORDINFOPK", precision=12, scale=0)
    public Long getTrpordinfopk() {
        return this.trpordinfopk;
    }
    
    public void setTrpordinfopk(Long trpordinfopk) {
        this.trpordinfopk = trpordinfopk;
    }

    
    @Column(name="GASIDENTIFICATION", length=40)
    public String getGasidentification() {
        return this.gasidentification;
    }
    
    public void setGasidentification(String gasidentification) {
        this.gasidentification = gasidentification;
    }

    
    @Column(name="SCANBUNDLE", precision=12, scale=0)
    public Long getScanbundle() {
        return this.scanbundle;
    }
    
    public void setScanbundle(Long scanbundle) {
        this.scanbundle = scanbundle;
    }

    
    @Column(name="ITEMCATEGORY", length=5)
    public String getItemcategory() {
        return this.itemcategory;
    }
    
    public void setItemcategory(String itemcategory) {
        this.itemcategory = itemcategory;
    }

    
    @Column(name="RECIPIENTSGLN", length=40)
    public String getRecipientsgln() {
        return this.recipientsgln;
    }
    
    public void setRecipientsgln(String recipientsgln) {
        this.recipientsgln = recipientsgln;
    }

    
    @Column(name="SENDERSGLN", length=40)
    public String getSendersgln() {
        return this.sendersgln;
    }
    
    public void setSendersgln(String sendersgln) {
        this.sendersgln = sendersgln;
    }

    
    @Column(name="PACKINGIDENTIFICATION", length=40)
    public String getPackingidentification() {
        return this.packingidentification;
    }
    
    public void setPackingidentification(String packingidentification) {
        this.packingidentification = packingidentification;
    }

    
    @Column(name="SHIPPINGMODULE", length=40)
    public String getShippingmodule() {
        return this.shippingmodule;
    }
    
    public void setShippingmodule(String shippingmodule) {
        this.shippingmodule = shippingmodule;
    }

    
    @Column(name="PLANNEDMOT1", length=4)
    public String getPlannedmot1() {
        return this.plannedmot1;
    }
    
    public void setPlannedmot1(String plannedmot1) {
        this.plannedmot1 = plannedmot1;
    }

    
    @Column(name="PLANNEDMOT2", length=4)
    public String getPlannedmot2() {
        return this.plannedmot2;
    }
    
    public void setPlannedmot2(String plannedmot2) {
        this.plannedmot2 = plannedmot2;
    }

    
    @Column(name="PLANNEDMOT3", length=4)
    public String getPlannedmot3() {
        return this.plannedmot3;
    }
    
    public void setPlannedmot3(String plannedmot3) {
        this.plannedmot3 = plannedmot3;
    }

    
    @Column(name="PLANNEDMOT4", length=4)
    public String getPlannedmot4() {
        return this.plannedmot4;
    }
    
    public void setPlannedmot4(String plannedmot4) {
        this.plannedmot4 = plannedmot4;
    }

    
    @Column(name="PLANNEDMOT5", length=4)
    public String getPlannedmot5() {
        return this.plannedmot5;
    }
    
    public void setPlannedmot5(String plannedmot5) {
        this.plannedmot5 = plannedmot5;
    }

    
    @Column(name="ACTUALMOT1", length=4)
    public String getActualmot1() {
        return this.actualmot1;
    }
    
    public void setActualmot1(String actualmot1) {
        this.actualmot1 = actualmot1;
    }

    
    @Column(name="ACTUALMOT2", length=4)
    public String getActualmot2() {
        return this.actualmot2;
    }
    
    public void setActualmot2(String actualmot2) {
        this.actualmot2 = actualmot2;
    }

    
    @Column(name="ACTUALMOT3", length=4)
    public String getActualmot3() {
        return this.actualmot3;
    }
    
    public void setActualmot3(String actualmot3) {
        this.actualmot3 = actualmot3;
    }

    
    @Column(name="ACTUALMOT4", length=4)
    public String getActualmot4() {
        return this.actualmot4;
    }
    
    public void setActualmot4(String actualmot4) {
        this.actualmot4 = actualmot4;
    }

    
    @Column(name="ACTUALMOT5", length=4)
    public String getActualmot5() {
        return this.actualmot5;
    }
    
    public void setActualmot5(String actualmot5) {
        this.actualmot5 = actualmot5;
    }

    
    @Column(name="TIMEDATEPK", precision=8, scale=0)
    public Integer getTimedatepk() {
        return this.timedatepk;
    }
    
    public void setTimedatepk(Integer timedatepk) {
        this.timedatepk = timedatepk;
    }

    
    @Column(name="IP_TIMEDATEPK_REPORTING", precision=8, scale=0)
    public Integer getIpTimedatepkReporting() {
        return this.ipTimedatepkReporting;
    }
    
    public void setIpTimedatepkReporting(Integer ipTimedatepkReporting) {
        this.ipTimedatepkReporting = ipTimedatepkReporting;
    }

    
    @Column(name="TRANSACTIONID_INBOUND", length=50)
    public String getTransactionidInbound() {
        return this.transactionidInbound;
    }
    
    public void setTransactionidInbound(String transactionidInbound) {
        this.transactionidInbound = transactionidInbound;
    }

    
    @Column(name="TRANSACTIONID_OUTBOUND_PARTNER", length=50)
    public String getTransactionidOutboundPartner() {
        return this.transactionidOutboundPartner;
    }
    
    public void setTransactionidOutboundPartner(String transactionidOutboundPartner) {
        this.transactionidOutboundPartner = transactionidOutboundPartner;
    }

    
    @Column(name="TRANSACTIONID_OUTBOUND_CARRIER", length=50)
    public String getTransactionidOutboundCarrier() {
        return this.transactionidOutboundCarrier;
    }
    
    public void setTransactionidOutboundCarrier(String transactionidOutboundCarrier) {
        this.transactionidOutboundCarrier = transactionidOutboundCarrier;
    }

    
    @Column(name="RECORDPROCESSEDFLAG_OUTBOUND_PARTNER", length=1)
    public String getRecordprocessedflagOutboundPartner() {
        return this.recordprocessedflagOutboundPartner;
    }
    
    public void setRecordprocessedflagOutboundPartner(String recordprocessedflagOutboundPartner) {
        this.recordprocessedflagOutboundPartner = recordprocessedflagOutboundPartner;
    }

    
    @Column(name="RECORDPROCESSEDFLAG_OUTBOUND_CARRIER", length=1)
    public String getRecordprocessedflagOutboundCarrier() {
        return this.recordprocessedflagOutboundCarrier;
    }
    
    public void setRecordprocessedflagOutboundCarrier(String recordprocessedflagOutboundCarrier) {
        this.recordprocessedflagOutboundCarrier = recordprocessedflagOutboundCarrier;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }




}


