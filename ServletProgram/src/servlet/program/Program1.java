package servlet.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Program1 extends HttpServlet
{
/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

@Override
protected void service(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String nm=request.getParameter("name");
	PrintWriter wr = responce.getWriter();
	wr.println(nm);
}
}
