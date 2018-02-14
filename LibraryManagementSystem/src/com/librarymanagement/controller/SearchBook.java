package com.librarymanagement.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.librarymanagement.model.BookTO;
import com.librarymanagement.util.JDBCUtil;

/**
 * Servlet implementation class SearchBook
 */
@WebServlet("/searchbook")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		booksearch bs=new booksearch();
	//	ArrayList <BookTO> localbook;
		//List<BookTO> BookList = new ArrayList<BookTO>();
		
		String name=req.getParameter("name");
		String value=req.getParameter("category");
		System.out.println(value);
		if (value.equals("ID")){
			System.out.println("calling searchbook id ()");
			int id=Integer.parseInt(req.getParameter("name"));
			List<BookTO> bto=bs.searchbookID(id);
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
			
		}
		else if (value.equals("name")){
			System.out.println("calling searchbook by bookname ()");
		//	int id=Integer.parseInt(req.getParameter("name"));
			List<BookTO> bto=bs.searchbookBNAME(name);
			
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
		}
		else if (value.equals("author")){
			System.out.println("calling searchbooby Author ()");
			
			List<BookTO> bto=bs.searchbookAUTHOR(name);
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
			
		}
		else if (value.equals("category")){
			System.out.println("calling searchbook by category ()");
	
			List<BookTO> bto=bs.searchbookCATEGORY(name);
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
			
		}
		else if (value.equals("subcategory")){
			System.out.println("calling searchbook by subcategory ()");
			
			List<BookTO> bto=bs.searchbookSUBCATEGORY(name);
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
			
		}
		else if (value.equals("publisher")){
			System.out.println("calling searchbook by publisher ()");
			List<BookTO> bto=bs.searchbookPUBLISHER(name);
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
			
		}else if (value.equals("all")){
			System.out.println("calling searchbook all ()");
			
			List<BookTO> bto=bs.searchbook();
			
			req.setAttribute("BOOK", bto);
			String result="/WEB-INF/View/Function/booksearchresult.jsp";
			RequestDispatcher view = req.getRequestDispatcher(result);
	          view.forward(req, res);
		}
	}

}
