<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${not empty ts}">
			<h5>${ts.id}: ${ts.crackedNail}</h5>
		</c:when>
		<c:otherwise>
			<h5>Can't Find Toe Stub</h5>
		</c:otherwise>
	</c:choose>
</body>
</html>