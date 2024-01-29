<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Toe Stub</title>
</head>
<body>

<h2>Toe Stub Update Form</h2>
<form action="editToeStub.do" method="POST">

<input type="hidden" name="id" value="${ts.id}"> 
		
		<label for="toe">Toe: </label> 
		<select name="toe" value="${ts.toe}" required>
			<option value="RIGHTBIGTOE">Right Big Toe</option>
			<option value="RIGHTINDEXTOE">Right Index Toe</option>
			<option value="RIGHTMIDDLETOE">Right Middle Toe</option>
			<option value="RIGHTFORETOE">Right Fore Toe</option>
			<option value="RIGHTPINKYTOE">Right Pinky Toe</option>
			<option value="LEFTBIGTOE">Left Big Toe</option>
			<option value="LEFTINDEXTOE">Left Index Toe</option>
			<option value="LEFTMIDDLETOE">Left Middle Toe</option>
			<option value="LEFTFORETOE">Left Fore Toe</option>
			<option value="LEFTPINKYTOE">Left Pinky Toe</option>
		</select> 
		<br>
		
		<Label for="stubTime">Time of Stub:</Label>
		<input type="date" name="stubTime"
		value="${ts.stubTime}"/>
		
		<label for="crackedNail">Toe Nail Cracked?: </label>
		<select name="crackNail" required>
			<option value="true">true</option>
			<option value="false">false</option>
		</select> 
		<br>

		<label for="stillHealing">Still Healing?: </label>
		<select name="stillHealing" required>
			<option value="true">true</option>
			<option value="false">false</option>
		</select> 
		
		<input type="submit" value="Update Toe Stub">
	</form>
		
</body>
</html>