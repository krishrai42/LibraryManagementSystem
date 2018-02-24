package com.librarymanagement.controller;
import java.sql.*;
import com.librarymanagement.model.BookTO;
import com.librarymanagement.util.JDBCUtil;
public class BookService {
public  int addbook(BookTO bto){
	int x=0;
PreparedStatement ps=null;
Connection con = null;
try {
	con=JDBCUtil.getdbConnection();
	String sql="insert into book(bname,bauthor,bcategory,bsubcategory,bpub,byear,bstatus) values(?,?,?,?,?,?,?)";
	ps=con.prepareStatement(sql);
	//ps.setInt(1,bto.getBookid());
	ps.setString(1,bto.getBookName());
	ps.setString(2,bto.getBookAuthor());
	ps.setString(3,bto.getBookCategory());
	ps.setString(4,bto.getBookSubcategory());
	ps.setString(5,bto.getBookPublication());
	ps.setString(6,bto.getBookYear());
	ps.setString(7,bto.getBookStatus());
	x=ps.executeUpdate();
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
return x;
}
public  int deletebook(String bookid){
	int x=0;
PreparedStatement ps=null;
Connection con = null;
try {
	con=JDBCUtil.getdbConnection();
	String sql="DELETE FROM book WHERE bid=? ";
	ps=con.prepareStatement(sql);
	ps.setString(1,bookid);
	
	x=ps.executeUpdate();
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
return x;
}
public  String checkbookstatus(String bookid){
	int x=0;
PreparedStatement ps=null;
Connection con = null;
ResultSet rs=null;
String value="";
try {
	con=JDBCUtil.getdbConnection();
	String sql="Select bstatus from book WHERE bid=? ";
	ps=con.prepareStatement(sql);
	ps.setString(1,bookid);
	rs=ps.executeQuery();
	if(rs.next()) {
		value=rs.getString("bstatus");
	}
	else {
		value="No book found";
	}
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
System.out.println(value);
return value;
}
}


