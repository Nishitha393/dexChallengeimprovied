package com.pro.dex.dao;

import com.pro.dex.dao.AbstractDAO;
import com.pro.dex.dao.DBUtil;
import com.pro.dex.model.UserMaster;

public class UserMasterDAO extends AbstractDAO{

	public UserMaster checkLogin(UserMaster um) {
		sql = "select id, name from usermaster where username='"+um.getUsername()+"' "
				+ "and password='"+um.getPassword()+"'";
		
		try {
			con = DBUtil.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				um.setId(rs.getInt(1));
				um.setName(rs.getString(2));
			}
			else {
				um.setId(0);
				um.setName("wrong user");				
			}
		}catch(Exception e) {System.out.println(e);}
		finally {try{ stmt.close(); con.close();}catch(Exception e) {System.out.println(e);}}
		
		return um;		
	}

	@Override
	public Boolean save(Object entity) {
		UserMaster um = (UserMaster) entity;
		
		sql = "insert into usermaster (username, password, name,email,phno) values("
				+ "'"+um.getUsername()+"','"+um.getPassword()+"','"+um.getName()+"','"+um.getEmail()+"','"+um.getPhno()+"')";
		
		return super.save(entity);
	}
	
	
	
}

