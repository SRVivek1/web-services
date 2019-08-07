package com.testmart.catalog;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.testmart.business.ProductServiceImpl;
import com.testmart.catalog.model.Product;
import com.testmart.catalog.serviceendpoints.ProductCatalog;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService", 
	endpointInterface = "com.testmart.catalog.serviceendpoints.ProductCatalog", 
	targetNamespace = "http://www.testmart.com/catalog")
@SOAPBinding(style=Style.DOCUMENT)
public class ProductCatalogImpl implements ProductCatalog {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testmart.catalog.ProductCatalog#getProductCatogeries()
	 */
	@Override
	public List<String> getProductCatogeries() {
		return productServiceImpl.getProductCatogeries();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testmart.catalog.ProductCatalog#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String categories) {
		return productServiceImpl.getProducts(categories);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testmart.catalog.ProductCatalog#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.testmart.catalog.ProductCatalog#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String categories) {
		return productServiceImpl.getProductsv2(categories);
	}
}
