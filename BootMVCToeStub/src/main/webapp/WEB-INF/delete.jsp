<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body>
    <h2>Result</h2>
    <c:if test="${wasDeleted == true}">
        <p>Film deleted successfully</p>
    </c:if>
    <c:if test="${wasDeleted == false}">
        <p>Film was not deleted</p>
    </c:if>
    <br>
    	<a href="/home.do">Return to Home Page</a>
    
</body>
</html>