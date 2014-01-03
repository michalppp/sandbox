package com.galexis.allog2mysql.deleteme;
// Generated Sep 6, 2013 9:37:59 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Timedate generated by hbm2java
 */
@Entity
@Table(name="TIMEDATE"
    ,schema="INTEGAP"
    ,catalog="CHGALE11RDB"
    , uniqueConstraints = @UniqueConstraint(columnNames="TDDATE") 
)
public class Timedate  implements java.io.Serializable {


     private int pk;
     private Date tddate;
     private short tdyear;
     private byte tdmonth;
     private byte tdday;
     private byte tdweekofyear;
     private String daycode;
     private String daydesc;
     private String monthcode;
     private String monthdesc;
     private String quartercode;
     private String isleapyear;
     private Integer actualperiod;
     private Integer actualperiodlastday;
     private Integer actualperiodfirstday;
     private Integer previousperiod;
     private Integer previousperiodlastday;
     private Integer previousperiodfirstday;
     private Integer previousyearperiod;
     private Integer previyearpreviperiod;
     private Integer prevyearprevperiodlastday;
     private Integer prevyearprevperiodfirstday;
     private Set<Grehdr> grehdrsForIpTimedatepkReporting = new HashSet<Grehdr>(0);
     private Set<Custopohdr> custopohdrsForTimedatepk = new HashSet<Custopohdr>(0);
     private Set<Custopohdr> custopohdrsForIpTimedatepkReporting = new HashSet<Custopohdr>(0);
     private Set<Stockrclop> stockrclopsForTimedatepk = new HashSet<Stockrclop>(0);
     private Set<Delhdr> delhdrsForIpTimedatepkReporting = new HashSet<Delhdr>(0);
     private Set<Stockrclop> stockrclopsForIpTimedatepkReporting = new HashSet<Stockrclop>(0);
     private Set<Grehdr> grehdrsForTimedatepk = new HashSet<Grehdr>(0);
     private Set<Delhdr> delhdrsForTimedatepk = new HashSet<Delhdr>(0);
     private Set<Stockrebtc> stockrebtcsForTimedatepk = new HashSet<Stockrebtc>(0);
     private Set<Stockrcbtc> stockrcbtcsForIpTimedatepkReporting = new HashSet<Stockrcbtc>(0);
     private Set<Invhdr> invhdrsForTimedatepk = new HashSet<Invhdr>(0);
     private Set<Invhdr> invhdrsForIpTimedatepkReporting = new HashSet<Invhdr>(0);
     private Set<Psilincnf> psilincnfsForTimedatepk = new HashSet<Psilincnf>(0);
     private Set<Stockrcbtc> stockrcbtcsForTimedatepk = new HashSet<Stockrcbtc>(0);
     private Set<Invmovmnt> invmovmntsForTimedatepk = new HashSet<Invmovmnt>(0);
     private Set<Stockrebtc> stockrebtcsForIpTimedatepkReporting = new HashSet<Stockrebtc>(0);
     private Set<Invmovmnt> invmovmntsForIpTimedatepkReporting = new HashSet<Invmovmnt>(0);
     private Set<Rethdr> rethdrsForTimedatepk = new HashSet<Rethdr>(0);
     private Set<Rethdr> rethdrsForIpTimedatepkReporting = new HashSet<Rethdr>(0);
     private Set<Psilincnf> psilincnfsForIpTimedatepkReporting = new HashSet<Psilincnf>(0);

