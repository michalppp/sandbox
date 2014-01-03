package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Itemmasi01 generated by hbm2java
 */
@Entity
@Table(name="ITEMMASI01"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
)
public class Itemmasi01  implements java.io.Serializable {


     private Itemmasi01Id id;

    public Itemmasi01() {
    }

    public Itemmasi01(Itemmasi01Id id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="pk", column=@Column(name="PK", nullable=false, precision=12, scale=0) ), 
        @AttributeOverride(name="itemnr", column=@Column(name="ITEMNR", nullable=false, length=35) ), 
        @AttributeOverride(name="itemnrcontractor", column=@Column(name="ITEMNRCONTRACTOR", length=35) ), 
        @AttributeOverride(name="ean", column=@Column(name="EAN", length=35) ), 
        @AttributeOverride(name="pharmacode", column=@Column(name="PHARMACODE", length=35) ), 
        @AttributeOverride(name="description", column=@Column(name="DESCRIPTION", length=50) ), 
        @AttributeOverride(name="descriptionfrench", column=@Column(name="DESCRIPTIONFRENCH", length=50) ), 
        @AttributeOverride(name="productgroup", column=@Column(name="PRODUCTGROUP", length=5) ), 
        @AttributeOverride(name="productgroupdesc", column=@Column(name="PRODUCTGROUPDESC", length=50) ), 
        @AttributeOverride(name="itemfamily", column=@Column(name="ITEMFAMILY", length=5) ), 
        @AttributeOverride(name="itemsubfamily", column=@Column(name="ITEMSUBFAMILY", length=5) ), 
        @AttributeOverride(name="supplieritemgroup", column=@Column(name="SUPPLIERITEMGROUP", length=10) ), 
        @AttributeOverride(name="mainsupplier", column=@Column(name="MAINSUPPLIER", length=20) ), 
        @AttributeOverride(name="mainsuppliername", column=@Column(name="MAINSUPPLIERNAME", length=50) ), 
        @AttributeOverride(name="secondsupplier", column=@Column(name="SECONDSUPPLIER", length=20) ), 
        @AttributeOverride(name="manufacturer", column=@Column(name="MANUFACTURER", length=20) ), 
        @AttributeOverride(name="manufacturername", column=@Column(name="MANUFACTURERNAME", length=50) ), 
        @AttributeOverride(name="replecemntitem", column=@Column(name="REPLECEMNTITEM", length=35) ), 
        @AttributeOverride(name="bookkeepingnr", column=@Column(name="BOOKKEEPINGNR", precision=9, scale=0) ), 
        @AttributeOverride(name="bookkeepingnrdesc", column=@Column(name="BOOKKEEPINGNRDESC", length=50) ), 
        @AttributeOverride(name="salesorganisation", column=@Column(name="SALESORGANISATION", length=30) ), 
        @AttributeOverride(name="salesorganisationdesc", column=@Column(name="SALESORGANISATIONDESC", length=50) ), 
        @AttributeOverride(name="standardcost", column=@Column(name="STANDARDCOST", precision=17, scale=4) ), 
        @AttributeOverride(name="legalsecuritystock", column=@Column(name="LEGALSECURITYSTOCK", precision=15, scale=3) ), 
        @AttributeOverride(name="minimumstock", column=@Column(name="MINIMUMSTOCK", precision=15, scale=3) ), 
        @AttributeOverride(name="batchsecuritydays", column=@Column(name="BATCHSECURITYDAYS", precision=4, scale=0) ), 
        @AttributeOverride(name="category1", column=@Column(name="CATEGORY1", length=10) ), 
        @AttributeOverride(name="category2", column=@Column(name="CATEGORY2", length=10) ), 
        @AttributeOverride(name="category3", column=@Column(name="CATEGORY3", length=10) ), 
        @AttributeOverride(name="category4", column=@Column(name="CATEGORY4", length=10) ), 
        @AttributeOverride(name="category5", column=@Column(name="CATEGORY5", length=10) ), 
        @AttributeOverride(name="category6", column=@Column(name="CATEGORY6", length=10) ), 
        @AttributeOverride(name="discountgroup", column=@Column(name="DISCOUNTGROUP", length=10) ), 
        @AttributeOverride(name="pricegroup", column=@Column(name="PRICEGROUP", length=10) ), 
        @AttributeOverride(name="family", column=@Column(name="FAMILY", length=10) ), 
        @AttributeOverride(name="sector", column=@Column(name="SECTOR", length=10) ), 
        @AttributeOverride(name="commissiongroup", column=@Column(name="COMMISSIONGROUP", length=10) ), 
        @AttributeOverride(name="statuscode", column=@Column(name="STATUSCODE", length=10) ), 
        @AttributeOverride(name="fictitiousflag", column=@Column(name="FICTITIOUSFLAG", length=1) ), 
        @AttributeOverride(name="handlingstatuscode", column=@Column(name="HANDLINGSTATUSCODE", length=10) ), 
        @AttributeOverride(name="pickingcode", column=@Column(name="PICKINGCODE", length=10) ), 
        @AttributeOverride(name="pickingcategory", column=@Column(name="PICKINGCATEGORY", length=10) ), 
        @AttributeOverride(name="vathandlingcode", column=@Column(name="VATHANDLINGCODE", length=4) ), 
        @AttributeOverride(name="vatpercentage", column=@Column(name="VATPERCENTAGE", precision=4) ), 
        @AttributeOverride(name="swissmediccode", column=@Column(name="SWISSMEDICCODE", length=10) ), 
        @AttributeOverride(name="vignetteflag", column=@Column(name="VIGNETTEFLAG", length=1) ), 
        @AttributeOverride(name="goodstype", column=@Column(name="GOODSTYPE", length=10) ), 
        @AttributeOverride(name="manneroftransportcode", column=@Column(name="MANNEROFTRANSPORTCODE", length=10) ), 
        @AttributeOverride(name="prescriptionflag", column=@Column(name="PRESCRIPTIONFLAG", length=1) ), 
        @AttributeOverride(name="publicprice", column=@Column(name="PUBLICPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="doctorsprice", column=@Column(name="DOCTORSPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="selfdispensingdoctorsprice", column=@Column(name="SELFDISPENSINGDOCTORSPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="pharmacyprice", column=@Column(name="PHARMACYPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="hospitalprice", column=@Column(name="HOSPITALPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="exfactoryprice", column=@Column(name="EXFACTORYPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="baseprice", column=@Column(name="BASEPRICE", precision=17, scale=4) ), 
        @AttributeOverride(name="sampleqty", column=@Column(name="SAMPLEQTY", precision=15, scale=3) ), 
        @AttributeOverride(name="palletqty", column=@Column(name="PALLETQTY", precision=15, scale=3) ), 
        @AttributeOverride(name="cartonqty", column=@Column(name="CARTONQTY", precision=15, scale=3) ), 
        @AttributeOverride(name="backlogflag", column=@Column(name="BACKLOGFLAG", length=1) ), 
        @AttributeOverride(name="locationgroup", column=@Column(name="LOCATIONGROUP", length=10) ), 
        @AttributeOverride(name="grossweight", column=@Column(name="GROSSWEIGHT", precision=11, scale=5) ), 
        @AttributeOverride(name="netweight", column=@Column(name="NETWEIGHT", precision=11, scale=5) ), 
        @AttributeOverride(name="grossvolume", column=@Column(name="GROSSVOLUME", precision=11, scale=5) ), 
        @AttributeOverride(name="netvolume", column=@Column(name="NETVOLUME", precision=11, scale=5) ), 
        @AttributeOverride(name="length", column=@Column(name="LENGTH", precision=9, scale=3) ), 
        @AttributeOverride(name="height", column=@Column(name="HEIGHT", precision=9, scale=3) ), 
        @AttributeOverride(name="width", column=@Column(name="WIDTH", precision=9, scale=3) ), 
        @AttributeOverride(name="batchcontrolledflag", column=@Column(name="BATCHCONTROLLEDFLAG", length=1) ), 
        @AttributeOverride(name="contbatchcontrolledflag", column=@Column(name="CONTBATCHCONTROLLEDFLAG", length=1) ), 
        @AttributeOverride(name="serialnumbertrackingflag", column=@Column(name="SERIALNUMBERTRACKINGFLAG", length=1) ), 
        @AttributeOverride(name="narcoticcategory", column=@Column(name="NARCOTICCATEGORY", length=10) ), 
        @AttributeOverride(name="eshopprovideflag", column=@Column(name="ESHOPPROVIDEFLAG", length=1) ), 
        @AttributeOverride(name="clinicalstudyflag", column=@Column(name="CLINICALSTUDYFLAG", length=1) ), 
        @AttributeOverride(name="cooleditemflag", column=@Column(name="COOLEDITEMFLAG", length=1) ), 
        @AttributeOverride(name="qcsamplingflag", column=@Column(name="QCSAMPLINGFLAG", length=1) ), 
        @AttributeOverride(name="qcsamplebacktowhsflag", column=@Column(name="QCSAMPLEBACKTOWHSFLAG", length=1) ), 
        @AttributeOverride(name="narcoticflag", column=@Column(name="NARCOTICFLAG", length=1) ), 
        @AttributeOverride(name="hazardoushandlingcode", column=@Column(name="HAZARDOUSHANDLINGCODE", length=5) ), 
        @AttributeOverride(name="hazardousgoodflag", column=@Column(name="HAZARDOUSGOODFLAG", length=1) ), 
        @AttributeOverride(name="medtechitem", column=@Column(name="MEDTECHITEM", length=1) ), 
        @AttributeOverride(name="electronicorderpermitted", column=@Column(name="ELECTRONICORDERPERMITTED", length=1) ), 
        @AttributeOverride(name="itemnrcontractor2", column=@Column(name="ITEMNRCONTRACTOR2", length=35) ), 
        @AttributeOverride(name="itemnrcontractor3", column=@Column(name="ITEMNRCONTRACTOR3", length=35) ), 
        @AttributeOverride(name="validfrom", column=@Column(name="VALIDFROM", nullable=false, length=26) ), 
        @AttributeOverride(name="validto", column=@Column(name="VALIDTO", length=26) ), 
        @AttributeOverride(name="outboundignore", column=@Column(name="OUTBOUNDIGNORE", length=1) ), 
        @AttributeOverride(name="reportignore", column=@Column(name="REPORTIGNORE", length=1) ), 
        @AttributeOverride(name="brand", column=@Column(name="BRAND", length=50) ), 
        @AttributeOverride(name="migelcode", column=@Column(name="MIGELCODE", length=20) ), 
        @AttributeOverride(name="atccode", column=@Column(name="ATCCODE", length=10) ), 
        @AttributeOverride(name="imsotccode", column=@Column(name="IMSOTCCODE", length=10) ), 
        @AttributeOverride(name="healthinsuranceaccepted", column=@Column(name="HEALTHINSURANCEACCEPTED", length=1) ), 
        @AttributeOverride(name="fragileflag", column=@Column(name="FRAGILEFLAG", length=1) ), 
        @AttributeOverride(name="flammableflag", column=@Column(name="FLAMMABLEFLAG", length=1) ), 
        @AttributeOverride(name="antibioticsflag", column=@Column(name="ANTIBIOTICSFLAG", length=1) ), 
        @AttributeOverride(name="serumflag", column=@Column(name="SERUMFLAG", length=1) ), 
        @AttributeOverride(name="specialaffairsflag", column=@Column(name="SPECIALAFFAIRSFLAG", length=1) ), 
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
        @AttributeOverride(name="transactionid", column=@Column(name="TRANSACTIONID", length=50) ), 
        @AttributeOverride(name="recordprocessedflag", column=@Column(name="RECORDPROCESSEDFLAG", length=1) ), 
        @AttributeOverride(name="recordprocessingtime", column=@Column(name="RECORDPROCESSINGTIME", length=26) ), 
        @AttributeOverride(name="recordlastchangetime", column=@Column(name="RECORDLASTCHANGETIME", length=26) ), 
        @AttributeOverride(name="recordcreationtime", column=@Column(name="RECORDCREATIONTIME", nullable=false, length=26) ), 
        @AttributeOverride(name="sortdescde", column=@Column(name="SORTDESCDE", nullable=false, length=150) ), 
        @AttributeOverride(name="sortdescfr", column=@Column(name="SORTDESCFR", nullable=false, length=150) ), 
        @AttributeOverride(name="responsible", column=@Column(name="RESPONSIBLE", nullable=false, length=10) ), 
        @AttributeOverride(name="planer", column=@Column(name="PLANER", nullable=false, length=10) ), 
        @AttributeOverride(name="rating", column=@Column(name="RATING", nullable=false, length=3) ), 
        @AttributeOverride(name="bewirtschaftungDisplay", column=@Column(name="BEWIRTSCHAFTUNG_DISPLAY", nullable=false, length=2) ) } )
    public Itemmasi01Id getId() {
        return this.id;
    }
    
    public void setId(Itemmasi01Id id) {
        this.id = id;
    }




}

