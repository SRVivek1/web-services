package com.testmart.catalog;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public class ShopInfo {

	/**
	 * Note ::
	 * ----------
	 * 	>> partName : this parameter will have impact only if the document style is RPC.
	 * 				  This is applicable to both WebParam and WebResult.
	 * 
	 * 	>> name : The name parameter specifies the name of input and output in document style
	 */
	@WebMethod
	@WebResult(partName="lookupOutput", name="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput", name="lookupInput") String property) {
		String response = "Invalid Property";
		
		if("shopname".equalsIgnoreCase(property)){
			response = "Test Mart";
		}else if ("since".equalsIgnoreCase(property)) {
			response = "Since 2015";
		}
		return response;
	}
}
