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
 * Algpvsexg generated by hbm2java
 */
@Entity
@Table(name = "ALGPVSEXG")
public class Algpvsexg implements java.io.Serializable {

	private long pk;

	private String shipmentnbr;

	private String glxshipment;

	private String picklst;

	private String packlstnbr;

	private String itemcategory;

	private String company01;

	private String company02;

	private String address01;

	private String address02;

	private String postcode;

	private String city;

	private String weight;

	private String bundlecount;

	private String packingnbr;

	private String changedate;

	private String bundle;

	private String scanbundle;

	private String martiinfo;

	private String gasnbr;

	private String manneroftransport01;

	private String manneroftransport02;

	private String manneroftransport03;

	private String manneroftransport04;

	private String manneroftransport05;

	private String recipientsgln;

	private String sendersgln;

	private String galexiswarehouse;

	private String galexisbarcode;

	private String user;

	private String client;

	private String shippingmodule;

	private String motc01transfer;

	private String motc02transfer;

	private String motc03transfer;

	private String motc04transfer;

	private String motc05transfer;

	private String transactionid;

	private Date recordcreationtime;

	private char recordprocessedflag;

	private Date recordprocessingtime;

	public Algpvsexg() {
	}

	public Algpvsexg(long pk, String shipmentnbr, String glxshipment, String picklst, String packlstnbr, String itemcategory, String company01, String company02, String address01,
	        String address02, String postcode, String city, String weight, String bundlecount, String packingnbr, String changedate, String bundle, String scanbundle,
	        String martiinfo, String gasnbr, String manneroftransport01, String manneroftransport02, String manneroftransport03, String manneroftransport04,
	        String manneroftransport05, String recipientsgln, String sendersgln, String galexiswarehouse, String galexisbarcode, String user, String client, String shippingmodule,
	        String motc01transfer, String motc02transfer, String motc03transfer, String motc04transfer, String motc05transfer, String transactionid, Date recordcreationtime,
	        char recordprocessedflag) {
		this.pk = pk;
		this.shipmentnbr = shipmentnbr;
		this.glxshipment = glxshipment;
		this.picklst = picklst;
		this.packlstnbr = packlstnbr;
		this.itemcategory = itemcategory;
		this.company01 = company01;
		this.company02 = company02;
		this.address01 = address01;
		this.address02 = address02;
		this.postcode = postcode;
		this.city = city;
		this.weight = weight;
		this.bundlecount = bundlecount;
		this.packingnbr = packingnbr;
		this.changedate = changedate;
		this.bundle = bundle;
		this.scanbundle = scanbundle;
		this.martiinfo = martiinfo;
		this.gasnbr = gasnbr;
		this.manneroftransport01 = manneroftransport01;
		this.manneroftransport02 = manneroftransport02;
		this.manneroftransport03 = manneroftransport03;
		this.manneroftransport04 = manneroftransport04;
		this.manneroftransport05 = manneroftransport05;
		this.recipientsgln = recipientsgln;
		this.sendersgln = sendersgln;
		this.galexiswarehouse = galexiswarehouse;
		this.galexisbarcode = galexisbarcode;
		this.user = user;
		this.client = client;
		this.shippingmodule = shippingmodule;
		this.motc01transfer = motc01transfer;
		this.motc02transfer = motc02transfer;
		this.motc03transfer = motc03transfer;
		this.motc04transfer = motc04transfer;
		this.motc05transfer = motc05transfer;
		this.transactionid = transactionid;
		this.recordcreationtime = recordcreationtime;
		this.recordprocessedflag = recordprocessedflag;
	}

	public Algpvsexg(long pk, String shipmentnbr, String glxshipment, String picklst, String packlstnbr, String itemcategory, String company01, String company02, String address01,
	        String address02, String postcode, String city, String weight, String bundlecount, String packingnbr, String changedate, String bundle, String scanbundle,
	        String martiinfo, String gasnbr, String manneroftransport01, String manneroftransport02, String manneroftransport03, String manneroftransport04,
	        String manneroftransport05, String recipientsgln, String sendersgln, String galexiswarehouse, String galexisbarcode, String user, String client, String shippingmodule,
	        String motc01transfer, String motc02transfer, String motc03transfer, String motc04transfer, String motc05transfer, String transactionid, Date recordcreationtime,
	        char recordprocessedflag, Date recordprocessingtime) {
		this.pk = pk;
		this.shipmentnbr = shipmentnbr;
		this.glxshipment = glxshipment;
		this.picklst = picklst;
		this.packlstnbr = packlstnbr;
		this.itemcategory = itemcategory;
		this.company01 = company01;
		this.company02 = company02;
		this.address01 = address01;
		this.address02 = address02;
		this.postcode = postcode;
		this.city = city;
		this.weight = weight;
		this.bundlecount = bundlecount;
		this.packingnbr = packingnbr;
		this.changedate = changedate;
		this.bundle = bundle;
		this.scanbundle = scanbundle;
		this.martiinfo = martiinfo;
		this.gasnbr = gasnbr;
		this.manneroftransport01 = manneroftransport01;
		this.manneroftransport02 = manneroftransport02;
		this.manneroftransport03 = manneroftransport03;
		this.manneroftransport04 = manneroftransport04;
		this.manneroftransport05 = manneroftransport05;
		this.recipientsgln = recipientsgln;
		this.sendersgln = sendersgln;
		this.galexiswarehouse = galexiswarehouse;
		this.galexisbarcode = galexisbarcode;
		this.user = user;
		this.client = client;
		this.shippingmodule = shippingmodule;
		this.motc01transfer = motc01transfer;
		this.motc02transfer = motc02transfer;
		this.motc03transfer = motc03transfer;
		this.motc04transfer = motc04transfer;
		this.motc05transfer = motc05transfer;
		this.transactionid = transactionid;
		this.recordcreationtime = recordcreationtime;
		this.recordprocessedflag = recordprocessedflag;
		this.recordprocessingtime = recordprocessingtime;
	}

