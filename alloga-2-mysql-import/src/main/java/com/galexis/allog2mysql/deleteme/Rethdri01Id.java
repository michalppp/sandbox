package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Rethdri01Id generated by hbm2java
 */
@Embeddable
public class Rethdri01Id  implements java.io.Serializable {


     private long pk;
     private long contrdefpk;
     private long incidentnr;
     private Date incidentdate;
     private String salesorganisation;
     private String salesorganisationdesc;
     private String principlereferencenr;
     private long bizparaddrpk;
     private String customercontractor;
     private String problemcode;
     private String resolutioncode;
     private String handler;
     private Date customerreturndate;
     private String customerreference;
     private String typeofreference;
     private Long referencenr;
     private Integer timedatepk;
     private Integer ipTimedatepkReporting;
     private String programname;
     private String filename;
     private String processingflag1;
     private String processingflag2;
     private String processingflag3;
     private String processingflag4;
     private String processingflag5;
     private String processingflag6;
     private String processingflag7;
     private String processingflag8;
     private String processingflag9;
     private String processingflag10;
     private String backendreleased;
     private String outboundignore;
     private String transactionid;
     private String recordprocessedflag;
     private Date recordprocessingtime;
     private Date recordlastchangetime;
     private Date recordcreationtime;

    public Rethdri01Id() {
    }

	
    public Rethdri01Id(long pk, long contrdefpk, long incidentnr, Date incidentdate, long bizparaddrpk, String backendreleased, String outboundignore, String recordprocessedflag, Date recordcreationtime) {
        this.pk = pk;
        this.contrdefpk = contrdefpk;
        this.incidentnr = incidentnr;
        this.incidentdate = incidentdate;
        this.bizparaddrpk = bizparaddrpk;
        this.backendreleased = backendreleased;
        this.outboundignore = outboundignore;
        this.recordprocessedflag = recordprocessedflag;
        this.recordcreationtime = recordcreationtime;
    }
    public Rethdri01Id(long pk, long contrdefpk, long incidentnr, Date incidentdate, String salesorganisation, String salesorganisationdesc, String principlereferencenr, long bizparaddrpk, String customercontractor, String problemcode, String resolutioncode, String handler, Date customerreturndate, String customerreference, String typeofreference, Long referencenr, Integer timedatepk, Integer ipTimedatepkReporting, String programname, String filename, String processingflag1, String processingflag2, String processingflag3, String processingflag4, String processingflag5, String processingflag6, String processingflag7, String processingflag8, String processingflag9, String processingflag10, String backendreleased, String outboundignore, String transactionid, String recordprocessedflag, Date recordprocessingtime, Date recordlastchangetime, Date recordcreationtime) {
       this.pk = pk;
       this.contrdefpk = contrdefpk;
       this.incidentnr = incidentnr;
       this.incidentdate = incidentdate;
       this.salesorganisation = salesorganisation;
       this.salesorganisationdesc = salesorganisationdesc;
       this.principlereferencenr = principlereferencenr;
       this.bizparaddrpk = bizparaddrpk;
       this.customercontractor = customercontractor;
       this.problemcode = problemcode;
       this.resolutioncode = resolutioncode;
       this.handler = handler;
       this.customerreturndate = customerreturndate;
       this.customerreference = customerreference;
       this.typeofreference = typeofreference;
       this.referencenr = referencenr;
       this.timedatepk = timedatepk;
       this.ipTimedatepkReporting = ipTimedatepkReporting;
       this.programname = programname;
       this.filename = filename;
       this.processingflag1 = processingflag1;
       this.processingflag2 = processingflag2;
       this.processingflag3 = processingflag3;
       this.processingflag4 = processingflag4;
       this.processingflag5 = processingflag5;
       this.processingflag6 = processingflag6;
       this.processingflag7 = processingflag7;
       this.processingflag8 = processingflag8;
       this.processingflag9 = processingflag9;
       this.processingflag10 = processingflag10;
       this.backendreleased = backendreleased;
       this.outboundignore = outboundignore;
       this.transactionid = transactionid;
       this.recordprocessedflag = recordprocessedflag;
       this.recordprocessingtime = recordprocessingtime;
       this.recordlastchangetime = recordlastchangetime;
       this.recordcreationtime = recordcreationtime;
    }
   


