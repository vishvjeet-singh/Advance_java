package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServlet02 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to genericservlet");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
        out.println("welcome to servlet");
        out.println("today" +new Date().toString());
	}

}
