<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Student Registration Form</h3>
	
	<font color='green'>${msg}</font>

	<form:form action="save" modelAttribute="student" method="POST">

		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" /></td>
			</tr>
			

			<tr>
				<td>Branch:</td>
				<td><form:select path="branch">
						<form:option value="">-Select-</form:option>
						<form:options items="${branch}" />
					</form:select></td>
			</tr>

			

			<tr>
				<td></td>
				<td><input type="submit" value="Save" /></td>
			</tr>

		</table>
	</form:form>
	
		<a href="viewStudents">View Students</a>
</body>
</html>