    @Column(name="PK", nullable=false, precision=12, scale=0)
    public long getPk() {
        return this.pk;
    }
    
    public void setPk(long pk) {
        this.pk = pk;
    }


    @Column(name="CONTRDEFPK", nullable=false, precision=12, scale=0)
    public long getContrdefpk() {
        return this.contrdefpk;
    }
    
    public void setContrdefpk(long contrdefpk) {
        this.contrdefpk = contrdefpk;
    }


    @Column(name="INCIDENTNR", nullable=false, precision=12, scale=0)
    public long getIncidentnr() {
        return this.incidentnr;
    }
    
    public void setIncidentnr(long incidentnr) {
        this.incidentnr = incidentnr;
    }


    @Column(name="INCIDENTDATE", nullable=false, length=26)
    public Date getIncidentdate() {
        return this.incidentdate;
    }
    
    public void setIncidentdate(Date incidentdate) {
        this.incidentdate = incidentdate;
    }


    @Column(name="SALESORGANISATION", length=30)
    public String getSalesorganisation() {
        return this.salesorganisation;
    }
    
    public void setSalesorganisation(String salesorganisation) {
        this.salesorganisation = salesorganisation;
    }


    @Column(name="SALESORGANISATIONDESC", length=50)
    public String getSalesorganisationdesc() {
        return this.salesorganisationdesc;
    }
    
    public void setSalesorganisationdesc(String salesorganisationdesc) {
        this.salesorganisationdesc = salesorganisationdesc;
    }


    @Column(name="PRINCIPLEREFERENCENR", length=35)
    public String getPrinciplereferencenr() {
        return this.principlereferencenr;
    }
    
    public void setPrinciplereferencenr(String principlereferencenr) {
        this.principlereferencenr = principlereferencenr;
    }


    @Column(name="BIZPARADDRPK", nullable=false, precision=12, scale=0)
    public long getBizparaddrpk() {
        return this.bizparaddrpk;
    }
    
    public void setBizparaddrpk(long bizparaddrpk) {
        this.bizparaddrpk = bizparaddrpk;
    }


    @Column(name="CUSTOMERCONTRACTOR", length=30)
    public String getCustomercontractor() {
        return this.customercontractor;
    }
    
    public void setCustomercontractor(String customercontractor) {
        this.customercontractor = customercontractor;
    }


    @Column(name="PROBLEMCODE", length=10)
    public String getProblemcode() {
        return this.problemcode;
    }
    
    public void setProblemcode(String problemcode) {
        this.problemcode = problemcode;
    }


    @Column(name="RESOLUTIONCODE", length=10)
    public String getResolutioncode() {
        return this.resolutioncode;
    }
    
    public void setResolutioncode(String resolutioncode) {
        this.resolutioncode = resolutioncode;
    }


    @Column(name="HANDLER", length=10)
    public String getHandler() {
        return this.handler;
    }
    
    public void setHandler(String handler) {
        this.handler = handler;
    }


    @Column(name="CUSTOMERRETURNDATE", length=26)
    public Date getCustomerreturndate() {
        return this.customerreturndate;
    }
    
    public void setCustomerreturndate(Date customerreturndate) {
        this.customerreturndate = customerreturndate;
    }


    @Column(name="CUSTOMERREFERENCE", length=30)
    public String getCustomerreference() {
        return this.customerreference;
    }
    
    public void setCustomerreference(String customerreference) {
        this.customerreference = customerreference;
    }


    @Column(name="TYPEOFREFERENCE", length=1)
    public String getTypeofreference() {
        return this.typeofreference;
    }
    
    public void setTypeofreference(String typeofreference) {
        this.typeofreference = typeofreference;
    }


    @Column(name="REFERENCENR", precision=12, scale=0)
    public Long getReferencenr() {
        return this.referencenr;
    }
    
    public void setReferencenr(Long referencenr) {
        this.referencenr = referencenr;
    }


    @Column(name="TIMEDATEPK", precision=8, scale=0)
    public Integer getTimedatepk() {
        return this.timedatepk;
    }
    
    public void setTimedatepk(Integer timedatepk) {
        this.timedatepk = timedatepk;
    }


    @Column(name="IP_TIMEDATEPK_REPORTING", precision=8, scale=0)
    public Integer getIpTimedatepkReporting() {
        return this.ipTimedatepkReporting;
    }
    
