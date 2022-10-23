<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="resources/css/login.css"> -->
<title>login</title>
</head>
<body>

<%@include file = "../header.jsp" %>
	<h2>SIGN IN</h2>
	<div class="cont">
	<form action="loginAction.do" method="post" name="frm">
	  <div class="form sign-in">
	    
	   	<div class = check>
			<span>ID</span>
	      	<input type="text" name="mId" required="required" autofocus="autofocus"/>
	 	</div>
	     <div class = check>
			<span>Password</span>
	      	<input type="password" name="mPw"/>
	 	</div>
	 	    <p class="forgot-pass">Forgot password?</p>
	    
	    <div class="button_go">
	    <input type="submit" class="btn_submit" value="Sign In">
		<!-- <div class="btn_submit">
    	  <button type="button" class="submit" >Sign In</button>
	      <button type="button" class="submit" onclick="location.href='joinForm.do' ">Sign Up</button>
	      </div> -->
		</div>
		 </div>
		</form>
	</div>
</body>
</html>