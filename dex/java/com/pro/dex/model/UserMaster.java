package com.pro.dex.model;


import java.io.Serializable;

public class UserMaster implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phno;
	
	public UserMaster() {super();}
	
	public UserMaster(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public UserMaster(String username, String password, String name,String email,String phno) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email= email;
		this.phno=phno;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
}
