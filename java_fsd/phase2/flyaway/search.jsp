<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<title>Fly Away AirLine Booking Portal</title>
</head>
<body>
<h1>Welcome to Fly Away AirLine Booking Portal</h1>
<form action="check.jsp" method="post">
<label for="Tdate">Date of Travel :</label>
<select name="Tdate" id="Tdate">
<option value="2022-07-20">2022-07-20</option>
<option value="2022-07-21">2022-07-21</option>
<option value="2022-07-22">2022-07-22</option>
<option value="2022-07-23">2022-07-23</option>
<option value="2022-07-24">2022-07-24</option>
<option value="2022-07-25">2022-07-25</option>
<option value="2022-07-26">2022-07-26</option>
<option value="2022-07-27">2022-07-27</option>
<option value="2022-07-28">2022-07-28</option>
<option value="2022-07-29">2022-07-29</option>
<option value="2022-07-30">2022-07-30</option>
</select>
<br>
<label for="Scity">From:</label>
<select name="Scity" id="Scity">
<option value="Banglore">Banglore</option>
<option value="Kolkata">Kolkata</option>
<option value="Pune">Pune</option>
<option value="Delhi">Delhi</option>
<option value="Vijayawada">Vijayawada</option>
<option value="Vijag">Vijag</option>
</select>
<br>
<label for="Dcity">To:</label>
<select name="Dcity" id="Dcity">
<option value="Banglore">Banglore</option>
<option value="Kolkata">Kolkata</option>
<option value="Pune">Pune</option>
<option value="Delhi">Delhi</option>
<option value="Vijag">Vijag</option>
<option value="Vijayawada">Vijayawada</option>
<option value="Chennai">Chennai</option>
</select>
<br>
<label for="num">No.of.Persons:</label>
<select name="num" id="num">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="4">5</option>
<option value="4">6</option>
<option value="4">7</option>
<option value="4">8</option>
<option value="4">9</option>
</select>
<br>
<label for="classs">Class:</label>
<select name="classs" id="classs">
<option value="Economy">Economy</option>
<option value="Business">Business</option>
</select>
<br>
<button>Submit</button>
</form>
<a href="admin.jsp">Click here if you are an admin</a>
</body>
</html>