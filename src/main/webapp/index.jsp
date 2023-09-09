<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>demooncrud Annotation</title>
</head>
<body>
  <h3>demooncrud Demo</h3>
  <form action="AddStudent" method="post">
    <table>
      <tr>
        <td style="width: 120px">Student ID</td>
        <td><input type="text" name="id" /></td>
      </tr>
      <tr>
        <td style="width: 120px">Student Name</td>
        <td><input type="text" name="name" /></td>
      </tr>
      <tr>
        <td style="width: 120px">Department</td>
        <td><input type="text" name="dept" /></td>
      </tr>
    </table>
    <input type="submit" value="Save" />
  </form>

  <h3>Update Operation</h3>
  <form action="UpdateStudent" method="post">
    <table>
      <tr>
        <td style="width: 120px">Student ID</td>
        <td><input type="text" name="id" /></td>
      </tr>
      <tr>
        <td style="width: 120px">Student Name</td>
        <td><input type="text" name="name" /></td>
      </tr>
      <tr>
        <td style="width: 120px">Department</td>
        <td><input type="text" name="dept" /></td>
      </tr>
    </table>
    <input type="submit" value="Update" />
  </form>

  <h3>Delete Operation</h3>
  <form action="DeleteStudent" method="post">
    <table>
      <tr>
        <td style="width: 120px">Student ID</td>
        <td><input type="text" name="id" /></td>
      </tr>
    </table>
    <input type="submit" value="Delete" />
  </form>

  <br />
  <br />
  <a href="GetStudent">Get Students</a>
</body>
</html>