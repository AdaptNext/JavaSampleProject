package com.mphasis.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1031422249396784970L;
	 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>\n"+"<body bgcolor=\"#f0f0f0\">\n"+
         "<h1 align=\"center\" bgcolor=\"#5F9EA0\">" + "Adapt Next <br> Version 1.0 "+"</h1>\n"+
        		"</body></html>" 		
        		);
        
        out.flush();
        out.close();
    }

}
