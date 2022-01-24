<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Question Profile</title>
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
	<h2><c:out value="${question.questionText}"/></h2>
	<div>
		<h4>Tags: 
			<c:forEach items="${ question.tags }" var="tag">
				<c:out value="${ tag.subject }   "/>
			</c:forEach>
		</h4>
	</div>
	<div id="outside-cont1">
		<div>
			<table class="table table-sm table-bordered table-striped" id = "dashboard-table" >
				<thead>
					<tr>
						<th scope="col">Answers </th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ question.answers }" var="answer">
					<tr>
							<td><c:out value="${ answer.answerText }"/> </td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div>
			<h4>Add your answer:</h4>
			<form:form action="/questions/answering" method="POST" modelAttribute="answer">
				<form:input type="hidden" path="question" value="${ question.id }"/>
				<div>
					<form:label path="answerText">Answer:</form:label>
					<div>
						<form:errors  path="answerText"/>
						<form:textarea type="text" style="width: 175px; height: 100px;" path="answerText"/>
					</div>
				</div>
				<div>
					<div id="answerbtn-cont">
						<button class="btn btn-success btn-sm">Answer it!</button>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</div>
</body>