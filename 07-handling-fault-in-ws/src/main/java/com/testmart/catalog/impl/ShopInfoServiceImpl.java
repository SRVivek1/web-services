package com.testmart.catalog.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.testmart.catalog.services.ShopInfoService;
import com.testmart.exceptions.InvalidInputException;

@WebService(portName = "ShopInfoPort", name = "ShopInfoPortType", serviceName = "ShopInfoService", endpointInterface = "com.testmart.catalog.services.ShopInfoService", targetNamespace = "http://testmart.com/shopinfo/")
public class ShopInfoServiceImpl implements ShopInfoService {

	@Override
	@WebMethod(operationName = "retriveShopInfo")
	@WebResult(name = "lookupOutput")
	public String getShopInfo(@WebParam(name = "lookupInput") String property)
			throws InvalidInputException {
		String response = null;
		if (property != null) {
			if (property.equalsIgnoreCase("ShopInfo")) {
				response = "Test Mart";
			} else if (property.equalsIgnoreCase("Since")) {
				response = "Since 2015";
			} else {
				throw new InvalidInputException("Invalid Property", property
						+ "is not a valid property.");
			}
		} else {
			response = "Property cannot be empty.";
		}
		return response;
	}

}