    public Timedate() {
    }

	
    public Timedate(int pk, Date tddate, short tdyear, byte tdmonth, byte tdday, byte tdweekofyear, String daycode, String daydesc, String monthcode, String monthdesc, String quartercode, String isleapyear) {
        this.pk = pk;
        this.tddate = tddate;
        this.tdyear = tdyear;
        this.tdmonth = tdmonth;
        this.tdday = tdday;
        this.tdweekofyear = tdweekofyear;
        this.daycode = daycode;
        this.daydesc = daydesc;
        this.monthcode = monthcode;
        this.monthdesc = monthdesc;
        this.quartercode = quartercode;
        this.isleapyear = isleapyear;
    }
    public Timedate(int pk, Date tddate, short tdyear, byte tdmonth, byte tdday, byte tdweekofyear, String daycode, String daydesc, String monthcode, String monthdesc, String quartercode, String isleapyear, Integer actualperiod, Integer actualperiodlastday, Integer actualperiodfirstday, Integer previousperiod, Integer previousperiodlastday, Integer previousperiodfirstday, Integer previousyearperiod, Integer previyearpreviperiod, Integer prevyearprevperiodlastday, Integer prevyearprevperiodfirstday, Set<Grehdr> grehdrsForIpTimedatepkReporting, Set<Custopohdr> custopohdrsForTimedatepk, Set<Custopohdr> custopohdrsForIpTimedatepkReporting, Set<Stockrclop> stockrclopsForTimedatepk, Set<Delhdr> delhdrsForIpTimedatepkReporting, Set<Stockrclop> stockrclopsForIpTimedatepkReporting, Set<Grehdr> grehdrsForTimedatepk, Set<Delhdr> delhdrsForTimedatepk, Set<Stockrebtc> stockrebtcsForTimedatepk, Set<Stockrcbtc> stockrcbtcsForIpTimedatepkReporting, Set<Invhdr> invhdrsForTimedatepk, Set<Invhdr> invhdrsForIpTimedatepkReporting, Set<Psilincnf> psilincnfsForTimedatepk, Set<Stockrcbtc> stockrcbtcsForTimedatepk, Set<Invmovmnt> invmovmntsForTimedatepk, Set<Stockrebtc> stockrebtcsForIpTimedatepkReporting, Set<Invmovmnt> invmovmntsForIpTimedatepkReporting, Set<Rethdr> rethdrsForTimedatepk, Set<Rethdr> rethdrsForIpTimedatepkReporting, Set<Psilincnf> psilincnfsForIpTimedatepkReporting) {
       this.pk = pk;
       this.tddate = tddate;
       this.tdyear = tdyear;
       this.tdmonth = tdmonth;
       this.tdday = tdday;
       this.tdweekofyear = tdweekofyear;
       this.daycode = daycode;
       this.daydesc = daydesc;
       this.monthcode = monthcode;
       this.monthdesc = monthdesc;
       this.quartercode = quartercode;
       this.isleapyear = isleapyear;
       this.actualperiod = actualperiod;
       this.actualperiodlastday = actualperiodlastday;
       this.actualperiodfirstday = actualperiodfirstday;
       this.previousperiod = previousperiod;
       this.previousperiodlastday = previousperiodlastday;
       this.previousperiodfirstday = previousperiodfirstday;
       this.previousyearperiod = previousyearperiod;
       this.previyearpreviperiod = previyearpreviperiod;
       this.prevyearprevperiodlastday = prevyearprevperiodlastday;
       this.prevyearprevperiodfirstday = prevyearprevperiodfirstday;
       this.grehdrsForIpTimedatepkReporting = grehdrsForIpTimedatepkReporting;
       this.custopohdrsForTimedatepk = custopohdrsForTimedatepk;
       this.custopohdrsForIpTimedatepkReporting = custopohdrsForIpTimedatepkReporting;
       this.stockrclopsForTimedatepk = stockrclopsForTimedatepk;
       this.delhdrsForIpTimedatepkReporting = delhdrsForIpTimedatepkReporting;
       this.stockrclopsForIpTimedatepkReporting = stockrclopsForIpTimedatepkReporting;
       this.grehdrsForTimedatepk = grehdrsForTimedatepk;
       this.delhdrsForTimedatepk = delhdrsForTimedatepk;
       this.stockrebtcsForTimedatepk = stockrebtcsForTimedatepk;
       this.stockrcbtcsForIpTimedatepkReporting = stockrcbtcsForIpTimedatepkReporting;
       this.invhdrsForTimedatepk = invhdrsForTimedatepk;
       this.invhdrsForIpTimedatepkReporting = invhdrsForIpTimedatepkReporting;
       this.psilincnfsForTimedatepk = psilincnfsForTimedatepk;
       this.stockrcbtcsForTimedatepk = stockrcbtcsForTimedatepk;
       this.invmovmntsForTimedatepk = invmovmntsForTimedatepk;
       this.stockrebtcsForIpTimedatepkReporting = stockrebtcsForIpTimedatepkReporting;
       this.invmovmntsForIpTimedatepkReporting = invmovmntsForIpTimedatepkReporting;
       this.rethdrsForTimedatepk = rethdrsForTimedatepk;
       this.rethdrsForIpTimedatepkReporting = rethdrsForIpTimedatepkReporting;
       this.psilincnfsForIpTimedatepkReporting = psilincnfsForIpTimedatepkReporting;
    }
   
