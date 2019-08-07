package com.testmart.catalog.beans;

public class Product {

	String pName;
	String sku;
	double price;
	
	public Product() {
		//  Auto-generated constructor stub
	}
	
	public Product(String pName, String sku, double price) {
		this.pName = pName;
		this.sku = sku;
		this.price =  price;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
