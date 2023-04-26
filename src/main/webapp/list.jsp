<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Student List</title>
</head>
<body>
	<h1>Student List</h1>

	<ul>
		<c:forEach var="student" items="${studentList}">
			<li>${student.name} (age ${student.age})</li>
		</c:forEach>
	</ul>

	<form action="hello" method="post">
		<input type="text" name="name" placeholder="Enter a new name">
		<input type="text" name="age" placeholder="Enter a new age">
		<button type="submit">Add Person</button>
	</form>

	<p><a href="./">Go back to the home page</a></p>

</body>
</html>