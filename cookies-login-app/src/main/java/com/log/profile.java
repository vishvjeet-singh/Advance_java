package com.log;

import java.awt.peer.TextAreaPeer;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class profile extends HttpServlet{
	

	
	Cookie[] ck=req.getCookies();
	
	if(ck==null) {
		resp.sendRedirect("index.html");
		
	}else {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1> Email:"+ck[0].getValue() + "</h1>");
		out.println("<h1> Password:"+ck[1].getValue() + "</h1>");

		out.println("<a href='logout'>Logout</a>");
		
	}
	
	

}
