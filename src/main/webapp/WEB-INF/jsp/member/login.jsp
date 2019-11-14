<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageName" value="로그인" />
<%@ include file="../part/head.jspf"%>
<form action="./doLogin" method="post"
	onsubmit="loginForm(this); return false;">
	<div>
		<span>아이디</span> <br> <input type="text" placeholder="아이디"
			name="loginId" autofocus="autofocus" maxlength="10">
	</div>
	<div>
		<span>비밀번호</span><br>
		<input type="password" placeholder="비밀번호" name="loginPw"
			maxlength="20">
	</div>

	<div>
		<span>로그인</span><br> <input type="submit" value="로그인"> <input
			type="reset" value="취소">
	</div>
</form>
<%@ include file="../part/foot.jspf"%>