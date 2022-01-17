<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Dojo</title>
</head>
<body>
	<h2>New Dojo</h2>
	<form:form action="/create/dojo" method="post" modelAttribute="newDojo">
		<form:label path="name">Name: </form:label>
		<form:errors path="name"/>
		<form:input path="name"/>
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>