package com.dave.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/astromotel.com")
public class LoginServlet extends HttpServlet {
	
	   valid v =new valid();
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  
		  

		  request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		  
		  
	  }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		  
	String name= request.getParameter("name");
	 String password= request.getParameter("password");
	 
	 boolean b=v.isvalid(name,password);
	 
	 
	 
	 if(b){
	
	request.setAttribute("name",name);
     request.setAttribute("password",password);
     request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,response);

	 }
	 
	 else
	 {
		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
	 }
	}
	  

}
