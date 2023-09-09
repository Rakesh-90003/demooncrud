<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students List</title>
</head>
<body>
  <h3>Students list</h3>

  <%@ page import="java.util.*"%>
  <%@ page import="com.model.*"%>
  <% @SuppressWarnings("unchecked") List<Student> list = (List<Student>) request.getAttribute("slist"); %>
  <table border="1">
    <tr>
      <th>SID</th>
      <th>SNAME</th>
      <th>SDEPT</th>
    </tr>
    <% for(Student S : list) {%>
    <tr>
      <td><%=S.getId() %></td>
      <td><%=S.getName() %></td>
      <td><%=S.getDept() %></td>
    </tr>
    <%} %>
  </table>
</body>
</html>