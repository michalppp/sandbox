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
 * DataStoreEntity generated by hbm2java
 */
@Entity
@Table(name="DataStoreEntity"
    ,catalog="integrationConfigDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"EntityName", "Qualifier", "DatastoreEntityType", "Version", "PartnerGroupPK"}) 
)
public class DataStoreEntity  implements java.io.Serializable {


     private int pk;
     private int version;
     private BackendResource backendResource;
     private PartnerGroup partnerGroup;
     private Metadata metadata;
     private int datastoreEntityType;
     private String entityName;
     private String qualifier;
     private String format;
     private String dataOwner;
     private String description;
     private int state;
     private Set<DataStoreField> dataStoreFields = new HashSet<DataStoreField>(0);
     private Set<DataStoreRelationship> dataStoreRelationshipsForForeignDataStoreEntityPk = new HashSet<DataStoreRelationship>(0);
     private Set<Sqlstatement> sqlstatements = new HashSet<Sqlstatement>(0);
     private Set<DataStoreRelationship> dataStoreRelationshipsForParentDataStoreEntityPk = new HashSet<DataStoreRelationship>(0);

    public DataStoreEntity() {
    }

	
    public DataStoreEntity(int pk, PartnerGroup partnerGroup, Metadata metadata, int datastoreEntityType, String entityName, String qualifier, int state) {
        this.pk = pk;
        this.partnerGroup = partnerGroup;
        this.metadata = metadata;
        this.datastoreEntityType = datastoreEntityType;
        this.entityName = entityName;
        this.qualifier = qualifier;
        this.state = state;
    }
    public DataStoreEntity(int pk, BackendResource backendResource, PartnerGroup partnerGroup, Metadata metadata, int datastoreEntityType, String entityName, String qualifier, String format, String dataOwner, String description, int state, Set<DataStoreField> dataStoreFields, Set<DataStoreRelationship> dataStoreRelationshipsForForeignDataStoreEntityPk, Set<Sqlstatement> sqlstatements, Set<DataStoreRelationship> dataStoreRelationshipsForParentDataStoreEntityPk) {
       this.pk = pk;
       this.backendResource = backendResource;
       this.partnerGroup = partnerGroup;
       this.metadata = metadata;
       this.datastoreEntityType = datastoreEntityType;
       this.entityName = entityName;
       this.qualifier = qualifier;
       this.format = format;
       this.dataOwner = dataOwner;
       this.description = description;
       this.state = state;
       this.dataStoreFields = dataStoreFields;
       this.dataStoreRelationshipsForForeignDataStoreEntityPk = dataStoreRelationshipsForForeignDataStoreEntityPk;
       this.sqlstatements = sqlstatements;
       this.dataStoreRelationshipsForParentDataStoreEntityPk = dataStoreRelationshipsForParentDataStoreEntityPk;
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

    
    @Column(name="DatastoreEntityType", nullable=false)
    public int getDatastoreEntityType() {
        return this.datastoreEntityType;
    }
    
    public void setDatastoreEntityType(int datastoreEntityType) {
        this.datastoreEntityType = datastoreEntityType;
    }

    
    @Column(name="EntityName", nullable=false, length=128)
    public String getEntityName() {
        return this.entityName;
    }
    
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    
    @Column(name="Qualifier", nullable=false)
    public String getQualifier() {
        return this.qualifier;
    }
    
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    
    @Column(name="Format")
    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    
    @Column(name="DataOwner", length=20)
    public String getDataOwner() {
        return this.dataOwner;
    }
    
    public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
    }

    
    @Column(name="Description")
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="State", nullable=false)
    public int getState() {
        return this.state;
    }
    
    public void setState(int state) {
        this.state = state;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="dataStoreEntity")
    public Set<DataStoreField> getDataStoreFields() {
        return this.dataStoreFields;
    }
    
    public void setDataStoreFields(Set<DataStoreField> dataStoreFields) {
        this.dataStoreFields = dataStoreFields;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="dataStoreEntityByForeignDataStoreEntityPk")
    public Set<DataStoreRelationship> getDataStoreRelationshipsForForeignDataStoreEntityPk() {
        return this.dataStoreRelationshipsForForeignDataStoreEntityPk;
    }
    
    public void setDataStoreRelationshipsForForeignDataStoreEntityPk(Set<DataStoreRelationship> dataStoreRelationshipsForForeignDataStoreEntityPk) {
        this.dataStoreRelationshipsForForeignDataStoreEntityPk = dataStoreRelationshipsForForeignDataStoreEntityPk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="dataStoreEntity")
    public Set<Sqlstatement> getSqlstatements() {
        return this.sqlstatements;
    }
    
    public void setSqlstatements(Set<Sqlstatement> sqlstatements) {
        this.sqlstatements = sqlstatements;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="dataStoreEntityByParentDataStoreEntityPk")
    public Set<DataStoreRelationship> getDataStoreRelationshipsForParentDataStoreEntityPk() {
        return this.dataStoreRelationshipsForParentDataStoreEntityPk;
    }
    
    public void setDataStoreRelationshipsForParentDataStoreEntityPk(Set<DataStoreRelationship> dataStoreRelationshipsForParentDataStoreEntityPk) {
        this.dataStoreRelationshipsForParentDataStoreEntityPk = dataStoreRelationshipsForParentDataStoreEntityPk;
    }




}


