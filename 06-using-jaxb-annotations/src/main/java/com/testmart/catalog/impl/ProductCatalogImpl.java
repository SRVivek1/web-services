package com.testmart.catalog.impl;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.testmart.catalog.beans.Product;
import com.testmart.catalog.business.ProductCatalogInfo;
import com.testmart.catalog.services.ProductCatalog;

@WebService(serviceName = "TestMartCatalogService", portName = "TestMartCatalogPort", name = "TestMartCatalog", endpointInterface = "com.testmart.catalog.services.ProductCatalog", targetNamespace = "http://testmart.com/product/catalog/")
@SOAPBinding(style = Style.RPC)
public class ProductCatalogImpl implements ProductCatalog {

	ProductCatalogInfo productCatalogInfo = new ProductCatalogInfo();
	@Override
	@WebMethod(operationName = "fetchCategoryList")
	@WebResult(name = "Categories")
	public List<String> getProductCategories() {
		return productCatalogInfo.getProductCategories();
	}

	@Override
	@WebMethod(operationName = "fetchProductList")
	@WebResult(name = "Item")
	public List<Product> getProducts(
			@WebParam(name = "categoryName") String category) {
		return productCatalogInfo.getProducts(category);
	}

	@Override
	@WebMethod(operationName = "addNewProduct")
	@WebResult(name = "Status")
	public boolean addProduct(
			@WebParam(name = "categoryName") String category,
			@WebParam(name = "productName") String product) {
		return productCatalogInfo.addProduct(category, product);
	}

}
