<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>simcon</title>
</head>
<body>
<style>

body{
     
      background-color: lightpink;
      
 }
 h1 {
     colour: green;
     text-align: center;
    }
         
</style>
	<c:if test="${ empty successMsg}">
	 
		<a href="login"> Login </a>
		<br>
		
		<a href="registration"> Register </a>
		
	</c:if>

	<hr>
	<h1 style="color:green">
    ${succsessMsg}

    </h1>
	
	

	<c:if test="${showLoginPage}">
		<jsp:include page="login.jsp"></jsp:include>
		 
	</c:if>
	


	<c:if test="${ not empty errorMsg}">
	<h1 style="color:red">
    ${errorMsg }

    </h1>
   
 
<jsp:include page="login.jsp"></jsp:include>
</c:if>

	<c:if test="${showRegistrationPage}"> 
<jsp:include page="registration.jsp"></jsp:include>
</c:if>
 	
		
		
</body>
</html>