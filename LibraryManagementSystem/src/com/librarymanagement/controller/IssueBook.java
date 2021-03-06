package com.librarymanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarymanagement.util.JDBCUtil;

/**
 * Servlet implementation class IssueBook
 */
@WebServlet("/issuebook")
public class IssueBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		Map<Integer,Integer> mapval = new HashMap<Integer,Integer>();
		String studid=req.getParameter("sid");
		String bookid=req.getParameter("bid");
		String issuedate=req.getParameter("date");
		String result="";
		BookService bs=new BookService();
		StudentService ss=new StudentService();
		System.out.println("checking Student status");
		mapval=ss.checkStudent(studid);
		int val = mapval.get(1);
		if (val==0) {
			System.out.println("print no Student found status");
			String msg="No student with this sid found";
			req.setAttribute("STUDERRR", msg);
			result ="/WEB-INF/View/Function/issuebook.jsp";
		}
		else {
			int val1 = mapval.get(2);
			System.out.println(val1);  
			if(val1<=2) {
		System.out.println("checking Student status");
		System.out.println("checking book status");
		String value=bs.checkbookstatus(bookid);
		System.out.println(value);  
		   if(value.equals("Issued")){
				
				System.out.println("inside issuebook else block");
			String msg="Book is Already Issued";
				req.setAttribute("ISSUEBOOKERR", msg);
				result ="/WEB-INF/View/Function/issuebook.jsp";
			}
		   else	if (value.equals("Avail")){
			System.out.println("inside issuebook block");
	//		PreparedStatement ps=null;
			CallableStatement cs=null;
			Connection con = null;
			try {
				System.out.println("inside try block");
				con=JDBCUtil.getdbConnection();
				System.out.println("getting coonection");
				con.setAutoCommit(false);
				System.out.println("starting transaction");
				cs=con.prepareCall("call Issue_Book(?,?,?)");
				cs.setString(1, studid);
				cs.setString(2, bookid);
				cs.setString(3, issuedate);
				cs.execute();
				System.out.println("Book Issued Successfully");
			      con.commit();
			      System.out.println(" successful!  Thanks for your business!");	
			}catch(Exception e) {
				 try { 
				        con.rollback();
				      }
				      catch (SQLException ignored) { } 
				      out.println("Order failed. Please contact technical support.");
				    }
			
			finally {JDBCUtil.cleanup(cs,con);

			}
			String msg="Book Issued Successfully";
			req.setAttribute("IBSUCCESS", msg);
			result ="/WEB-INF/View/Function/success.jsp";
		}
		 if(value.equals("NotAvail")){
		
			System.out.println("inside issuebook else block");
		String msg="Book is Already Issued";
			req.setAttribute("ISSUEBOOKERR", msg);
			result ="/WEB-INF/View/Function/issuebook.jsp";
		}
		}
			else {
				String msg=" 3 Books are Already Issued! maximum 3 books can be issued to a student";
				req.setAttribute("ISSUEBOOKERR", msg);
				result ="/WEB-INF/View/Function/issuebook.jsp";
			}
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
