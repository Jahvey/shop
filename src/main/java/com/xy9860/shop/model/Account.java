package com.xy9860.shop.model;
// Generated 2017-3-16 19:35:17 by Hibernate Tools 5.2.1.Final

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable {

	@Override
	public String toString() {
		return "Account [aid=" + aid + ", alogin=" + alogin + ", aname=" + aname + ", apass=" + apass + "]";
	}

	private Integer aid;
	private String alogin;
	private String aname;
	private String apass;

	public Account() {
	}

	public Account(Integer aid, String alogin, String aname, String apass) {
		super();
		this.aid = aid;
		this.alogin = alogin;
		this.aname = aname;
		this.apass = apass;
	}

	public Account(String alogin, String aname, String apass) {
		this.alogin = alogin;
		this.aname = aname;
		this.apass = apass;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAlogin() {
		return this.alogin;
	}

	public void setAlogin(String alogin) {
		this.alogin = alogin;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApass() {
		return this.apass;
	}

	public void setApass(String apass) {
		this.apass = apass;
	}

}
