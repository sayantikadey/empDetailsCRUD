package com.enty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
	private int hno;
	private String address;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
