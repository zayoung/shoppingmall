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
	<c:if test="${result>-1 }">
	<script>
		alert("가입 성공");
		location.href="main.do";
	</script>
	</c:if>
	<c:if test="${result<0 }">
	<script>
		alert("가입 성공");
		history.back();
	</script>
	</c:if>
</body>
</html>