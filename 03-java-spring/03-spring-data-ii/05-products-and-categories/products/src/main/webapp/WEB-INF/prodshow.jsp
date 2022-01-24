<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>Product Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="/css/style.css"/>
</head>
<body>
	<h1> <c:out value="${product.name}"/> </h1>
	<div id= "outside-cont1">
		<div>
			<h4>Categories:</h4>
			<c:forEach items="${ categories }" var="c">
            	<p>- <c:out value="${c.name}"/></p>
        	</c:forEach>
		</div>
		<div>
			<form:form action="/products/${ product.id }" method="post" modelAttribute="category">
			<div>
		        <label for="category">Add Category:</label>
		        <div>
		        	<select name="category">
                    <c:forEach var="nonc" items="${ nonCategories }">
                        <option value="${ nonc.id }"><c:out value="${ nonc.name }"/></option>
                    </c:forEach>
                	</select>
		        	<form:errors path="category"/>
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