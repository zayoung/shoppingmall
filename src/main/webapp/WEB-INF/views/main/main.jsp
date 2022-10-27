<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome FUNNIC</title>
<style type="text/css">
.mainpic img{ width:1600px; height : 600px; margin-left : 120px; text-align:center;}
.bestmenu { text-align : center;}
.menu_p_name{width : 250px; height:100px; word-break:break-all; }
.bestmenu ul li img{ width : 300px; height :300px; text-align : center;}
.bestTitle{ text-align : center; margin-top:15px; margin-bottom:15px;}
.bestmenu ul li{ display : inline-block; text-decoration:none; vertical-align:top; text-align:center;"}

</style>
</head>
<body>

	<%@include file = "../header.jsp" %>
	<div class ="mainpic">
	<img src="resources/pic/main.JPG">
	</div>
	<div class = best>
		<div class="bestTitle">BEST BED</div>
		<div class="bestmenu">
			<ul>	
				<c:forEach var="bestBedList" items="${bestBedList }">
					<li>
						<img src = "resources/pic/${bestBedList.pImage }">
						<div><a href="pDetail.do?pNum=${bestBedList.pNum }">상세보기</a></div>
						<div class="menu_p_name">${bestBedList.pName }</div>
					</li>
				</c:forEach>
			</ul>
		</div>
		<div class="bestTitle">bestKitchenList</div>
		<div class="bestmenu">
			<ul>
				<c:forEach var="bestKitchenList" items="${bestKitchenList }">
					<li>
						<img src = "resources/pic/${bestKitchenList.pImage }">
						<div><a href="pDetail.do?pNum=${bestKitchenList.pNum }">상세보기</a></div>
						<div class="menu_p_name">${bestKitchenList.pName }</div>
					</li>
			</c:forEach>
			</ul>
		</div>
		<div class="bestTitle">bestLibraryList</div>
		<div class="bestmenu">
			<ul>
				<c:forEach var="bestLibraryList" items="${bestLibraryList }">
					<li>
						<img src = "resources/pic/${bestLibraryList.pImage }">
						<div><a href="pDetail.do?pNum=${bestLibraryList.pNum }">상세보기</a></div>
						<div class="menu_p_name">${bestLibraryList.pName }</div>
					</li>
			</c:forEach>
			</ul>
		</div>
		<div class="bestTitle">bestLivingList</div>
		<div class="bestmenu">
			<ul>
				<c:forEach var="bestLivingList" items="${bestLivingList }">
					<li>
						<img src = "resources/pic/${bestLivingList.pImage }">
						<div><a href="pDetail.do?pNum=${bestLivingList.pNum }">상세보기</a></div>
						<div class="menu_p_name">${bestLivingList.pName }</div>
					</li>
			</c:forEach>
			</ul>
		</div>
		<div class="bestTitle">bestPropList</div>
		<div class="bestmenu">
			<ul class="best_ul">
				<c:forEach var="bestPropList" items="${bestPropList }">
					<li>
						<div class="menu_img"><img src = "resources/pic/${bestPropList.pImage }"></div>
						<div><a href="pDetail.do?pNum=${bestPropList.pNum }">상세보기</a></div>
						<div class="menu_p_name">${bestPropList.pName }</div>
					</li>
			</c:forEach>
			</ul>
		</div>
	</div>
	

</body>
</html>