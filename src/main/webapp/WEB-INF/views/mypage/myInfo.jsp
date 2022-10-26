<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myInfo</title>
</head>
<body>
	<%@include file = "../header.jsp" %>
<div id = "content">
	<table class="myInfo">
			
		<tr>
			<th>아이디</th>
			<td>${members.mId }</td>
		</tr>
		<tr>
			<th>이름</th>
			<td>${mList.mName }</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>${mList.mEmail }</td>
		</tr>
		<tr>
			<th>주소</th>
			<td>${mList.mAddress }</td>
		</tr>
		<tr>
			<th>핸드폰 번호</th>
			<td>${mList.mPhone }</td>
		</tr>
	</table>
</div>
</body>
</html>