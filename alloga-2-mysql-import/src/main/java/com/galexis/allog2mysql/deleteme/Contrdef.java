package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Contrdef generated by hbm2java
 */
@Entity
@Table(name="CONTRDEF"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = {@UniqueConstraint(columnNames="CONTRACTORINTEGRATIONPLATFORM"), @UniqueConstraint(columnNames="CONTRACTOR")} 
)
public class Contrdef  implements java.io.Serializable {


     private long pk;
     private Bizpmaster bizpmaster;
     private String contractor;
     private String contractorintegrationplatform;
     private String description;
     private String supplier;
     private String holdordertextkeyflag;
     private String holdorderbatchallocationflag;
     private String reportorderzerolineflag;
     private String confirmentiredeliveryflag;
     private String expectedreceiptsusingflag;
     private String confirmentirepurchaseordflag;
     private String salesorganisationsplitflag;
     private String isactiveflag;
     private Character isinternalpartner;
     private Character i2EShopActiv;
     private String dayendHandlingType;
     private Character isFullService;
     private Character useDeliveryAddr;
     private Character useInvoiceAddr;
     private Character holdInvoice;
     private Character useCustomerNbr;
     private Character useLineNbr;
     private Character useOrdernbrForOrdertype;
     private Character useDeliverySchedule;
     private Character sndDeliveryWithoutPicklist;
     private Character outboundOnlyWhenInbound;
     private Character extendelocationzoneevaluation;
     private Character ordertypeAccordingLinecat;
     private String language;
     private String customernr;
     private String reportingEmailAddress;
     private Date recordcreationtime;
     private Date recordlastchangetime;
     private String userlastchange;
     private Set<Triggerdef> triggerdefs = new HashSet<Triggerdef>(0);
     private Set<Invhdr> invhdrs = new HashSet<Invhdr>(0);
     private Set<Stockrcbtc> stockrcbtcs = new HashSet<Stockrcbtc>(0);
     private Set<Delannhdr> delannhdrs = new HashSet<Delannhdr>(0);
     private Set<Itembtcm> itembtcms = new HashSet<Itembtcm>(0);
     private Set<Invmovcon> invmovcons = new HashSet<Invmovcon>(0);
     private Set<Rethdr> rethdrs = new HashSet<Rethdr>(0);
     private Set<Dayendext> dayendexts = new HashSet<Dayendext>(0);
     private Set<AsxExchg> asxExchgs = new HashSet<AsxExchg>(0);
     private Set<Triggerexc> triggerexcs = new HashSet<Triggerexc>(0);
     private Set<Delhdr> delhdrs = new HashSet<Delhdr>(0);
     private Set<Ctrbizpcls> ctrbizpclses = new HashSet<Ctrbizpcls>(0);
     private Set<Invmovmnt> invmovmnts = new HashSet<Invmovmnt>(0);
     private Set<Stockrcmap> stockrcmaps = new HashSet<Stockrcmap>(0);
     private Set<Grehdr> grehdrs = new HashSet<Grehdr>(0);
     private Set<Dayend> dayends = new HashSet<Dayend>(0);
     private Set<Consordhdr> consordhdrs = new HashSet<Consordhdr>(0);
     private Set<Phaselog> phaselogs = new HashSet<Phaselog>(0);
     private Set<Custopohdr> custopohdrs = new HashSet<Custopohdr>(0);
     private Set<Custordhdr> custordhdrs = new HashSet<Custordhdr>(0);
     private Set<Bizpconaut> bizpconauts = new HashSet<Bizpconaut>(0);
     private Set<Psihdr> psihdrs = new HashSet<Psihdr>(0);
     private Set<Contrpgrp> contrpgrps = new HashSet<Contrpgrp>(0);
     private Set<Stockrclop> stockrclops = new HashSet<Stockrclop>(0);
     private Set<Jobdef> jobdefs = new HashSet<Jobdef>(0);
     private Set<Stockrebtc> stockrebtcs = new HashSet<Stockrebtc>(0);

