package com.avinash.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity

public class Customer {

	@Id
	@GeneratedValue
	private Integer cid;
	private String cname;

	@OneToMany(targetEntity = Products.class, cascade=CascadeType.ALL)
	@JoinColumn(name ="cp_fk",referencedColumnName = "cid")
	private List<Products> products;
	
	

	public Customer() {
		
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public Customer(Integer cid, String cname, List<Products> products) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", products=" + products + "]";
	}
	
	
}
