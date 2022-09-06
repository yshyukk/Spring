<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<!-- 
		1. bno : 폼이 나오면 자동으로 부여하도록
		2. 제목, 작성자, 내용 : 입력값이 없으면 submit안되게
			1) Form에 이름을 부여, onsubmit="return false"로 강제로 submit막기
	 -->
	<form name="insertForm" action="insert" method="POST" onsubmit="return false">
		<div>
			<h3> 게시글 등록</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${no }" readonly></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="contents"></textarea></td>
			</tr>
			<tr>
				<th>첨부 이미지</th>
				<td><input type="text" name="image"></td>
			</tr>						
		</table>
		<button type="submit" onclick="formOption()">등록</button>
		<button type="button">조회</button>
	</form>
	<script>
		//제목,작성자,내용이 값이 있는지 없는지 체크하고 있을때만 submit되게
		function formOption(){
			let title = document.getElementsByName('title')[0];
			let writer = document.getElementsByName('writer')[0];
			let contents = document.getElementsByName('contents')[0];
			
			if(title.value == ""){
				alert("제목이 입력되지 않았습니다.");
				return;
			}
			if(writer.value == ""){
				alert("작성자가 입력되지 않았습니다.");
				return;
			}
			if(contents.value == ""){
				alert("내용이 입력되지 않았습니다.");
				return;
			}
			
			insertForm.submit();
		}
	</script>
</body>
</html>