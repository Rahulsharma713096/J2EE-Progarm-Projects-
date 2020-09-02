package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Login extends HttpServlet {
private static int count=3;
	@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String mypwd="123rahul";
	String pwd=req.getParameter("pwd");
	res.setContentType("text/html");
	if(pwd.equals(mypwd)) {
		RequestDispatcher reqd = req.getRequestDispatcher("/home");
		reqd.forward(req, res);
	}
	else {
		PrintWriter wr = res.getWriter();
		wr.println("Invalid Data");
		wr.println("Remaning appempts is:");
		count--;
		wr.println(count);
		if(count>0) {
			RequestDispatcher rqd = req.getRequestDispatcher("/index.html");
			rqd.include(req,res);
			System.out.println("Hi");
		}
	}
}
}
