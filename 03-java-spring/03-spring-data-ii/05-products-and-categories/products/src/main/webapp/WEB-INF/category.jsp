<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>New Category</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1>New Category</h1>
	<form:form action="/categories/new" method="POST" modelAttribute="category">
		    <div >
		        <form:label  path="name">Name:</form:label>
		        <div >
		        	<form:input  path="name"/>
		        	<form:errors  path="name"/>
		        </div>
		    </div>
		    <div >
		    	<div >
		    		<input class = "btn btn-success" type="submit" value="Create"/>
		    	</div>	
		    </div>
	    
		</form:form>
</body>