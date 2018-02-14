package com.librarymanagement.controller;
import java.sql.*;
import com.librarymanagement.model.librarianTO;
import com.librarymanagement.util.JDBCUtil;
public class LibrarianService {
public static  int registerLibrarian(librarianTO lto){
	int x=0;
PreparedStatement ps=null;
Connection con = null;
try {
	con=JDBCUtil.getdbConnection();
	String sql="insert into librarian values(?,?,?,?,?)";
	ps=con.prepareStatement(sql);
	ps.setInt(1,lto.getId());
	ps.setString(2,lto.getName());
	ps.setString(3,lto.getEmail());
	ps.setString(4,lto.getPassword());
	ps.setString(5,lto.getGender());
	x=ps.executeUpdate();
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
return x;
}

protected  int verifyLibrarian(String email, String pwd) {
	int x=0;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	System.out.println("verify librarian called()");
	System.out.println(email+" "+pwd);
	
	try {
		con=JDBCUtil.getdbConnection();
		String sql="Select * from librarian where email= ? and password=?";
		ps=con.prepareStatement(sql);
		ps.setString(1,email);
		ps.setString(2, pwd);
		rs = ps.executeQuery();
		if(rs.next())
		x=1;
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {JDBCUtil.cleanup(rs,ps,con);

	}
	System.out.println("returning to calling method()");
	return x;
}

public String getPasswordbyemail(String email) {
	String pwd=null;
	Connection con = null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		con=JDBCUtil.getdbConnection();
		String sql="Select password from librarian where email= ?";
		ps=con.prepareStatement(sql);
		ps.setString(1,email);
		
		rs = ps.executeQuery();
		System.out.println(rs);
		if(rs.next())
		pwd=rs.getString(1);
		System.out.println(pwd);
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {JDBCUtil.cleanup(rs,ps,con);

	}
	return pwd;
}
}
