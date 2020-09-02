package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetResult
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/GetResult")


public class GetResult extends HttpServlet {
	private Connection con;
	private PreparedStatement pstmt;
	private HttpSession session;
	private ResultSet res;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try { System.out.println("Try To Connect DB");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","12345678");
		System.out.println("Driver loaded and connection is established");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		String usn = req.getParameter("usn");
		session = req.getSession(true);
		String sql = "Select * from studentdetails where usn=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, usn);
		
		res = pstmt.executeQuery();
		while(res.next()==true) {
			session.setAttribute("name", res.getString(2)); //store name into session
			session.setAttribute("marks1", res.getInt(3)); // store m1 into session
			session.setAttribute("marks2", res.getInt(4));//  store m2 into session
			session.setAttribute("marks3", res.getInt(5));//  store m3 into session
			
			resp.sendRedirect("Percentage"); // Transfer control to percentage.java
		}
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try {
			res.close();
			pstmt.close();
			con.close();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
