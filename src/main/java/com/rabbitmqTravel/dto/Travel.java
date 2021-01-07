package com.rabbitmqTravel.dto;

import java.util.Date;

public class Travel {

	private int id;
	private String name;
	private String src;
	private String des;
	private Date st;
	private Date en;
	private UserLogin userlogin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Date getSt() {
		return st;
	}
	public void setSt(Date st) {
		this.st = st;
	}
	public Date getEn() {
		return en;
	}
	public void setEn(Date en) {
		this.en = en;
	}
	public UserLogin getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(UserLogin userlogin) {
		this.userlogin = userlogin;
	}
	
	
}
