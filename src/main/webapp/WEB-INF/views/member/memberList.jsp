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
	<h3>고객 목록</h3>
	<!-- CSS 파일을 변경 후에 바로 Refresh가 안된다면 common.css 파일로 들어가서 바로 Refresh 해주면 적용 된다. -->
	<table class="w-pct60">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
			<th>주소</th>
			<th>핸드폰번호</th>
			<th>가입일</th>
			<th>탈퇴여부</th>
		</tr>
		<!-- for(꺼낸 배열 변수를 담을 새로운 변수 (String x) : 배열 변수(list)) -->
		<!-- items : 배열 변수 -->
		<!-- var : 꺼낸 배열 변수를 담을 새로운 변수 -->
	
	<c:forEach var="mList" items="${mList }" > 
			<tr>
				 <td>${mList.mId }</td>
				<td>${mList.mName }</td>
				<td>${mList.mEmail }</td>
				<td>${mList.mAddress }</td>
				<td>${mList.mPhone }</td>
				<td>${mList.mRgstDate }</td>
				<td>${mList.mDel }</td>
				<%-- <td><a href='detail.cu?id=${vo.id}'>${vo.name }</a></td> --%>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>