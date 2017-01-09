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
     
      background-color: lightblue;
      
 }
 h1 {
     colour: orange;
     text-align: center;
    }
         
</style>


<form action = "validate">

  <table border="1" align="center">
  <tr>
 
<td> Mail ID : <input type="text" name="mailID" > </td>
</tr>
<tr>
 <td>Password: <input type="password" name="password">  </td> 
 </tr>
  <tr>
<td>Mobile number : <input type="text" name="mobile" > </td>
</tr>
<tr>
<td>Adress: <input type="text" name="adress"></td>

</tr>
 
   </table>
   

 <input type= "submit" value="Register">
  <input type= "reset" value="reset">

 
 </form>

</body>
</html>