package com.helloworld.HelloWorldService.application;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.helloworld.HelloWorldService.HelloWorldService_PortType;
import com.helloworld.HelloWorldService.HelloWorldService_ServiceLocator;
import com.helloworld.HelloWorldService.SayHelloRequest;
import com.helloworld.HelloWorldService.SayHelloResponse;

public class MyClientApp {

	public static void main(String[] args) {

		HelloWorldService_ServiceLocator serviceLocator = new HelloWorldService_ServiceLocator();
		HelloWorldService_PortType helloWorldPort = null;
		try {
			helloWorldPort = serviceLocator.getHelloWorldServicePort();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		SayHelloRequest request = new SayHelloRequest("Ravi");
		SayHelloResponse response = null;
		try {
			response = helloWorldPort.sayHello(request);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		System.out.println("Response : " + response.getResult());
		
	}

}
