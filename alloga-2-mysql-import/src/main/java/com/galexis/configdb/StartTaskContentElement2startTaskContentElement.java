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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * StartTaskContentElement2startTaskContentElement generated by hbm2java
 */
@Entity
@Table(name="StartTaskContentElement2StartTaskContentElement"
    ,catalog="integrationConfigDB"
)
public class StartTaskContentElement2startTaskContentElement  implements java.io.Serializable {


     private Integer pk;
     private StartTaskContentElement startTaskContentElementByStartTaskContentElementPk2;
     private StartTaskContentElement startTaskContentElementByStartTaskContentElementPk;
     private Integer sequence;
     private Set<StartTaskContentAttributeValue> startTaskContentAttributeValues = new HashSet<StartTaskContentAttributeValue>(0);

    public StartTaskContentElement2startTaskContentElement() {
    }

	
    public StartTaskContentElement2startTaskContentElement(StartTaskContentElement startTaskContentElementByStartTaskContentElementPk2, StartTaskContentElement startTaskContentElementByStartTaskContentElementPk) {
        this.startTaskContentElementByStartTaskContentElementPk2 = startTaskContentElementByStartTaskContentElementPk2;
        this.startTaskContentElementByStartTaskContentElementPk = startTaskContentElementByStartTaskContentElementPk;
    }
    public StartTaskContentElement2startTaskContentElement(StartTaskContentElement startTaskContentElementByStartTaskContentElementPk2, StartTaskContentElement startTaskContentElementByStartTaskContentElementPk, Integer sequence, Set<StartTaskContentAttributeValue> startTaskContentAttributeValues) {
       this.startTaskContentElementByStartTaskContentElementPk2 = startTaskContentElementByStartTaskContentElementPk2;
       this.startTaskContentElementByStartTaskContentElementPk = startTaskContentElementByStartTaskContentElementPk;
       this.sequence = sequence;
       this.startTaskContentAttributeValues = startTaskContentAttributeValues;
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
    @JoinColumn(name="StartTaskContentElementPK2", nullable=false)
    public StartTaskContentElement getStartTaskContentElementByStartTaskContentElementPk2() {
        return this.startTaskContentElementByStartTaskContentElementPk2;
    }
    
    public void setStartTaskContentElementByStartTaskContentElementPk2(StartTaskContentElement startTaskContentElementByStartTaskContentElementPk2) {
        this.startTaskContentElementByStartTaskContentElementPk2 = startTaskContentElementByStartTaskContentElementPk2;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="StartTaskContentElementPK", nullable=false)
    public StartTaskContentElement getStartTaskContentElementByStartTaskContentElementPk() {
        return this.startTaskContentElementByStartTaskContentElementPk;
    }
    
    public void setStartTaskContentElementByStartTaskContentElementPk(StartTaskContentElement startTaskContentElementByStartTaskContentElementPk) {
        this.startTaskContentElementByStartTaskContentElementPk = startTaskContentElementByStartTaskContentElementPk;
    }

    
    @Column(name="Sequence")
    public Integer getSequence() {
        return this.sequence;
    }
    
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="startTaskContentElement2startTaskContentElement")
    public Set<StartTaskContentAttributeValue> getStartTaskContentAttributeValues() {
        return this.startTaskContentAttributeValues;
    }
    
    public void setStartTaskContentAttributeValues(Set<StartTaskContentAttributeValue> startTaskContentAttributeValues) {
        this.startTaskContentAttributeValues = startTaskContentAttributeValues;
    }




}


