<%@page import="com.glen.ReminderAppSpringMVC.models.Reminder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reminders</title>
<%@ page isELIgnored="false" %>
</head>
<body>
<ul>
<c:forEach items="${reminders}" var="reminder">
	<li>${reminder.title}
	    -${reminder.task}
	    <a href="<%=request.getContextPath()%>/deleteReminder/${reminder.id}">delete</a></li>
	    
</c:forEach>
</ul>
	<form action="" method="post">
		Id:<input type="text" name="id">
		Title:<input type="text" name="title">
		Task:<input type="text" name="task">
		<input type="submit">
	</form>
</body>
</html>