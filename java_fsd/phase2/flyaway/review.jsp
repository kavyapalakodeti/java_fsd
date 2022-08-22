<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Review & Pay</title>
</head>
<body>
<h2>Please check all your details and click pay button </h2>
<%
String n=(String)session.getAttribute("name");
String Fullname=request.getParameter("Fullname");
String Address=request.getParameter("Address");
String Age=request.getParameter("age");
String mobile=request.getParameter("Mobile");
String Email=request.getParameter("mail");
String Country=request.getParameter("Country");
out.println("Filght number: "+n);
out.println("<BR>");
out.println("FullName : " +Fullname);
out.println("<BR>");
out.println("\n Address : " +Address);
out.println("<BR>");
 out.println("\n Age :" +Age);
 out.println("<BR>");
 out.println("\n MobileNumber :"+ mobile);
 out.println("<BR>");
 out.println("\n Email :" +Email);
 out.println("<BR>");
 out.println("<BR>");
 String num=(String)session.getAttribute("num");
 String p=(String)session.getAttribute("p");

 int num2=Integer.parseInt(session.getAttribute("num").toString());
 int p2=Integer.parseInt(session.getAttribute("p").toString());

 out.println("TOTAL AMOUNT TO BE PAID :"+(num2*p2));
%>
<img alt="QR Code" src="C:\Users\ACER\Desktop\qr.png" width="200">
<form action="Conformation.jsp" method="post">
<Button>Pay</Button>
</form>
</body>
</html>