<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>
  <body><style>

body{
     
      background-color: wheat;
      
 }
 h1 {
     colour: purple;
     text-align: center;
    }
         
</style>



 
 <form action = "validate">
 <table border="1" align="center">
 <tr>
    <td>  <span class="glyphicon glyphicon-user"></span></td>
    <td><input type="text" name="id"></td>
     </tr>
     
   <tr>
   <td> <span class="glyphicon glyphicon-lock"> </span></td>
    <td><input  type="password" name="password"></td>
   
   </tr>
  
 
 
 <input type= "submit" value="Login" >
 
 
</table>

 
 
 </form>
 
</body>

</html>