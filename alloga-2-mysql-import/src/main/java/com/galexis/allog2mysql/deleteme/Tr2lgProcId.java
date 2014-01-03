package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Tr2lgProcId generated by hbm2java
 */
@Embeddable
public class Tr2lgProcId  implements java.io.Serializable {


     private Date crTime;
     private String serverId;
     private String appId;
     private String tag;
     private String messagetyp;
     private String messagever;
     private String taskId;
     private String refId;
     private String transId;
     private String partnerId;
     private String clientId;
     private char severity;
     private String info;
     private String summary;

    public Tr2lgProcId() {
    }

    public Tr2lgProcId(Date crTime, String serverId, String appId, String tag, String messagetyp, String messagever, String taskId, String refId, String transId, String partnerId, String clientId, char severity, String info, String summary) {
       this.crTime = crTime;
       this.serverId = serverId;
       this.appId = appId;
       this.tag = tag;
       this.messagetyp = messagetyp;
       this.messagever = messagever;
       this.taskId = taskId;
       this.refId = refId;
       this.transId = transId;
       this.partnerId = partnerId;
       this.clientId = clientId;
       this.severity = severity;
       this.info = info;
       this.summary = summary;
    }
   


    @Column(name="CR_TIME", nullable=false, length=26)
    public Date getCrTime() {
        return this.crTime;
    }
    
    public void setCrTime(Date crTime) {
        this.crTime = crTime;
    }


    @Column(name="SERVER_ID", nullable=false, length=10)
    public String getServerId() {
        return this.serverId;
    }
    
    public void setServerId(String serverId) {
        this.serverId = serverId;
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


    @Column(name="MESSAGETYP", nullable=false, length=50)
    public String getMessagetyp() {
        return this.messagetyp;
    }
    
    public void setMessagetyp(String messagetyp) {
        this.messagetyp = messagetyp;
    }


    @Column(name="MESSAGEVER", nullable=false, length=5)
    public String getMessagever() {
        return this.messagever;
    }
    
    public void setMessagever(String messagever) {
        this.messagever = messagever;
    }


    @Column(name="TASK_ID", nullable=false, length=36)
    public String getTaskId() {
        return this.taskId;
    }
    
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }


    @Column(name="REF_ID", nullable=false, length=50)
    public String getRefId() {
        return this.refId;
    }
    
    public void setRefId(String refId) {
        this.refId = refId;
    }


    @Column(name="TRANS_ID", nullable=false, length=36)
    public String getTransId() {
        return this.transId;
    }
    
    public void setTransId(String transId) {
        this.transId = transId;
    }


    @Column(name="PARTNER_ID", nullable=false, length=50)
    public String getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }


    @Column(name="CLIENT_ID", nullable=false, length=30)
    public String getClientId() {
        return this.clientId;
    }
    
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }


    @Column(name="SEVERITY", nullable=false, length=1)
    public char getSeverity() {
        return this.severity;
    }
    
    public void setSeverity(char severity) {
        this.severity = severity;
    }


    @Column(name="INFO", nullable=false, length=2048)
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(String info) {
        this.info = info;
    }


    @Column(name="SUMMARY", nullable=false, length=250)
    public String getSummary() {
        return this.summary;
    }
    
    public void setSummary(String summary) {
        this.summary = summary;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Tr2lgProcId) ) return false;
		 Tr2lgProcId castOther = ( Tr2lgProcId ) other; 
         
		 return ( (this.getCrTime()==castOther.getCrTime()) || ( this.getCrTime()!=null && castOther.getCrTime()!=null && this.getCrTime().equals(castOther.getCrTime()) ) )
 && ( (this.getServerId()==castOther.getServerId()) || ( this.getServerId()!=null && castOther.getServerId()!=null && this.getServerId().equals(castOther.getServerId()) ) )
 && ( (this.getAppId()==castOther.getAppId()) || ( this.getAppId()!=null && castOther.getAppId()!=null && this.getAppId().equals(castOther.getAppId()) ) )
 && ( (this.getTag()==castOther.getTag()) || ( this.getTag()!=null && castOther.getTag()!=null && this.getTag().equals(castOther.getTag()) ) )
 && ( (this.getMessagetyp()==castOther.getMessagetyp()) || ( this.getMessagetyp()!=null && castOther.getMessagetyp()!=null && this.getMessagetyp().equals(castOther.getMessagetyp()) ) )
 && ( (this.getMessagever()==castOther.getMessagever()) || ( this.getMessagever()!=null && castOther.getMessagever()!=null && this.getMessagever().equals(castOther.getMessagever()) ) )
 && ( (this.getTaskId()==castOther.getTaskId()) || ( this.getTaskId()!=null && castOther.getTaskId()!=null && this.getTaskId().equals(castOther.getTaskId()) ) )
 && ( (this.getRefId()==castOther.getRefId()) || ( this.getRefId()!=null && castOther.getRefId()!=null && this.getRefId().equals(castOther.getRefId()) ) )
 && ( (this.getTransId()==castOther.getTransId()) || ( this.getTransId()!=null && castOther.getTransId()!=null && this.getTransId().equals(castOther.getTransId()) ) )
 && ( (this.getPartnerId()==castOther.getPartnerId()) || ( this.getPartnerId()!=null && castOther.getPartnerId()!=null && this.getPartnerId().equals(castOther.getPartnerId()) ) )
 && ( (this.getClientId()==castOther.getClientId()) || ( this.getClientId()!=null && castOther.getClientId()!=null && this.getClientId().equals(castOther.getClientId()) ) )
 && (this.getSeverity()==castOther.getSeverity())
 && ( (this.getInfo()==castOther.getInfo()) || ( this.getInfo()!=null && castOther.getInfo()!=null && this.getInfo().equals(castOther.getInfo()) ) )
 && ( (this.getSummary()==castOther.getSummary()) || ( this.getSummary()!=null && castOther.getSummary()!=null && this.getSummary().equals(castOther.getSummary()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getCrTime() == null ? 0 : this.getCrTime().hashCode() );
         result = 37 * result + ( getServerId() == null ? 0 : this.getServerId().hashCode() );
         result = 37 * result + ( getAppId() == null ? 0 : this.getAppId().hashCode() );
         result = 37 * result + ( getTag() == null ? 0 : this.getTag().hashCode() );
         result = 37 * result + ( getMessagetyp() == null ? 0 : this.getMessagetyp().hashCode() );
         result = 37 * result + ( getMessagever() == null ? 0 : this.getMessagever().hashCode() );
         result = 37 * result + ( getTaskId() == null ? 0 : this.getTaskId().hashCode() );
         result = 37 * result + ( getRefId() == null ? 0 : this.getRefId().hashCode() );
         result = 37 * result + ( getTransId() == null ? 0 : this.getTransId().hashCode() );
         result = 37 * result + ( getPartnerId() == null ? 0 : this.getPartnerId().hashCode() );
         result = 37 * result + ( getClientId() == null ? 0 : this.getClientId().hashCode() );
         result = 37 * result + this.getSeverity();
         result = 37 * result + ( getInfo() == null ? 0 : this.getInfo().hashCode() );
         result = 37 * result + ( getSummary() == null ? 0 : this.getSummary().hashCode() );
         return result;
   }   


}


