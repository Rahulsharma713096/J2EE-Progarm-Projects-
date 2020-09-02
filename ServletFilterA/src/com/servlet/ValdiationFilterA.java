package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

//Filter Without web.xml mapping and with Annotation
@WebFilter(urlPatterns = { "/ValdiationFilterA" }, servletNames = { "GetResult" })
public class ValdiationFilterA implements Filter {

	  
		
		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			String usn = request.getParameter("usn");
			if(usn.length()<=7) {
				chain.doFilter(request, response);
			}
			else {
			
				((HttpServletResponse) response).sendRedirect("/ServletFilterA/Error.html");
			}
			
		}

}
