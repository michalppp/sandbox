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
 * DataMapping generated by hbm2java
 */
@Entity
@Table(name="DataMapping"
    ,catalog="integrationConfigDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"MappingGroup", "MappingDefinitionPK", "Sequence"}) 
)
public class DataMapping  implements java.io.Serializable {


     private int pk;
     private FieldAccessor fieldAccessorByDestinationFieldAccessorPk;
     private FieldAccessor fieldAccessorBySourceFieldAccessorPk;
     private MappingDefinition mappingDefinition;
     private Metadata metadata;
     private String mappingGroup;
     private String filter;
     private String conditionStrategy;
     private String conditionArguments;
     private String comment;
     private int sequence;

    public DataMapping() {
    }

	
    public DataMapping(int pk, FieldAccessor fieldAccessorByDestinationFieldAccessorPk, FieldAccessor fieldAccessorBySourceFieldAccessorPk, MappingDefinition mappingDefinition, Metadata metadata, String mappingGroup, String filter, int sequence) {
        this.pk = pk;
        this.fieldAccessorByDestinationFieldAccessorPk = fieldAccessorByDestinationFieldAccessorPk;
        this.fieldAccessorBySourceFieldAccessorPk = fieldAccessorBySourceFieldAccessorPk;
        this.mappingDefinition = mappingDefinition;
        this.metadata = metadata;
        this.mappingGroup = mappingGroup;
        this.filter = filter;
        this.sequence = sequence;
    }
    public DataMapping(int pk, FieldAccessor fieldAccessorByDestinationFieldAccessorPk, FieldAccessor fieldAccessorBySourceFieldAccessorPk, MappingDefinition mappingDefinition, Metadata metadata, String mappingGroup, String filter, String conditionStrategy, String conditionArguments, String comment, int sequence) {
       this.pk = pk;
       this.fieldAccessorByDestinationFieldAccessorPk = fieldAccessorByDestinationFieldAccessorPk;
       this.fieldAccessorBySourceFieldAccessorPk = fieldAccessorBySourceFieldAccessorPk;
       this.mappingDefinition = mappingDefinition;
       this.metadata = metadata;
       this.mappingGroup = mappingGroup;
       this.filter = filter;
       this.conditionStrategy = conditionStrategy;
       this.conditionArguments = conditionArguments;
       this.comment = comment;
       this.sequence = sequence;
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
    @JoinColumn(name="DestinationFieldAccessorPK", nullable=false)
    public FieldAccessor getFieldAccessorByDestinationFieldAccessorPk() {
        return this.fieldAccessorByDestinationFieldAccessorPk;
    }
    
    public void setFieldAccessorByDestinationFieldAccessorPk(FieldAccessor fieldAccessorByDestinationFieldAccessorPk) {
        this.fieldAccessorByDestinationFieldAccessorPk = fieldAccessorByDestinationFieldAccessorPk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SourceFieldAccessorPK", nullable=false)
    public FieldAccessor getFieldAccessorBySourceFieldAccessorPk() {
        return this.fieldAccessorBySourceFieldAccessorPk;
    }
    
    public void setFieldAccessorBySourceFieldAccessorPk(FieldAccessor fieldAccessorBySourceFieldAccessorPk) {
        this.fieldAccessorBySourceFieldAccessorPk = fieldAccessorBySourceFieldAccessorPk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MappingDefinitionPK", nullable=false)
    public MappingDefinition getMappingDefinition() {
        return this.mappingDefinition;
    }
    
    public void setMappingDefinition(MappingDefinition mappingDefinition) {
        this.mappingDefinition = mappingDefinition;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MetadataPK", nullable=false)
    public Metadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    
    @Column(name="MappingGroup", nullable=false, length=128)
    public String getMappingGroup() {
        return this.mappingGroup;
    }
    
    public void setMappingGroup(String mappingGroup) {
        this.mappingGroup = mappingGroup;
    }

    
    @Column(name="Filter", nullable=false, length=128)
    public String getFilter() {
        return this.filter;
    }
    
    public void setFilter(String filter) {
        this.filter = filter;
    }

    
    @Column(name="ConditionStrategy", length=128)
    public String getConditionStrategy() {
        return this.conditionStrategy;
    }
    
    public void setConditionStrategy(String conditionStrategy) {
        this.conditionStrategy = conditionStrategy;
    }

    
    @Column(name="ConditionArguments", length=1024)
    public String getConditionArguments() {
        return this.conditionArguments;
    }
    
    public void setConditionArguments(String conditionArguments) {
        this.conditionArguments = conditionArguments;
    }

    
    @Column(name="Comment")
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    
    @Column(name="Sequence", nullable=false)
    public int getSequence() {
        return this.sequence;
    }
    
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }




}


