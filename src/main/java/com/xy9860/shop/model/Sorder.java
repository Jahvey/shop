package com.xy9860.shop.model;
// Generated 2017-3-22 11:18:04 by Hibernate Tools 5.2.1.Final

/**
 * Sorder generated by hbm2java
 */
public class Sorder implements java.io.Serializable {

	@Override
	public String toString() {
		return "Sorder [sid=" + sid + ", sname=" + sname + ", sprice=" + sprice + ", snumber=" + snumber + ", fid="
				+ fid + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return sid==((Sorder)obj).getSid();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return product.getPid().hashCode();
	}

	private Integer sid;
	private String sname;
	private Double sprice;
	private int snumber;
	private Integer fid;
	private Product product;

	public Sorder() {
	}

	public Sorder(int snumber) {
		this.snumber = snumber;
	}

	public Sorder(String sname, Double sprice, int snumber, Integer fid ){
		this.sname = sname;
		this.sprice = sprice;
		this.snumber = snumber;
		this.fid = fid;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSprice() {
		return this.sprice;
	}

	public void setSprice(Double sprice) {
		this.sprice = sprice;
	}

	public int getSnumber() {
		return this.snumber;
	}

	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}



}
