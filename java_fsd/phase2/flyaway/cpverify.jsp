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
String old=request.getParameter("old");
String newpass=request.getParameter("new");
if(password.equals(old)){
	password=newpass;
	out.println("Password changed Sucessfully");
	out.println("<BR>");
	out.println("<a href=lsd.jsp>click here to see list to sources and destination </a>");
	out.println("<BR>");
	out.println("<a href=al.jsp>click here to see list to AirLines </a>");
	out.println("<BR>");
	out.println("<a href=fl.jsp>click here to see list to Flights </a>");
}
else{
	out.println("Your old password doesn't match");
}
%>
</body>
</html>