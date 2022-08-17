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
String Pid=request.getParameter("pid");
String Pname=request.getParameter("pname");
String Price=request.getParameter("price");
out.println("Your Product Id is "+Pid);
out.println("<br>Your Product name  is "+Pname);
out.println("<br>Your Product price  is "+Price);
%>
</body>
</html>