     @Id 

    
    @Column(name="PK", unique=true, nullable=false, precision=8, scale=0)
    public int getPk() {
        return this.pk;
    }
    
    public void setPk(int pk) {
        this.pk = pk;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="TDDATE", unique=true, nullable=false, length=10)
    public Date getTddate() {
        return this.tddate;
    }
    
    public void setTddate(Date tddate) {
        this.tddate = tddate;
    }

    
    @Column(name="TDYEAR", nullable=false, precision=4, scale=0)
    public short getTdyear() {
        return this.tdyear;
    }
    
    public void setTdyear(short tdyear) {
        this.tdyear = tdyear;
    }

    
    @Column(name="TDMONTH", nullable=false, precision=2, scale=0)
    public byte getTdmonth() {
        return this.tdmonth;
    }
    
    public void setTdmonth(byte tdmonth) {
        this.tdmonth = tdmonth;
    }

    
    @Column(name="TDDAY", nullable=false, precision=2, scale=0)
    public byte getTdday() {
        return this.tdday;
    }
    
    public void setTdday(byte tdday) {
        this.tdday = tdday;
    }

    
    @Column(name="TDWEEKOFYEAR", nullable=false, precision=2, scale=0)
    public byte getTdweekofyear() {
        return this.tdweekofyear;
    }
    
    public void setTdweekofyear(byte tdweekofyear) {
        this.tdweekofyear = tdweekofyear;
    }

    
    @Column(name="DAYCODE", nullable=false, length=3)
    public String getDaycode() {
        return this.daycode;
    }
    
    public void setDaycode(String daycode) {
        this.daycode = daycode;
    }

    
    @Column(name="DAYDESC", nullable=false, length=30)
    public String getDaydesc() {
        return this.daydesc;
    }
    
    public void setDaydesc(String daydesc) {
        this.daydesc = daydesc;
    }

    
    @Column(name="MONTHCODE", nullable=false, length=3)
    public String getMonthcode() {
        return this.monthcode;
    }
    
    public void setMonthcode(String monthcode) {
        this.monthcode = monthcode;
    }

    
    @Column(name="MONTHDESC", nullable=false, length=30)
    public String getMonthdesc() {
        return this.monthdesc;
    }
    
    public void setMonthdesc(String monthdesc) {
        this.monthdesc = monthdesc;
    }

    
    @Column(name="QUARTERCODE", nullable=false, length=2)
    public String getQuartercode() {
        return this.quartercode;
    }
    
    public void setQuartercode(String quartercode) {
        this.quartercode = quartercode;
    }

    
    @Column(name="ISLEAPYEAR", nullable=false, length=1)
    public String getIsleapyear() {
        return this.isleapyear;
    }
    
    public void setIsleapyear(String isleapyear) {
        this.isleapyear = isleapyear;
    }

    
    @Column(name="ACTUALPERIOD", precision=6, scale=0)
    public Integer getActualperiod() {
        return this.actualperiod;
    }
    
    public void setActualperiod(Integer actualperiod) {
        this.actualperiod = actualperiod;
    }

    
    @Column(name="ACTUALPERIODLASTDAY", precision=8, scale=0)
    public Integer getActualperiodlastday() {
        return this.actualperiodlastday;
    }
    
    public void setActualperiodlastday(Integer actualperiodlastday) {
        this.actualperiodlastday = actualperiodlastday;
    }

    
    @Column(name="ACTUALPERIODFIRSTDAY", precision=8, scale=0)
    public Integer getActualperiodfirstday() {
        return this.actualperiodfirstday;
    }
    
    public void setActualperiodfirstday(Integer actualperiodfirstday) {
        this.actualperiodfirstday = actualperiodfirstday;
    }

    
    @Column(name="PREVIOUSPERIOD", precision=6, scale=0)
    public Integer getPreviousperiod() {
        return this.previousperiod;
    }
    
    public void setPreviousperiod(Integer previousperiod) {
        this.previousperiod = previousperiod;
    }

    
    @Column(name="PREVIOUSPERIODLASTDAY", precision=8, scale=0)
    public Integer getPreviousperiodlastday() {
        return this.previousperiodlastday;
    }
    
