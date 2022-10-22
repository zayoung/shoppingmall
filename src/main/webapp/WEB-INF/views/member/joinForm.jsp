<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="resources/css/login.css"> -->

<title>joinForm</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
<script type="text/javascript">


 	/*아이디 중복체크 */
 	function chkId(){ //아래줄 id는 input의 id=id 값과 동일
 		var str = document.frm.mId.value;
		var idRegExp = /^[a-zA-z0-9]{4,12}$/; //아이디 유효성 검사        
		if (!idRegExp.test(str)) {           
			alert("아이디는 영문 대소문자와 숫자 4~12자리로 입력해야합니다!");            
			/* form.idid.value = "";          
			form.idid.focus();    */
			return false;        
			}      
			
		
	} 
	
	/* 비밀번호 형식 체크 (4글자이상) -> */
	function chkPass(){
		var pwchk = $("#pw").val();
		if(pwchk.length<4) {
			$('#err_pass').html("비밀번호를 4자리이상 입력해주세요");
			frm.pw.focus();
			frm.pw.value="";
			return false;
		} else {
			$('#err_pass').html("");
		}
	}
	
	/* 비밀번호 확인 일치여부 체크 */
	function chkPass2() {
		if (!frm.pw1.value){
			$('#err_pass2').html("비밀번호 확인란을 입력하세요");
			return false;
		} if(frm.pw1.value!=frm.pw.value){
			$('#err_pass2').html("비밀번호가 일치하지 않습니다");
			frm.pw1.focus();
			frm.pw1.value="";
			return false;
		} else {
			$('#err_pass2').html("");
		}
	}
	
	/* 이메일 유효성 검사 */
	function chkEmail(){
		var reg_email = /^([0-9a-zA-Z_\.-]+)@([0-9a-zA-Z_-]+)(\.[0-9a-zA-Z_-]+){1,2}$/;
		if(!frm.email.value) {
			$('#err_email').html("이메일을 입력하세요");
			frm.email.focus();
			return false; 
		} if(!reg_email.test(frm.email.value)){
				$('#err_email').html("올바른 이메일 형식이 아닙니다");
				frm.email.focus();
				return false;
		}else{
			$('#err_email').html("");
		}
	}
		
	/* 연락처 유효성 검사 */
	function chkPhone(){
		var reg_phone = /^([0-9]){3}[-]([0-9]){4}[-]([0-9]){4}$/;
		if(!frm.cp.value) {
			$('#err_cp').html("연락처를 입력하세요");
			frm.cp.focus();
			return false;
		} if(!reg_phone.test(frm.cp.value)){
			$('#err_cp').html("올바른 연락처 형식이 아닙니다");
			frm.cp.focus();
			return false;
		} else {
			$('#err_cp').html("");
		}
	}

</script>

</head>
<body>

<%@include file = "../header.jsp" %>

	<h2>SIGN UP</h2>
	<div class="joinform">
		<form action="joinAction.do" method="post" name="frm" onsubmit="return chk();">
		
		<!-- 엔터키 전송 막기 -->
			<div style="display:none">
				<input type="submit" onclick="return false"/>
				<input type="text"/>
			</div>
			
	  <div class="form sign-in">
	    
	    <div class = check>
			<span>ID</span>
	      	<input type="text" name="mId" id="idid" required="required" autofocus="autofocus" onchange="chkId()"/>
	      	<div class="chk-msg" id="err_id"></div>
	      	<button type="button" onclick="id_check();">중복확인</button>
	    </div>
	     <div class = check>
			<span>PASSWORD</span>
	      	<input type="password" name="mPw" id="pw" required="required" onChange="chkPass()"/>
	      	<div class="chk-msg" id="err_pass"></div>
	    </div>
	     <div class = check>
			<span>PASSWORD CHECK</span>
	      	<input type="password" name="mPw1" id="pw1" required="required" onChange="chkPass2()"/>
	      	<div class="chk-msg" id="err_pass2"></div>
	    </div>
	     <div class = check>
			<span>NAME</span>
	      	<input type="text" name="mName" required="required"/>
	  	 </div>
	     <div class = check>
			<span>EMAIL</span>
	      	<input type="email" name="mEmail" required="required" onChange="chkEmail()"/>
	      	<div class="chk-msg" id="err_email"></div>
	  	</div>
	     <div class = check>
			<span>ADDRESS</span>
	      	<input type="text" name="mAddress" required="required"/>
	      	<div class="chk-msg" id="err_nickname"></div>
	   	</div>
	     <div class = check>
			<span>PHONE</span>
	      	<input type="text" name="mPhone" required="required" pattern="010-\d{4}-\d{4}" placeholder="010-0000-0000" onchange="chkPhone()"/>
	      	<div class="chk-msg" id="err_cp"></div>
		 </div>
	
	      <div class="button_go">
	    	  <input type="submit" class="btn_submit" value="Sign Up">
		</div>
		</div>
		</form>
	</div>
</body>
</html>