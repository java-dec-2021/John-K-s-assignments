<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<h2>New Ninja</h2>
	<form:form action="/create/ninja" method="post" modelAttribute="newNinja">
	<p>
		<form:label path="dojo">Dojo: </form:label>
		<form:errors path="dojo"/>
		<form:select path="dojo">
			<c:forEach items="${Dojos}" var="dojo">
				<option value="${dojo.id}">${dojo.name }</option>
			</c:forEach>
		</form:select>
	</p>
	<p>
		<form:label path="firstName">First Name: </form:label>
		<form:errors path="firstName"/>
		<form:input path="firstName"/>
	</p>
	<p>
		<form:label path="lastName">Last Name: </form:label>
		<form:errors path="lastName"/>
		<form:input path="lastName"/>
	</p>
	<p>
		<form:label path="age">Age: </form:label>
		<form:errors path="age"/>
		<form:input type="number" path="age" min="1" max="150" />
	</p>
	
		<input type="submit" value="Create"/>
	</form:form>
</body>
</html>