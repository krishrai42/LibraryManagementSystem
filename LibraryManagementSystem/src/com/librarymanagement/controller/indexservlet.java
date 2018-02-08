package com.librarymanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class indexservlet
 */
@WebServlet("/indexservlet")
public class indexservlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	       String name=request.getParameter("position");
	       if(name.equals("Librarian")) {
	    	   	RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/View/librarian/LibrarianLogin.jsp");
		        rd.forward(request, response);
	}
	       if(name.equals("Student")) {	    		
	    		  RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/View/Student/StudentLogin.jsp");
	    			        rd.forward(request, response);
	    		}
	       
	
	}
	}
		
	
	



