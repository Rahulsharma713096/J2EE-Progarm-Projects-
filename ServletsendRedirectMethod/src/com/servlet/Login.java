package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
private static int count=3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String mypwd="123rahul";
		String pwd=req.getParameter("pwd");
		res.setContentType("text/html");
		if(pwd.equals(mypwd)) {
		res.sendRedirect("home");
		
		
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
