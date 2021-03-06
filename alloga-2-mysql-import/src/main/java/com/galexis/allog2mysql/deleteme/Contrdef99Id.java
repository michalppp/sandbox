package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Contrdef99Id generated by hbm2java
 */
@Embeddable
public class Contrdef99Id  implements java.io.Serializable {


     private long pk;
     private String contractor;
     private String supplier;
     private String description;

    public Contrdef99Id() {
    }

	
    public Contrdef99Id(long pk, String contractor) {
        this.pk = pk;
        this.contractor = contractor;
    }
    public Contrdef99Id(long pk, String contractor, String supplier, String description) {
       this.pk = pk;
       this.contractor = contractor;
       this.supplier = supplier;
       this.description = description;
    }
   


    @Column(name="PK", nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="CONTRACTOR", nullable=false, length=10)
    public String getContractor() {
        return this.contractor;
    }
    
    public void setContractor(String contractor) {
        this.contractor = contractor;
    }


    @Column(name="SUPPLIER", length=20)
    public String getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }


    @Column(name="DESCRIPTION", length=100)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Contrdef99Id) ) return false;
		 Contrdef99Id castOther = ( Contrdef99Id ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && ( (this.getContractor()==castOther.getContractor()) || ( this.getContractor()!=null && castOther.getContractor()!=null && this.getContractor().equals(castOther.getContractor()) ) )
 && ( (this.getSupplier()==castOther.getSupplier()) || ( this.getSupplier()!=null && castOther.getSupplier()!=null && this.getSupplier().equals(castOther.getSupplier()) ) )
 && ( (this.getDescription()==castOther.getDescription()) || ( this.getDescription()!=null && castOther.getDescription()!=null && this.getDescription().equals(castOther.getDescription()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + ( getContractor() == null ? 0 : this.getContractor().hashCode() );
         result = 37 * result + ( getSupplier() == null ? 0 : this.getSupplier().hashCode() );
         result = 37 * result + ( getDescription() == null ? 0 : this.getDescription().hashCode() );
         return result;
   }   


}


