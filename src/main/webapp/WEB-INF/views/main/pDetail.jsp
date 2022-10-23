<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file = "../header.jsp" %>
<div id="content">
	<h3>[${dp.pName }] 상세 정보</h3>
	<!-- CSS 파일을 변경 후에 바로 Refresh가 안된다면 common.css 파일로 들어가서 바로 Refresh 해주면 적용 된다. -->
	
	<table class="productDetail">
		<tr>
			<th class='pdetail'>상품이미지</th>
			<td><img src = "resources/pic/${dp.pImage }"></td>
		</tr>
		<tr>
			<th>상품이름</th>
			<td>${dp.pName }</td>
		</tr>
		<tr>
			<th>상품가격</th>
			<td>${dp.pPrice1 }</td>
		</tr>
		<tr>
			<th>상품설명</th>
			<td>${dp.pText }</td>
		</tr>
	</table>
	<div class='btn'>
		<a class='btn-fill' onclick='history.back()'>리스트로 돌아가기</a>
		<a class='btn-fill' href='basket.do'>장바구니</a>
	</div>
</div>
</body>
</html>