package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Dellinpck generated by hbm2java
 */
@Entity
@Table(name="DELLINPCK"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Dellinpck  implements java.io.Serializable {


     private long pk;
     private Delhdr delhdr;
     private Dellinbtc dellinbtc;
     private Dellin dellin;
     private BigDecimal deliveredqty;
     private Long packagelistnr;
     private Long boxnr;
     private BigDecimal weight;
     private BigDecimal volume;
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

    public Dellinpck() {
    }

	
    public Dellinpck(long pk, Delhdr delhdr, Dellinbtc dellinbtc, Dellin dellin, String outboundignore, Date recordcreationtime) {
        this.pk = pk;
        this.delhdr = delhdr;
        this.dellinbtc = dellinbtc;
        this.dellin = dellin;
        this.outboundignore = outboundignore;
        this.recordcreationtime = recordcreationtime;
    }
    public Dellinpck(long pk, Delhdr delhdr, Dellinbtc dellinbtc, Dellin dellin, BigDecimal deliveredqty, Long packagelistnr, Long boxnr, BigDecimal weight, BigDecimal volume, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.delhdr = delhdr;
       this.dellinbtc = dellinbtc;
       this.dellin = dellin;
       this.deliveredqty = deliveredqty;
       this.packagelistnr = packagelistnr;
       this.boxnr = boxnr;
       this.weight = weight;
       this.volume = volume;
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

    
    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DELHDRPK", nullable=false)
    public Delhdr getDelhdr() {
        return this.delhdr;
    }
    
    public void setDelhdr(Delhdr delhdr) {
        this.delhdr = delhdr;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DELLINBTCPK", nullable=false)
    public Dellinbtc getDellinbtc() {
        return this.dellinbtc;
    }
    
    public void setDellinbtc(Dellinbtc dellinbtc) {
        this.dellinbtc = dellinbtc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DELLINPK", nullable=false)
    public Dellin getDellin() {
        return this.dellin;
    }
    
    public void setDellin(Dellin dellin) {
        this.dellin = dellin;
    }

    
    @Column(name="DELIVEREDQTY", precision=15, scale=3)
    public BigDecimal getDeliveredqty() {
        return this.deliveredqty;
    }
    
    public void setDeliveredqty(BigDecimal deliveredqty) {
        this.deliveredqty = deliveredqty;
    }

    
    @Column(name="PACKAGELISTNR", precision=12, scale=0)
    public Long getPackagelistnr() {
        return this.packagelistnr;
    }
    
    public void setPackagelistnr(Long packagelistnr) {
        this.packagelistnr = packagelistnr;
    }

    
    @Column(name="BOXNR", precision=12, scale=0)
    public Long getBoxnr() {
        return this.boxnr;
    }
    
    public void setBoxnr(Long boxnr) {
        this.boxnr = boxnr;
    }

    
    @Column(name="WEIGHT", precision=11, scale=5)
    public BigDecimal getWeight() {
        return this.weight;
    }
    
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    
    @Column(name="VOLUME", precision=11, scale=5)
    public BigDecimal getVolume() {
        return this.volume;
    }
    
    public void setVolume(BigDecimal volume) {
        this.volume = volume;
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




}