    public void setIpTimedatepkReporting(Integer ipTimedatepkReporting) {
        this.ipTimedatepkReporting = ipTimedatepkReporting;
    }


    @Column(name="PROGRAMNAME", length=10)
    public String getProgramname() {
        return this.programname;
    }
    
    public void setProgramname(String programname) {
        this.programname = programname;
    }


    @Column(name="FILENAME", length=10)
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }


    @Column(name="PROCESSINGFLAG1", length=1)
    public String getProcessingflag1() {
        return this.processingflag1;
    }
    
    public void setProcessingflag1(String processingflag1) {
        this.processingflag1 = processingflag1;
    }


    @Column(name="PROCESSINGFLAG2", length=1)
    public String getProcessingflag2() {
        return this.processingflag2;
    }
    
    public void setProcessingflag2(String processingflag2) {
        this.processingflag2 = processingflag2;
    }


    @Column(name="PROCESSINGFLAG3", length=1)
    public String getProcessingflag3() {
        return this.processingflag3;
    }
    
    public void setProcessingflag3(String processingflag3) {
        this.processingflag3 = processingflag3;
    }


    @Column(name="PROCESSINGFLAG4", length=1)
    public String getProcessingflag4() {
        return this.processingflag4;
    }
    
    public void setProcessingflag4(String processingflag4) {
        this.processingflag4 = processingflag4;
    }


    @Column(name="PROCESSINGFLAG5", length=1)
    public String getProcessingflag5() {
        return this.processingflag5;
    }
    
    public void setProcessingflag5(String processingflag5) {
        this.processingflag5 = processingflag5;
    }


    @Column(name="PROCESSINGFLAG6", length=1)
    public String getProcessingflag6() {
        return this.processingflag6;
    }
    
    public void setProcessingflag6(String processingflag6) {
        this.processingflag6 = processingflag6;
    }


    @Column(name="PROCESSINGFLAG7", length=1)
    public String getProcessingflag7() {
        return this.processingflag7;
    }
    
    public void setProcessingflag7(String processingflag7) {
        this.processingflag7 = processingflag7;
    }


    @Column(name="PROCESSINGFLAG8", length=1)
    public String getProcessingflag8() {
        return this.processingflag8;
    }
    
    public void setProcessingflag8(String processingflag8) {
        this.processingflag8 = processingflag8;
    }


    @Column(name="PROCESSINGFLAG9", length=1)
    public String getProcessingflag9() {
        return this.processingflag9;
    }
    
    public void setProcessingflag9(String processingflag9) {
        this.processingflag9 = processingflag9;
    }


    @Column(name="PROCESSINGFLAG10", length=1)
    public String getProcessingflag10() {
        return this.processingflag10;
    }
    
    public void setProcessingflag10(String processingflag10) {
        this.processingflag10 = processingflag10;
    }


    @Column(name="BACKENDRELEASED", nullable=false, length=1)
    public String getBackendreleased() {
        return this.backendreleased;
    }
    
    public void setBackendreleased(String backendreleased) {
        this.backendreleased = backendreleased;
    }


    @Column(name="OUTBOUNDIGNORE", nullable=false, length=1)
    public String getOutboundignore() {
        return this.outboundignore;
    }
    
    public void setOutboundignore(String outboundignore) {
        this.outboundignore = outboundignore;
    }


    @Column(name="TRANSACTIONID", length=50)
    public String getTransactionid() {
        return this.transactionid;
    }
    
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }


    @Column(name="RECORDPROCESSEDFLAG", nullable=false, length=1)
    public String getRecordprocessedflag() {
        return this.recordprocessedflag;
    }
    
    public void setRecordprocessedflag(String recordprocessedflag) {
        this.recordprocessedflag = recordprocessedflag;
    }


    @Column(name="RECORDPROCESSINGTIME", length=26)
    public Date getRecordprocessingtime() {
        return this.recordprocessingtime;
    }
    
    public void setRecordprocessingtime(Date recordprocessingtime) {
        this.recordprocessingtime = recordprocessingtime;
    }


    @Column(name="RECORDLASTCHANGETIME", length=26)
    public Date getRecordlastchangetime() {
        return this.recordlastchangetime;
    }
    
    public void setRecordlastchangetime(Date recordlastchangetime) {
        this.recordlastchangetime = recordlastchangetime;
    }


    @Column(name="RECORDCREATIONTIME", nullable=false, length=26)
    public Date getRecordcreationtime() {
        return this.recordcreationtime;
    }
    
    public void setRecordcreationtime(Date recordcreationtime) {
        this.recordcreationtime = recordcreationtime;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Rethdri01Id) ) return false;
		 Rethdri01Id castOther = ( Rethdri01Id ) other; 
         
		 return (this.getPk()==castOther.getPk())
 && (this.getContrdefpk()==castOther.getContrdefpk())
 && (this.getIncidentnr()==castOther.getIncidentnr())
 && ( (this.getIncidentdate()==castOther.getIncidentdate()) || ( this.getIncidentdate()!=null && castOther.getIncidentdate()!=null && this.getIncidentdate().equals(castOther.getIncidentdate()) ) )
 && ( (this.getSalesorganisation()==castOther.getSalesorganisation()) || ( this.getSalesorganisation()!=null && castOther.getSalesorganisation()!=null && this.getSalesorganisation().equals(castOther.getSalesorganisation()) ) )
 && ( (this.getSalesorganisationdesc()==castOther.getSalesorganisationdesc()) || ( this.getSalesorganisationdesc()!=null && castOther.getSalesorganisationdesc()!=null && this.getSalesorganisationdesc().equals(castOther.getSalesorganisationdesc()) ) )
 && ( (this.getPrinciplereferencenr()==castOther.getPrinciplereferencenr()) || ( this.getPrinciplereferencenr()!=null && castOther.getPrinciplereferencenr()!=null && this.getPrinciplereferencenr().equals(castOther.getPrinciplereferencenr()) ) )
 && (this.getBizparaddrpk()==castOther.getBizparaddrpk())
 && ( (this.getCustomercontractor()==castOther.getCustomercontractor()) || ( this.getCustomercontractor()!=null && castOther.getCustomercontractor()!=null && this.getCustomercontractor().equals(castOther.getCustomercontractor()) ) )
 && ( (this.getProblemcode()==castOther.getProblemcode()) || ( this.getProblemcode()!=null && castOther.getProblemcode()!=null && this.getProblemcode().equals(castOther.getProblemcode()) ) )
 && ( (this.getResolutioncode()==castOther.getResolutioncode()) || ( this.getResolutioncode()!=null && castOther.getResolutioncode()!=null && this.getResolutioncode().equals(castOther.getResolutioncode()) ) )
 && ( (this.getHandler()==castOther.getHandler()) || ( this.getHandler()!=null && castOther.getHandler()!=null && this.getHandler().equals(castOther.getHandler()) ) )
 && ( (this.getCustomerreturndate()==castOther.getCustomerreturndate()) || ( this.getCustomerreturndate()!=null && castOther.getCustomerreturndate()!=null && this.getCustomerreturndate().equals(castOther.getCustomerreturndate()) ) )
 && ( (this.getCustomerreference()==castOther.getCustomerreference()) || ( this.getCustomerreference()!=null && castOther.getCustomerreference()!=null && this.getCustomerreference().equals(castOther.getCustomerreference()) ) )
 && ( (this.getTypeofreference()==castOther.getTypeofreference()) || ( this.getTypeofreference()!=null && castOther.getTypeofreference()!=null && this.getTypeofreference().equals(castOther.getTypeofreference()) ) )
 && ( (this.getReferencenr()==castOther.getReferencenr()) || ( this.getReferencenr()!=null && castOther.getReferencenr()!=null && this.getReferencenr().equals(castOther.getReferencenr()) ) )
 && ( (this.getTimedatepk()==castOther.getTimedatepk()) || ( this.getTimedatepk()!=null && castOther.getTimedatepk()!=null && this.getTimedatepk().equals(castOther.getTimedatepk()) ) )
 && ( (this.getIpTimedatepkReporting()==castOther.getIpTimedatepkReporting()) || ( this.getIpTimedatepkReporting()!=null && castOther.getIpTimedatepkReporting()!=null && this.getIpTimedatepkReporting().equals(castOther.getIpTimedatepkReporting()) ) )
 && ( (this.getProgramname()==castOther.getProgramname()) || ( this.getProgramname()!=null && castOther.getProgramname()!=null && this.getProgramname().equals(castOther.getProgramname()) ) )
 && ( (this.getFilename()==castOther.getFilename()) || ( this.getFilename()!=null && castOther.getFilename()!=null && this.getFilename().equals(castOther.getFilename()) ) )
 && ( (this.getProcessingflag1()==castOther.getProcessingflag1()) || ( this.getProcessingflag1()!=null && castOther.getProcessingflag1()!=null && this.getProcessingflag1().equals(castOther.getProcessingflag1()) ) )
 && ( (this.getProcessingflag2()==castOther.getProcessingflag2()) || ( this.getProcessingflag2()!=null && castOther.getProcessingflag2()!=null && this.getProcessingflag2().equals(castOther.getProcessingflag2()) ) )
 && ( (this.getProcessingflag3()==castOther.getProcessingflag3()) || ( this.getProcessingflag3()!=null && castOther.getProcessingflag3()!=null && this.getProcessingflag3().equals(castOther.getProcessingflag3()) ) )
 && ( (this.getProcessingflag4()==castOther.getProcessingflag4()) || ( this.getProcessingflag4()!=null && castOther.getProcessingflag4()!=null && this.getProcessingflag4().equals(castOther.getProcessingflag4()) ) )
 && ( (this.getProcessingflag5()==castOther.getProcessingflag5()) || ( this.getProcessingflag5()!=null && castOther.getProcessingflag5()!=null && this.getProcessingflag5().equals(castOther.getProcessingflag5()) ) )
 && ( (this.getProcessingflag6()==castOther.getProcessingflag6()) || ( this.getProcessingflag6()!=null && castOther.getProcessingflag6()!=null && this.getProcessingflag6().equals(castOther.getProcessingflag6()) ) )
 && ( (this.getProcessingflag7()==castOther.getProcessingflag7()) || ( this.getProcessingflag7()!=null && castOther.getProcessingflag7()!=null && this.getProcessingflag7().equals(castOther.getProcessingflag7()) ) )
 && ( (this.getProcessingflag8()==castOther.getProcessingflag8()) || ( this.getProcessingflag8()!=null && castOther.getProcessingflag8()!=null && this.getProcessingflag8().equals(castOther.getProcessingflag8()) ) )
 && ( (this.getProcessingflag9()==castOther.getProcessingflag9()) || ( this.getProcessingflag9()!=null && castOther.getProcessingflag9()!=null && this.getProcessingflag9().equals(castOther.getProcessingflag9()) ) )
 && ( (this.getProcessingflag10()==castOther.getProcessingflag10()) || ( this.getProcessingflag10()!=null && castOther.getProcessingflag10()!=null && this.getProcessingflag10().equals(castOther.getProcessingflag10()) ) )
 && ( (this.getBackendreleased()==castOther.getBackendreleased()) || ( this.getBackendreleased()!=null && castOther.getBackendreleased()!=null && this.getBackendreleased().equals(castOther.getBackendreleased()) ) )
 && ( (this.getOutboundignore()==castOther.getOutboundignore()) || ( this.getOutboundignore()!=null && castOther.getOutboundignore()!=null && this.getOutboundignore().equals(castOther.getOutboundignore()) ) )
 && ( (this.getTransactionid()==castOther.getTransactionid()) || ( this.getTransactionid()!=null && castOther.getTransactionid()!=null && this.getTransactionid().equals(castOther.getTransactionid()) ) )
 && ( (this.getRecordprocessedflag()==castOther.getRecordprocessedflag()) || ( this.getRecordprocessedflag()!=null && castOther.getRecordprocessedflag()!=null && this.getRecordprocessedflag().equals(castOther.getRecordprocessedflag()) ) )
 && ( (this.getRecordprocessingtime()==castOther.getRecordprocessingtime()) || ( this.getRecordprocessingtime()!=null && castOther.getRecordprocessingtime()!=null && this.getRecordprocessingtime().equals(castOther.getRecordprocessingtime()) ) )
 && ( (this.getRecordlastchangetime()==castOther.getRecordlastchangetime()) || ( this.getRecordlastchangetime()!=null && castOther.getRecordlastchangetime()!=null && this.getRecordlastchangetime().equals(castOther.getRecordlastchangetime()) ) )
 && ( (this.getRecordcreationtime()==castOther.getRecordcreationtime()) || ( this.getRecordcreationtime()!=null && castOther.getRecordcreationtime()!=null && this.getRecordcreationtime().equals(castOther.getRecordcreationtime()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getPk();
         result = 37 * result + (int) this.getContrdefpk();
         result = 37 * result + (int) this.getIncidentnr();
         result = 37 * result + ( getIncidentdate() == null ? 0 : this.getIncidentdate().hashCode() );
         result = 37 * result + ( getSalesorganisation() == null ? 0 : this.getSalesorganisation().hashCode() );
         result = 37 * result + ( getSalesorganisationdesc() == null ? 0 : this.getSalesorganisationdesc().hashCode() );
         result = 37 * result + ( getPrinciplereferencenr() == null ? 0 : this.getPrinciplereferencenr().hashCode() );
         result = 37 * result + (int) this.getBizparaddrpk();
         result = 37 * result + ( getCustomercontractor() == null ? 0 : this.getCustomercontractor().hashCode() );
         result = 37 * result + ( getProblemcode() == null ? 0 : this.getProblemcode().hashCode() );
         result = 37 * result + ( getResolutioncode() == null ? 0 : this.getResolutioncode().hashCode() );
         result = 37 * result + ( getHandler() == null ? 0 : this.getHandler().hashCode() );
         result = 37 * result + ( getCustomerreturndate() == null ? 0 : this.getCustomerreturndate().hashCode() );
         result = 37 * result + ( getCustomerreference() == null ? 0 : this.getCustomerreference().hashCode() );
         result = 37 * result + ( getTypeofreference() == null ? 0 : this.getTypeofreference().hashCode() );
         result = 37 * result + ( getReferencenr() == null ? 0 : this.getReferencenr().hashCode() );
         result = 37 * result + ( getTimedatepk() == null ? 0 : this.getTimedatepk().hashCode() );
         result = 37 * result + ( getIpTimedatepkReporting() == null ? 0 : this.getIpTimedatepkReporting().hashCode() );
         result = 37 * result + ( getProgramname() == null ? 0 : this.getProgramname().hashCode() );
         result = 37 * result + ( getFilename() == null ? 0 : this.getFilename().hashCode() );
         result = 37 * result + ( getProcessingflag1() == null ? 0 : this.getProcessingflag1().hashCode() );
         result = 37 * result + ( getProcessingflag2() == null ? 0 : this.getProcessingflag2().hashCode() );
         result = 37 * result + ( getProcessingflag3() == null ? 0 : this.getProcessingflag3().hashCode() );
         result = 37 * result + ( getProcessingflag4() == null ? 0 : this.getProcessingflag4().hashCode() );
         result = 37 * result + ( getProcessingflag5() == null ? 0 : this.getProcessingflag5().hashCode() );
         result = 37 * result + ( getProcessingflag6() == null ? 0 : this.getProcessingflag6().hashCode() );
         result = 37 * result + ( getProcessingflag7() == null ? 0 : this.getProcessingflag7().hashCode() );
         result = 37 * result + ( getProcessingflag8() == null ? 0 : this.getProcessingflag8().hashCode() );
         result = 37 * result + ( getProcessingflag9() == null ? 0 : this.getProcessingflag9().hashCode() );
         result = 37 * result + ( getProcessingflag10() == null ? 0 : this.getProcessingflag10().hashCode() );
         result = 37 * result + ( getBackendreleased() == null ? 0 : this.getBackendreleased().hashCode() );
         result = 37 * result + ( getOutboundignore() == null ? 0 : this.getOutboundignore().hashCode() );
         result = 37 * result + ( getTransactionid() == null ? 0 : this.getTransactionid().hashCode() );
         result = 37 * result + ( getRecordprocessedflag() == null ? 0 : this.getRecordprocessedflag().hashCode() );
         result = 37 * result + ( getRecordprocessingtime() == null ? 0 : this.getRecordprocessingtime().hashCode() );
         result = 37 * result + ( getRecordlastchangetime() == null ? 0 : this.getRecordlastchangetime().hashCode() );
         result = 37 * result + ( getRecordcreationtime() == null ? 0 : this.getRecordcreationtime().hashCode() );
         return result;
   }   


}


