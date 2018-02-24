package com.librarymanagement.util;
import java.sql.*;
public class JDBCUtil {
static {
	try {
	Class.forName("com.mysql.jdbc.Driver");	
	}catch(ClassNotFoundException ex) {
		System.out.println(ex);
	}
}


public static Connection getdbConnection()throws SQLException{
String url="jdbc:mysql://localhost:3306/dummydb";
Connection con=DriverManager.getConnection(url,"root","indurai");
return con;
}

public static void cleanup(Statement st,Connection con) {
	try {
		if(st!=null)st.close();
		if(con!=null)con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
public static void cleanup(CallableStatement cs,Connection con) {
	try {
		if(cs!=null)cs.close();
		if(con!=null)con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
public static void cleanup(ResultSet rs,Statement st,Connection con) {
	try {
		if(rs!=null)rs.close();
		if(st!=null)st.close();
		if(con!=null)con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
public static void cleanup(PreparedStatement ps,Connection con) {
	try {
		if(ps!=null)ps.close();
		if(con!=null)con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
public static void cleanup(ResultSet rs,PreparedStatement ps,Connection con) {
	try {
		if(rs!=null)rs.close();
		if(ps!=null)ps.close();
		if(con!=null)con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
}
}