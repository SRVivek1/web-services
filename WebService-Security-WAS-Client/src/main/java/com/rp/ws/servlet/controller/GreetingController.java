package com.rp.ws.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String forwardToResourceURL = "/pages/welcome.jsp";
		
		req.setAttribute("message", "Get method not supported.");
		req.getRequestDispatcher(forwardToResourceURL).forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String flag = request.getParameter("flag");
		
		String responseString = null;
	
		if(flag.equalsIgnoreCase("hello")){
			responseString = "Welcome Mr. " + user;
		} else if(flag.equalsIgnoreCase("bye")) {
			responseString = "GoodBye Mr. " + user;
		}
		
		request.setAttribute("response", responseString);
		
		request.getRequestDispatcher("/pages/welcome.jsp").forward(request, response);
	}

}
