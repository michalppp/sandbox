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
import javax.persistence.Version;

/**
 * BusinessServiceDefinition generated by hbm2java
 */
@Entity
@Table(name="BusinessServiceDefinition"
    ,catalog="integrationConfigDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"Name", "Version", "PartnerGroupPK"}) 
)
public class BusinessServiceDefinition  implements java.io.Serializable {


     private int pk;
     private int version;
     private BackendResource backendResource;
     private PartnerGroup partnerGroup;
     private Metadata metadata;
     private String name;
     private String classifier;
     private String description;
     private String dataOwner;
     private int state;
     private Set<BusinessServiceDefinitionDataStoreField> businessServiceDefinitionDataStoreFields = new HashSet<BusinessServiceDefinitionDataStoreField>(0);
     private Set<MappingDefinitionBusinessServiceDefinition> mappingDefinitionBusinessServiceDefinitions = new HashSet<MappingDefinitionBusinessServiceDefinition>(0);

    public BusinessServiceDefinition() {
    }

	
    public BusinessServiceDefinition(int pk, PartnerGroup partnerGroup, Metadata metadata, String name, int state) {
        this.pk = pk;
        this.partnerGroup = partnerGroup;
        this.metadata = metadata;
        this.name = name;
        this.state = state;
    }
    public BusinessServiceDefinition(int pk, BackendResource backendResource, PartnerGroup partnerGroup, Metadata metadata, String name, String classifier, String description, String dataOwner, int state, Set<BusinessServiceDefinitionDataStoreField> businessServiceDefinitionDataStoreFields, Set<MappingDefinitionBusinessServiceDefinition> mappingDefinitionBusinessServiceDefinitions) {
       this.pk = pk;
       this.backendResource = backendResource;
       this.partnerGroup = partnerGroup;
       this.metadata = metadata;
       this.name = name;
       this.classifier = classifier;
       this.description = description;
       this.dataOwner = dataOwner;
       this.state = state;
       this.businessServiceDefinitionDataStoreFields = businessServiceDefinitionDataStoreFields;
       this.mappingDefinitionBusinessServiceDefinitions = mappingDefinitionBusinessServiceDefinitions;
    }
   
     @Id 

    
    @Column(name="PK", unique=true, nullable=false)
    public int getPk() {
        return this.pk;
    }
    
    public void setPk(int pk) {
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
    @JoinColumn(name="BackendResourcePK")
    public BackendResource getBackendResource() {
        return this.backendResource;
    }
    
    public void setBackendResource(BackendResource backendResource) {
        this.backendResource = backendResource;
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

    
    @Column(name="Name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Classifier")
    public String getClassifier() {
        return this.classifier;
    }
    
    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    
    @Column(name="Description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="DataOwner", length=20)
    public String getDataOwner() {
        return this.dataOwner;
    }
    
    public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
    }

    
    @Column(name="State", nullable=false)
    public int getState() {
        return this.state;
    }
    
    public void setState(int state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessServiceDefinition")
    public Set<BusinessServiceDefinitionDataStoreField> getBusinessServiceDefinitionDataStoreFields() {
        return this.businessServiceDefinitionDataStoreFields;
    }
    
    public void setBusinessServiceDefinitionDataStoreFields(Set<BusinessServiceDefinitionDataStoreField> businessServiceDefinitionDataStoreFields) {
        this.businessServiceDefinitionDataStoreFields = businessServiceDefinitionDataStoreFields;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="businessServiceDefinition")
    public Set<MappingDefinitionBusinessServiceDefinition> getMappingDefinitionBusinessServiceDefinitions() {
        return this.mappingDefinitionBusinessServiceDefinitions;
    }
    
    public void setMappingDefinitionBusinessServiceDefinitions(Set<MappingDefinitionBusinessServiceDefinition> mappingDefinitionBusinessServiceDefinitions) {
        this.mappingDefinitionBusinessServiceDefinitions = mappingDefinitionBusinessServiceDefinitions;
    }




}


