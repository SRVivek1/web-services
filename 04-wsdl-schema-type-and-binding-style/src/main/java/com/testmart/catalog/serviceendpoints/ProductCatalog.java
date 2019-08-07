package com.testmart.catalog.serviceendpoints;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.testmart.catalog.model.Product;

@WebService(targetNamespace="http://www.testmart.com/catalog")
public interface ProductCatalog {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCatogeries();

	@WebMethod(action="fetch_product_list", operationName="fetchProductList")
	public abstract List<String> getProducts(String categories);

	@WebMethod(action="add_product", operationName="addProduct")
	public abstract boolean addProduct(String category, String product);

	@WebMethod(action="fetch_product_list_v2", operationName="fetchProductListv2")
	public abstract List<Product> getProductsv2(String categories);

}