<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>kitchenMain</title>
<style type="text/css">
.menu_title{ text-align : center; margin-top:15px; margin-bottom:15px;}
.menu_ul li{ display : inline-block; text-decoration:none;}
.menu_ul li img{ width : 300px; height : 300px;}
.menu_ul li menu_p_nume {word-break:break-word; }


</style>
</head>
<body>
<%@include file = "../header.jsp" %>
<div class="menu_title"> KITCHEN </div>
	<div class="menu_ul">
		<ul>
			<c:forEach var="pList" items="${pList }">
				<li class="pListSlide">
					<a href="pDetail.do?pNum=${pList.pNum }">상세보기</a>
					<img src = "resources/pic/${pList.pImage }">
					<div class="menu_p_name">${pList.pName }</div>
					</li>
			</c:forEach>
		</ul>
</div>
</body>
</html>