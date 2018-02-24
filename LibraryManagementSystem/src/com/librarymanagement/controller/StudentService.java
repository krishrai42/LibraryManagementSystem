package com.librarymanagement.controller;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

import com.librarymanagement.model.StudentTO;
import com.librarymanagement.util.JDBCUtil;
public class StudentService {
public static  int registerStudent(StudentTO sto){
	int x=0;
PreparedStatement ps=null;
Connection con = null;
try {
	con=JDBCUtil.getdbConnection();
	String sql="insert into student(sname,smobile,scity,sstate,sdob,semail,spassword,gender,sdepartment) values(?,?,?,?,?,?,?,?,?)";
	ps=con.prepareStatement(sql);
	//ps.setString(1,sto.getId());
	ps.setString(1,sto.getName());
	ps.setString(2,sto.getMobile());
	ps.setString(3,sto.getCity());
	ps.setString(4,sto.getState());
	ps.setString(6,sto.getDateofbirth());
	ps.setString(5,sto.getEmail());
	ps.setString(7,sto.getPassword());
	ps.setString(8,sto.getGender());
	ps.setString(9,sto.getDepartment());
	x=ps.executeUpdate();
}catch(Exception e) {
	e.printStackTrace();
}
finally {JDBCUtil.cleanup(ps,con);

}
return x;
}

public static String verifyStudent(String email, String pwd) {
	int x=0;
	String sid=null;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	System.out.println("verify Student called()");
	System.out.println(email+" "+pwd);
	
	try {
		con=JDBCUtil.getdbConnection();
		String sql="Select * from student where semail= ? and spassword=?";
		ps=con.prepareStatement(sql);
		ps.setString(1,email);
		ps.setString(2, pwd);
		rs = ps.executeQuery();
		if(rs.next()) {
		x=1;
		sid=rs.getString(1);
		System.out.println(x);
		System.out.println("Student verified");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {JDBCUtil.cleanup(rs,ps,con);
	//return x;
	}
	System.out.println("returning to calling method()");
	System.out.println(x);
	return sid;
}
public int verifyStudent(String studid) {
	int x=0;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	System.out.println("verify Student called()");
	
	
	try {
		con=JDBCUtil.getdbConnection();
		String sql="Select * from student where sid= ?";
		ps=con.prepareStatement(sql);
		ps.setString(1,studid);
		
		rs = ps.executeQuery();
		if(rs.next()) {
		x=1;
		System.out.println(x);
		System.out.println("Student verified");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {JDBCUtil.cleanup(rs,ps,con);
	//return x;
	}
	System.out.println("returning to calling method()");
	System.out.println(x);
	return x;
}
public Map<Integer,Integer>  checkStudent(String studid) {
	  Map<Integer,Integer> mapvalue = new HashMap<Integer,Integer>();
	int x=0;
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	System.out.println("verify Student called()");
	int y= verifyStudent(studid);
	System.out.println("verify Student returned()"+y);
	mapvalue.put(1, y);
	if(y==1) {
		
	try {
		con=JDBCUtil.getdbConnection();
		String sql="SELECT count(*) as rowcount FROM book_issued where sid=?;";
		ps=con.prepareStatement(sql);
		ps.setString(1,studid);
		
		rs = ps.executeQuery();
		if(rs.next()) {
			int count = rs.getInt("rowcount");
			mapvalue.put(2,count);
		x=1;
		System.out.println(x);
		System.out.println("no. of book issued"+count);
		System.out.println("Student checked");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {JDBCUtil.cleanup(rs,ps,con);
	//return x;
	}
	System.out.println("returning to calling method()");
	System.out.println(x);
//	return mapvalue;
	}

	return mapvalue;
}
public String getPasswordbyemail(String email) {
	String pwd=null;
	Connection con = null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	try {
		con=JDBCUtil.getdbConnection();
		String sql="Select spassword from student where semail= ?";
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
