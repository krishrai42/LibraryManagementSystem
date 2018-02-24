package com.librarymanagement.controller;
import com.librarymanagement.model.librarianTO;
import java.io.IOException;
import com.librarymanagement.controller.LibrarianService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Librarianregister
 */
@WebServlet("/libreg")
public class Librarianregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Librarianregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LibrarianService librarianService=new LibrarianService();
		// TODO Auto-generated method stub
	//	int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pwd=req.getParameter("password");
		String gender=req.getParameter("gender");
		librarianTO lto=new librarianTO(name, email, pwd, gender);
		System.out.println("register librarian called()");
		int x=librarianService.registerLibrarian(lto);
		System.out.println(x);
		String result="";
		if(x==1) {
			result="/WEB-INF/View/librarian/Libsuccess.jsp";	
		}
		else {
			result ="/WEB-INF/View/librarian/LibrarianSignup.jsp";
		}
		RequestDispatcher rd=req.getRequestDispatcher(result);
		rd.forward(req,res);
	}

}
