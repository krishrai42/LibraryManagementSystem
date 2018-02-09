package com.librarymanagement.controller;
import com.librarymanagement.controller.LibrarianService;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class librarianforgotpassword
 */
@WebServlet("/libforgotpwd")
public class librarianforgotpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LibrarianService librarianservice=new LibrarianService();
		PrintWriter out=res.getWriter();
		String email=req.getParameter("email");
		out.println(email);
		String pwd=librarianservice.getPasswordbyemail(email);
		
		out.println(pwd);
		String result="";
		if(pwd!=null) {
			result="/WEB-INF/View/librarian/librarianpassword.jsp";
			req.setAttribute("PASSWORD",pwd);
			
		}else {
			String msg="invalidEmail-try again";
			req.setAttribute("MSG", msg);
			result="/WEB-INF/View/librarian/LibrarianForgotpassword.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
