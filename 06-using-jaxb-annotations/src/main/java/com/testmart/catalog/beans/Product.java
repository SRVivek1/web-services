package com.testmart.catalog.beans;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name="Item")
@XmlType(propOrder={"price", "sku", "pName"})
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
	
	@XmlElement(name="ProductName")
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	@XmlElement(name="Sku")
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@XmlElement(name="Price")
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
