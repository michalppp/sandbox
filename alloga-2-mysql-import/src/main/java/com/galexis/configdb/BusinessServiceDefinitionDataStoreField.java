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
import javax.persistence.UniqueConstraint;

/**
 * BusinessServiceDefinitionDataStoreField generated by hbm2java
 */
@Entity
@Table(name="BusinessServiceDefinition_DataStoreField"
    ,catalog="integrationConfigDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"DataStoreFieldPK", "BusinessServiceDefinitionPK"}) 
)
public class BusinessServiceDefinitionDataStoreField  implements java.io.Serializable {


     private int pk;
     private DataStoreField dataStoreField;
     private BusinessServiceDefinition businessServiceDefinition;
     private Metadata metadata;
     private Boolean mandatory;
     private Integer sequence;
     private Set<FieldAccessorDataStoreField> fieldAccessorDataStoreFields = new HashSet<FieldAccessorDataStoreField>(0);

    public BusinessServiceDefinitionDataStoreField() {
    }

	
    public BusinessServiceDefinitionDataStoreField(int pk, DataStoreField dataStoreField, BusinessServiceDefinition businessServiceDefinition, Metadata metadata) {
        this.pk = pk;
        this.dataStoreField = dataStoreField;
        this.businessServiceDefinition = businessServiceDefinition;
        this.metadata = metadata;
    }
    public BusinessServiceDefinitionDataStoreField(int pk, DataStoreField dataStoreField, BusinessServiceDefinition businessServiceDefinition, Metadata metadata, Boolean mandatory, Integer sequence, Set<FieldAccessorDataStoreField> fieldAccessorDataStoreFields) {
       this.pk = pk;
       this.dataStoreField = dataStoreField;
       this.businessServiceDefinition = businessServiceDefinition;
       this.metadata = metadata;
       this.mandatory = mandatory;
       this.sequence = sequence;
       this.fieldAccessorDataStoreFields = fieldAccessorDataStoreFields;
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
    @JoinColumn(name="DataStoreFieldPK", nullable=false)
    public DataStoreField getDataStoreField() {
        return this.dataStoreField;
    }
    
    public void setDataStoreField(DataStoreField dataStoreField) {
        this.dataStoreField = dataStoreField;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BusinessServiceDefinitionPK", nullable=false)
    public BusinessServiceDefinition getBusinessServiceDefinition() {
        return this.businessServiceDefinition;
    }
    
    public void setBusinessServiceDefinition(BusinessServiceDefinition businessServiceDefinition) {
        this.businessServiceDefinition = businessServiceDefinition;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MetadataPK", nullable=false)
    public Metadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    
    @Column(name="Mandatory")
    public Boolean getMandatory() {
        return this.mandatory;
    }
    
    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
    }

    
    @Column(name="Sequence")
    public Integer getSequence() {
        return this.sequence;
    }
    
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessServiceDefinitionDataStoreField")
    public Set<FieldAccessorDataStoreField> getFieldAccessorDataStoreFields() {
        return this.fieldAccessorDataStoreFields;
    }
    
    public void setFieldAccessorDataStoreFields(Set<FieldAccessorDataStoreField> fieldAccessorDataStoreFields) {
        this.fieldAccessorDataStoreFields = fieldAccessorDataStoreFields;
    }




}


