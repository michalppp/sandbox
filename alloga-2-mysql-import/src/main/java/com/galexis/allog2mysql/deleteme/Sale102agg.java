package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Sale102agg generated by hbm2java
 */
@Entity
@Table(name="SALE102AGG"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"CONTRDEFPK", "TDYEAR", "TDMONTH", "ITEMNR", "ITEMNRCONTRACTOR"}) 
)
public class Sale102agg  implements java.io.Serializable {


     private Sale102aggId id;

    public Sale102agg() {
    }

    public Sale102agg(Sale102aggId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="contrdefpk", column=@Column(name="CONTRDEFPK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="tdyear", column=@Column(name="TDYEAR", nullable=false, precision=4, scale=0) ), 
        @AttributeOverride(name="tdmonth", column=@Column(name="TDMONTH", nullable=false, precision=2, scale=0) ), 
        @AttributeOverride(name="actualperiod", column=@Column(name="ACTUALPERIOD", nullable=false, precision=6, scale=0) ), 
        @AttributeOverride(name="itemnr", column=@Column(name="ITEMNR", nullable=false, length=35) ), 
        @AttributeOverride(name="itemnrcontractor", column=@Column(name="ITEMNRCONTRACTOR", length=35) ), 
        @AttributeOverride(name="grosssales", column=@Column(name="GROSSSALES", precision=17, scale=4) ), 
        @AttributeOverride(name="netsales", column=@Column(name="NETSALES", precision=17, scale=4) ), 
        @AttributeOverride(name="qtyinvoiced", column=@Column(name="QTYINVOICED", precision=15, scale=3) ), 
        @AttributeOverride(name="focqtysamples", column=@Column(name="FOCQTYSAMPLES", precision=15, scale=3) ), 
        @AttributeOverride(name="focqtybonus", column=@Column(name="FOCQTYBONUS", precision=15, scale=3) ), 
        @AttributeOverride(name="focqtyreplacement", column=@Column(name="FOCQTYREPLACEMENT", precision=15, scale=3) ), 
        @AttributeOverride(name="focqtynoreason", column=@Column(name="FOCQTYNOREASON", precision=15, scale=3) ), 
        @AttributeOverride(name="focqtyotherreasons", column=@Column(name="FOCQTYOTHERREASONS", precision=15, scale=3) ), 
        @AttributeOverride(name="processingflag1", column=@Column(name="PROCESSINGFLAG1", length=1) ), 
        @AttributeOverride(name="processingflag2", column=@Column(name="PROCESSINGFLAG2", length=1) ), 
        @AttributeOverride(name="processingflag3", column=@Column(name="PROCESSINGFLAG3", length=1) ), 
        @AttributeOverride(name="processingflag4", column=@Column(name="PROCESSINGFLAG4", length=1) ), 
        @AttributeOverride(name="processingflag5", column=@Column(name="PROCESSINGFLAG5", length=1) ), 
        @AttributeOverride(name="processingflag6", column=@Column(name="PROCESSINGFLAG6", length=1) ), 
        @AttributeOverride(name="processingflag7", column=@Column(name="PROCESSINGFLAG7", length=1) ), 
        @AttributeOverride(name="processingflag8", column=@Column(name="PROCESSINGFLAG8", length=1) ), 
        @AttributeOverride(name="processingflag9", column=@Column(name="PROCESSINGFLAG9", length=1) ), 
        @AttributeOverride(name="processingflag10", column=@Column(name="PROCESSINGFLAG10", length=1) ), 
        @AttributeOverride(name="outboundignore", column=@Column(name="OUTBOUNDIGNORE", nullable=false, length=1) ), 
        @AttributeOverride(name="recordprocessedflag", column=@Column(name="RECORDPROCESSEDFLAG", nullable=false, length=1) ), 
        @AttributeOverride(name="recordprocessingtime", column=@Column(name="RECORDPROCESSINGTIME", length=26) ), 
        @AttributeOverride(name="recordlastchangetime", column=@Column(name="RECORDLASTCHANGETIME", length=26) ), 
        @AttributeOverride(name="recordcreationtime", column=@Column(name="RECORDCREATIONTIME", nullable=false, length=26) ) } )
    public Sale102aggId getId() {
        return this.id;
    }
    
    public void setId(Sale102aggId id) {
        this.id = id;
    }




}


