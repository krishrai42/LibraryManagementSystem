package com.librarymanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class librarianhome
 */
@WebServlet("/libhome")
public class librarianhome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String value=req.getParameter("book");
		System.out.println("Inside librarian home");
		System.out.println(value);
		String result=null;
		if (value=="Add Books") {
			result="/WEB-INF/View/Function/addbook.jsp";
		}
		else if (value=="Search Books") {
		//	result="/WEB-INF/View/Function/searchbook.jsp";
			result="home.jsp?myUrlVariable=/WEB-INF/View/Function/searchbook.jsp";
		}
		else if (value=="Issue Books") {
			result="/WEB-INF/View/Function/issuebook.jsp";
		}
		else if (value=="Collect Books") {
			result="/WEB-INF/View/Function/collectbook.jsp";
		}
		else if (value=="Delete Books") {
			result="/WEB-INF/View/Function/deletebook.jsp";
		}else if (value=="Verify Student") {
			result="/WEB-INF/View/Function/verifystudent.jsp";
		}
		
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
		//res.sendRedirect(result);
	}

}