    public void setPreviousperiodlastday(Integer previousperiodlastday) {
        this.previousperiodlastday = previousperiodlastday;
    }

    
    @Column(name="PREVIOUSPERIODFIRSTDAY", precision=8, scale=0)
    public Integer getPreviousperiodfirstday() {
        return this.previousperiodfirstday;
    }
    
    public void setPreviousperiodfirstday(Integer previousperiodfirstday) {
        this.previousperiodfirstday = previousperiodfirstday;
    }

    
    @Column(name="PREVIOUSYEARPERIOD", precision=6, scale=0)
    public Integer getPreviousyearperiod() {
        return this.previousyearperiod;
    }
    
    public void setPreviousyearperiod(Integer previousyearperiod) {
        this.previousyearperiod = previousyearperiod;
    }

    
    @Column(name="PREVIYEARPREVIPERIOD", precision=6, scale=0)
    public Integer getPreviyearpreviperiod() {
        return this.previyearpreviperiod;
    }
    
    public void setPreviyearpreviperiod(Integer previyearpreviperiod) {
        this.previyearpreviperiod = previyearpreviperiod;
    }

    
    @Column(name="PREVYEARPREVPERIODLASTDAY", precision=8, scale=0)
    public Integer getPrevyearprevperiodlastday() {
        return this.prevyearprevperiodlastday;
    }
    
    public void setPrevyearprevperiodlastday(Integer prevyearprevperiodlastday) {
        this.prevyearprevperiodlastday = prevyearprevperiodlastday;
    }

    
    @Column(name="PREVYEARPREVPERIODFIRSTDAY", precision=8, scale=0)
    public Integer getPrevyearprevperiodfirstday() {
        return this.prevyearprevperiodfirstday;
    }
    
