package com.testmart.catalog;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.testmart.business.ProductServiceImpl;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService",
			targetNamespace="http://www.testmart.com/catalog")
public class ProductCatalog {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCatogeries() {
		return productServiceImpl.getProductCatogeries();
	}

	@WebMethod(exclude = true)
	public List<String> getProducts(String categories) {
		return productServiceImpl.getProducts(categories);
	}

	@WebMethod(exclude = true)
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}
}
