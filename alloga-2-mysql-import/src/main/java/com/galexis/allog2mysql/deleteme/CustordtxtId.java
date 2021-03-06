package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CustordtxtId generated by hbm2java
 */
@Embeddable
public class CustordtxtId  implements java.io.Serializable {


     private long pk;
     private Long custordhdrpk;
     private Long custordlinpk;
     private int textsequencenr;
     private String textid;
     private String text;
     private String transactionid;
     private Date timestampreceived;
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

    public CustordtxtId() {
    }

	
    public CustordtxtId(long pk, int textsequencenr, Date recordcreationtime) {
        this.pk = pk;
        this.textsequencenr = textsequencenr;
        this.recordcreationtime = recordcreationtime;
    }
    public CustordtxtId(long pk, Long custordhdrpk, Long custordlinpk, int textsequencenr, String textid, String text, String transactionid, Date timestampreceived, String programname, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.custordhdrpk = custordhdrpk;
       this.custordlinpk = custordlinpk;
       this.textsequencenr = textsequencenr;
       this.textid = textid;
       this.text = text;
       this.transactionid = transactionid;
       this.timestampreceived = timestampreceived;
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
    }
   


    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="CUSTORDHDRPK", precision=12, scale=0)
    public Long getCustordhdrpk() {
        return this.custordhdrpk;
    }
    
    public void setCustordhdrpk(Long custordhdrpk) {
        this.custordhdrpk = custordhdrpk;
    }


    @Column(name="CUSTORDLINPK", precision=12, scale=0)
    public Long getCustordlinpk() {
        return this.custordlinpk;
    }
    
    public void setCustordlinpk(Long custordlinpk) {
        this.custordlinpk = custordlinpk;
    }


    @Column(name="TEXTSEQUENCENR", nullable=false, precision=6, scale=0)
    public int getTextsequencenr() {
        return this.textsequencenr;
    }
    
    public void setTextsequencenr(int textsequencenr) {
        this.textsequencenr = textsequencenr;
    }


    @Column(name="TEXTID", length=10)
    public String getTextid() {
        return this.textid;
    }
    
    public void setTextid(String textid) {
        this.textid = textid;
    }


    @Column(name="TEXT", length=100)
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }


    @Column(name="TRANSACTIONID", length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }


    @Column(name="TIMESTAMPRECEIVED", length=26)
    public Date getTimestampreceived() {
        return this.timestampreceived;
    }
    
    public void setTimestampreceived(Date timestampreceived) {
        this.timestampreceived = timestampreceived;
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


    @Column(name="RECORDPROCESSINGTIME", length=26)
    public Date getRecordprocessingtime() {
        return this.recordprocessingtime;
    }
    
    public void setRecordprocessingtime(Date recordprocessingtime) {
        this.recordprocessingtime = recordprocessingtime;
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
		 if ( !(other instanceof CustordtxtId) ) return false;
		 CustordtxtId castOther = ( CustordtxtId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && ( (this.getCustordhdrpk()==castOther.getCustordhdrpk()) || ( this.getCustordhdrpk()!=null && castOther.getCustordhdrpk()!=null && this.getCustordhdrpk().equals(castOther.getCustordhdrpk()) ) )
 && ( (this.getCustordlinpk()==castOther.getCustordlinpk()) || ( this.getCustordlinpk()!=null && castOther.getCustordlinpk()!=null && this.getCustordlinpk().equals(castOther.getCustordlinpk()) ) )
 && (this.getTextsequencenr()==castOther.getTextsequencenr())
 && ( (this.getTextid()==castOther.getTextid()) || ( this.getTextid()!=null && castOther.getTextid()!=null && this.getTextid().equals(castOther.getTextid()) ) )
 && ( (this.getText()==castOther.getText()) || ( this.getText()!=null && castOther.getText()!=null && this.getText().equals(castOther.getText()) ) )
 && ( (this.getTransactionid()==castOther.getTransactionid()) || ( this.getTransactionid()!=null && castOther.getTransactionid()!=null && this.getTransactionid().equals(castOther.getTransactionid()) ) )
 && ( (this.getTimestampreceived()==castOther.getTimestampreceived()) || ( this.getTimestampreceived()!=null && castOther.getTimestampreceived()!=null && this.getTimestampreceived().equals(castOther.getTimestampreceived()) ) )
 && ( (this.getProgramname()==castOther.getProgramname()) || ( this.getProgramname()!=null && castOther.getProgramname()!=null && this.getProgramname().equals(castOther.getProgramname()) ) )
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
 && ( (this.getRecordprocessedflag()==castOther.getRecordprocessedflag()) || ( this.getRecordprocessedflag()!=null && castOther.getRecordprocessedflag()!=null && this.getRecordprocessedflag().equals(castOther.getRecordprocessedflag()) ) )
 && ( (this.getRecordprocessingtime()==castOther.getRecordprocessingtime()) || ( this.getRecordprocessingtime()!=null && castOther.getRecordprocessingtime()!=null && this.getRecordprocessingtime().equals(castOther.getRecordprocessingtime()) ) )
 && ( (this.getRecordlastchangetime()==castOther.getRecordlastchangetime()) || ( this.getRecordlastchangetime()!=null && castOther.getRecordlastchangetime()!=null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime()) ) )
 && ( (this.getRecordcreationtime()==castOther.getRecordcreationtime()) || ( this.getRecordcreationtime()!=null && castOther.getRecordcreationtime()!=null && this.getRecordcreationtime().equals(castOther.getRecordcreationtime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + ( getCustordhdrpk() == null ? 0 : this.getCustordhdrpk().hashCode() );
         result = 37 * result + ( getCustordlinpk() == null ? 0 : this.getCustordlinpk().hashCode() );
         result = 37 * result + this.getTextsequencenr();
         result = 37 * result + ( getTextid() == null ? 0 : this.getTextid().hashCode() );
         result = 37 * result + ( getText() == null ? 0 : this.getText().hashCode() );
         result = 37 * result + ( getTransactionid() == null ? 0 : this.getTransactionid().hashCode() );
         result = 37 * result + ( getTimestampreceived() == null ? 0 : this.getTimestampreceived().hashCode() );
         result = 37 * result + ( getProgramname() == null ? 0 : this.getProgramname().hashCode() );
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
         result = 37 * result + ( getRecordprocessedflag() == null ? 0 : this.getRecordprocessedflag().hashCode() );
         result = 37 * result + ( getRecordprocessingtime() == null ? 0 : this.getRecordprocessingtime().hashCode() );
         result = 37 * result + ( getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode() );
         result = 37 * result + ( getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode() );
         return result;
   }   


}


