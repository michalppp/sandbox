package com.galexis.configdb;
// Generated Sep 6, 2013 10:20:44 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FieldAccessorDataStoreField generated by hbm2java
 */
@Entity
@Table(name="FieldAccessor_DataStoreField"
    ,catalog="integrationConfigDB"
)
public class FieldAccessorDataStoreField  implements java.io.Serializable {


     private int pk;
     private ValueConversion valueConversion;
     private BusinessServiceDefinitionDataStoreField businessServiceDefinitionDataStoreField;
     private Metadata metadata;
     private String conversionArguments;
     private Set<FieldAccessor> fieldAccessors = new HashSet<FieldAccessor>(0);

    public FieldAccessorDataStoreField() {
    }

	
    public FieldAccessorDataStoreField(int pk, Metadata metadata) {
        this.pk = pk;
        this.metadata = metadata;
    }
    public FieldAccessorDataStoreField(int pk, ValueConversion valueConversion, BusinessServiceDefinitionDataStoreField businessServiceDefinitionDataStoreField, Metadata metadata, String conversionArguments, Set<FieldAccessor> fieldAccessors) {
       this.pk = pk;
       this.valueConversion = valueConversion;
       this.businessServiceDefinitionDataStoreField = businessServiceDefinitionDataStoreField;
       this.metadata = metadata;
       this.conversionArguments = conversionArguments;
       this.fieldAccessors = fieldAccessors;
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
    @JoinColumn(name="ValueConversionPK")
    public ValueConversion getValueConversion() {
        return this.valueConversion;
    }
    
    public void setValueConversion(ValueConversion valueConversion) {
        this.valueConversion = valueConversion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BusinessServiceDefinition_DataStoreFieldPK")
    public BusinessServiceDefinitionDataStoreField getBusinessServiceDefinitionDataStoreField() {
        return this.businessServiceDefinitionDataStoreField;
    }
    
    public void setBusinessServiceDefinitionDataStoreField(BusinessServiceDefinitionDataStoreField businessServiceDefinitionDataStoreField) {
        this.businessServiceDefinitionDataStoreField = businessServiceDefinitionDataStoreField;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MetadataPK", nullable=false)
    public Metadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    
    @Column(name="ConversionArguments", length=1024)
    public String getConversionArguments() {
        return this.conversionArguments;
    }
    
    public void setConversionArguments(String conversionArguments) {
        this.conversionArguments = conversionArguments;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="fieldAccessorDataStoreField")
    public Set<FieldAccessor> getFieldAccessors() {
        return this.fieldAccessors;
    }
    
    public void setFieldAccessors(Set<FieldAccessor> fieldAccessors) {
        this.fieldAccessors = fieldAccessors;
    }




}


