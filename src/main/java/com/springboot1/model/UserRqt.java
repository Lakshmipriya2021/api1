package com.springboot1.model;

import java.time.LocalDate;

public class Api2Rqt {
	
	long rqtuserId;
	String rqtname;
	String rqtdob;
	String rqtemail;
	String rqtmobile;
	
	public long getRqtuserId() {
		return rqtuserId;
	}
	public void setRqtuserId(long rqtuserId) {
		this.rqtuserId = rqtuserId;
	}
	public String getRqtname() {
		return rqtname;
	}
	public void setRqtname(String rqtname) {
		this.rqtname = rqtname;
	}
	public String getRqtdob() {
		return rqtdob;
	}
	public void setRqtdob(String rqtdob) {
		LocalDate dates=LocalDate.of(Integer.parseInt(rqtdob.substring(6,10)),
				Integer.parseInt(rqtdob.substring(3,5)), Integer.parseInt(rqtdob.substring(0,2)));
		this.rqtdob = dates.toString();
	}
	public String getRqtemail() {
		return rqtemail;
	}
	public void setRqtemail(String rqtemail) {
		this.rqtemail = rqtemail;
	}
	public String getRqtmobile() {
		return rqtmobile;
	}
	public void setRqtmobile(String rqtmobile) {
		this.rqtmobile = rqtmobile;
	}
	@Override
	public String toString() {
		return "UserRqt [rqtuserId=" + rqtuserId + ", rqtname=" + rqtname + ", rqtdob=" + rqtdob + ", rqtemail="
				+ rqtemail + ", rqtmobile=" + rqtmobile + "]";
	}
	

}
