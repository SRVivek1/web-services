package com.testmart.catalog.packages;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.testmart.business.ProductServiceImpl;

@WebService
public class ProductCatalogClass {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();
	
	@WebMethod
	public List<String> getProductCatogeriesMethod(){
		return productServiceImpl.getProductCatogeries();
	}
	
	// Ecluding this method to make WSDL as simple
	@WebMethod(exclude=true)
	public List<String>	getProducts(String categories) {
		return productServiceImpl.getProducts(categories);
	}

	// Ecluding this method to make WSDL as simple
	@WebMethod(exclude=true)
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
}
