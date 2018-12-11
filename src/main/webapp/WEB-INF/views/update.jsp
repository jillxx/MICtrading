<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Added or Updated</title>
</head>
<body>
${person}
<form action="update">

	<input type="hidden" name="id" value="${id}" > 
	<table>		
		<tr>
			<td>ID  </td>
			<td>${id}</td>
		</tr>
		<tr>
			<td>Name: </td>
			<td><input type="text" name="name"></td>
		</tr>
        <tr>
			<td>Location:</td>
			<td><input type="text" name="location"></td>
		</tr>
			
	</table>

	<input id="submitBtn" type="submit" value="Update">
	
	</form>
</body>
</html>