    public Contrdef() {
    }

	
    public Contrdef(long pk, String contractor, String holdordertextkeyflag, String holdorderbatchallocationflag, String reportorderzerolineflag, String confirmentiredeliveryflag, String expectedreceiptsusingflag, String confirmentirepurchaseordflag, String salesorganisationsplitflag, String isactiveflag, Date recordcreationtime) {
        this.pk = pk;
        this.contractor = contractor;
        this.holdordertextkeyflag = holdordertextkeyflag;
        this.holdorderbatchallocationflag = holdorderbatchallocationflag;
        this.reportorderzerolineflag = reportorderzerolineflag;
        this.confirmentiredeliveryflag = confirmentiredeliveryflag;
        this.expectedreceiptsusingflag = expectedreceiptsusingflag;
        this.confirmentirepurchaseordflag = confirmentirepurchaseordflag;
        this.salesorganisationsplitflag = salesorganisationsplitflag;
        this.isactiveflag = isactiveflag;
        this.recordcreationtime = recordcreationtime;
    }
    public Contrdef(long pk, Bizpmaster bizpmaster, String contractor, String contractorintegrationplatform, String description, String supplier, String holdordertextkeyflag, String holdorderbatchallocationflag, String reportorderzerolineflag, String confirmentiredeliveryflag, String expectedreceiptsusingflag, String confirmentirepurchaseordflag, String salesorganisationsplitflag, String isactiveflag, Character isinternalpartner, Character i2EShopActiv, String dayendHandlingType, Character isFullService, Character useDeliveryAddr, Character useInvoiceAddr, Character holdInvoice, Character useCustomerNbr, Character useLineNbr, Character useOrdernbrForOrdertype, Character useDeliverySchedule, Character sndDeliveryWithoutPicklist, Character outboundOnlyWhenInbound, Character extendelocationzoneevaluation, Character ordertypeAccordingLinecat, String language, String customernr, String reportingEmailAddress, Date recordcreationtime, Date recordlastchangetime, String userlastchange, Set<Triggerdef> triggerdefs, Set<Invhdr> invhdrs, Set<Stockrcbtc> stockrcbtcs, Set<Delannhdr> delannhdrs, Set<Itembtcm> itembtcms, Set<Invmovcon> invmovcons, Set<Rethdr> rethdrs, Set<Dayendext> dayendexts, Set<AsxExchg> asxExchgs, Set<Triggerexc> triggerexcs, Set<Delhdr> delhdrs, Set<Ctrbizpcls> ctrbizpclses, Set<Invmovmnt> invmovmnts, Set<Stockrcmap> stockrcmaps, Set<Grehdr> grehdrs, Set<Dayend> dayends, Set<Consordhdr> consordhdrs, Set<Phaselog> phaselogs, Set<Custopohdr> custopohdrs, Set<Custordhdr> custordhdrs, Set<Bizpconaut> bizpconauts, Set<Psihdr> psihdrs, Set<Contrpgrp> contrpgrps, Set<Stockrclop> stockrclops, Set<Jobdef> jobdefs, Set<Stockrebtc> stockrebtcs) {
       this.pk = pk;
       this.bizpmaster = bizpmaster;
       this.contractor = contractor;
       this.contractorintegrationplatform = contractorintegrationplatform;
       this.description = description;
       this.supplier = supplier;
       this.holdordertextkeyflag = holdordertextkeyflag;
       this.holdorderbatchallocationflag = holdorderbatchallocationflag;
       this.reportorderzerolineflag = reportorderzerolineflag;
       this.confirmentiredeliveryflag = confirmentiredeliveryflag;
       this.expectedreceiptsusingflag = expectedreceiptsusingflag;
       this.confirmentirepurchaseordflag = confirmentirepurchaseordflag;
       this.salesorganisationsplitflag = salesorganisationsplitflag;
       this.isactiveflag = isactiveflag;
       this.isinternalpartner = isinternalpartner;
       this.i2EShopActiv = i2EShopActiv;
       this.dayendHandlingType = dayendHandlingType;
       this.isFullService = isFullService;
       this.useDeliveryAddr = useDeliveryAddr;
       this.useInvoiceAddr = useInvoiceAddr;
       this.holdInvoice = holdInvoice;
       this.useCustomerNbr = useCustomerNbr;
       this.useLineNbr = useLineNbr;
       this.useOrdernbrForOrdertype = useOrdernbrForOrdertype;
       this.useDeliverySchedule = useDeliverySchedule;
       this.sndDeliveryWithoutPicklist = sndDeliveryWithoutPicklist;
       this.outboundOnlyWhenInbound = outboundOnlyWhenInbound;
       this.extendelocationzoneevaluation = extendelocationzoneevaluation;
       this.ordertypeAccordingLinecat = ordertypeAccordingLinecat;
       this.language = language;
       this.customernr = customernr;
       this.reportingEmailAddress = reportingEmailAddress;
       this.recordcreationtime = recordcreationtime;
       this.recordlastchangetime = recordlastchangetime;
       this.userlastchange = userlastchange;
       this.triggerdefs = triggerdefs;
       this.invhdrs = invhdrs;
       this.stockrcbtcs = stockrcbtcs;
       this.delannhdrs = delannhdrs;
       this.itembtcms = itembtcms;
       this.invmovcons = invmovcons;
       this.rethdrs = rethdrs;
       this.dayendexts = dayendexts;
       this.asxExchgs = asxExchgs;
       this.triggerexcs = triggerexcs;
       this.delhdrs = delhdrs;
       this.ctrbizpclses = ctrbizpclses;
       this.invmovmnts = invmovmnts;
       this.stockrcmaps = stockrcmaps;
       this.grehdrs = grehdrs;
       this.dayends = dayends;
       this.consordhdrs = consordhdrs;
       this.phaselogs = phaselogs;
       this.custopohdrs = custopohdrs;
       this.custordhdrs = custordhdrs;
       this.bizpconauts = bizpconauts;
       this.psihdrs = psihdrs;
       this.contrpgrps = contrpgrps;
       this.stockrclops = stockrclops;
       this.jobdefs = jobdefs;
       this.stockrebtcs = stockrebtcs;
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
    @JoinColumn(name="BIZPMASTERPK")
    public Bizpmaster getBizpmaster() {
        return this.bizpmaster;
    }
    
    public void setBizpmaster(Bizpmaster bizpmaster) {
        this.bizpmaster = bizpmaster;
    }

    
    @Column(name="CONTRACTOR", unique=true, nullable=false, length=10)
    public String getContractor() {
        return this.contractor;
    }
    
    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    
    @Column(name="CONTRACTORINTEGRATIONPLATFORM", unique=true, length=50)
    public String getContractorintegrationplatform() {
        return this.contractorintegrationplatform;
    }
    
    public void setContractorintegrationplatform(String contractorintegrationplatform) {
        this.contractorintegrationplatform = contractorintegrationplatform;
    }

    
    @Column(name="DESCRIPTION", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="SUPPLIER", length=20)
    public String getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    
    @Column(name="HOLDORDERTEXTKEYFLAG", nullable=false, length=1)
    public String getHoldordertextkeyflag() {
        return this.holdordertextkeyflag;
    }
    
    public void setHoldordertextkeyflag(String holdordertextkeyflag) {
        this.holdordertextkeyflag = holdordertextkeyflag;
    }

    
    @Column(name="HOLDORDERBATCHALLOCATIONFLAG", nullable=false, length=1)
    public String getHoldorderbatchallocationflag() {
        return this.holdorderbatchallocationflag;
    }
    
    public void setHoldorderbatchallocationflag(String holdorderbatchallocationflag) {
        this.holdorderbatchallocationflag = holdorderbatchallocationflag;
    }

    
    @Column(name="REPORTORDERZEROLINEFLAG", nullable=false, length=1)
    public String getReportorderzerolineflag() {
        return this.reportorderzerolineflag;
    }
    
    public void setReportorderzerolineflag(String reportorderzerolineflag) {
        this.reportorderzerolineflag = reportorderzerolineflag;
    }

    
    @Column(name="CONFIRMENTIREDELIVERYFLAG", nullable=false, length=1)
    public String getConfirmentiredeliveryflag() {
        return this.confirmentiredeliveryflag;
    }
    
    public void setConfirmentiredeliveryflag(String confirmentiredeliveryflag) {
        this.confirmentiredeliveryflag = confirmentiredeliveryflag;
    }

    
    @Column(name="EXPECTEDRECEIPTSUSINGFLAG", nullable=false, length=1)
    public String getExpectedreceiptsusingflag() {
        return this.expectedreceiptsusingflag;
    }
    
    public void setExpectedreceiptsusingflag(String expectedreceiptsusingflag) {
        this.expectedreceiptsusingflag = expectedreceiptsusingflag;
    }

    
    @Column(name="CONFIRMENTIREPURCHASEORDFLAG", nullable=false, length=1)
    public String getConfirmentirepurchaseordflag() {
        return this.confirmentirepurchaseordflag;
    }
    
    public void setConfirmentirepurchaseordflag(String confirmentirepurchaseordflag) {
        this.confirmentirepurchaseordflag = confirmentirepurchaseordflag;
    }

    
    @Column(name="SALESORGANISATIONSPLITFLAG", nullable=false, length=1)
    public String getSalesorganisationsplitflag() {
        return this.salesorganisationsplitflag;
    }
    
    public void setSalesorganisationsplitflag(String salesorganisationsplitflag) {
        this.salesorganisationsplitflag = salesorganisationsplitflag;
    }

    
    @Column(name="ISACTIVEFLAG", nullable=false, length=1)
    public String getIsactiveflag() {
        return this.isactiveflag;
    }
    
    public void setIsactiveflag(String isactiveflag) {
        this.isactiveflag = isactiveflag;
    }

    
    @Column(name="ISINTERNALPARTNER", length=1)
    public Character getIsinternalpartner() {
        return this.isinternalpartner;
    }
    
    public void setIsinternalpartner(Character isinternalpartner) {
        this.isinternalpartner = isinternalpartner;
    }

    
    @Column(name="I2_E_SHOP_ACTIV", length=1)
    public Character getI2EShopActiv() {
        return this.i2EShopActiv;
    }
    
    public void setI2EShopActiv(Character i2EShopActiv) {
        this.i2EShopActiv = i2EShopActiv;
    }

    
    @Column(name="DAYEND_HANDLING_TYPE", length=20)
    public String getDayendHandlingType() {
        return this.dayendHandlingType;
    }
    
    public void setDayendHandlingType(String dayendHandlingType) {
        this.dayendHandlingType = dayendHandlingType;
    }

    
    @Column(name="IS_FULL_SERVICE", length=1)
    public Character getIsFullService() {
        return this.isFullService;
    }
    
    public void setIsFullService(Character isFullService) {
        this.isFullService = isFullService;
    }

    
    @Column(name="USE_DELIVERY_ADDR", length=1)
    public Character getUseDeliveryAddr() {
        return this.useDeliveryAddr;
    }
    
    public void setUseDeliveryAddr(Character useDeliveryAddr) {
        this.useDeliveryAddr = useDeliveryAddr;
    }

    
    @Column(name="USE_INVOICE_ADDR", length=1)
    public Character getUseInvoiceAddr() {
        return this.useInvoiceAddr;
    }
    
    public void setUseInvoiceAddr(Character useInvoiceAddr) {
        this.useInvoiceAddr = useInvoiceAddr;
    }

    
    @Column(name="HOLD_INVOICE", length=1)
    public Character getHoldInvoice() {
        return this.holdInvoice;
    }
    
    public void setHoldInvoice(Character holdInvoice) {
        this.holdInvoice = holdInvoice;
    }

    
    @Column(name="USE_CUSTOMER_NBR", length=1)
    public Character getUseCustomerNbr() {
        return this.useCustomerNbr;
    }
    
    public void setUseCustomerNbr(Character useCustomerNbr) {
        this.useCustomerNbr = useCustomerNbr;
    }

    
    @Column(name="USE_LINE_NBR", length=1)
    public Character getUseLineNbr() {
        return this.useLineNbr;
    }
    
    public void setUseLineNbr(Character useLineNbr) {
        this.useLineNbr = useLineNbr;
    }

    
    @Column(name="USE_ORDERNBR_FOR_ORDERTYPE", length=1)
    public Character getUseOrdernbrForOrdertype() {
        return this.useOrdernbrForOrdertype;
    }
    
    public void setUseOrdernbrForOrdertype(Character useOrdernbrForOrdertype) {
        this.useOrdernbrForOrdertype = useOrdernbrForOrdertype;
    }

    
    @Column(name="USE_DELIVERY_SCHEDULE", length=1)
    public Character getUseDeliverySchedule() {
        return this.useDeliverySchedule;
    }
    
    public void setUseDeliverySchedule(Character useDeliverySchedule) {
        this.useDeliverySchedule = useDeliverySchedule;
    }

    
    @Column(name="SND_DELIVERY_WITHOUT_PICKLIST", length=1)
    public Character getSndDeliveryWithoutPicklist() {
        return this.sndDeliveryWithoutPicklist;
    }
    
    public void setSndDeliveryWithoutPicklist(Character sndDeliveryWithoutPicklist) {
        this.sndDeliveryWithoutPicklist = sndDeliveryWithoutPicklist;
    }

    
    @Column(name="OUTBOUND_ONLY_WHEN_INBOUND", length=1)
    public Character getOutboundOnlyWhenInbound() {
        return this.outboundOnlyWhenInbound;
    }
    
    public void setOutboundOnlyWhenInbound(Character outboundOnlyWhenInbound) {
        this.outboundOnlyWhenInbound = outboundOnlyWhenInbound;
    }

    
    @Column(name="EXTENDELOCATIONZONEEVALUATION", length=1)
    public Character getExtendelocationzoneevaluation() {
        return this.extendelocationzoneevaluation;
    }
    
    public void setExtendelocationzoneevaluation(Character extendelocationzoneevaluation) {
        this.extendelocationzoneevaluation = extendelocationzoneevaluation;
    }

    
    @Column(name="ORDERTYPE_ACCORDING_LINECAT", length=1)
    public Character getOrdertypeAccordingLinecat() {
        return this.ordertypeAccordingLinecat;
    }
    
    public void setOrdertypeAccordingLinecat(Character ordertypeAccordingLinecat) {
        this.ordertypeAccordingLinecat = ordertypeAccordingLinecat;
    }

    
    @Column(name="LANGUAGE", length=3)
    public String getLanguage() {
        return this.language;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }

    
    @Column(name="CUSTOMERNR", length=20)
    public String getCustomernr() {
        return this.customernr;
    }
    
    public void setCustomernr(String customernr) {
        this.customernr = customernr;
    }

    
    @Column(name="REPORTING_EMAIL_ADDRESS", length=250)
    public String getReportingEmailAddress() {
        return this.reportingEmailAddress;
    }
    
    public void setReportingEmailAddress(String reportingEmailAddress) {
        this.reportingEmailAddress = reportingEmailAddress;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDLASTCHANGETIME", length=26)
    public Date getRecordlastchangetime() {
        return this.recordlastchangetime;
    }
    
    public void setRecordlastchangetime(Date recordlastchangetime) {
        this.recordlastchangetime = recordlastchangetime;
    }

    
    @Column(name="USERLASTCHANGE", length=20)
    public String getUserlastchange() {
        return this.userlastchange;
    }
    
    public void setUserlastchange(String userlastchange) {
        this.userlastchange = userlastchange;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Triggerdef> getTriggerdefs() {
        return this.triggerdefs;
    }
    
    public void setTriggerdefs(Set<Triggerdef> triggerdefs) {
        this.triggerdefs = triggerdefs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Invhdr> getInvhdrs() {
        return this.invhdrs;
    }
    
    public void setInvhdrs(Set<Invhdr> invhdrs) {
        this.invhdrs = invhdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Stockrcbtc> getStockrcbtcs() {
        return this.stockrcbtcs;
    }
    
    public void setStockrcbtcs(Set<Stockrcbtc> stockrcbtcs) {
        this.stockrcbtcs = stockrcbtcs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Delannhdr> getDelannhdrs() {
        return this.delannhdrs;
    }
    
    public void setDelannhdrs(Set<Delannhdr> delannhdrs) {
        this.delannhdrs = delannhdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Itembtcm> getItembtcms() {
        return this.itembtcms;
    }
    
    public void setItembtcms(Set<Itembtcm> itembtcms) {
        this.itembtcms = itembtcms;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Invmovcon> getInvmovcons() {
        return this.invmovcons;
    }
    
    public void setInvmovcons(Set<Invmovcon> invmovcons) {
        this.invmovcons = invmovcons;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Rethdr> getRethdrs() {
        return this.rethdrs;
    }
    
    public void setRethdrs(Set<Rethdr> rethdrs) {
        this.rethdrs = rethdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Dayendext> getDayendexts() {
        return this.dayendexts;
    }
    
    public void setDayendexts(Set<Dayendext> dayendexts) {
        this.dayendexts = dayendexts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<AsxExchg> getAsxExchgs() {
        return this.asxExchgs;
    }
    
    public void setAsxExchgs(Set<AsxExchg> asxExchgs) {
        this.asxExchgs = asxExchgs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Triggerexc> getTriggerexcs() {
        return this.triggerexcs;
    }
    
    public void setTriggerexcs(Set<Triggerexc> triggerexcs) {
        this.triggerexcs = triggerexcs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Delhdr> getDelhdrs() {
        return this.delhdrs;
    }
    
    public void setDelhdrs(Set<Delhdr> delhdrs) {
        this.delhdrs = delhdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Ctrbizpcls> getCtrbizpclses() {
        return this.ctrbizpclses;
    }
    
    public void setCtrbizpclses(Set<Ctrbizpcls> ctrbizpclses) {
        this.ctrbizpclses = ctrbizpclses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Invmovmnt> getInvmovmnts() {
        return this.invmovmnts;
    }
    
    public void setInvmovmnts(Set<Invmovmnt> invmovmnts) {
        this.invmovmnts = invmovmnts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Stockrcmap> getStockrcmaps() {
        return this.stockrcmaps;
    }
    
    public void setStockrcmaps(Set<Stockrcmap> stockrcmaps) {
        this.stockrcmaps = stockrcmaps;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Grehdr> getGrehdrs() {
        return this.grehdrs;
    }
    
    public void setGrehdrs(Set<Grehdr> grehdrs) {
        this.grehdrs = grehdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Dayend> getDayends() {
        return this.dayends;
    }
    
    public void setDayends(Set<Dayend> dayends) {
        this.dayends = dayends;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Consordhdr> getConsordhdrs() {
        return this.consordhdrs;
    }
    
    public void setConsordhdrs(Set<Consordhdr> consordhdrs) {
        this.consordhdrs = consordhdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Phaselog> getPhaselogs() {
        return this.phaselogs;
    }
    
    public void setPhaselogs(Set<Phaselog> phaselogs) {
        this.phaselogs = phaselogs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Custopohdr> getCustopohdrs() {
        return this.custopohdrs;
    }
    
    public void setCustopohdrs(Set<Custopohdr> custopohdrs) {
        this.custopohdrs = custopohdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Custordhdr> getCustordhdrs() {
        return this.custordhdrs;
    }
    
    public void setCustordhdrs(Set<Custordhdr> custordhdrs) {
        this.custordhdrs = custordhdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Bizpconaut> getBizpconauts() {
        return this.bizpconauts;
    }
    
    public void setBizpconauts(Set<Bizpconaut> bizpconauts) {
        this.bizpconauts = bizpconauts;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Psihdr> getPsihdrs() {
        return this.psihdrs;
    }
    
    public void setPsihdrs(Set<Psihdr> psihdrs) {
        this.psihdrs = psihdrs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Contrpgrp> getContrpgrps() {
        return this.contrpgrps;
    }
    
    public void setContrpgrps(Set<Contrpgrp> contrpgrps) {
        this.contrpgrps = contrpgrps;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Stockrclop> getStockrclops() {
        return this.stockrclops;
    }
    
    public void setStockrclops(Set<Stockrclop> stockrclops) {
        this.stockrclops = stockrclops;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Jobdef> getJobdefs() {
        return this.jobdefs;
    }
    
    public void setJobdefs(Set<Jobdef> jobdefs) {
        this.jobdefs = jobdefs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="contrdef")
    public Set<Stockrebtc> getStockrebtcs() {
        return this.stockrebtcs;
    }
    
    public void setStockrebtcs(Set<Stockrebtc> stockrebtcs) {
        this.stockrebtcs = stockrebtcs;
    }




}


