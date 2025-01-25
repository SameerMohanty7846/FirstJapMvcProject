<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>View Students</h2>

	<a href="/">Add New Student</a>
	<table border="1">
		<thead>
            <tr>
                <th>ID</th>
                <th>AGE</th>
                <th>BRANCH</th>
                <th>NAME</th>

            </tr>


		</thead>

		<tbody>
            <c:forEach items="${students}" var="student" varStatus="index">
                <tr>
                    <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td> <!-- Use 'id' instead of 'index.count' -->
                    <td>${student.age}</td>
                    <td>${student.branch}</td>
                    <td>${student.name}</td>
                </tr>
            </c:forEach>
		</tbody>
	</table>
</body>
</html>