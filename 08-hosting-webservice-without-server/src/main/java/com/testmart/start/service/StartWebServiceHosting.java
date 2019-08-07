package com.testmart.start.service;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

import com.testmart.catalog.impl.ShopInfoServiceImpl;

public class StartWebServiceHosting {

	public static void main(String[] args) {

		String serviceURL = "http://localhost:5648/localhosting/helloworld/";
		Endpoint endpoint = Endpoint.publish(serviceURL, new ShopInfoServiceImpl());
		if(endpoint.isPublished()){
			System.out.println("***WebService started.");
			System.out.println("Service running on : " + serviceURL);
		}
		boolean run = true;
		Scanner scanner = new Scanner(System.in);		
		while(run){
			System.out.print("Input command (stop) : ");
			String command = scanner.next();
			if(command.equalsIgnoreCase("stop")){
				System.out.println("Shutting down webservice hosting.");
				endpoint.stop();
				run = false;
			}else {
				System.out.println("Inavlid command.");
			}
		}
		scanner.close();
	}
}
