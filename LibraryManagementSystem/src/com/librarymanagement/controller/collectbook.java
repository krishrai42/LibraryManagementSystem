package com.librarymanagement.controller;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarymanagement.util.JDBCUtil;

/**
 * Servlet implementation class collectbook
 */
@WebServlet("/collectbook")
public class collectbook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String studid=req.getParameter("sid");
		String bookid=req.getParameter("bid");
		CallableStatement cs=null;
		Connection con = null;
		String result="";
		try {
			System.out.println("inside try block");
			con=JDBCUtil.getdbConnection();
			System.out.println("getting coonection");
			con.setAutoCommit(false);
			System.out.println("starting transaction");
			cs=con.prepareCall("call Collect_Book(?,?)");
			cs.setString(1, studid);
			cs.setString(2, bookid);
			
			cs.execute();
			System.out.println("Book Collected Successfully");
		      con.commit();
		      System.out.println(" successful!");	
		}catch(Exception e) {
			 try { 
			        con.rollback();
			      }
			      catch (SQLException ignored) { } 
			      System.out.println("Operation failed. try again.");
			    }
		
		finally {JDBCUtil.cleanup(cs,con);

		}
		String msg="Book Collected Successfully";
		req.setAttribute("BCSUCCESS", msg);
		result ="/WEB-INF/View/Function/success.jsp";
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}
	
}
