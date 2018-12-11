<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trading List</title>
</head>
<body>
	
	
	
		<h1>Trading List:</h1>
<table class="table" border="1">
				<thead class="thead">
					<tr>
						<th>Player Name</th>
						<th>Shikigami Name</th>
						<th></th>


					</tr>
				</thead>
				<tbody>
					<c:forEach  var="list" items="${list}">
						<tr>
							<td></td>
							<td></td>
							<td>${list.shardnum}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
	${list}
</body>
</html>