package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BizwebfunlId generated by hbm2java
 */
@Embeddable
public class BizwebfunlId  implements java.io.Serializable {


     private long pk;
     private long bizwebfunhpk;
     private String attributename;
     private String attributevalue;
     private String attributetype;
     private String attributedescription;
     private String userid;
     private Date recordlastchangetime;
     private Date recordcreationtime;

    public BizwebfunlId() {
    }

	
    public BizwebfunlId(long pk, long bizwebfunhpk, Date recordcreationtime) {
        this.pk = pk;
        this.bizwebfunhpk = bizwebfunhpk;
        this.recordcreationtime = recordcreationtime;
    }
    public BizwebfunlId(long pk, long bizwebfunhpk, String attributename, String attributevalue, String attributetype, String attributedescription, String userid, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.bizwebfunhpk = bizwebfunhpk;
       this.attributename = attributename;
       this.attributevalue = attributevalue;
       this.attributetype = attributetype;
       this.attributedescription = attributedescription;
       this.userid = userid;
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


    @Column(name="BIZWEBFUNHPK", nullable=false, precision=12, scale=0)
    public long getBizwebfunhpk() {
        return this.bizwebfunhpk;
    }
    
    public void setBizwebfunhpk(long bizwebfunhpk) {
        this.bizwebfunhpk = bizwebfunhpk;
    }


    @Column(name="ATTRIBUTENAME", length=50)
    public String getAttributename() {
        return this.attributename;
    }
    
    public void setAttributename(String attributename) {
        this.attributename = attributename;
    }


    @Column(name="ATTRIBUTEVALUE", length=50)
    public String getAttributevalue() {
        return this.attributevalue;
    }
    
    public void setAttributevalue(String attributevalue) {
        this.attributevalue = attributevalue;
    }


    @Column(name="ATTRIBUTETYPE", length=20)
    public String getAttributetype() {
        return this.attributetype;
    }
    
    public void setAttributetype(String attributetype) {
        this.attributetype = attributetype;
    }


    @Column(name="ATTRIBUTEDESCRIPTION", length=100)
    public String getAttributedescription() {
        return this.attributedescription;
    }
    
    public void setAttributedescription(String attributedescription) {
        this.attributedescription = attributedescription;
    }


    @Column(name="USERID", length=10)
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
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
		 if ( !(other instanceof BizwebfunlId) ) return false;
		 BizwebfunlId castOther = ( BizwebfunlId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && (this.getBizwebfunhpk()==castOther.getBizwebfunhpk())
 && ( (this.getAttributename()==castOther.getAttributename()) || ( this.getAttributename()!=null && castOther.getAttributename()!=null && this.getAttributename().equals(castOther.getAttributename()) ) )
 && ( (this.getAttributevalue()==castOther.getAttributevalue()) || ( this.getAttributevalue()!=null && castOther.getAttributevalue()!=null && this.getAttributevalue().equals(castOther.getAttributevalue()) ) )
 && ( (this.getAttributetype()==castOther.getAttributetype()) || ( this.getAttributetype()!=null && castOther.getAttributetype()!=null && this.getAttributetype().equals(castOther.getAttributetype()) ) )
 && ( (this.getAttributedescription()==castOther.getAttributedescription()) || ( this.getAttributedescription()!=null && castOther.getAttributedescription()!=null && this.getAttributedescription().equals(castOther.getAttributedescription()) ) )
 && ( (this.getUserid()==castOther.getUserid()) || ( this.getUserid()!=null && castOther.getUserid()!=null && this.getUserid().equals(castOther.getUserid()) ) )
 && ( (this.getRecordlastchangetime()==castOther.getRecordlastchangetime()) || ( this.getRecordlastchangetime()!=null && castOther.getRecordlastchangetime()!=null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime()) ) )
 && ( (this.getRecordcreationtime()==castOther.getRecordcreationtime()) || ( this.getRecordcreationtime()!=null && castOther.getRecordcreationtime()!=null && this.getRecordcreationtime().equals(castOther.getRecordcreationtime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + (int) this.getBizwebfunhpk();
         result = 37 * result + ( getAttributename() == null ? 0 : this.getAttributename().hashCode() );
         result = 37 * result + ( getAttributevalue() == null ? 0 : this.getAttributevalue().hashCode() );
         result = 37 * result + ( getAttributetype() == null ? 0 : this.getAttributetype().hashCode() );
         result = 37 * result + ( getAttributedescription() == null ? 0 : this.getAttributedescription().hashCode() );
         result = 37 * result + ( getUserid() == null ? 0 : this.getUserid().hashCode() );
         result = 37 * result + ( getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode() );
         result = 37 * result + ( getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode() );
         return result;
   }   


}


