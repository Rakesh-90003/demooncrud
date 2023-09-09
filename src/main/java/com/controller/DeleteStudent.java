package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StudentManager;

@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteStudent() {
        super();
        
    }

	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		    response.setContentType("text/html");
		    PrintWriter pw = response.getWriter();
		    StudentManager SM = new StudentManager();
		    String ack = "";
		    try
		    {
		      int id = Integer.parseInt(request.getParameter("id"));
		            
		      ack = SM.deleteData(id);
		    }catch(Exception e)
		    {
		      ack = e.getMessage();
		    }
		    pw.println(ack);
		    RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
		    RD.include(request, response);
		  }
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
