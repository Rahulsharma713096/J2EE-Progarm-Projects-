package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Multiplication extends HttpServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1 = req.getParameter("num1");
		String s2 = req.getParameter("num2");
	    int n1 = Integer.parseInt(s1);
	    int n2 = Integer.parseInt(s2);
	    
	    int num3=n1*n2;
	    System.out.println(num3);
	  int sum=  (int)req.getAttribute("sum"); //Fetch the sum from temporary variable
	  //Create the writer and print the result 
         PrintWriter wr = res.getWriter();	    
	    wr.println("The Product is:"+num3);
	    wr.print("<br>");
	    wr.println("The Addition is:"+sum);
}
}