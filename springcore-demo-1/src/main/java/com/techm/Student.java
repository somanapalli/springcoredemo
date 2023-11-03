package com.techm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("100")
	private Integer stid;
	@Value("animesh")
	private String stname;
	
	@Autowired
	private Address address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStid() {
		return stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStname() {
		return stname;
	}

	public void setStname(String stname) {
		this.stname = stname;
	}

	/*
	 * public Address getAddress() { return address; }
	 * 
	 * public void setAddress(Address address) { this.address = address; }
	 */
	public Student(Integer stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
		
	}

	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", address=" + address + "]";
	}

}
