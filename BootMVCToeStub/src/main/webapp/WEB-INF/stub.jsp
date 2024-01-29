<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Toe Stub</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty ts}">
			<h3>${ts.toe}</h3>
			<h3>Time of toe stub: ${ts.stubTime}</h3> 
			<h3>Toe nail cracked?: ${ts.crackedNail}</h3>
			<h3>Is it still healing?: ${ts.stillHealing}</h3>
			<a href="updateToeStub.do?stubId=${ts.id}">Update Toe Stub</a>
			<br>
			<a href="deleteToeStub.do?stubId=${ts.id}">Delete Toe Stub</a>
			<br>
		</c:when>
		<c:otherwise>
			<h3>Can't Find Toe Stub</h3>
			<br>
		</c:otherwise>
	</c:choose>
	<a href="/home.do">Return to Home Page</a>
</body>
</html>