    public void setPrevyearprevperiodfirstday(Integer prevyearprevperiodfirstday) {
        this.prevyearprevperiodfirstday = prevyearprevperiodfirstday;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Grehdr> getGrehdrsForIpTimedatepkReporting() {
        return this.grehdrsForIpTimedatepkReporting;
    }
    
    public void setGrehdrsForIpTimedatepkReporting(Set<Grehdr> grehdrsForIpTimedatepkReporting) {
        this.grehdrsForIpTimedatepkReporting = grehdrsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Custopohdr> getCustopohdrsForTimedatepk() {
        return this.custopohdrsForTimedatepk;
    }
    
    public void setCustopohdrsForTimedatepk(Set<Custopohdr> custopohdrsForTimedatepk) {
        this.custopohdrsForTimedatepk = custopohdrsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Custopohdr> getCustopohdrsForIpTimedatepkReporting() {
        return this.custopohdrsForIpTimedatepkReporting;
    }
    
    public void setCustopohdrsForIpTimedatepkReporting(Set<Custopohdr> custopohdrsForIpTimedatepkReporting) {
        this.custopohdrsForIpTimedatepkReporting = custopohdrsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Stockrclop> getStockrclopsForTimedatepk() {
        return this.stockrclopsForTimedatepk;
    }
    
    public void setStockrclopsForTimedatepk(Set<Stockrclop> stockrclopsForTimedatepk) {
        this.stockrclopsForTimedatepk = stockrclopsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Delhdr> getDelhdrsForIpTimedatepkReporting() {
        return this.delhdrsForIpTimedatepkReporting;
    }
    
    public void setDelhdrsForIpTimedatepkReporting(Set<Delhdr> delhdrsForIpTimedatepkReporting) {
        this.delhdrsForIpTimedatepkReporting = delhdrsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Stockrclop> getStockrclopsForIpTimedatepkReporting() {
        return this.stockrclopsForIpTimedatepkReporting;
    }
    
    public void setStockrclopsForIpTimedatepkReporting(Set<Stockrclop> stockrclopsForIpTimedatepkReporting) {
        this.stockrclopsForIpTimedatepkReporting = stockrclopsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Grehdr> getGrehdrsForTimedatepk() {
        return this.grehdrsForTimedatepk;
    }
    
    public void setGrehdrsForTimedatepk(Set<Grehdr> grehdrsForTimedatepk) {
        this.grehdrsForTimedatepk = grehdrsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Delhdr> getDelhdrsForTimedatepk() {
        return this.delhdrsForTimedatepk;
    }
    
    public void setDelhdrsForTimedatepk(Set<Delhdr> delhdrsForTimedatepk) {
        this.delhdrsForTimedatepk = delhdrsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Stockrebtc> getStockrebtcsForTimedatepk() {
        return this.stockrebtcsForTimedatepk;
    }
    
    public void setStockrebtcsForTimedatepk(Set<Stockrebtc> stockrebtcsForTimedatepk) {
        this.stockrebtcsForTimedatepk = stockrebtcsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Stockrcbtc> getStockrcbtcsForIpTimedatepkReporting() {
        return this.stockrcbtcsForIpTimedatepkReporting;
    }
    
    public void setStockrcbtcsForIpTimedatepkReporting(Set<Stockrcbtc> stockrcbtcsForIpTimedatepkReporting) {
        this.stockrcbtcsForIpTimedatepkReporting = stockrcbtcsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Invhdr> getInvhdrsForTimedatepk() {
        return this.invhdrsForTimedatepk;
    }
    
    public void setInvhdrsForTimedatepk(Set<Invhdr> invhdrsForTimedatepk) {
        this.invhdrsForTimedatepk = invhdrsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Invhdr> getInvhdrsForIpTimedatepkReporting() {
        return this.invhdrsForIpTimedatepkReporting;
    }
    
    public void setInvhdrsForIpTimedatepkReporting(Set<Invhdr> invhdrsForIpTimedatepkReporting) {
        this.invhdrsForIpTimedatepkReporting = invhdrsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Psilincnf> getPsilincnfsForTimedatepk() {
        return this.psilincnfsForTimedatepk;
    }
    
    public void setPsilincnfsForTimedatepk(Set<Psilincnf> psilincnfsForTimedatepk) {
        this.psilincnfsForTimedatepk = psilincnfsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Stockrcbtc> getStockrcbtcsForTimedatepk() {
        return this.stockrcbtcsForTimedatepk;
    }
    
    public void setStockrcbtcsForTimedatepk(Set<Stockrcbtc> stockrcbtcsForTimedatepk) {
        this.stockrcbtcsForTimedatepk = stockrcbtcsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Invmovmnt> getInvmovmntsForTimedatepk() {
        return this.invmovmntsForTimedatepk;
    }
    
    public void setInvmovmntsForTimedatepk(Set<Invmovmnt> invmovmntsForTimedatepk) {
        this.invmovmntsForTimedatepk = invmovmntsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Stockrebtc> getStockrebtcsForIpTimedatepkReporting() {
        return this.stockrebtcsForIpTimedatepkReporting;
    }
    
    public void setStockrebtcsForIpTimedatepkReporting(Set<Stockrebtc> stockrebtcsForIpTimedatepkReporting) {
        this.stockrebtcsForIpTimedatepkReporting = stockrebtcsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Invmovmnt> getInvmovmntsForIpTimedatepkReporting() {
        return this.invmovmntsForIpTimedatepkReporting;
    }
    
    public void setInvmovmntsForIpTimedatepkReporting(Set<Invmovmnt> invmovmntsForIpTimedatepkReporting) {
        this.invmovmntsForIpTimedatepkReporting = invmovmntsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByTimedatepk")
    public Set<Rethdr> getRethdrsForTimedatepk() {
        return this.rethdrsForTimedatepk;
    }
    
    public void setRethdrsForTimedatepk(Set<Rethdr> rethdrsForTimedatepk) {
        this.rethdrsForTimedatepk = rethdrsForTimedatepk;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Rethdr> getRethdrsForIpTimedatepkReporting() {
        return this.rethdrsForIpTimedatepkReporting;
    }
    
    public void setRethdrsForIpTimedatepkReporting(Set<Rethdr> rethdrsForIpTimedatepkReporting) {
        this.rethdrsForIpTimedatepkReporting = rethdrsForIpTimedatepkReporting;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="timedateByIpTimedatepkReporting")
    public Set<Psilincnf> getPsilincnfsForIpTimedatepkReporting() {
        return this.psilincnfsForIpTimedatepkReporting;
    }
    
    public void setPsilincnfsForIpTimedatepkReporting(Set<Psilincnf> psilincnfsForIpTimedatepkReporting) {
        this.psilincnfsForIpTimedatepkReporting = psilincnfsForIpTimedatepkReporting;
    }




}


