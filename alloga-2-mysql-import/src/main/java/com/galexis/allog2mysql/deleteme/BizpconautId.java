package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BizpconautId generated by hbm2java
 */
@Embeddable
public class BizpconautId  implements java.io.Serializable {


     private long pk;
     private long bizpmasterpk;
     private long contrdefpk;
     private String isactiveflag;
     private String programname;
     private String filename;
     private Date recordlastchangetime;
     private Date recordcreationtime;

    public BizpconautId() {
    }

	
    public BizpconautId(long pk, long bizpmasterpk, long contrdefpk, Date recordcreationtime) {
        this.pk = pk;
        this.bizpmasterpk = bizpmasterpk;
        this.contrdefpk = contrdefpk;
        this.recordcreationtime = recordcreationtime;
    }
    public BizpconautId(long pk, long bizpmasterpk, long contrdefpk, String isactiveflag, String programname, String filename, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.bizpmasterpk = bizpmasterpk;
       this.contrdefpk = contrdefpk;
       this.isactiveflag = isactiveflag;
       this.programname = programname;
       this.filename = filename;
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


    @Column(name="BIZPMASTERPK", nullable=false, precision=12, scale=0)
    public long getBizpmasterpk() {
        return this.bizpmasterpk;
    }
    
    public void setBizpmasterpk(long bizpmasterpk) {
        this.bizpmasterpk = bizpmasterpk;
    }


    @Column(name="CONTRDEFPK", nullable=false, precision=12, scale=0)
    public long getContrdefpk() {
        return this.contrdefpk;
    }
    
    public void setContrdefpk(long contrdefpk) {
        this.contrdefpk = contrdefpk;
    }


    @Column(name="ISACTIVEFLAG", length=1)
    public String getIsactiveflag() {
        return this.isactiveflag;
    }
    
    public void setIsactiveflag(String isactiveflag) {
        this.isactiveflag = isactiveflag;
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
		 if ( !(other instanceof BizpconautId) ) return false;
		 BizpconautId castOther = ( BizpconautId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && (this.getBizpmasterpk()==castOther.getBizpmasterpk())
 && (this.getContrdefpk()==castOther.getContrdefpk())
 && ( (this.getIsactiveflag()==castOther.getIsactiveflag()) || ( this.getIsactiveflag()!=null && castOther.getIsactiveflag()!=null && this.getIsactiveflag().equals(castOther.getIsactiveflag()) ) )
 && ( (this.getProgramname()==castOther.getProgramname()) || ( this.getProgramname()!=null && castOther.getProgramname()!=null && this.getProgramname().equals(castOther.getProgramname()) ) )
 && ( (this.getFilename()==castOther.getFilename()) || ( this.getFilename()!=null && castOther.getFilename()!=null && this.getFilename().equals(castOther.getFilename()) ) )
 && ( (this.getRecordlastchangetime()==castOther.getRecordlastchangetime()) || ( this.getRecordlastchangetime()!=null && castOther.getRecordlastchangetime()!=null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime()) ) )
 && ( (this.getRecordcreationtime()==castOther.getRecordcreationtime()) || ( this.getRecordcreationtime()!=null && castOther.getRecordcreationtime()!=null && this.getRecordcreationtime().equals(castOther.getRecordcreationtime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + (int) this.getBizpmasterpk();
         result = 37 * result + (int) this.getContrdefpk();
         result = 37 * result + ( getIsactiveflag() == null ? 0 : this.getIsactiveflag().hashCode() );
         result = 37 * result + ( getProgramname() == null ? 0 : this.getProgramname().hashCode() );
         result = 37 * result + ( getFilename() == null ? 0 : this.getFilename().hashCode() );
         result = 37 * result + ( getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode() );
         result = 37 * result + ( getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode() );
         return result;
   }   


}

