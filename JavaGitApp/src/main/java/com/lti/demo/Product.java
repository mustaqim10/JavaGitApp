package com.lti.demo;

public class Product {

	private int prdId;
	private String prdName;
	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
