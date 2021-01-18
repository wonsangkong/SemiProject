<%@page import="com.mvc.member.model.vo.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member loginMember = (Member)session.getAttribute("loginMember");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/style.css">
<script src="<%=request.getContextPath() %>/js/jquery-3.5.1.js"></script>
</head>
<body>
    <div class="wrap">
        <header>
            <div id="login_form">
            	<% if(loginMember == null) {%>
                <form id="login_form_input" action="<%= request.getContextPath() %>/login" method="post">
                    <table>
                        <td id="userInput">
                            <input type="text" name="userId" placeholder="아이디를 입력해주세요." id="userId"required><br>
                            <input type="password" name="userPwd" id="userPwd" placeholder="비밀번호를 입력해주세요." required>
                        </td>
                        <td id="loginB" >
                            <input type="submit" value="로그인">
                        </td>
                        <tr>
                            <td colspan="2">
                                <div id="login_form_etc">
                                    <a id="a1" href="<%= request.getContextPath()%>/member/agreement">회원가입</a> 
                                    <a id="a2" href="">ID 찾기</a> 
                                    <a id="a3" href="">PWD 찾기</a>
                                </div>
                            </td>
                        </tr>
                    </table>
                </form>
                <% } else { %>
                	<table>
                        <td id="userInput">
                            <%= loginMember.getUserName() %> 님 안녕하세요.
                        </td>
                        <td id="loginB" >
                            
                        </td>
                        <tr>
                            <td colspan="2">
                                <div id="login_form_etc">
                                    <a id="a1" href="">내 정보</a> 
                                    <a id="a2" href="<%= request.getContextPath() %>/logout">로그아웃</a> 
                                    <a id="a3" href=""><%= loginMember.getUserCoin() %> 코인</a>
                                </div>
                            </td>
                        </tr>
                    </table>
                  <% } %>
                
            </div>
            <div id="navi_2">
                <a href="">
                    <img src="resources/logo.PNG" id="home_logo" width="250px">
                </a>
            </div>
            <div id="navigator">
                <ul id="navi_1">
                    <li><a href="">펀딩하기</a>
                        <ul>
                            <li><a href="">모든프로젝트</a></li>
                            <li><a href="">카테고리</a></li>
                            <li><a href="">오픈예정</a></li>
                        </ul>
                    </li>
                    <li><a href="">프로젝트 신청하기</a></li>
                </ul>
                <ul id="navi_3">
                    <li><a href="">커뮤니티</a></li>
                    <li><a href="">마이페이지</a></li>
                </ul>
            </div>   
        </header>