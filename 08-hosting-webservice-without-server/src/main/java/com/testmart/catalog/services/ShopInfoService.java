package com.testmart.catalog.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.testmart.exceptions.InvalidInputException;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface ShopInfoService {

	@WebMethod(operationName = "retriveShopInfo")
	@WebResult(name = "lookupOutput")
	public String getShopInfo(@WebParam(name = "lookupInput") String property) throws InvalidInputException;
}
