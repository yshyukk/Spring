<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</header>
	<main>
		<tiles:insertAttribute name="main"></tiles:insertAttribute>
	</main>
	<footer>
	<div id="address">
	<address>
		<span class="bold">(주)예담직업전문학교</span> 대구광역시 중구 중앙대로 403 (남일동 135-1, 5층)				
		<span class="colorCCC">/</span>
		<span class="bold">대표자</span>:서강중		
				<span class="colorCCC">/</span>
		<span class="bold">사업자번호</span>:504-86-00471						
		<span class="colorCCC">/</span>
		<span class="bold">Tel</span>:053-421-2460			
		<span class="colorCCC">/</span>
		<span class="bold">Fax</span>:053-356-3939	
		</address>
		<p>
		<span class="bold">대표 E-mail</span>:ask@yedam.ac	
						<span class="colorCCC">/</span>
		<span class="bold">개인정보보호책임자</span>:서강중 (ask@yedam.ac)			</p>

	<p>Copyright &copy; 2009 <span>(주)예담직업전문학교</span> All Rights Reserved.</p>
</div>
<div id="designedBy"><a href="http://wooripage.co.kr" target="_blank" title="Designed by WP"><img src="/images/designedBy.jpg" alt="Designed by 우리페이지" /></a></div>		</div>
	</div>
	</footer>
</body>
</html>