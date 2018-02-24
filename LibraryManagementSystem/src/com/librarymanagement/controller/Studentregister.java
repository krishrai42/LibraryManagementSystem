package com.librarymanagement.controller;
import com.librarymanagement.model.StudentTO;
import java.io.IOException;
import com.librarymanagement.controller.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/studreg")
public class Studentregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentService studentservice=new StudentService();
		// TODO Auto-generated method stub
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
		String gender=req.getParameter("gender");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String dob=req.getParameter("dob");
		String dep=req.getParameter("dept");
		String mob=req.getParameter("mobile");
		StudentTO sto=new StudentTO(name,mob,city,state,dob, email, pwd, gender,dep);
		System.out.println("register Student called()");
		int x=StudentService.registerStudent(sto);
		System.out.println(x);
		String result="";
		if(x==1) {
			result="/WEB-INF/View/Student/Studsuccess.jsp";	
		}
		else {
			result ="/WEB-INF/View/Student/StudentSignup.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
