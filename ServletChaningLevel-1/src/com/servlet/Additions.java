package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Additions extends HttpServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String s1 = req.getParameter("num1");
	String s2 = req.getParameter("num2");
    int n1 = Integer.parseInt(s1);
    int n2 = Integer.parseInt(s2);
    
    int num3=n1+n2;
    System.out.println(num3);
    req.setAttribute("sum",num3); //Store the num3 in Temporary variable
    
    RequestDispatcher rd= req.getRequestDispatcher("mul"); //Give Call to Servlet
    rd.forward(req,res);  //Transfer Control
}
}
