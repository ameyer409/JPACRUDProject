<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Ouch man I stubbed my toe!</h2>

<form action="stub.do" method="post">
Search Toe Stub by ID: <input type="text" name="stubId">
<input type="submit" value="submit">

<h2>Add Toe Stub</h2>
	<a href="addToeStub.do">click here!</a>
</form>
</body>
</html>