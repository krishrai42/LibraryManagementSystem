package com.librarymanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteBook
 */
@WebServlet("/deletebook")
public class DeleteBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id=(req.getParameter("name"));
		BookService bs=new BookService();
		int x=bs.deletebook(id);
		String result="";
if(x==1) {
			
			String bmsg="Books deleted Sucessfully";
			req.setAttribute("DelMSG", bmsg);
			result="/WEB-INF/View/Function/success.jsp";
			
			
		}
		else {
			String err ="error occurred";
			req.setAttribute("ERR", err);
			result ="/WEB-INF/View/Function/deletebook.jsp";
			
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
