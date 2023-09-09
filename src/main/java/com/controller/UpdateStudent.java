package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.model.StudentManager;


@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateStudent() {
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
		      String name = request.getParameter("name");
		      String dept = request.getParameter("dept");
		      
		      Student S = new Student();
		      S.setId(id);
		      S.setName(name);
		      S.setDept(dept);
		      
		      ack = SM.updateData(id, S);
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
		
		doGet(request, response);
	}

}
