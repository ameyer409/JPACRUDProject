<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:choose>
	<c:when test="${not empty ts}">
		<title>Toe Stub Updated</title>
	</c:when>
	<c:otherwise>
		<title>Updated Incomplete</title>
	</c:otherwise>
</c:choose>
</head>
<body>
	<c:choose>
		<c:when test="${not empty ts}">
			<p>Toe Stub Updated!</p>
		</c:when>
		<c:otherwise>
			<p>Toe Stub Could Not Be Updated</p>
		</c:otherwise>
	</c:choose>
	<a href="home.do">Return to Home Page</a>
</body>
</html>