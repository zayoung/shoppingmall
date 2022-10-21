<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LIBRARYMAIN</title>
<style type="text/css">
.menu_title{ text-align : center; margin-top:15px; margin-bottom:15px;}
.menu_ul li{ display : inline-block; text-decoration:none;}
.menu_ul li img{ width : 300px; height : 300px;}


</style>
</head>
<body>
<%@include file = "../header.jsp" %>
<div class="menu_title"> LIBRARY </div>
	<div class="menu_ul">
		<ul>
			<c:forEach var="pList" items="${pList }">
				<li class="pListSlide">
					<a href="pDetail.do?p_num=${p.List.p_num }"></a>
					<img src = "resources/pic/${pList.p_image }">
					<div class="menu_p_name">${pList.p_name }</div>
					</li>
			</c:forEach>
		</ul>
</div>
</body>
</html>