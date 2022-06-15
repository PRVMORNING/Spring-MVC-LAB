<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Save Book Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h3>Book Directory</h3>
	<hr>
	<p class="h4 mb-4">Book Employee</p>
	<form action="/LibraryManagement3/books/save" method="Post">
	<input type="hidden" name="id" value="${Book.id}" />
	<div class="form-inline">
		<input type="text" name="name" value="${Book.name}" class="form-control mb-4 col-4" placeholder="Name"/>
	</div>
	<div class="form-inline">
		<input type="text" name="category" value="${Book.category}" class="form-control mb-4 col-4" placeholder="Category"/>
	</div>
	<div class="form-inline">
		<input type="text" name="author" value="${Book.author}" class="form-control mb-4 col-4" placeholder="Author"/>
	</div>
	<button type="submit" class="btn btn-info col-2">Save</button>
	</form>
	<hr>
	<a href="/LibraryManagement3/books/list">Back To Books List</a>
</div>
</body>
</html>