<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="empList" method="get">
		<label><input type="text" name="employeeId"></label>
		<label><input type="text" name="firstName"></label>
		<label><input type="text" name="lastName"></label>
		<label><input type="text" name="jobId"></label>
		<label><input type="text" name="email"></label>
		<label><input type="text" name="salary"></label>
		<label><input type="text" name="hireDate"></label>		
		<button type="submit">전송</button>	
	</form>
</body>
</html>