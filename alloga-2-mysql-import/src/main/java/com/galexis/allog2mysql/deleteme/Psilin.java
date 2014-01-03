package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
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
 * Psilin generated by hbm2java
 */
@Entity
@Table(name="PSILIN"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"PSIHDRPK", "INSTRUCTIONLINENR"}) 
)
public class Psilin  implements java.io.Serializable {


     private long pk;
     private Psihdr psihdr;
     private int instructionlinenr;
     private String itemcategory;
     private String contractoritemnr;
     private String contractoritemnr2;
     private String itemdescription;
     private String batchnr;
     private String vendorbatchnr;
     private BigDecimal requestedqty;
     private String unit;
     private String storagelocation;
     private String loadinggroup;
     private String purchaseorder;
     private String specialhandlingcode;
     private String specialhandlingtext;
     private Date timestampreceived;
     private Integer filesequencenr;
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
     private Set<Psilincnf> psilincnfs = new HashSet<Psilincnf>(0);

    public Psilin() {
    }

	
    public Psilin(long pk, Psihdr psihdr, int instructionlinenr, String contractoritemnr, Date recordcreationtime) {
        this.pk = pk;
        this.psihdr = psihdr;
        this.instructionlinenr = instructionlinenr;
        this.contractoritemnr = contractoritemnr;
        this.recordcreationtime = recordcreationtime;
    }
    public Psilin(long pk, Psihdr psihdr, int instructionlinenr, String itemcategory, String contractoritemnr, String contractoritemnr2, String itemdescription, String batchnr, String vendorbatchnr, BigDecimal requestedqty, String unit, String storagelocation, String loadinggroup, String purchaseorder, String specialhandlingcode, String specialhandlingtext, Date timestampreceived, Integer filesequencenr, String transactionid, Date timestampconfirmation, String programname, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime, Set<Psilincnf> psilincnfs) {
       this.pk = pk;
       this.psihdr = psihdr;
       this.instructionlinenr = instructionlinenr;
       this.itemcategory = itemcategory;
       this.contractoritemnr = contractoritemnr;
       this.contractoritemnr2 = contractoritemnr2;
       this.itemdescription = itemdescription;
       this.batchnr = batchnr;
       this.vendorbatchnr = vendorbatchnr;
       this.requestedqty = requestedqty;
       this.unit = unit;
       this.storagelocation = storagelocation;
       this.loadinggroup = loadinggroup;
       this.purchaseorder = purchaseorder;
       this.specialhandlingcode = specialhandlingcode;
       this.specialhandlingtext = specialhandlingtext;
       this.timestampreceived = timestampreceived;
       this.filesequencenr = filesequencenr;
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
       this.psilincnfs = psilincnfs;
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
    @JoinColumn(name="PSIHDRPK", nullable=false)
    public Psihdr getPsihdr() {
        return this.psihdr;
    }
    
    public void setPsihdr(Psihdr psihdr) {
        this.psihdr = psihdr;
    }

    
    @Column(name="INSTRUCTIONLINENR", nullable=false, precision=6, scale=0)
    public int getInstructionlinenr() {
        return this.instructionlinenr;
    }
    
    public void setInstructionlinenr(int instructionlinenr) {
        this.instructionlinenr = instructionlinenr;
    }

    
    @Column(name="ITEMCATEGORY", length=10)
    public String getItemcategory() {
        return this.itemcategory;
    }
    
    public void setItemcategory(String itemcategory) {
        this.itemcategory = itemcategory;
    }

    
    @Column(name="CONTRACTORITEMNR", nullable=false, length=35)
    public String getContractoritemnr() {
        return this.contractoritemnr;
    }
    
    public void setContractoritemnr(String contractoritemnr) {
        this.contractoritemnr = contractoritemnr;
    }

    
    @Column(name="CONTRACTORITEMNR2", length=35)
    public String getContractoritemnr2() {
        return this.contractoritemnr2;
    }
    
    public void setContractoritemnr2(String contractoritemnr2) {
        this.contractoritemnr2 = contractoritemnr2;
    }

    
    @Column(name="ITEMDESCRIPTION", length=50)
    public String getItemdescription() {
        return this.itemdescription;
    }
    
    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    
    @Column(name="BATCHNR", length=20)
    public String getBatchnr() {
        return this.batchnr;
    }
    
    public void setBatchnr(String batchnr) {
        this.batchnr = batchnr;
    }

    
    @Column(name="VENDORBATCHNR", length=20)
    public String getVendorbatchnr() {
        return this.vendorbatchnr;
    }
    
    public void setVendorbatchnr(String vendorbatchnr) {
        this.vendorbatchnr = vendorbatchnr;
    }

    
    @Column(name="REQUESTEDQTY", precision=15, scale=3)
    public BigDecimal getRequestedqty() {
        return this.requestedqty;
    }
    
    public void setRequestedqty(BigDecimal requestedqty) {
        this.requestedqty = requestedqty;
    }

    
    @Column(name="UNIT", length=10)
    public String getUnit() {
        return this.unit;
    }
    
    public void setUnit(String unit) {
        this.unit = unit;
    }

    
    @Column(name="STORAGELOCATION", length=10)
    public String getStoragelocation() {
        return this.storagelocation;
    }
    
    public void setStoragelocation(String storagelocation) {
        this.storagelocation = storagelocation;
    }

    
    @Column(name="LOADINGGROUP", length=10)
    public String getLoadinggroup() {
        return this.loadinggroup;
    }
    
    public void setLoadinggroup(String loadinggroup) {
        this.loadinggroup = loadinggroup;
    }

    
    @Column(name="PURCHASEORDER", length=30)
    public String getPurchaseorder() {
        return this.purchaseorder;
    }
    
    public void setPurchaseorder(String purchaseorder) {
        this.purchaseorder = purchaseorder;
    }

    
    @Column(name="SPECIALHANDLINGCODE", length=10)
    public String getSpecialhandlingcode() {
        return this.specialhandlingcode;
    }
    
    public void setSpecialhandlingcode(String specialhandlingcode) {
        this.specialhandlingcode = specialhandlingcode;
    }

    
    @Column(name="SPECIALHANDLINGTEXT", length=80)
    public String getSpecialhandlingtext() {
        return this.specialhandlingtext;
    }
    
    public void setSpecialhandlingtext(String specialhandlingtext) {
        this.specialhandlingtext = specialhandlingtext;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TIMESTAMPRECEIVED", length=26)
    public Date getTimestampreceived() {
        return this.timestampreceived;
    }
    
    public void setTimestampreceived(Date timestampreceived) {
        this.timestampreceived = timestampreceived;
    }

    
    @Column(name="FILESEQUENCENR", precision=7, scale=0)
    public Integer getFilesequencenr() {
        return this.filesequencenr;
    }
    
    public void setFilesequencenr(Integer filesequencenr) {
        this.filesequencenr = filesequencenr;
    }

    
    @Column(name="TRANSACTIONID", length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TIMESTAMPCONFIRMATION", length=26)
    public Date getTimestampconfirmation() {
        return this.timestampconfirmation;
    }
    
    public void setTimestampconfirmation(Date timestampconfirmation) {
        this.timestampconfirmation = timestampconfirmation;
    }

    
    @Column(name="PROGRAMNAME", length=10)
    public String getProgramname() {
        return this.programname;
    }
    
    public void setProgramname(String programname) {
        this.programname = programname;
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

    
    @Column(name="RECORDPROCESSEDFLAG", length=1)
    public String getRecordprocessedflag() {
        return this.recordprocessedflag;
    }
    
    public void setRecordprocessedflag(String recordprocessedflag) {
        this.recordprocessedflag = recordprocessedflag;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDPROCESSINGTIME", length=26)
    public Date getRecordprocessingtime() {
        return this.recordprocessingtime;
    }
    
    public void setRecordprocessingtime(Date recordprocessingtime) {
        this.recordprocessingtime = recordprocessingtime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDLASTCHANGETIME", length=26)
    public Date getRecordlastchangetime() {
        return this.recordlastchangetime;
    }
    
    public void setRecordlastchangetime(Date recordlastchangetime) {
        this.recordlastchangetime = recordlastchangetime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="psilin")
    public Set<Psilincnf> getPsilincnfs() {
        return this.psilincnfs;
    }
    
    public void setPsilincnfs(Set<Psilincnf> psilincnfs) {
        this.psilincnfs = psilincnfs;
    }




}


