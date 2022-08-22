<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username="Admin";
String password="123";
String user=request.getParameter("username");
String pass=request.getParameter("password");
if(username.equals(user)&&password.equals(pass)){
	out.println("Login Sucessfull");
	out.println("<BR>");
	out.println("<a href=changepass.jsp>click here to change password</a>");
	out.println("<BR>");
	out.println("<a href=lsd.jsp>click here to see list to sources and destination </a>");
	out.println("<BR>");
	out.println("<a href=al.jsp>click here to see list to AirLines </a>");
	out.println("<BR>");
	out.println("<a href=fl.jsp>click here to see list to Flights </a>");
}
else{
	out.println("Invalid Login Credintials");
}
%>

</body>
</html>