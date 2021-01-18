<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/signup.css">
<script src="<%=request.getContextPath() %>/js/jquery-3.5.1.js"></script>
</head>
<body>

<div id="allcode">
    <div id="title1">
        <h1>회원가입</h1>
    </div>

    <div id="first">
        <label id="info1">* 모든 항목을 입력해주세요. </label>
        <hr id="hr1">
    </div>

    <form action="<%= request.getContextPath()%>/member/signup" method="post">
        <label id="idLabel">아이디<input type="text" name="userId" id="userId" placeholder="(4글자이상)" required>
        <input type="button" value="중복검사" ><br></label>
        <p></p><br>
        <label>비밀번호<input type="password" name="userPwd1" id="userPwd1" required><br>
        <label class="hint">영문자, 숫자, 특수문자(!@#$%...)를 조합한 8자 이상</label></label>
        <p></p><br>
        
        <label>비밀번호 확인<input type="password" name="userPwd2" id="userPwd2" required><br></label>
        <p></p><br>
        
        <label>이름<input type="text" name="userName" id="userName" required><br></label>
        <p></p><br>

        <label>휴대폰번호<input type="text" name="phone" id="phone" placeholder="(-없이)01012349876" maxlength="11" required><br>
        <label class="hint">숫자만 입력해주세요.</label></label>
        <p></p><br>

        <label>이메일<input type="email" name="email" id="email" placeholder="abc@defg.com" required><br></label>
        <p></p><br>

        <label>주소<input type="text" name="address" id="address" required><br></label>
        <p></p><br>

        <input type="submit" value="가즈아" id="submitbtn">
    </form>
</div>

<%@ include file="/views/common/footer.jsp" %>