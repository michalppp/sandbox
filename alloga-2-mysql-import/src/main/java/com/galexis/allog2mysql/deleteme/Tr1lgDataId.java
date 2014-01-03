package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Arrays;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Tr1lgDataId generated by hbm2java
 */
@Embeddable
public class Tr1lgDataId  implements java.io.Serializable {


     private Date crTime;
     private String appId;
     private String tag;
     private String taskId;
     private String transId;
     private char severity;
     private byte[] databin;
     private int segmNo;
     private String summary;
     private String messagetyp;

    public Tr1lgDataId() {
    }

    public Tr1lgDataId(Date crTime, String appId, String tag, String taskId, String transId, char severity, byte[] databin, int segmNo, String summary, String messagetyp) {
       this.crTime = crTime;
       this.appId = appId;
       this.tag = tag;
       this.taskId = taskId;
       this.transId = transId;
       this.severity = severity;
       this.databin = databin;
       this.segmNo = segmNo;
       this.summary = summary;
       this.messagetyp = messagetyp;
    }
   


    @Column(name="CR_TIME", nullable=false, length=26)
    public Date getCrTime() {
        return this.crTime;
    }
    
    public void setCrTime(Date crTime) {
        this.crTime = crTime;
    }


    @Column(name="APP_ID", nullable=false, length=10)
    public String getAppId() {
        return this.appId;
    }
    
    public void setAppId(String appId) {
        this.appId = appId;
    }


    @Column(name="TAG", nullable=false, length=80)
    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }


    @Column(name="TASK_ID", nullable=false, length=36)
    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    @Column(name="TRANS_ID", nullable=false, length=36)
    public String getTransId() {
        return this.transId;
    }
    
    public void setTransId(String transId) {
        this.transId = transId;
    }


    @Column(name="SEVERITY", nullable=false, length=1)
    public char getSeverity() {
        return this.severity;
    }
    
    public void setSeverity(char severity) {
        this.severity = severity;
    }


    @Column(name="DATABIN", nullable=false)
    public byte[] getDatabin() {
        return this.databin;
    }
    
    public void setDatabin(byte[] databin) {
        this.databin = databin;
    }


    @Column(name="SEGM_NO", nullable=false, precision=5, scale=0)
    public int getSegmNo() {
        return this.segmNo;
    }
    
    public void setSegmNo(int segmNo) {
        this.segmNo = segmNo;
    }


    @Column(name="SUMMARY", nullable=false, length=250)
    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }


    @Column(name="MESSAGETYP", nullable=false, length=50)
    public String getMessagetyp() {
        return this.messagetyp;
    }
    
    public void setMessagetyp(String messagetyp) {
        this.messagetyp = messagetyp;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Tr1lgDataId) ) return false;
		 Tr1lgDataId castOther = ( Tr1lgDataId ) other; 
         
		 return ( (this.getCrTime()==castOther.getCrTime()) || ( this.getCrTime()!=null && castOther.getCrTime()!=null && this.getCrTime().equals(castOther.getCrTime()) ) )
 && ( (this.getAppId()==castOther.getAppId()) || ( this.getAppId()!=null && castOther.getAppId()!=null && this.getAppId().equals(castOther.getAppId()) ) )
 && ( (this.getTag()==castOther.getTag()) || ( this.getTag()!=null && castOther.getTag()!=null && this.getTag().equals(castOther.getTag()) ) )
 && ( (this.getTaskId()==castOther.getTaskId()) || ( this.getTaskId()!=null && castOther.getTaskId()!=null && this.getTaskId().equals(castOther.getTaskId()) ) )
 && ( (this.getTransId()==castOther.getTransId()) || ( this.getTransId()!=null && castOther.getTransId()!=null && this.getTransId().equals(castOther.getTransId()) ) )
 && (this.getSeverity()==castOther.getSeverity())
 && ( (this.getDatabin()==castOther.getDatabin()) || ( this.getDatabin()!=null && castOther.getDatabin()!=null && Arrays.equals(this.getDatabin(), castOther.getDatabin()) ) )
 && (this.getSegmNo()==castOther.getSegmNo())
 && ( (this.getSummary()==castOther.getSummary()) || ( this.getSummary()!=null && castOther.getSummary()!=null && this.getSummary().equals(castOther.getSummary()) ) )
 && ( (this.getMessagetyp()==castOther.getMessagetyp()) || ( this.getMessagetyp()!=null && castOther.getMessagetyp()!=null && this.getMessagetyp().equals(castOther.getMessagetyp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCrTime() == null ? 0 : this.getCrTime().hashCode() );
         result = 37 * result + ( getAppId() == null ? 0 : this.getAppId().hashCode() );
         result = 37 * result + ( getTag() == null ? 0 : this.getTag().hashCode() );
         result = 37 * result + ( getTaskId() == null ? 0 : this.getTaskId().hashCode() );
         result = 37 * result + ( getTransId() == null ? 0 : this.getTransId().hashCode() );
         result = 37 * result + this.getSeverity();
         result = 37 * result + ( getDatabin() == null ? 0 : Arrays.hashCode(this.getDatabin()) );
         result = 37 * result + this.getSegmNo();
         result = 37 * result + ( getSummary() == null ? 0 : this.getSummary().hashCode() );
         result = 37 * result + ( getMessagetyp() == null ? 0 : this.getMessagetyp().hashCode() );
         return result;
   }   


}


