<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<style>
	table, tr, th, td {
		border : 1px solid black;
	}
</style>
</head>
<body>
	<!-- empList출력하기 -->
	<table>
		<thead>
			<tr>
				<th>사원번호</th>
				<th>성</th>
				<th>이름</th>
				<th>직책</th>
				<th>메일</th>
				<th>급여</th>
				<th>입사일</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="emp" items="${empList }">
			<tr onclick="location.href='getInfo?employeeId=${emp.employeeId }'"> 
				<td>${emp.employeeId }</td>
				<td>${emp.firstName }</td>
				<td>${emp.lastName }</td>
				<td>${emp.jobId }</td>
				<td>${emp.email }</td>
				<td>${emp.salary }</td>
				<td>${emp.hireDate }</td>
				<td><button type="button" onclick="deleteInfo(${emp.employeeId}, event)">삭제</button></td>
			</tr>
		</c:forEach>
		</tbody>		
	</table>
	<button type="button" onclick="location.href='insertFrom'">추가</button>
	
	<script>
		function deleteInfo(id, event){
			//tr 태그에 이벤트가 실행되서(이벤트 버블링) 막아줘야함.
			event.stopPropagation();
			location.href = 'deleteInfo/' + id;
		}
		
		function insertInfo(list, event){
			event.stopPropagation();
			location.href = 'in'
		}
	</script>
	
</body>
</html>