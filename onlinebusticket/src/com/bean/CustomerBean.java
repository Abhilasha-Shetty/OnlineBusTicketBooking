package com.bean;

public class CustomerBean {
private String cid;
private String name;
private String gender;
private String email;

private String date;
private String busname;
private String fromplace;
private String toplace;

public CustomerBean() {
	super();
	// TODO Auto-generated constructor stub
}
public CustomerBean(String cid, String name, String gender, String email, String date, String busname,
		String fromplace, String toplace) {
	super();
	this.cid = cid;
	this.name = name;
	this.gender = gender;
	this.email = email;
	
	this.date = date;
	this.busname = busname;
	this.fromplace = fromplace;
	this.toplace = toplace;
}
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getBusname() {
	return busname;
}
public void setBusname(String busname) {
	this.busname = busname;
}
public String getFromplace() {
	return fromplace;
}
public void setFromplace(String fromplace) {
	this.fromplace = fromplace;
}
public String getToplace() {
	return toplace;
}
public void setToplace(String toplace) {
	this.toplace = toplace;
}

}