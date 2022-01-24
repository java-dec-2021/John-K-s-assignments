<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Category Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
		<h1> ${category.name} </h1>
	<div id= "outside-cont2">
		<div>
			<h4>Products:</h4>
			<c:forEach items="${products}" var="p">
            	<p>- <c:out value="${p.name}"/></p>
        	</c:forEach>
		</div>
		<div>
			<form:form action="/categories/${ category.id }" method="POST" modelAttribute="product">
			<div>
		        <label for="product">Add Product:</label>
		        <div>
		        	<select name="product">
                    <c:forEach var="nonp" items="${ nonProducts }">
                        <option value="${ nonp.id }"><c:out value="${ nonp.name }"/></option>
                    </c:forEach>
                	</select>
		        	<form:errors path="product"/>
		        </div>
		    </div>
		    <div >
		    	<div >
		    		<button class="btn btn-success">Add</button>
		    	</div>	
		    </div>
		</form:form>
		</div>
	</div>
</body>