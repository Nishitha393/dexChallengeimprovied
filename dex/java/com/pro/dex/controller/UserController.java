package com.pro.dex.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import com.pro.dex.dao.UserMasterDAO;
import com.pro.dex.model.UserMaster;



public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserMasterDAO umdao = new UserMasterDAO();   
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String username = request.getParameter("username"); 
		String password = request.getParameter("password");
		
		if(action.equalsIgnoreCase("register")) {
			String name = request.getParameter("name");
			String email= request.getParameter("email");
			String phno= request.getParameter("phno");
			
			UserMaster um = new UserMaster(username, password, name, email, phno);
			registerUser(request, response,um);
		}
		else if(action.equalsIgnoreCase("login")) {
			UserMaster um = new UserMaster(username, password);
			checkUserLogin(request, response, um);
		}
	}
	private void registerUser(HttpServletRequest request, HttpServletResponse response, UserMaster um) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Boolean success = umdao.save(um);
		HttpSession session = null;
		RequestDispatcher rd = null;
		
		if(success) {			
			session =request.getSession(true);
			session.setAttribute("name",um.getName());
			session.setAttribute("email",um.getEmail());
			session.setAttribute("phno",um.getPhno());
			session.setAttribute("username", um.getUsername());
			
			rd = request.getRequestDispatcher("dexroom.jsp");
			rd.include(request,response);
		}else {
			rd = request.getRequestDispatcher("signin.jsp");
			rd.include(request,response);
			out.println("<h3 align='center' style='color:red'>Unable to register..plz try again</h3>");
		}
	}
	private void checkUserLogin(HttpServletRequest request, HttpServletResponse response, UserMaster um) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		um = umdao.checkLogin(um);
		RequestDispatcher rd = null; 
		HttpSession session = null;
		if(um.getId() > 0 ) {
			session =request.getSession(true);
			session.setAttribute("name",um.getName());
			session.setAttribute("username", um.getUsername());
			
			rd = request.getRequestDispatcher("dexroom.jsp");
			rd.include(request,response);
		}
		else {
			rd = request.getRequestDispatcher("login.jsp");
			rd.include(request,response);
			out.println("<h3 align='center' style='color:red'>Wrong Username / password</h3>");
		}
	}
	
}
