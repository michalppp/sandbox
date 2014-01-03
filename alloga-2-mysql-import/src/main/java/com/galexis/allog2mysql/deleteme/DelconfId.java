package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * DelconfId generated by hbm2java
 */
@Embeddable
public class DelconfId  implements java.io.Serializable {


     private long pk;
     private String mandant;
     private String pvsshipmentno;
     private String confirmationdate;
     private String confirmationtime;
     private String signature;
     private String transactionid;
     private char recordprocessedflag;
     private Date recordprocessingtime;
     private Date creationtimestamp;

    public DelconfId() {
    }

    public DelconfId(long pk, String mandant, String pvsshipmentno, String confirmationdate, String confirmationtime, String signature, String transactionid, char recordprocessedflag, Date recordprocessingtime, Date creationtimestamp) {
       this.pk = pk;
       this.mandant = mandant;
       this.pvsshipmentno = pvsshipmentno;
       this.confirmationdate = confirmationdate;
       this.confirmationtime = confirmationtime;
       this.signature = signature;
       this.transactionid = transactionid;
       this.recordprocessedflag = recordprocessedflag;
       this.recordprocessingtime = recordprocessingtime;
       this.creationtimestamp = creationtimestamp;
    }
   


    @Column(name="PK", nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="MANDANT", nullable=false, length=40)
    public String getMandant() {
        return this.mandant;
    }
    
    public void setMandant(String mandant) {
        this.mandant = mandant;
    }


    @Column(name="PVSSHIPMENTNO", nullable=false, length=40)
    public String getPvsshipmentno() {
        return this.pvsshipmentno;
    }
    
    public void setPvsshipmentno(String pvsshipmentno) {
        this.pvsshipmentno = pvsshipmentno;
    }


    @Column(name="CONFIRMATIONDATE", nullable=false, length=8)
    public String getConfirmationdate() {
        return this.confirmationdate;
    }
    
    public void setConfirmationdate(String confirmationdate) {
        this.confirmationdate = confirmationdate;
    }


    @Column(name="CONFIRMATIONTIME", nullable=false, length=6)
    public String getConfirmationtime() {
        return this.confirmationtime;
    }
    
    public void setConfirmationtime(String confirmationtime) {
        this.confirmationtime = confirmationtime;
    }


    @Column(name="SIGNATURE", nullable=false, length=40)
    public String getSignature() {
        return this.signature;
    }
    
    public void setSignature(String signature) {
        this.signature = signature;
    }


    @Column(name="TRANSACTIONID", nullable=false, length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }


    @Column(name="RECORDPROCESSEDFLAG", nullable=false, length=1)
    public char getRecordprocessedflag() {
        return this.recordprocessedflag;
    }
    
    public void setRecordprocessedflag(char recordprocessedflag) {
        this.recordprocessedflag = recordprocessedflag;
    }


    @Column(name="RECORDPROCESSINGTIME", nullable=false, length=26)
    public Date getRecordprocessingtime() {
        return this.recordprocessingtime;
    }
    
    public void setRecordprocessingtime(Date recordprocessingtime) {
        this.recordprocessingtime = recordprocessingtime;
    }


    @Column(name="CREATIONTIMESTAMP", nullable=false, length=26)
    public Date getCreationtimestamp() {
        return this.creationtimestamp;
    }
    
    public void setCreationtimestamp(Date creationtimestamp) {
        this.creationtimestamp = creationtimestamp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DelconfId) ) return false;
		 DelconfId castOther = ( DelconfId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && ( (this.getMandant()==castOther.getMandant()) || ( this.getMandant()!=null && castOther.getMandant()!=null && this.getMandant().equals(castOther.getMandant()) ) )
 && ( (this.getPvsshipmentno()==castOther.getPvsshipmentno()) || ( this.getPvsshipmentno()!=null && castOther.getPvsshipmentno()!=null && this.getPvsshipmentno().equals(castOther.getPvsshipmentno()) ) )
 && ( (this.getConfirmationdate()==castOther.getConfirmationdate()) || ( this.getConfirmationdate()!=null && castOther.getConfirmationdate()!=null && this.getConfirmationdate().equals(castOther.getConfirmationdate()) ) )
 && ( (this.getConfirmationtime()==castOther.getConfirmationtime()) || ( this.getConfirmationtime()!=null && castOther.getConfirmationtime()!=null && this.getConfirmationtime().equals(castOther.getConfirmationtime()) ) )
 && ( (this.getSignature()==castOther.getSignature()) || ( this.getSignature()!=null && castOther.getSignature()!=null && this.getSignature().equals(castOther.getSignature()) ) )
 && ( (this.getTransactionid()==castOther.getTransactionid()) || ( this.getTransactionid()!=null && castOther.getTransactionid()!=null && this.getTransactionid().equals(castOther.getTransactionid()) ) )
 && (this.getRecordprocessedflag()==castOther.getRecordprocessedflag())
 && ( (this.getRecordprocessingtime()==castOther.getRecordprocessingtime()) || ( this.getRecordprocessingtime()!=null && castOther.getRecordprocessingtime()!=null && this.getRecordprocessingtime().equals(castOther.getRecordprocessingtime()) ) )
 && ( (this.getCreationtimestamp()==castOther.getCreationtimestamp()) || ( this.getCreationtimestamp()!=null && castOther.getCreationtimestamp()!=null && this.getCreationtimestamp().equals(castOther.getCreationtimestamp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + ( getMandant() == null ? 0 : this.getMandant().hashCode() );
         result = 37 * result + ( getPvsshipmentno() == null ? 0 : this.getPvsshipmentno().hashCode() );
         result = 37 * result + ( getConfirmationdate() == null ? 0 : this.getConfirmationdate().hashCode() );
         result = 37 * result + ( getConfirmationtime() == null ? 0 : this.getConfirmationtime().hashCode() );
         result = 37 * result + ( getSignature() == null ? 0 : this.getSignature().hashCode() );
         result = 37 * result + ( getTransactionid() == null ? 0 : this.getTransactionid().hashCode() );
         result = 37 * result + this.getRecordprocessedflag();
         result = 37 * result + ( getRecordprocessingtime() == null ? 0 : this.getRecordprocessingtime().hashCode() );
         result = 37 * result + ( getCreationtimestamp() == null ? 0 : this.getCreationtimestamp().hashCode() );
         return result;
   }   


}


