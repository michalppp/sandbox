package com.galexis.alloga2mysql.model;

// Generated Mar 4, 2013 4:41:13 PM by Hibernate Tools 4.0.0

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Jobdef generated by hbm2java
 */
@Entity
@Table(name = "JOBDEF")
public class Jobdef implements java.io.Serializable {

	private long pk;

	private String version;

	private long contrdefpk;

	private String jobname;

	private String backendresource;

	private String jobclass;

	private String executionmode;

	private String taskmessagetype;

	private String taskdefinitionversion;

	private String content;

	private short triggerrepeatcount;

	private long triggerrepepeatinterval;

	private String groupname;

	private String jobdescription;

	private char volatility;

	private char durability;

	private char recover;

	private char autoprocessinglog;

	private String processinghost;

	private Character executeaftertime;

	private Date lastruntime;

	private Date recordcreationtime;

	private Long selstcelempk;

	public Jobdef() {
	}

	public Jobdef(long pk, long contrdefpk, String jobname, String backendresource, String jobclass, String executionmode, String taskmessagetype, String taskdefinitionversion,
	        String content, short triggerrepeatcount, long triggerrepepeatinterval, String groupname, char volatility, char durability, char recover, char autoprocessinglog,
	        String processinghost, Date recordcreationtime) {
		this.pk = pk;
		this.contrdefpk = contrdefpk;
		this.jobname = jobname;
		this.backendresource = backendresource;
		this.jobclass = jobclass;
		this.executionmode = executionmode;
		this.taskmessagetype = taskmessagetype;
		this.taskdefinitionversion = taskdefinitionversion;
		this.content = content;
		this.triggerrepeatcount = triggerrepeatcount;
		this.triggerrepepeatinterval = triggerrepepeatinterval;
		this.groupname = groupname;
		this.volatility = volatility;
		this.durability = durability;
		this.recover = recover;
		this.autoprocessinglog = autoprocessinglog;
		this.processinghost = processinghost;
		this.recordcreationtime = recordcreationtime;
	}

	public Jobdef(long pk, long contrdefpk, String jobname, String backendresource, String jobclass, String executionmode, String taskmessagetype, String taskdefinitionversion,
	        String content, short triggerrepeatcount, long triggerrepepeatinterval, String groupname, String jobdescription, char volatility, char durability, char recover,
	        char autoprocessinglog, String processinghost, Character executeaftertime, Date lastruntime, Date recordcreationtime, Long selstcelempk) {
		this.pk = pk;
		this.contrdefpk = contrdefpk;
		this.jobname = jobname;
		this.backendresource = backendresource;
		this.jobclass = jobclass;
		this.executionmode = executionmode;
		this.taskmessagetype = taskmessagetype;
		this.taskdefinitionversion = taskdefinitionversion;
		this.content = content;
		this.triggerrepeatcount = triggerrepeatcount;
		this.triggerrepepeatinterval = triggerrepepeatinterval;
		this.groupname = groupname;
		this.jobdescription = jobdescription;
		this.volatility = volatility;
		this.durability = durability;
		this.recover = recover;
		this.autoprocessinglog = autoprocessinglog;
		this.processinghost = processinghost;
		this.executeaftertime = executeaftertime;
		this.lastruntime = lastruntime;
		this.recordcreationtime = recordcreationtime;
		this.selstcelempk = selstcelempk;
	}

