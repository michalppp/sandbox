package com.galexis.configdb;
// Generated Sep 6, 2013 10:20:44 AM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * HandlerMappingConfiguration generated by hbm2java
 */
@Entity
@Table(name="HandlerMappingConfiguration"
    ,catalog="integrationConfigDB"
    , uniqueConstraints = @UniqueConstraint(columnNames={"MappingGroup", "Filter", "Selector", "MessageTypeDefinitionPK", "MappingDefinitionPK"}) 
)
public class HandlerMappingConfiguration  implements java.io.Serializable {


     private Integer pk;
     private MessageTypeDefinition messageTypeDefinition;
     private MappingDefinition mappingDefinition;
     private Metadata metadata;
     private String mappingGroup;
     private String filter;
     private String selector;
     private String handlerName;

    public HandlerMappingConfiguration() {
    }

	
    public HandlerMappingConfiguration(MessageTypeDefinition messageTypeDefinition, MappingDefinition mappingDefinition, Metadata metadata) {
        this.messageTypeDefinition = messageTypeDefinition;
        this.mappingDefinition = mappingDefinition;
        this.metadata = metadata;
    }
    public HandlerMappingConfiguration(MessageTypeDefinition messageTypeDefinition, MappingDefinition mappingDefinition, Metadata metadata, String mappingGroup, String filter, String selector, String handlerName) {
       this.messageTypeDefinition = messageTypeDefinition;
       this.mappingDefinition = mappingDefinition;
       this.metadata = metadata;
       this.mappingGroup = mappingGroup;
       this.filter = filter;
       this.selector = selector;
       this.handlerName = handlerName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="PK", unique=true, nullable=false)
    public Integer getPk() {
        return this.pk;
    }
    
    public void setPk(Integer pk) {
        this.pk = pk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MessageTypeDefinitionPK", nullable=false)
    public MessageTypeDefinition getMessageTypeDefinition() {
        return this.messageTypeDefinition;
    }
    
    public void setMessageTypeDefinition(MessageTypeDefinition messageTypeDefinition) {
        this.messageTypeDefinition = messageTypeDefinition;
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

    
    @Column(name="MappingGroup", length=126)
    public String getMappingGroup() {
        return this.mappingGroup;
    }
    
    public void setMappingGroup(String mappingGroup) {
        this.mappingGroup = mappingGroup;
    }

    
    @Column(name="Filter", length=126)
    public String getFilter() {
        return this.filter;
    }
    
    public void setFilter(String filter) {
        this.filter = filter;
    }

    
    @Column(name="Selector", length=126)
    public String getSelector() {
        return this.selector;
    }
    
    public void setSelector(String selector) {
        this.selector = selector;
    }

    
    @Column(name="HandlerName", length=126)
    public String getHandlerName() {
        return this.handlerName;
    }
    
    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }




}


