<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/css/login.css">
<title>login</title>
</head>
<body>

<%@include file = "../header.jsp" %>
	<h2>SIGN IN</h2>
	<div class="cont">
	  <div class="form sign-in">
	    
	    <label>
			<span>Email</span>
	      	<input type="email" />
	    </label>
	    <label>
			<span>Password</span>
	      	<input type="password" />
	    </label>
	    <p class="forgot-pass">Forgot password?</p>
		<div class="btn_submit">
    	  <button type="button" class="submit" >Sign In</button>
	      <button type="button" class="submit" onclick="location.href='joinForm.do' ">Sign Up</button>
	      </div>
		</div>
	</div>
</body>
</html>