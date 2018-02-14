package com.librarymanagement.controller;
import com.librarymanagement.model.BookTO;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBook
 */
@WebServlet("/addbook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookService bookservice=new BookService();
		int id=Integer.parseInt(req.getParameter("bid"));
		String bname=req.getParameter("bname");
		String bauth=req.getParameter("bauthor");
		String bcatg=req.getParameter("bcategory");
		String bsub=req.getParameter("bsubcategory");
		String bpub=req.getParameter("bpub");
		String byear=req.getParameter("byear");
		String bstat=req.getParameter("status");
		BookTO bto=new BookTO(id,bname,bauth,bcatg,bsub,bpub,byear,bstat);
		int x=bookservice.addbook(bto);
		System.out.println(x);
		String result="";
		if(x==1) {
			
			String bmsg="Books Added Sucessfully";
			req.setAttribute("BMSG", bmsg);
			result="/WEB-INF/View/Function/success.jsp";
			
			//res.sendRedirect(result);
		}
		else {
			String err ="error occurred";
			req.setAttribute("ERR", err);
			result ="/WEB-INF/View/Function/addbook.jsp";
			
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
