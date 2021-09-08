package com.avinash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue
	private Integer pid;
	private String pname;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Products(Integer pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	
	public Products() {
		
	}
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pname=" + pname + "]";
	}
	
	

}
