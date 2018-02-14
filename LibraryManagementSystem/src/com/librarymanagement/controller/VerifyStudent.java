package com.librarymanagement.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifyStudent
 */
@WebServlet("/verifystud")
public class VerifyStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("name"));
		StudentService ss=new StudentService();
		int x=ss.verifyStudent(id);
		String result="";
if(x==1) {
			
			String bmsg="Student verfied Sucessfully";
			req.setAttribute("STudMSG", bmsg);
			result="/WEB-INF/View/Function/success.jsp";
			
			
		}
		else if(x==0){
			String err ="No student Found";
			req.setAttribute("StudERR", err);
			result ="/WEB-INF/View/Function/success.jsp";
			
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}
	}


