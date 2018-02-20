package com.librarymanagement.controller;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarymanagement.model.BookIssueTO;
import com.librarymanagement.model.BookTO;
import com.librarymanagement.util.JDBCUtil;

/**
 * Servlet implementation class ShowStudAccount
 */
@WebServlet("/showstudaccount")
public class ShowStudAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int studid=Integer.parseInt(req.getParameter("sid"));
		List<BookIssueTO> books = new ArrayList<BookIssueTO>();
		CallableStatement cs=null;
		Connection con = null;
		ResultSet rs=null;
		String result="";
		int x=0;
		try {
			con=JDBCUtil.getdbConnection();
			System.out.println("calling show book");
			cs=con.prepareCall("call Show_Book(?)");
			cs.setInt(1, studid);
			cs.execute();
			 rs = cs.getResultSet();
		
			while(rs.next()) {
				 x=1;
				System.out.println(x);
				BookIssueTO bto = new BookIssueTO(rs);
				bto.setSid(rs.getInt(1));
				bto.setBid(rs.getInt(2));
				bto.setBname(rs.getString("bname"));
				bto.setIssue_date(rs.getDate("issue_date"));
				bto.setReturn_date(rs.getDate("return_date"));
				bto.setFine(rs.getDouble("Fine"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,cs,con);
		
		}
		req.setAttribute("BOOKSDETAIL", books);
		result="/WEB-INF/View/Student/StudBookDetail.jsp";
		RequestDispatcher view = req.getRequestDispatcher(result);
          view.forward(req, res);
		
	}

}
