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
	String sql="insert into book values(?,?,?,?,?,?,?,?)";
	ps=con.prepareStatement(sql);
	ps.setInt(1,bto.getBookid());
	ps.setString(2,bto.getBookName());
	ps.setString(3,bto.getBookAuthor());
	ps.setString(4,bto.getBookCategory());
	ps.setString(5,bto.getBookSubcategory());
	ps.setString(6,bto.getBookPublication());
	ps.setString(7,bto.getBookYear());
	ps.setString(8,bto.getBookStatus());
	x=ps.executeUpdate();
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
return x;
}
public  int deletebook(int bookid){
	int x=0;
PreparedStatement ps=null;
Connection con = null;
try {
	con=JDBCUtil.getdbConnection();
	String sql="DELETE FROM book WHERE bid=? ";
	ps=con.prepareStatement(sql);
	ps.setInt(1,bookid);
	
	x=ps.executeUpdate();
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
return x;
}
}


