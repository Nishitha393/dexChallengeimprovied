package com.pro.dex.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pro.dex.dao.DAO;
import com.pro.dex.dao.DBUtil;
public abstract class AbstractDAO implements DAO{

	protected Connection con = null;
	protected Statement stmt = null;
	protected ResultSet rs = null;
	protected String sql = "";
	

	public Boolean save(Object entity) {
		return performAction();
	}
	
	public Boolean update(Object entity) {
		return performAction();
	}

	public Boolean delete(Integer id) {
		return performAction();
	}
	
	private Boolean performAction() {
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
			
		}catch(Exception e) {System.out.println(e); return false;}
		finally {try{stmt.close(); con.close(); }catch(Exception e) {System.out.println(e);}}
		
		return true;
	}

}