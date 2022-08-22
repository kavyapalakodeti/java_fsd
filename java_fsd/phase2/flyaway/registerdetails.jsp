<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal details</title>
</head>
<body>
<%
String Id=request.getParameter("n");
String p=request.getParameter("p");
String dt=request.getParameter("dt");
String at=request.getParameter("at");
String al=request.getParameter("al");
out.println("Flight no:"+Id);
session.setAttribute("name",Id);
session.setAttribute("p",p);
session.setAttribute("dt",dt);
session.setAttribute("at",at);
session.setAttribute("al",al);

%>
<br>
<b>Fill the below details</b>
<form action="review.jsp" method="post">
FulName: <input type="text" name="Fullname"><br>
Address: <input type="text" name="Address"><br>
Age: <input type="number" name="age"><br>
Mobile Number: <input type="number" name="Mobile"><br>
Email:<input type="email" name="mail"><br>
<label for="type">Type:</label>
<select name="type" id="type">
<option value="Aadhar">Aadhar</option>
<option value="SSN">SSN</option>
<option value="Passport">Voter Id</option>
<option value="Passport">Driving License</option>
</select>
<input type="text" name="typeno"><br>
Country: <input type="text" name="Country"><br>
<button>Review</button>
</form>
</body>
</html>