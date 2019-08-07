package com.testmart.catalog;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.testmart.business.ProductServiceImpl;

@WebService
public class ProductCatalog {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCatogeries(){
		return productServiceImpl.getProductCatogeries();
	}
	
	@WebMethod
	public List<String>	getProducts(String categories) {
		return productServiceImpl.getProducts(categories);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
}
