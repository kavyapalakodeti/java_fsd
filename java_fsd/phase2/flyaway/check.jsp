<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error Page</title>
</head>
<body>
<%
String Tdate=request.getParameter("Tdate");
String Scity=request.getParameter("Scity");
String Dcity=request.getParameter("Dcity");
String num=request.getParameter("num");
String classs=request.getParameter("classs");
if(Scity.equals(Dcity)){
	out.println("Your origin and destination are same");
}
else{
	 session.setAttribute("Scity", Scity);
	 session.setAttribute("Dcity", Dcity);
	 session.setAttribute("num", num);
	 session.setAttribute("Tdate", Tdate);
	 session.setAttribute("classs", classs);
     response.sendRedirect("flightpage.jsp");
     
}


%>
</body>
</html>