<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>New Language</title>
</head>
<body class="p-5">
	<a class="ms-5" href="/dashboard">Dashboard</a>
	<div class="d-flex flex-column mt-5 ms-5">
		<h1>
			<c:out value="${language.name}" />
		</h1>
		<p>
			<c:out value="Created by:    ${language.creator}" />
		</p>
		<p>
			<c:out value="Version:    ${language.currentVersion}" />
		</p>
		<a href="/dashboard/${language.id}/edit">Edit</a>
		<a href="/delete/${language.id}">Delete</a>
	</div>
</body>
</html>