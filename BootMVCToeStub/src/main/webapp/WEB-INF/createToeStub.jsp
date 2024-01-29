<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Toe Stub</title>
</head>
<body>


	<c:choose>
		<c:when test="${not empty ts}">
		<p>Toe Stub Added!</p>
				Id: ${ts.id}
				<br>
				Toe: ${ts.toe}
				<br>
				Time: ${ts.stubTime}
				<br>
		</c:when>
		<c:otherwise>
			<p>Toe Stub Not Added</p>
		</c:otherwise>
	</c:choose>
	<a href="/home.do">Return to Home Page</a>
</body>
</html>