	@Id
	@Column(name = "PK", unique = true, nullable = false, precision = 12, scale = 0)
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	@Column(name = "SHIPMENTNBR", nullable = false, length = 40)
	public String getShipmentnbr() {
		return this.shipmentnbr;
	}

	public void setShipmentnbr(String shipmentnbr) {
		this.shipmentnbr = shipmentnbr;
	}

	@Column(name = "GLXSHIPMENT", nullable = false, length = 40)
	public String getGlxshipment() {
		return this.glxshipment;
	}

	public void setGlxshipment(String glxshipment) {
		this.glxshipment = glxshipment;
	}

	@Column(name = "PICKLST", nullable = false, length = 40)
	public String getPicklst() {
		return this.picklst;
	}

	public void setPicklst(String picklst) {
		this.picklst = picklst;
	}

	@Column(name = "PACKLSTNBR", nullable = false, length = 20)
	public String getPacklstnbr() {
		return this.packlstnbr;
	}

	public void setPacklstnbr(String packlstnbr) {
		this.packlstnbr = packlstnbr;
	}

	@Column(name = "ITEMCATEGORY", nullable = false, length = 40)
	public String getItemcategory() {
		return this.itemcategory;
	}

	public void setItemcategory(String itemcategory) {
		this.itemcategory = itemcategory;
	}

	@Column(name = "COMPANY01", nullable = false, length = 40)
	public String getCompany01() {
		return this.company01;
	}

	public void setCompany01(String company01) {
		this.company01 = company01;
	}

	@Column(name = "COMPANY02", nullable = false, length = 40)
	public String getCompany02() {
		return this.company02;
	}

	public void setCompany02(String company02) {
		this.company02 = company02;
	}

	@Column(name = "ADDRESS01", nullable = false, length = 40)
	public String getAddress01() {
		return this.address01;
	}

	public void setAddress01(String address01) {
		this.address01 = address01;
	}

	@Column(name = "ADDRESS02", nullable = false, length = 40)
	public String getAddress02() {
		return this.address02;
	}

	public void setAddress02(String address02) {
		this.address02 = address02;
	}

