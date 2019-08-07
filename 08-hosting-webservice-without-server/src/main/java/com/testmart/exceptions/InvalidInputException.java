package com.testmart.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name="InvalidInput", targetNamespace="http://testmart.com/exceptions/")
public class InvalidInputException extends Exception {

	/**
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private String errorInfo;
	
	public InvalidInputException(String reason, String errofInfo) {
		super(reason);
		this.errorInfo = errofInfo;
	}
	
	public String getFaultInfo() {
		return this.errorInfo;
	}
}
