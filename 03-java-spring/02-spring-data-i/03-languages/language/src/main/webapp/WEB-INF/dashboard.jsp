<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Language Dashboard</title>
</head>
<body class="p-5">
	<h1>All Languages</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Creator</th>
				<th scope="col">Version</th>
				<th scope="col">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${languages}" var="language">
				<tr>
					<td scope="row"><a href="/dashboard/${language.id}"><c:out value="${language.name}" /></a></td>
					<td><c:out value="${language.creator}" /></td>
					<td><c:out value="${language.version}" /></td>
					<td class="d-flex">
						<form action="/dashboard/${language.id}" method="post">
							    <input type="hidden" name="_method" value="put">
							    <input type="submit" value="Edit">
						</form>
						<form action="/delete/${language.id}" method="post">
							    <input type="hidden" name="_method" value="delete">
							    <input type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form class="mt-5" action="/create" method="post"
		modelAttribute="newLanguage">
		<p>
			<form:label path="name">Name: </form:label>
			<form:input path="name" />
			<form:errors path="name" class="text-danger" />
		</p>
		<p>
			<form:label path="creator">Creator: </form:label>
			<form:input path="creator" />
			<form:errors path="creator" class="text-danger" />
		</p>
		<p>
			<form:label path="currentVersion">Current Version: </form:label>
			<form:input path="currentVersion" />
			<form:errors path="currentVersion" class="text-danger" />
		</p>
		<input type="submit" value="Submit" class="btn btn-primary" />
	</form:form>
</body>
</html>