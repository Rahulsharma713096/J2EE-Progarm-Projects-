package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet {
 @Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String uname=req.getParameter("uname");
	PrintWriter wr = res.getWriter();
	wr.println("<h1>Output HTML File</h1><br>The User Name is:  "+uname);
}
}
