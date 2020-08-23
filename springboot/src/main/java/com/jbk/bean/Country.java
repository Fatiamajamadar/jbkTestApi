package com.jbk.bean;

public class Country {
	private int cid;
	private String cname;
	//if we use lombok then no need to create getters and setter..only use annotation..also constructor annotation.
	public Country()
	{
		
	}
	public Country(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
