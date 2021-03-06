package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CustopolinId generated by hbm2java
 */
@Embeddable
public class CustopolinId  implements java.io.Serializable {


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

    public CustopolinId() {
    }

	
    public CustopolinId(long pk, long custopohdrpk, int orderline, long itemmasterpk, String itemnr, String outboundignore, Date recordcreationtime) {
        this.pk = pk;
        this.custopohdrpk = custopohdrpk;
        this.orderline = orderline;
        this.itemmasterpk = itemmasterpk;
        this.itemnr = itemnr;
        this.outboundignore = outboundignore;
        this.recordcreationtime = recordcreationtime;
    }
    public CustopolinId(long pk, long custopohdrpk, int orderline, Integer deliverylinenr, Byte orderlinestatus, long itemmasterpk, String itemnr, String itemnrcontractor, String salesrepresentative, Date requesteddeliverydate, String freeofchargeflag, String freeofchargereasoncode, BigDecimal orderquantity, BigDecimal deliveredquantity, BigDecimal remainingquantity, BigDecimal invoicequantity, String unit, String requestedbatchid, Date batchexpirydate, BigDecimal salesprice, BigDecimal netsalesprice, Long incidentnr, Integer incidentline, Long retlinpk, String backloggedflag, Integer ipFreeofchargereasoncode, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime) {
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
   


    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="CUSTOPOHDRPK", nullable=false, precision=12, scale=0)
    public long getCustopohdrpk() {
        return this.custopohdrpk;
    }
    
    public void setCustopohdrpk(long custopohdrpk) {
        this.custopohdrpk = custopohdrpk;
    }


    @Column(name="ORDERLINE", nullable=false, precision=5, scale=0)
    public int getOrderline() {
        return this.orderline;
    }
    
    public void setOrderline(int orderline) {
        this.orderline = orderline;
    }


    @Column(name="DELIVERYLINENR", precision=5, scale=0)
    public Integer getDeliverylinenr() {
        return this.deliverylinenr;
    }
    
    public void setDeliverylinenr(Integer deliverylinenr) {
        this.deliverylinenr = deliverylinenr;
    }


    @Column(name="ORDERLINESTATUS", precision=2, scale=0)
    public Byte getOrderlinestatus() {
        return this.orderlinestatus;
    }
    
    public void setOrderlinestatus(Byte orderlinestatus) {
        this.orderlinestatus = orderlinestatus;
    }


    @Column(name="ITEMMASTERPK", nullable=false, precision=12, scale=0)
    public long getItemmasterpk() {
        return this.itemmasterpk;
    }
    
    public void setItemmasterpk(long itemmasterpk) {
        this.itemmasterpk = itemmasterpk;
    }


    @Column(name="ITEMNR", nullable=false, length=35)
    public String getItemnr() {
        return this.itemnr;
    }
    
    public void setItemnr(String itemnr) {
        this.itemnr = itemnr;
    }


    @Column(name="ITEMNRCONTRACTOR", length=35)
    public String getItemnrcontractor() {
        return this.itemnrcontractor;
    }
    
    public void setItemnrcontractor(String itemnrcontractor) {
        this.itemnrcontractor = itemnrcontractor;
    }


    @Column(name="SALESREPRESENTATIVE", length=30)
    public String getSalesrepresentative() {
        return this.salesrepresentative;
    }
    
    public void setSalesrepresentative(String salesrepresentative) {
        this.salesrepresentative = salesrepresentative;
    }


    @Column(name="REQUESTEDDELIVERYDATE", length=26)
    public Date getRequesteddeliverydate() {
        return this.requesteddeliverydate;
    }
    
    public void setRequesteddeliverydate(Date requesteddeliverydate) {
        this.requesteddeliverydate = requesteddeliverydate;
    }


    @Column(name="FREEOFCHARGEFLAG", length=1)
    public String getFreeofchargeflag() {
        return this.freeofchargeflag;
    }
    
    public void setFreeofchargeflag(String freeofchargeflag) {
        this.freeofchargeflag = freeofchargeflag;
    }


    @Column(name="FREEOFCHARGEREASONCODE", length=2)
    public String getFreeofchargereasoncode() {
        return this.freeofchargereasoncode;
    }
    
    public void setFreeofchargereasoncode(String freeofchargereasoncode) {
        this.freeofchargereasoncode = freeofchargereasoncode;
    }


    @Column(name="ORDERQUANTITY", precision=15, scale=3)
    public BigDecimal getOrderquantity() {
        return this.orderquantity;
    }
    
    public void setOrderquantity(BigDecimal orderquantity) {
        this.orderquantity = orderquantity;
    }


