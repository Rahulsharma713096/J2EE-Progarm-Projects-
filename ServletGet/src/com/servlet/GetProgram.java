package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetProgram extends HttpServlet {
@Override
public void init() throws ServletException {
 
	super.init();
	System.out.println("Initialization Method");
}
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get Method");
		String name=req.getParameter("name");
		PrintWriter wr = resp.getWriter();
		wr.println(name);
	}
@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Destroy Mathod");
	}
}
