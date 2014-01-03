package com.galexis.configdb;
// Generated Sep 6, 2013 10:20:44 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ConfigurationValue generated by hbm2java
 */
@Entity
@Table(name="ConfigurationValue"
    ,catalog="integrationConfigDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"Name", "ConfigurationHeaderPK", "PartnerGroupPK"}) 
)
public class ConfigurationValue  implements java.io.Serializable {


     private int pk;
     private ConfigurationHeader configurationHeader;
     private PartnerGroup partnerGroup;
     private Metadata metadata;
     private String partner;
     private String name;
     private String value;
     private int type;

    public ConfigurationValue() {
    }

	
    public ConfigurationValue(int pk, ConfigurationHeader configurationHeader, PartnerGroup partnerGroup, Metadata metadata, String name, String value, int type) {
        this.pk = pk;
        this.configurationHeader = configurationHeader;
        this.partnerGroup = partnerGroup;
        this.metadata = metadata;
        this.name = name;
        this.value = value;
        this.type = type;
    }
    public ConfigurationValue(int pk, ConfigurationHeader configurationHeader, PartnerGroup partnerGroup, Metadata metadata, String partner, String name, String value, int type) {
       this.pk = pk;
       this.configurationHeader = configurationHeader;
       this.partnerGroup = partnerGroup;
       this.metadata = metadata;
       this.partner = partner;
       this.name = name;
       this.value = value;
       this.type = type;
    }
   
     @Id 

    
    @Column(name="PK", unique=true, nullable=false)
    public int getPk() {
        return this.pk;
    }
    
    public void setPk(int pk) {
        this.pk = pk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ConfigurationHeaderPK", nullable=false)
    public ConfigurationHeader getConfigurationHeader() {
        return this.configurationHeader;
    }
    
    public void setConfigurationHeader(ConfigurationHeader configurationHeader) {
        this.configurationHeader = configurationHeader;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PartnerGroupPK", nullable=false)
    public PartnerGroup getPartnerGroup() {
        return this.partnerGroup;
    }
    
    public void setPartnerGroup(PartnerGroup partnerGroup) {
        this.partnerGroup = partnerGroup;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MetadataPK", nullable=false)
    public Metadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    
    @Column(name="Partner", length=20)
    public String getPartner() {
        return this.partner;
    }
    
    public void setPartner(String partner) {
        this.partner = partner;
    }

    
    @Column(name="Name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Value", nullable=false, length=1024)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

    
    @Column(name="Type", nullable=false)
    public int getType() {
        return this.type;
    }
    
    public void setType(int type) {
        this.type = type;
    }




}

