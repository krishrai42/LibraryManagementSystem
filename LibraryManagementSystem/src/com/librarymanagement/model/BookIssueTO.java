package com.librarymanagement.model;

import java.sql.ResultSet;
import java.util.Date;

public class BookIssueTO {
 private String sid;
 private String bid;
 private String bname;
 private Date Issue_date;
 private Date Return_date;
 private double Fine;

public BookIssueTO(String sid, String bid, String bname, Date issue_date, Date return_date, double fine) {
	super();
	this.sid = sid;
	this.bid = bid;
	this.bname = bname;
	Issue_date = issue_date;
	Return_date = return_date;
	Fine = fine;
}
public BookIssueTO(ResultSet rs) {
	// TODO Auto-generated constructor stub
}
public double getFine() {
	return Fine;
}
public void setFine(double fine) {
	Fine = fine;
}
public Date getReturn_date() {
	return Return_date;
}
public void setReturn_date(Date return_date) {
	Return_date = return_date;
}
public Date getIssue_date() {
	return Issue_date;
}
public void setIssue_date(Date issue_date) {
	Issue_date = issue_date;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getBid() {
	return bid;
}
public void setBid(String bid) {
	this.bid = bid;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}


}
