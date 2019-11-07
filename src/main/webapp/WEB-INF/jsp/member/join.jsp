<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageName" value="회원가입" />
<%@ include file="../part/head.jspf"%>
<form action="./dojoin" method="post"
	onsubmit="joinForm(this); return false;">
	<div>
		<span>아이디</span> <input type="text" placeholder="제목" name="title">
	</div>
	<div>
		<span>비밀번호</span> <input type="password" placeholder="비밀번호"
			name="loginPw">
	</div>
	<div>
		<span>비밀번호 확인</span> <input type="password" placeholder="비밀번호확인"
			name="loginPwCheck">

	</div>
	<div>
		<span>가입</span> <input type="submit" value="회원가입"> <input
			type="reset" value="취소">
	</div>
</form>
<%@ include file="../part/foot.jspf"%>