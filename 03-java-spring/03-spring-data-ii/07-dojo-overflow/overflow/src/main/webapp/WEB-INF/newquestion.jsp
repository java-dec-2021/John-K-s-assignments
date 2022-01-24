<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>New Question</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
<nav class="navbar navbar-expand-xl navbar-dark bg-dark" id="nav-bar">
	<div class="collapse navbar-collapse show" id="navbarDark">
		<ul class="navbar-nav me-auto mb-2 mb-xl-0">
			<li class="nav-item">
				<a class="nav-link active" aria-current="page" href="/questions">Home</a>
			</li>
		</ul>
	</div>
</nav>
<div id="outside-all">
	<h2>What is your question?</h2>
	<form:form action="/questions/new" method="post" modelAttribute="question">
		<div >
			<form:label path="questionText">Question:</form:label>
			<div >
				<form:errors  path="questionText"/>
				<form:textarea type="text" style="width: 350px; height: 100px;" path="questionText"/>
			</div>
		</div>
		<div>
			<form:label path="parsedTags">Tags:</form:label>
		    <div>
		    	<form:errors path="parsedTags"/>
		    	<form:input type="text" path="parsedTags"/>
			</div>
		</div> 
		<div>
		    <div id = "submit-cont">
		    	<button class="btn btn-success btn-sm">Submit</button>
		    </div>	
		</div>
	</form:form>
</div>	
</body>