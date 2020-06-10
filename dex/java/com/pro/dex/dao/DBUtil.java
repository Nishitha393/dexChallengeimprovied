package com.pro.dex.dao;

import java.sql.*;
public class DBUtil {
	private static Connection con = null;
	
	private static String username = "root";
	private static String password = "root";
	private static String dbURL = "jdbc:mysql://127.0.0.1:3306/dexchallenge";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e) {System.out.println(e);}
	}
	
	public static Connection getConnection() {
		try {
			con = DriverManager.getConnection(dbURL, username, password);
		}catch(Exception e) {System.out.println(e);}
		return con;
	}

}