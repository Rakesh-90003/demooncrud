package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.model.Student;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StudentManager;


@WebServlet("/GetStudent")
public class GetStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GetStudent() {
        super();
        
    }


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    // TODO Auto-generated method stub
		    response.setContentType("text/html");
		    PrintWriter pw = response.getWriter();
		    StudentManager SM = new StudentManager();
		    
		    List<Student> list = null;
		    try
		    {          
		      list = SM.getData();
		    }catch(Exception e)
		    {
		      pw.println(e.getMessage());
		    }
		    request.setAttribute("slist", list);
		    RequestDispatcher RD = request.getRequestDispatcher("viewdata.jsp");
		    RD.forward(request, response);
		  }
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
