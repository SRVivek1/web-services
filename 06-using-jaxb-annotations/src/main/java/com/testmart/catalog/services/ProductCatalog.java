package com.testmart.catalog.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.testmart.catalog.beans.Product;

@WebService(targetNamespace = "http://testmart.com/product/catalog/")
public interface ProductCatalog {

	@WebMethod(operationName = "fetchCategoryList")
	@WebResult(name = "Categories")
	public List<String> getProductCategories();

	@WebMethod(operationName = "fetchProductList")
	@WebResult(name = "Item")
	public List<Product> getProducts(@WebParam(name = "categoryName") String category);

	@WebMethod(operationName = "addNewProduct")
	@WebResult(name = "Status")
	public boolean addProduct(@WebParam(name = "categoryName") String category,
			@WebParam(name = "productName") String product);
}
