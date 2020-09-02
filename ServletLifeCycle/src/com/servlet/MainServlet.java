package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class MainServlet extends HttpServlet  {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
public void init() throws ServletException {
	System.out.println("Inside Init Function");
}
@Override
	public void service(ServletRequest request, ServletResponse responce) throws ServletException, IOException {
		System.out.println("Inside Service Function");
		String name=request.getParameter("name");
		PrintWriter wr = responce.getWriter();
		wr.println(name);
	}

}
