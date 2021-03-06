package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ItemjrnentId generated by hbm2java
 */
@Embeddable
public class ItemjrnentId  implements java.io.Serializable {


     private long pk;
     private String tablename;
     private String fieldname;

    public ItemjrnentId() {
    }

	
    public ItemjrnentId(long pk, String tablename) {
        this.pk = pk;
        this.tablename = tablename;
    }
    public ItemjrnentId(long pk, String tablename, String fieldname) {
       this.pk = pk;
       this.tablename = tablename;
       this.fieldname = fieldname;
    }
   


    @Column(name="PK", unique=true, nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="TABLENAME", nullable=false, length=10)
    public String getTablename() {
        return this.tablename;
    }
    
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }


    @Column(name="FIELDNAME", length=10)
    public String getFieldname() {
        return this.fieldname;
    }
    
    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ItemjrnentId) ) return false;
		 ItemjrnentId castOther = ( ItemjrnentId ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && ( (this.getTablename()==castOther.getTablename()) || ( this.getTablename()!=null && castOther.getTablename()!=null && this.getTablename().equals(castOther.getTablename()) ) )
 && ( (this.getFieldname()==castOther.getFieldname()) || ( this.getFieldname()!=null && castOther.getFieldname()!=null && this.getFieldname().equals(castOther.getFieldname()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + ( getTablename() == null ? 0 : this.getTablename().hashCode() );
         result = 37 * result + ( getFieldname() == null ? 0 : this.getFieldname().hashCode() );
         return result;
   }   


}


