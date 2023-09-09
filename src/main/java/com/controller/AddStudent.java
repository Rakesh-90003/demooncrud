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
import com.model.Student;

@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddStudent() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    // TODO Auto-generated method stub
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
		      
		      ack = SM.insertData(S);
		    }catch(Exception e)
		    {
		      ack = e.getMessage();
		    }
		    pw.println(ack);
		    RequestDispatcher RD = request.getRequestDispatcher("index.jsp");
		    RD.include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
