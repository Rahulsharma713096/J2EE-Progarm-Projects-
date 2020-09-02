package com.servlet.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.Model.Model;

@WebServlet("/cont")

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String cls = req.getParameter("classes");
	
		String u1 = req.getParameter("usn");
		int usn = Integer.parseInt(u1);
		String u2 = req.getParameter("m1");
		int m1 = Integer.parseInt(u2);
		String u3 = req.getParameter("m2");
		int m2 = Integer.parseInt(u3);
		String u4 = req.getParameter("m3");
		int m3 = Integer.parseInt(u4);
		String u5 = req.getParameter("m4");
		int m4 = Integer.parseInt(u5);
		String u6 = req.getParameter("m5");
		int m5 = Integer.parseInt(u6);
		try{
			Model m = new Model();
			m.setUsn(usn);
			m.setName(name);
			m.setClasses(cls);
			m.setM1(m1);
			m.setM2(m2);
			m.setM3(m3);
			m.setM4(m4);
			m.setM5(m5);
		System.out.println("Data Sending Controller to Model");
		boolean b=m.insert();
		if(b==true) {
			resp.sendRedirect("/MVCProg/Sucess.html");
		}else resp.sendRedirect("/MVCProg/Faliour.html");
		
		}catch (Exception e) {
			e.printStackTrace();
		}

	
	}
	



}

	


