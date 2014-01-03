package com.galexis.configdb;
// Generated Sep 6, 2013 10:20:44 AM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * ConditionDefinition generated by hbm2java
 */
@Entity
@Table(name="ConditionDefinition"
    ,catalog="integrationConfigDB"
)
public class ConditionDefinition  implements java.io.Serializable {


     private Integer pk;
     private int version;
     private PartnerGroup partnerGroup;
     private ConditionSchema conditionSchema;
     private Metadata metadata;
     private String partner;
     private int sequence;
     private int state;
     private Set<ConditionDefinitionDetails> conditionDefinitionDetailses = new HashSet<ConditionDefinitionDetails>(0);
     private Set<ConversionDefinition> conversionDefinitions = new HashSet<ConversionDefinition>(0);

    public ConditionDefinition() {
    }

	
    public ConditionDefinition(PartnerGroup partnerGroup, ConditionSchema conditionSchema, Metadata metadata, int sequence, int state) {
        this.partnerGroup = partnerGroup;
        this.conditionSchema = conditionSchema;
        this.metadata = metadata;
        this.sequence = sequence;
        this.state = state;
    }
    public ConditionDefinition(PartnerGroup partnerGroup, ConditionSchema conditionSchema, Metadata metadata, String partner, int sequence, int state, Set<ConditionDefinitionDetails> conditionDefinitionDetailses, Set<ConversionDefinition> conversionDefinitions) {
       this.partnerGroup = partnerGroup;
       this.conditionSchema = conditionSchema;
       this.metadata = metadata;
       this.partner = partner;
       this.sequence = sequence;
       this.state = state;
       this.conditionDefinitionDetailses = conditionDefinitionDetailses;
       this.conversionDefinitions = conversionDefinitions;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="PK", unique=true, nullable=false)
    public Integer getPk() {
        return this.pk;
    }
    
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @Version
    @Column(name="Version", nullable=false)
    public int getVersion() {
        return this.version;
    }
    
    public void setVersion(int version) {
        this.version = version;
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
    @JoinColumn(name="ConditionSchemaPK", nullable=false)
    public ConditionSchema getConditionSchema() {
        return this.conditionSchema;
    }
    
    public void setConditionSchema(ConditionSchema conditionSchema) {
        this.conditionSchema = conditionSchema;
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

    
    @Column(name="Sequence", nullable=false)
    public int getSequence() {
        return this.sequence;
    }
    
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    
    @Column(name="State", nullable=false)
    public int getState() {
        return this.state;
    }
    
    public void setState(int state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="conditionDefinition")
    public Set<ConditionDefinitionDetails> getConditionDefinitionDetailses() {
        return this.conditionDefinitionDetailses;
    }
    
    public void setConditionDefinitionDetailses(Set<ConditionDefinitionDetails> conditionDefinitionDetailses) {
        this.conditionDefinitionDetailses = conditionDefinitionDetailses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ConversionDefinition_ConditionDefinition", catalog="integrationConfigDB", joinColumns = { 
        @JoinColumn(name="ConditionDefinitionPK", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="ConversionDefinitionPK", nullable=false, updatable=false) })
    public Set<ConversionDefinition> getConversionDefinitions() {
        return this.conversionDefinitions;
    }
    
    public void setConversionDefinitions(Set<ConversionDefinition> conversionDefinitions) {
        this.conversionDefinitions = conversionDefinitions;
    }




}