    @Column(name="DELIVEREDQUANTITY", precision=15, scale=3)
    public BigDecimal getDeliveredquantity() {
        return this.deliveredquantity;
    }
    
    public void setDeliveredquantity(BigDecimal deliveredquantity) {
        this.deliveredquantity = deliveredquantity;
    }


    @Column(name="REMAININGQUANTITY", precision=15, scale=3)
    public BigDecimal getRemainingquantity() {
        return this.remainingquantity;
    }
    
    public void setRemainingquantity(BigDecimal remainingquantity) {
        this.remainingquantity = remainingquantity;
    }


    @Column(name="INVOICEQUANTITY", precision=15, scale=3)
    public BigDecimal getInvoicequantity() {
        return this.invoicequantity;
    }
    
    public void setInvoicequantity(BigDecimal invoicequantity) {
        this.invoicequantity = invoicequantity;
    }


    @Column(name="UNIT", length=5)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }


    @Column(name="REQUESTEDBATCHID", length=20)
    public String getRequestedbatchid() {
        return this.requestedbatchid;
    }
    
    public void setRequestedbatchid(String requestedbatchid) {
        this.requestedbatchid = requestedbatchid;
    }


    @Column(name="BATCHEXPIRYDATE", length=26)
    public Date getBatchexpirydate() {
        return this.batchexpirydate;
    }
    
    public void setBatchexpirydate(Date batchexpirydate) {
        this.batchexpirydate = batchexpirydate;
    }


    @Column(name="SALESPRICE", precision=17, scale=4)
    public BigDecimal getSalesprice() {
        return this.salesprice;
    }
    
    public void setSalesprice(BigDecimal salesprice) {
        this.salesprice = salesprice;
    }


    @Column(name="NETSALESPRICE", precision=17, scale=4)
    public BigDecimal getNetsalesprice() {
        return this.netsalesprice;
    }
    
    public void setNetsalesprice(BigDecimal netsalesprice) {
        this.netsalesprice = netsalesprice;
    }


    @Column(name="INCIDENTNR", precision=12, scale=0)
    public Long getIncidentnr() {
        return this.incidentnr;
    }
    
    public void setIncidentnr(Long incidentnr) {
        this.incidentnr = incidentnr;
    }


    @Column(name="INCIDENTLINE", precision=5, scale=0)
    public Integer getIncidentline() {
        return this.incidentline;
    }
    
    public void setIncidentline(Integer incidentline) {
        this.incidentline = incidentline;
    }


    @Column(name="RETLINPK", precision=12, scale=0)
    public Long getRetlinpk() {
        return this.retlinpk;
    }
    
    public void setRetlinpk(Long retlinpk) {
        this.retlinpk = retlinpk;
    }


    @Column(name="BACKLOGGEDFLAG", length=1)
    public String getBackloggedflag() {
        return this.backloggedflag;
    }
    
    public void setBackloggedflag(String backloggedflag) {
        this.backloggedflag = backloggedflag;
    }


    @Column(name="IP_FREEOFCHARGEREASONCODE", precision=5, scale=0)
    public Integer getIpFreeofchargereasoncode() {
        return this.ipFreeofchargereasoncode;
    }
    
    public void setIpFreeofchargereasoncode(Integer ipFreeofchargereasoncode) {
        this.ipFreeofchargereasoncode = ipFreeofchargereasoncode;
    }


    @Column(name="PROGRAMNAME", length=10)
    public String getProgramname() {
        return this.programname;
    }
    
    public void setProgramname(String programname) {
        this.programname = programname;
    }


    @Column(name="FILENAME", length=10)
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
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


    @Column(name="OUTBOUNDIGNORE", nullable=false, length=1)
    public String getOutboundignore() {
        return this.outboundignore;
    }
    
    public void setOutboundignore(String outboundignore) {
        this.outboundignore = outboundignore;
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
		 if ( !(other instanceof CustopolinId) ) return false;
		 CustopolinId castOther = ( CustopolinId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && (this.getCustopohdrpk()==castOther.getCustopohdrpk())
 && (this.getOrderline()==castOther.getOrderline())
 && ( (this.getDeliverylinenr()==castOther.getDeliverylinenr()) || ( this.getDeliverylinenr()!=null && castOther.getDeliverylinenr()!=null && this.getDeliverylinenr().equals(castOther.getDeliverylinenr()) ) )
 && ( (this.getOrderlinestatus()==castOther.getOrderlinestatus()) || ( this.getOrderlinestatus()!=null && castOther.getOrderlinestatus()!=null && this.getOrderlinestatus().equals(castOther.getOrderlinestatus()) ) )
 && (this.getItemmasterpk()==castOther.getItemmasterpk())
 && ( (this.getItemnr()==castOther.getItemnr()) || ( this.getItemnr()!=null && castOther.getItemnr()!=null && this.getItemnr().equals(castOther.getItemnr()) ) )
 && ( (this.getItemnrcontractor()==castOther.getItemnrcontractor()) || ( this.getItemnrcontractor()!=null && castOther.getItemnrcontractor()!=null && this.getItemnrcontractor().equals(castOther.getItemnrcontractor()) ) )
 && ( (this.getSalesrepresentative()==castOther.getSalesrepresentative()) || ( this.getSalesrepresentative()!=null && castOther.getSalesrepresentative()!=null && this.getSalesrepresentative().equals(castOther.getSalesrepresentative()) ) )
 && ( (this.getRequesteddeliverydate()==castOther.getRequesteddeliverydate()) || ( this.getRequesteddeliverydate()!=null && castOther.getRequesteddeliverydate()!=null && this.getRequesteddeliverydate().equals(castOther.getRequesteddeliverydate()) ) )
 && ( (this.getFreeofchargeflag()==castOther.getFreeofchargeflag()) || ( this.getFreeofchargeflag()!=null && castOther.getFreeofchargeflag()!=null && this.getFreeofchargeflag().equals(castOther.getFreeofchargeflag()) ) )
 && ( (this.getFreeofchargereasoncode()==castOther.getFreeofchargereasoncode()) || ( this.getFreeofchargereasoncode()!=null && castOther.getFreeofchargereasoncode()!=null && this.getFreeofchargereasoncode().equals(castOther.getFreeofchargereasoncode()) ) )
 && ( (this.getOrderquantity()==castOther.getOrderquantity()) || ( this.getOrderquantity()!=null && castOther.getOrderquantity()!=null && this.getOrderquantity().equals(castOther.getOrderquantity()) ) )
 && ( (this.getDeliveredquantity()==castOther.getDeliveredquantity()) || ( this.getDeliveredquantity()!=null && castOther.getDeliveredquantity()!=null && this.getDeliveredquantity().equals(castOther.getDeliveredquantity()) ) )
 && ( (this.getRemainingquantity()==castOther.getRemainingquantity()) || ( this.getRemainingquantity()!=null && castOther.getRemainingquantity()!=null && this.getRemainingquantity().equals(castOther.getRemainingquantity()) ) )
 && ( (this.getInvoicequantity()==castOther.getInvoicequantity()) || ( this.getInvoicequantity()!=null && castOther.getInvoicequantity()!=null && this.getInvoicequantity().equals(castOther.getInvoicequantity()) ) )
 && ( (this.getUnit()==castOther.getUnit()) || ( this.getUnit()!=null && castOther.getUnit()!=null && this.getUnit().equals(castOther.getUnit()) ) )
 && ( (this.getRequestedbatchid()==castOther.getRequestedbatchid()) || ( this.getRequestedbatchid()!=null && castOther.getRequestedbatchid()!=null && this.getRequestedbatchid().equals(castOther.getRequestedbatchid()) ) )
 && ( (this.getBatchexpirydate()==castOther.getBatchexpirydate()) || ( this.getBatchexpirydate()!=null && castOther.getBatchexpirydate()!=null && this.getBatchexpirydate().equals(castOther.getBatchexpirydate()) ) )
 && ( (this.getSalesprice()==castOther.getSalesprice()) || ( this.getSalesprice()!=null && castOther.getSalesprice()!=null && this.getSalesprice().equals(castOther.getSalesprice()) ) )
 && ( (this.getNetsalesprice()==castOther.getNetsalesprice()) || ( this.getNetsalesprice()!=null && castOther.getNetsalesprice()!=null && this.getNetsalesprice().equals(castOther.getNetsalesprice()) ) )
 && ( (this.getIncidentnr()==castOther.getIncidentnr()) || ( this.getIncidentnr()!=null && castOther.getIncidentnr()!=null && this.getIncidentnr().equals(castOther.getIncidentnr()) ) )
 && ( (this.getIncidentline()==castOther.getIncidentline()) || ( this.getIncidentline()!=null && castOther.getIncidentline()!=null && this.getIncidentline().equals(castOther.getIncidentline()) ) )
 && ( (this.getRetlinpk()==castOther.getRetlinpk()) || ( this.getRetlinpk()!=null && castOther.getRetlinpk()!=null && this.getRetlinpk().equals(castOther.getRetlinpk()) ) )
 && ( (this.getBackloggedflag()==castOther.getBackloggedflag()) || ( this.getBackloggedflag()!=null && castOther.getBackloggedflag()!=null && this.getBackloggedflag().equals(castOther.getBackloggedflag()) ) )
 && ( (this.getIpFreeofchargereasoncode()==castOther.getIpFreeofchargereasoncode()) || ( this.getIpFreeofchargereasoncode()!=null && castOther.getIpFreeofchargereasoncode()!=null && this.getIpFreeofchargereasoncode().equals(castOther.getIpFreeofchargereasoncode()) ) )
 && ( (this.getProgramname()==castOther.getProgramname()) || ( this.getProgramname()!=null && castOther.getProgramname()!=null && this.getProgramname().equals(castOther.getProgramname()) ) )
 && ( (this.getFilename()==castOther.getFilename()) || ( this.getFilename()!=null && castOther.getFilename()!=null && this.getFilename().equals(castOther.getFilename()) ) )
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
 && ( (this.getOutboundignore()==castOther.getOutboundignore()) || ( this.getOutboundignore()!=null && castOther.getOutboundignore()!=null && this.getOutboundignore().equals(castOther.getOutboundignore()) ) )
 && ( (this.getRecordlastchangetime()==castOther.getRecordlastchangetime()) || ( this.getRecordlastchangetime()!=null && castOther.getRecordlastchangetime()!=null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime()) ) )
 && ( (this.getRecordcreationtime()==castOther.getRecordcreationtime()) || ( this.getRecordcreationtime()!=null && castOther.getRecordcreationtime()!=null && this.getRecordcreationtime().equals(castOther.getRecordcreationtime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + (int) this.getCustopohdrpk();
         result = 37 * result + this.getOrderline();
         result = 37 * result + ( getDeliverylinenr() == null ? 0 : this.getDeliverylinenr().hashCode() );
         result = 37 * result + ( getOrderlinestatus() == null ? 0 : this.getOrderlinestatus().hashCode() );
         result = 37 * result + (int) this.getItemmasterpk();
         result = 37 * result + ( getItemnr() == null ? 0 : this.getItemnr().hashCode() );
         result = 37 * result + ( getItemnrcontractor() == null ? 0 : this.getItemnrcontractor().hashCode() );
         result = 37 * result + ( getSalesrepresentative() == null ? 0 : this.getSalesrepresentative().hashCode() );
         result = 37 * result + ( getRequesteddeliverydate() == null ? 0 : this.getRequesteddeliverydate().hashCode() );
         result = 37 * result + ( getFreeofchargeflag() == null ? 0 : this.getFreeofchargeflag().hashCode() );
         result = 37 * result + ( getFreeofchargereasoncode() == null ? 0 : this.getFreeofchargereasoncode().hashCode() );
         result = 37 * result + ( getOrderquantity() == null ? 0 : this.getOrderquantity().hashCode() );
         result = 37 * result + ( getDeliveredquantity() == null ? 0 : this.getDeliveredquantity().hashCode() );
         result = 37 * result + ( getRemainingquantity() == null ? 0 : this.getRemainingquantity().hashCode() );
         result = 37 * result + ( getInvoicequantity() == null ? 0 : this.getInvoicequantity().hashCode() );
         result = 37 * result + ( getUnit() == null ? 0 : this.getUnit().hashCode() );
         result = 37 * result + ( getRequestedbatchid() == null ? 0 : this.getRequestedbatchid().hashCode() );
         result = 37 * result + ( getBatchexpirydate() == null ? 0 : this.getBatchexpirydate().hashCode() );
         result = 37 * result + ( getSalesprice() == null ? 0 : this.getSalesprice().hashCode() );
         result = 37 * result + ( getNetsalesprice() == null ? 0 : this.getNetsalesprice().hashCode() );
         result = 37 * result + ( getIncidentnr() == null ? 0 : this.getIncidentnr().hashCode() );
         result = 37 * result + ( getIncidentline() == null ? 0 : this.getIncidentline().hashCode() );
         result = 37 * result + ( getRetlinpk() == null ? 0 : this.getRetlinpk().hashCode() );
         result = 37 * result + ( getBackloggedflag() == null ? 0 : this.getBackloggedflag().hashCode() );
         result = 37 * result + ( getIpFreeofchargereasoncode() == null ? 0 : this.getIpFreeofchargereasoncode().hashCode() );
         result = 37 * result + ( getProgramname() == null ? 0 : this.getProgramname().hashCode() );
         result = 37 * result + ( getFilename() == null ? 0 : this.getFilename().hashCode() );
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
         result = 37 * result + ( getOutboundignore() == null ? 0 : this.getOutboundignore().hashCode() );
         result = 37 * result + ( getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode() );
         result = 37 * result + ( getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode() );
         return result;
   }   


}


