package com.librarymanagement.model;
import java.sql.*;
public class BookTO {
	private String bookid;
	private String BookName;
	private String BookAuthor;
	private String BookCategory;
	private String BookSubcategory;
	private String BookPublication;
	private String BookYear;
	private String BookStatus;
	public BookTO(String bookName, String bookAuthor, String bookCategory, String bookSubcategory,
			String bookPublication, String bookYear, String bookStatus) {
		super();
		BookName = bookName;
		BookAuthor = bookAuthor;
		BookCategory = bookCategory;
		BookSubcategory = bookSubcategory;
		BookPublication = bookPublication;
		BookYear = bookYear;
		BookStatus = bookStatus;
	}
	public BookTO(String bookid, String bookName, String bookAuthor, String bookCategory, String bookSubcategory,
			String bookPublication, String bookYear, String bookStatus) {
		super();
		this.bookid = bookid;
		BookName = bookName;
		BookAuthor = bookAuthor;
		BookCategory = bookCategory;
		BookSubcategory = bookSubcategory;
		BookPublication = bookPublication;
		BookYear = bookYear;
		BookStatus = bookStatus;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getBookCategory() {
		return BookCategory;
	}
	public void setBookCategory(String bookCategory) {
		BookCategory = bookCategory;
	}
	public String getBookSubcategory() {
		return BookSubcategory;
	}
	public void setBookSubcategory(String bookSubcategory) {
		BookSubcategory = bookSubcategory;
	}
	public String getBookPublication() {
		return BookPublication;
	}
	public void setBookPublication(String bookPublication) {
		BookPublication = bookPublication;
	}
	public String getBookYear() {
		return BookYear;
	}
	public void setBookYear(String bookYear) {
		BookYear = bookYear;
	}
	public String getBookStatus() {
		return BookStatus;
	}
	public void setBookStatus(String bookStatus) {
		BookStatus = bookStatus;
	}
	public BookTO (ResultSet resultset) throws SQLException {
		this.bookid = resultset.getString("bid");
        this.BookName = resultset.getString("bname");
        this.BookAuthor = resultset.getString("bauthor");
        this.BookCategory = resultset.getString("bcategory");
        this.BookSubcategory = resultset.getString("bsubcategory");
        this.BookPublication = resultset.getString("bpub");
        this.BookYear = resultset.getString("byear");
        this.BookStatus = resultset.getString("bstatus");
	}
	@Override
	public String toString() {
		return "BookTO [bookid=" + this.getBookid() + ", BookName=" + this.getBookName() + ", BookAuthor=" + this.getBookAuthor() + ", BookCategory="
				+ this.getBookCategory() + ", BookSubcategory=" + this.getBookSubcategory() + ", BookPublication=" + this.getBookPublication()
				+ ", BookYear=" + this.getBookYear() + ", BookStatus=" + this.getBookStatus() + "]";
	}
	
}
