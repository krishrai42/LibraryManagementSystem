package com.librarymanagement.controller;
import com.librarymanagement.controller.StudentService;
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
@WebServlet("/studforgotpwd")
public class Studentforgotpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentService studentservice=new StudentService();
		PrintWriter out=res.getWriter();
		String email=req.getParameter("email");
		out.println(email);
		String pwd=studentservice.getPasswordbyemail(email);
		
		out.println(pwd);
		String result="";
		if(pwd!=null) {
			result="/WEB-INF/View/Student/Studentpassword.jsp";
			req.setAttribute("PASSWORD",pwd);
			
		}else {
			String msg="invalidEmail-try again";
			req.setAttribute("MSG", msg);
			result="/WEB-INF/View/Student/StudForgotpassword.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
