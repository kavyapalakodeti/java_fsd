<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Airlines</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/db_world"  
     user="root"  password="root"/>   
     
 <sql:query dataSource="${db}" var="rs">  
	SELECT DISTINCT AirLine from Flight 
 
</sql:query>

<table border="2" width="100%">  
<tr>  
<th>AirLine</th>  
    
</tr> 
<c:forEach var="table" items="${rs.rows}">  
		<tr>  
			<td><c:out value="${table.AirLine}"/></td>   
		</tr>  
		
	</c:forEach>  
</table>
</body>
</html>