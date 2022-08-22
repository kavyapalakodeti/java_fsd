<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thanks page</title>
</head>
<body>
<%
int num2=Integer.parseInt(session.getAttribute("num").toString());
String n=(String)session.getAttribute("name");
String dt=(String)session.getAttribute("dt");
String at=(String)session.getAttribute("at");
String al=(String)session.getAttribute("al");
String Scity=(String)session.getAttribute("Scity");
String Dcity=(String)session.getAttribute("Dcity");
String num=(String)session.getAttribute("num");
String Tdate=(String)session.getAttribute("Tdate");
String classs=(String)session.getAttribute("classs");

%>
<sql:setDataSource var="db"  driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>
       <c:set var="k" scope="session" value="<%=num2 %>"></c:set>
     <c:set var="s" scope="session" value="<%=n %>"></c:set>
     <sql:update dataSource="${db }" var="count">
UPDATE Flight SET booked=booked+? WHERE Flightno=?
<sql:param value="${k}"></sql:param>
<sql:param value="${s}"></sql:param>
</sql:update>
<sql:update dataSource="${db }" var="count">
UPDATE Flight SET avail=avail-? WHERE Flightno=?
<sql:param value="${k}"></sql:param>
<sql:param value="${s}"></sql:param>
</sql:update>

 
<h2>Thank you for booking !!!</h2><br>
<b> Your Flight details : </b><br>

<% 
out.println("Date of Travel:"+Tdate);
out.println("<BR>");
out.println("Flight No:"+n);
out.println("<BR>");
out.println("AirLine Name:"+al);
out.println("<BR>");
out.println("Source City:"+Scity);
out.println("<BR>");
out.println("Destination City:"+Dcity);
out.println("<BR>");
out.println("Departure Time:"+dt);
out.println("<BR>");
out.println("Arrival Time:"+at);
out.println("<BR>");
out.println("No.of Tickets:"+num2);
%>


</body>
</html>