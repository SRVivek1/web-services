package com.rp.ws.provider;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="Greeting")
public class GreetingImpl {

	@WebMethod
	public String sayHello(String name) {
		String response = null;
		if(name.equalsIgnoreCase("")){
			response = "Hello Mr. " + name;
		}else{
			response = "Hello Mr. X";
		}
		return response;
	}

	@WebMethod
	public String sayGoodBye(String name) {
		String response = null;
		if(name.equalsIgnoreCase("")){
			response = "GoodBye Mr. " + name;
		}else{
			response = "GoodBye Mr. X";
		}
		return response;
	}
}
