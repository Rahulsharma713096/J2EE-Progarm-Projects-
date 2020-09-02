package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Percentage")
public class Percentage extends HttpServlet {
	private HttpSession session;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		session = req.getSession();
		String name = (String) session.getAttribute("name");
		int m1 = (int) session.getAttribute("marks1");
		int m2 = (int) session.getAttribute("marks2");
		int m3 = (int) session.getAttribute("marks3");
		
		float percentage = ((m1+m2+m3)/300.0f)*100.0f;
		
		PrintWriter writer = resp.getWriter();
		writer.println("the result is:");
		writer.println("Candidate name: "+name);
		writer.println("Candidate Marks-1: "+m1);
		writer.println("Candidate Marks-2: "+m2);
		writer.println("Candidate Marks-3: "+m3);
		writer.println("Candidate percentage : "+percentage);

	}
}
