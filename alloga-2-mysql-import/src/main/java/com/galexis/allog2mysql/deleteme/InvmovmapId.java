package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * InvmovmapId generated by hbm2java
 */
@Embeddable
public class InvmovmapId  implements java.io.Serializable {


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

    public InvmovmapId() {
    }

	
    public InvmovmapId(long pk, long invmovmntpk, String outboundignore) {
        this.pk = pk;
        this.invmovmntpk = invmovmntpk;
        this.outboundignore = outboundignore;
    }
    public InvmovmapId(long pk, long invmovmntpk, Long invmovconpk, String plantfrom, String plantto, String storagelocationfrom, String storagelocationto, String stockstatusfrom, String stockstatusto, String movementcode, String reasoncode, String salesorganisation, String reference, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String outboundignore, Date recordlastchangetime, Date recordcreationtime) {
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
   


    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="INVMOVMNTPK", nullable=false, precision=12, scale=0)
    public long getInvmovmntpk() {
        return this.invmovmntpk;
    }
    
    public void setInvmovmntpk(long invmovmntpk) {
        this.invmovmntpk = invmovmntpk;
    }


    @Column(name="INVMOVCONPK", precision=12, scale=0)
    public Long getInvmovconpk() {
        return this.invmovconpk;
    }
    
    public void setInvmovconpk(Long invmovconpk) {
        this.invmovconpk = invmovconpk;
    }


    @Column(name="PLANTFROM", length=20)
    public String getPlantfrom() {
        return this.plantfrom;
    }
    
    public void setPlantfrom(String plantfrom) {
        this.plantfrom = plantfrom;
    }


    @Column(name="PLANTTO", length=20)
    public String getPlantto() {
        return this.plantto;
    }
    
    public void setPlantto(String plantto) {
        this.plantto = plantto;
    }


    @Column(name="STORAGELOCATIONFROM", length=20)
    public String getStoragelocationfrom() {
        return this.storagelocationfrom;
    }
    
    public void setStoragelocationfrom(String storagelocationfrom) {
        this.storagelocationfrom = storagelocationfrom;
    }


    @Column(name="STORAGELOCATIONTO", length=20)
    public String getStoragelocationto() {
        return this.storagelocationto;
    }
    
    public void setStoragelocationto(String storagelocationto) {
        this.storagelocationto = storagelocationto;
    }


    @Column(name="STOCKSTATUSFROM", length=20)
    public String getStockstatusfrom() {
        return this.stockstatusfrom;
    }
    
    public void setStockstatusfrom(String stockstatusfrom) {
        this.stockstatusfrom = stockstatusfrom;
    }


    @Column(name="STOCKSTATUSTO", length=20)
    public String getStockstatusto() {
        return this.stockstatusto;
    }
    
    public void setStockstatusto(String stockstatusto) {
        this.stockstatusto = stockstatusto;
    }


    @Column(name="MOVEMENTCODE", length=20)
    public String getMovementcode() {
        return this.movementcode;
    }
    
    public void setMovementcode(String movementcode) {
        this.movementcode = movementcode;
    }


    @Column(name="REASONCODE", length=20)
    public String getReasoncode() {
        return this.reasoncode;
    }
    
    public void setReasoncode(String reasoncode) {
        this.reasoncode = reasoncode;
    }


    @Column(name="SALESORGANISATION", length=20)
    public String getSalesorganisation() {
        return this.salesorganisation;
    }
    
    public void setSalesorganisation(String salesorganisation) {
        this.salesorganisation = salesorganisation;
    }


    @Column(name="REFERENCE", length=50)
    public String getReference() {
        return this.reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
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


    @Column(name="RECORDCREATIONTIME", length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InvmovmapId) ) return false;
		 InvmovmapId castOther = ( InvmovmapId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && (this.getInvmovmntpk()==castOther.getInvmovmntpk())
 && ( (this.getInvmovconpk()==castOther.getInvmovconpk()) || ( this.getInvmovconpk()!=null && castOther.getInvmovconpk()!=null && this.getInvmovconpk().equals(castOther.getInvmovconpk()) ) )
 && ( (this.getPlantfrom()==castOther.getPlantfrom()) || ( this.getPlantfrom()!=null && castOther.getPlantfrom()!=null && this.getPlantfrom().equals(castOther.getPlantfrom()) ) )
 && ( (this.getPlantto()==castOther.getPlantto()) || ( this.getPlantto()!=null && castOther.getPlantto()!=null && this.getPlantto().equals(castOther.getPlantto()) ) )
 && ( (this.getStoragelocationfrom()==castOther.getStoragelocationfrom()) || ( this.getStoragelocationfrom()!=null && castOther.getStoragelocationfrom()!=null && this.getStoragelocationfrom().equals(castOther.getStoragelocationfrom()) ) )
 && ( (this.getStoragelocationto()==castOther.getStoragelocationto()) || ( this.getStoragelocationto()!=null && castOther.getStoragelocationto()!=null && this.getStoragelocationto().equals(castOther.getStoragelocationto()) ) )
 && ( (this.getStockstatusfrom()==castOther.getStockstatusfrom()) || ( this.getStockstatusfrom()!=null && castOther.getStockstatusfrom()!=null && this.getStockstatusfrom().equals(castOther.getStockstatusfrom()) ) )
 && ( (this.getStockstatusto()==castOther.getStockstatusto()) || ( this.getStockstatusto()!=null && castOther.getStockstatusto()!=null && this.getStockstatusto().equals(castOther.getStockstatusto()) ) )
 && ( (this.getMovementcode()==castOther.getMovementcode()) || ( this.getMovementcode()!=null && castOther.getMovementcode()!=null && this.getMovementcode().equals(castOther.getMovementcode()) ) )
 && ( (this.getReasoncode()==castOther.getReasoncode()) || ( this.getReasoncode()!=null && castOther.getReasoncode()!=null && this.getReasoncode().equals(castOther.getReasoncode()) ) )
 && ( (this.getSalesorganisation()==castOther.getSalesorganisation()) || ( this.getSalesorganisation()!=null && castOther.getSalesorganisation()!=null && this.getSalesorganisation().equals(castOther.getSalesorganisation()) ) )
 && ( (this.getReference()==castOther.getReference()) || ( this.getReference()!=null && castOther.getReference()!=null && this.getReference().equals(castOther.getReference()) ) )
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
         result = 37 * result + (int) this.getInvmovmntpk();
         result = 37 * result + ( getInvmovconpk() == null ? 0 : this.getInvmovconpk().hashCode() );
         result = 37 * result + ( getPlantfrom() == null ? 0 : this.getPlantfrom().hashCode() );
         result = 37 * result + ( getPlantto() == null ? 0 : this.getPlantto().hashCode() );
         result = 37 * result + ( getStoragelocationfrom() == null ? 0 : this.getStoragelocationfrom().hashCode() );
         result = 37 * result + ( getStoragelocationto() == null ? 0 : this.getStoragelocationto().hashCode() );
         result = 37 * result + ( getStockstatusfrom() == null ? 0 : this.getStockstatusfrom().hashCode() );
         result = 37 * result + ( getStockstatusto() == null ? 0 : this.getStockstatusto().hashCode() );
         result = 37 * result + ( getMovementcode() == null ? 0 : this.getMovementcode().hashCode() );
         result = 37 * result + ( getReasoncode() == null ? 0 : this.getReasoncode().hashCode() );
         result = 37 * result + ( getSalesorganisation() == null ? 0 : this.getSalesorganisation().hashCode() );
         result = 37 * result + ( getReference() == null ? 0 : this.getReference().hashCode() );
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