	@Id
	@Column(name = "PK", unique = true, nullable = false, precision = 12, scale = 0)
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	@Column(name = "VERSION", nullable = false, length = 8)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "CONTRDEFPK", nullable = false, precision = 12, scale = 0)
	public long getContrdefpk() {
		return this.contrdefpk;
	}

	public void setContrdefpk(long contrdefpk) {
		this.contrdefpk = contrdefpk;
	}

	@Column(name = "JOBNAME", nullable = false, length = 50)
	public String getJobname() {
		return this.jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	@Column(name = "BACKENDRESOURCE", nullable = false, length = 10)
	public String getBackendresource() {
		return this.backendresource;
	}

	public void setBackendresource(String backendresource) {
		this.backendresource = backendresource;
	}

	@Column(name = "JOBCLASS", nullable = false, length = 200)
	public String getJobclass() {
		return this.jobclass;
	}

	public void setJobclass(String jobclass) {
		this.jobclass = jobclass;
	}

	@Column(name = "EXECUTIONMODE", nullable = false, length = 30)
	public String getExecutionmode() {
		return this.executionmode;
	}

	public void setExecutionmode(String executionmode) {
		this.executionmode = executionmode;
	}

	@Column(name = "TASKMESSAGETYPE", nullable = false, length = 50)
	public String getTaskmessagetype() {
		return this.taskmessagetype;
	}

	public void setTaskmessagetype(String taskmessagetype) {
		this.taskmessagetype = taskmessagetype;
	}

	@Column(name = "TASKDEFINITIONVERSION", nullable = false, length = 8)
	public String getTaskdefinitionversion() {
		return this.taskdefinitionversion;
	}

	public void setTaskdefinitionversion(String taskdefinitionversion) {
		this.taskdefinitionversion = taskdefinitionversion;
	}

	@Column(name = "CONTENT", nullable = false, length = 2500)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "TRIGGERREPEATCOUNT", nullable = false, precision = 4, scale = 0)
	public short getTriggerrepeatcount() {
		return this.triggerrepeatcount;
	}

	public void setTriggerrepeatcount(short triggerrepeatcount) {
		this.triggerrepeatcount = triggerrepeatcount;
	}

	@Column(name = "TRIGGERREPEPEATINTERVAL", nullable = false, precision = 10, scale = 0)
	public long getTriggerrepepeatinterval() {
		return this.triggerrepepeatinterval;
	}

	public void setTriggerrepepeatinterval(long triggerrepepeatinterval) {
		this.triggerrepepeatinterval = triggerrepepeatinterval;
	}

	@Column(name = "GROUPNAME", nullable = false, length = 30)
	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	@Column(name = "JOBDESCRIPTION")
	public String getJobdescription() {
		return this.jobdescription;
	}

	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}

	@Column(name = "VOLATILITY", nullable = false, length = 1)
	public char getVolatility() {
		return this.volatility;
	}

	public void setVolatility(char volatility) {
		this.volatility = volatility;
	}

	@Column(name = "DURABILITY", nullable = false, length = 1)
	public char getDurability() {
		return this.durability;
	}

	public void setDurability(char durability) {
		this.durability = durability;
	}

	@Column(name = "RECOVER", nullable = false, length = 1)
	public char getRecover() {
		return this.recover;
	}

	public void setRecover(char recover) {
		this.recover = recover;
	}

	@Column(name = "AUTOPROCESSINGLOG", nullable = false, length = 1)
	public char getAutoprocessinglog() {
		return this.autoprocessinglog;
	}

	public void setAutoprocessinglog(char autoprocessinglog) {
		this.autoprocessinglog = autoprocessinglog;
	}

	@Column(name = "PROCESSINGHOST", nullable = false, length = 50)
	public String getProcessinghost() {
		return this.processinghost;
	}

	public void setProcessinghost(String processinghost) {
		this.processinghost = processinghost;
	}

	@Column(name = "EXECUTEAFTERTIME", length = 1)
	public Character getExecuteaftertime() {
		return this.executeaftertime;
	}

	public void setExecuteaftertime(Character executeaftertime) {
		this.executeaftertime = executeaftertime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTRUNTIME", length = 19)
	public Date getLastruntime() {
		return this.lastruntime;
	}

	public void setLastruntime(Date lastruntime) {
		this.lastruntime = lastruntime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECORDCREATIONTIME", nullable = false, length = 19)
	public Date getRecordcreationtime() {
		return this.recordcreationtime;
	}

	public void setRecordcreationtime(Date recordcreationtime) {
		this.recordcreationtime = recordcreationtime;
	}

	@Column(name = "SELSTCELEMPK", precision = 12, scale = 0)
	public Long getSelstcelempk() {
		return this.selstcelempk;
	}

	public void setSelstcelempk(Long selstcelempk) {
		this.selstcelempk = selstcelempk;
	}

}
