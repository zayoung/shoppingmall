<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Header</title>
</head>
<style>
.wrap { height : 200px; background : #FDF5E6;}
.header_logo { font-size:50px; text-align:center; }
.header_logo a { text-decoration : none; }
.header1 { top:10px; text-align:right;}
.header1 ul li{ display : inline-block; margin-left: 15px; margin-top:10px; margin-right:15px;}
.header1 ul li a { text-decoration : none; }
.header2 { text-align:center; margin-top:40px;}
.header2 ul li{  display : inline-block; text-align: center;"}
.header2 ul li a { text-decoration : none; }

</style>
<body>
<div class = "wrap">
<header>
		<div class="header1">
			<ul class="header1_ul">
				<c:if test="${id == null }">
					<li><a href="loginForm.do">Login</a></li>
					<li><a href="joinForm.do">Join</a></li>
				</c:if>
				<c:if test="${id != null }">
					<li>${id }님</li>
					<li><a href="logout.do">Logout</a></li>
					<% String id = (String)session.getAttribute("id");
						if(id!=null&&id.equals("admin")){ %>
					<li><a href="memberList.do">memberList</a></li>
					<%	
					}
					%>
					<li class="page" id="h1"><a href="myPage.do" onclick="return sessionChk()"> Mypage</a></li>
					<li class="page" id="h2"><a href="" onclick="return sessionChk()"> Q&A</a></li>
					<li class="page" id="h3"><a href="" onclick="return sessionChk()"> Cart</a></li>
				</c:if>
			</ul>
		</div>
		<div class="header_logo">
			<a href="main.do">FUNNIC</a>
		</div>
		
		</header>
		
		<div class="header2">
			<ul class="header2_ul">
				<li class="page" id="h1"><a href="bedroomMain.do" > 침실가구</a></li>
				<li class="page" id="h2"><a href="livingroomMain.do" > 거실가구</a></li>
				<li class="page" id="h3"><a href="kitchenMain.do" > 주방가구</a></li>
				<li class="page" id="h4"><a href="libraryMain.do" > 서재가구</a></li>
				<li class="page" id="h5"><a href="livingPropMain.do" > 리빙소품</a></li>
			</ul>
		</div>
		</div>
</body>
</html>