package com.librarymanagement.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.librarymanagement.model.BookTO;

import com.librarymanagement.util.JDBCUtil;

public class booksearch {
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	List<BookTO> books = new ArrayList<BookTO>();
	public  List <BookTO> searchbookID(int bid) {
		int x=0;
		
		System.out.println("search book called()");
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book where bid= ?";
			ps=con.prepareStatement(sql);
			ps.setInt(1,bid);
			rs = ps.executeQuery();
			while(rs.next()) {
				x=1;
				BookTO bto = new BookTO(rs);
				bto.setBookid(rs.getInt(1));
				bto.setBookName(rs.getString("bname"));
				bto.setBookAuthor(rs.getString("bauthor"));
				bto.setBookCategory(rs.getString("bcategory"));
				bto.setBookSubcategory(rs.getString("bsubcategory"));
				bto.setBookPublication(rs.getString("bpub"));
				bto.setBookYear(rs.getString("byear"));
				bto.setBookStatus(rs.getString("bstatus"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
	public List<BookTO> searchbookBNAME(String bname) {
		int x=0;
		
		System.out.println("search book called()");		
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book where bname= ?";
			ps=con.prepareStatement(sql);
			ps.setString(1,bname);
			rs = ps.executeQuery();
			while(rs.next()) {
				x=1;
				BookTO bto = new BookTO(rs);
				bto.setBookid(rs.getInt("bid"));
				bto.setBookName(rs.getString("bname"));
				bto.setBookAuthor(rs.getString("bauthor"));
				bto.setBookCategory(rs.getString("bcategory"));
				bto.setBookSubcategory(rs.getString("bsubcategory"));
				bto.setBookPublication(rs.getString("bpub"));
				bto.setBookYear(rs.getString("byear"));
				bto.setBookStatus(rs.getString("bstatus"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
	public List<BookTO> searchbookAUTHOR(String author) {
		int x=0;
		
		System.out.println("search book called()");

		
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book where bauthor=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,author);
			rs = ps.executeQuery();
			while(rs.next()) {
				x=1;
				BookTO bto = new BookTO(rs);
				bto.setBookid(rs.getInt("bid"));
				bto.setBookName(rs.getString("bname"));
				bto.setBookAuthor(rs.getString("bauthor"));
				bto.setBookCategory(rs.getString("bcategory"));
				bto.setBookSubcategory(rs.getString("bsubcategory"));
				bto.setBookPublication(rs.getString("bpub"));
				bto.setBookYear(rs.getString("byear"));
				bto.setBookStatus(rs.getString("bstatus"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
	public  List <BookTO> searchbookCATEGORY(String category) {
		int x=0;
		
		System.out.println("search book called()");
		
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book where bcategory= ?";
			ps=con.prepareStatement(sql);
			ps.setString(1,category);
			rs = ps.executeQuery();
			while(rs.next()) {
				x=1;
				BookTO bto = new BookTO(rs);
				bto.setBookid(rs.getInt("bid"));
				bto.setBookName(rs.getString("bname"));
				bto.setBookAuthor(rs.getString("bauthor"));
				bto.setBookCategory(rs.getString("bcategory"));
				bto.setBookSubcategory(rs.getString("bsubcategory"));
				bto.setBookPublication(rs.getString("bpub"));
				bto.setBookYear(rs.getString("byear"));
				bto.setBookStatus(rs.getString("bstatus"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
	public  List <BookTO> searchbookSUBCATEGORY(String subcategory) {
		int x=0;
		
		System.out.println("search book called()");
		
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book where bsubcategory=?";
			ps=con.prepareStatement(sql);
			ps.setString(1,subcategory);
			
			rs = ps.executeQuery();
			if(rs.next())
			x=1;
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
	public  List <BookTO> searchbookPUBLISHER(String publisher) {
		int x=0;
		
		System.out.println("search book called()");
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book where bpub = ?";
			ps=con.prepareStatement(sql);
			ps.setString(1,publisher);
			rs = ps.executeQuery();
			while(rs.next()) {
				x=1;
				BookTO bto = new BookTO(rs);
				bto.setBookid(rs.getInt("bid"));
				bto.setBookName(rs.getString("bname"));
				bto.setBookAuthor(rs.getString("bauthor"));
				bto.setBookCategory(rs.getString("bcategory"));
				bto.setBookSubcategory(rs.getString("bsubcategory"));
				bto.setBookPublication(rs.getString("bpub"));
				bto.setBookYear(rs.getString("byear"));
				bto.setBookStatus(rs.getString("bstatus"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
	public  List <BookTO> searchbook() {
		int x=0;
		
		System.out.println("search book called()");
		//System.out.println(email+" "+pwd);
		
		try {
			con=JDBCUtil.getdbConnection();
			String sql="Select * from book";
			ps=con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				x=1;
				BookTO bto = new BookTO(rs);
				bto.setBookid(rs.getInt("bid"));
				bto.setBookName(rs.getString("bname"));
				bto.setBookAuthor(rs.getString("bauthor"));
				bto.setBookCategory(rs.getString("bcategory"));
				bto.setBookSubcategory(rs.getString("bsubcategory"));
				bto.setBookPublication(rs.getString("bpub"));
				bto.setBookYear(rs.getString("byear"));
				bto.setBookStatus(rs.getString("bstatus"));
				System.out.println(bto);
				books.add(bto);
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {JDBCUtil.cleanup(rs,ps,con);

		}
		System.out.println("returning to calling method()");
		return books;
	}
}
