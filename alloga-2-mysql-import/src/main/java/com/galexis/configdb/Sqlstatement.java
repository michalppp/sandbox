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
import javax.persistence.Version;

/**
 * Sqlstatement generated by hbm2java
 */
@Entity
@Table(name="SQLStatement"
    ,catalog="integrationConfigDB"
)
public class Sqlstatement  implements java.io.Serializable {


     private int pk;
     private int version;
     private DataStoreEntity dataStoreEntity;
     private Metadata metadata;
     private String name;
     private String statement;
     private int numParameters;
     private String dataOwner;
     private String description;
     private Set<MessageTypeDefinition> messageTypeDefinitions = new HashSet<MessageTypeDefinition>(0);

    public Sqlstatement() {
    }

	
    public Sqlstatement(int pk, DataStoreEntity dataStoreEntity, Metadata metadata, String name, String statement, int numParameters) {
        this.pk = pk;
        this.dataStoreEntity = dataStoreEntity;
        this.metadata = metadata;
        this.name = name;
        this.statement = statement;
        this.numParameters = numParameters;
    }
    public Sqlstatement(int pk, DataStoreEntity dataStoreEntity, Metadata metadata, String name, String statement, int numParameters, String dataOwner, String description, Set<MessageTypeDefinition> messageTypeDefinitions) {
       this.pk = pk;
       this.dataStoreEntity = dataStoreEntity;
       this.metadata = metadata;
       this.name = name;
       this.statement = statement;
       this.numParameters = numParameters;
       this.dataOwner = dataOwner;
       this.description = description;
       this.messageTypeDefinitions = messageTypeDefinitions;
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
    @JoinColumn(name="DataStoreEntityPK", nullable=false)
    public DataStoreEntity getDataStoreEntity() {
        return this.dataStoreEntity;
    }
    
    public void setDataStoreEntity(DataStoreEntity dataStoreEntity) {
        this.dataStoreEntity = dataStoreEntity;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MetadataPK", nullable=false)
    public Metadata getMetadata() {
        return this.metadata;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    
    @Column(name="Name", nullable=false, length=128)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="Statement", nullable=false, length=65000)
    public String getStatement() {
        return this.statement;
    }
    
    public void setStatement(String statement) {
        this.statement = statement;
    }

    
    @Column(name="NumParameters", nullable=false)
    public int getNumParameters() {
        return this.numParameters;
    }
    
    public void setNumParameters(int numParameters) {
        this.numParameters = numParameters;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="sqlstatement")
    public Set<MessageTypeDefinition> getMessageTypeDefinitions() {
        return this.messageTypeDefinitions;
    }
    
    public void setMessageTypeDefinitions(Set<MessageTypeDefinition> messageTypeDefinitions) {
        this.messageTypeDefinitions = messageTypeDefinitions;
    }




}


