<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Flight Details Page</title>
</head>
<body>
<center><h2>Available flights</h2></center>
<%

String Tdate=(String)session.getAttribute("Tdate");
String Scity=(String)session.getAttribute("Scity");
String Dcity=(String)session.getAttribute("Dcity");
String num=(String)session.getAttribute("num");
String classs=(String)session.getAttribute("classs");

%>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>   
 
<!-- sql:query  tag --> 
<sql:query dataSource="${db}" var="rs">  
	SELECT * from Flight WHERE Scity=? AND travel=? AND Dcity=? AND avail>=? AND class=?
	<sql:param value="<%=Scity%>"></sql:param> 
	<sql:param value="<%=Tdate %>"></sql:param> 
	<sql:param value="<%=Dcity %>"></sql:param> 
	<sql:param value="<%=num %>"></sql:param> 
	<sql:param value="<%=classs %>"></sql:param> 
</sql:query>  
   

<table border="2" width="100%">  
<tr>  
<th>AirLine</th>  
<th>Price</th>  
<th>Source</th>  
<th>Destination</th>  
<th>Available Tickets</th>  
<th>FlightNo</th>  
</tr>  
	<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.AirLine}"/></td>  
			<td><c:out value="${table.Price}"/></td>  
			<td><c:out value="${table.Scity}"/></td>  
			<td><c:out value="${table.Dcity}"/></td>    
			<td><c:out value="${(table.total)-(table.booked)}"/></td> 
			<td><a href="registerdetails.jsp?n=${table.Flightno}&p=${table.Price}&dt=${table.dtime}&at=${table.atime}&al=${table.AirLine}"> <c:out value="${table.Flightno}"/></a></td> 
		</tr>  
		
	</c:forEach>  
</table>



</body>
</html>