package com.librarymanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Librarianlogin
 */
@WebServlet("/studlogin/*")
public class Studentlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentService studentservice=new StudentService();
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
		int x=StudentService.verifyStudent(email,pwd);
		PrintWriter out=res.getWriter();
		System.out.println(x);
		HttpSession session=req.getSession();
		String result="";
		if(x==1) {
		session.setAttribute("Email", email);
		out.println("Login Success");
		result="/WEB-INF/View/Student/StudentHome.jsp";	
	}
		else {
			String msg="Invalid username or password";
			req.setAttribute("MSG", msg);
			result="/WEB-INF/View/Student/StudentLogin.jsp";
		//	PrintWriter out=res.getWriter();
			out.println(" login failed");
}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
		
}
}
