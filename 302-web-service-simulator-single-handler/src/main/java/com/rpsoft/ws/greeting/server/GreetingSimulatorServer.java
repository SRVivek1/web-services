package com.rpsoft.ws.greeting.server;

import java.util.List;
import java.util.Scanner;

import javax.xml.ws.Binding;
import javax.xml.ws.Endpoint;
import javax.xml.ws.handler.Handler;

import com.rpsoft.ws.greeting.impl.GreetingServiceImpl;

class GreetingSimulatorServer {

	public static void main(String[] args) {

		//String serviceURL = "http://localhost:9119/ws/greeting";
		String serviceURL = "http://10.10.10.12:9119/ws/greeting";
		GreetingServiceImpl serviceImpl = new GreetingServiceImpl();

		Endpoint endpoint = Endpoint.publish(serviceURL, serviceImpl);
		
		Binding binding = endpoint.getBinding();
		List<Handler> handerChainList = binding.getHandlerChain();
		handerChainList.add(serviceImpl);
		//binding.setHandlerChain(handerChainList);

		
		if (endpoint.isPublished()) {
			System.out.println("***WebService started.");
			System.out.println("Service running on : " + serviceURL);
		}
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.print("Input command (stop) : ");
			String command = scanner.next();
			if (command.equalsIgnoreCase("stop")) {
				System.out.println("Shutting down webservice hosting.");
				endpoint.stop();
				run = false;
			} else {
				System.out.println("Inavlid command.");
			}
		}
		scanner.close();
	}

}
