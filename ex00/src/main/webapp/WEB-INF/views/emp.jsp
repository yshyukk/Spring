<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees Info</title>
</head>
<body>
	<h3>사원조회</h3>
	<div>사번 : ${emp.employeeId }</div>
	<div>이름 : ${emp.firstName }</div>
	<div>입사일자 : ${emp.hireDate }</div>
	<div>급여 : ${emp.salary }</div>
	
</body>
</html>