	@Column(name = "POSTCODE", nullable = false, length = 5)
	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	@Column(name = "CITY", nullable = false, length = 40)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "WEIGHT", nullable = false, length = 10)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "BUNDLECOUNT", nullable = false, length = 10)
	public String getBundlecount() {
		return this.bundlecount;
	}

	public void setBundlecount(String bundlecount) {
		this.bundlecount = bundlecount;
	}

	@Column(name = "PACKINGNBR", nullable = false, length = 40)
	public String getPackingnbr() {
		return this.packingnbr;
	}

	public void setPackingnbr(String packingnbr) {
		this.packingnbr = packingnbr;
	}

	@Column(name = "CHANGEDATE", nullable = false, length = 40)
	public String getChangedate() {
		return this.changedate;
	}

	public void setChangedate(String changedate) {
		this.changedate = changedate;
	}

	@Column(name = "BUNDLE", nullable = false, length = 40)
	public String getBundle() {
		return this.bundle;
	}

	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	@Column(name = "SCANBUNDLE", nullable = false, length = 40)
	public String getScanbundle() {
		return this.scanbundle;
	}

	public void setScanbundle(String scanbundle) {
		this.scanbundle = scanbundle;
	}

	@Column(name = "MARTIINFO", nullable = false, length = 40)
	public String getMartiinfo() {
		return this.martiinfo;
	}

	public void setMartiinfo(String martiinfo) {
		this.martiinfo = martiinfo;
	}

	@Column(name = "GASNBR", nullable = false, length = 40)
	public String getGasnbr() {
		return this.gasnbr;
	}

	public void setGasnbr(String gasnbr) {
		this.gasnbr = gasnbr;
	}

	@Column(name = "MANNEROFTRANSPORT01", nullable = false, length = 4)
	public String getManneroftransport01() {
		return this.manneroftransport01;
	}

	public void setManneroftransport01(String manneroftransport01) {
		this.manneroftransport01 = manneroftransport01;
	}

	@Column(name = "MANNEROFTRANSPORT02", nullable = false, length = 4)
	public String getManneroftransport02() {
		return this.manneroftransport02;
	}

	public void setManneroftransport02(String manneroftransport02) {
		this.manneroftransport02 = manneroftransport02;
	}

	@Column(name = "MANNEROFTRANSPORT03", nullable = false, length = 4)
	public String getManneroftransport03() {
		return this.manneroftransport03;
	}

	public void setManneroftransport03(String manneroftransport03) {
		this.manneroftransport03 = manneroftransport03;
	}

	@Column(name = "MANNEROFTRANSPORT04", nullable = false, length = 4)
	public String getManneroftransport04() {
		return this.manneroftransport04;
	}

	public void setManneroftransport04(String manneroftransport04) {
		this.manneroftransport04 = manneroftransport04;
	}

	@Column(name = "MANNEROFTRANSPORT05", nullable = false, length = 4)
	public String getManneroftransport05() {
		return this.manneroftransport05;
	}

	public void setManneroftransport05(String manneroftransport05) {
		this.manneroftransport05 = manneroftransport05;
	}

	@Column(name = "RECIPIENTSGLN", nullable = false, length = 40)
	public String getRecipientsgln() {
		return this.recipientsgln;
	}

	public void setRecipientsgln(String recipientsgln) {
		this.recipientsgln = recipientsgln;
	}

	@Column(name = "SENDERSGLN", nullable = false, length = 40)
	public String getSendersgln() {
		return this.sendersgln;
	}

	public void setSendersgln(String sendersgln) {
		this.sendersgln = sendersgln;
	}

	@Column(name = "GALEXISWAREHOUSE", nullable = false, length = 40)
	public String getGalexiswarehouse() {
		return this.galexiswarehouse;
	}

	public void setGalexiswarehouse(String galexiswarehouse) {
		this.galexiswarehouse = galexiswarehouse;
	}

	@Column(name = "GALEXISBARCODE", nullable = false, length = 40)
	public String getGalexisbarcode() {
		return this.galexisbarcode;
	}

	public void setGalexisbarcode(String galexisbarcode) {
		this.galexisbarcode = galexisbarcode;
	}

	@Column(name = "USER", nullable = false, length = 40)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "CLIENT", nullable = false, length = 40)
	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Column(name = "SHIPPINGMODULE", nullable = false, length = 40)
	public String getShippingmodule() {
		return this.shippingmodule;
	}

	public void setShippingmodule(String shippingmodule) {
		this.shippingmodule = shippingmodule;
	}

	@Column(name = "MOTC01TRANSFER", nullable = false, length = 4)
	public String getMotc01transfer() {
		return this.motc01transfer;
	}

	public void setMotc01transfer(String motc01transfer) {
		this.motc01transfer = motc01transfer;
	}

	@Column(name = "MOTC02TRANSFER", nullable = false, length = 4)
	public String getMotc02transfer() {
		return this.motc02transfer;
	}

	public void setMotc02transfer(String motc02transfer) {
		this.motc02transfer = motc02transfer;
	}

	@Column(name = "MOTC03TRANSFER", nullable = false, length = 4)
	public String getMotc03transfer() {
		return this.motc03transfer;
	}

	public void setMotc03transfer(String motc03transfer) {
		this.motc03transfer = motc03transfer;
	}

	@Column(name = "MOTC04TRANSFER", nullable = false, length = 4)
	public String getMotc04transfer() {
		return this.motc04transfer;
	}

	public void setMotc04transfer(String motc04transfer) {
		this.motc04transfer = motc04transfer;
	}

	@Column(name = "MOTC05TRANSFER", nullable = false, length = 4)
	public String getMotc05transfer() {
		return this.motc05transfer;
	}

	public void setMotc05transfer(String motc05transfer) {
		this.motc05transfer = motc05transfer;
	}

	@Column(name = "TRANSACTIONID", nullable = false, length = 50)
	public String getTransactionid() {
		return this.transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECORDCREATIONTIME", nullable = false, length = 19)
	public Date getRecordcreationtime() {
		return this.recordcreationtime;
	}

	public void setRecordcreationtime(Date recordcreationtime) {
		this.recordcreationtime = recordcreationtime;
	}

	@Column(name = "RECORDPROCESSEDFLAG", nullable = false, length = 1)
	public char getRecordprocessedflag() {
		return this.recordprocessedflag;
	}

	public void setRecordprocessedflag(char recordprocessedflag) {
		this.recordprocessedflag = recordprocessedflag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECORDPROCESSINGTIME", length = 19)
	public Date getRecordprocessingtime() {
		return this.recordprocessingtime;
	}

	public void setRecordprocessingtime(Date recordprocessingtime) {
		this.recordprocessingtime = recordprocessingtime;
	}

}