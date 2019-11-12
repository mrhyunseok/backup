<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageName" value="게시물 수정" />
<%@ include file="../part/head.jspf"%>
<form action="./doModify" method="post"
	onsubmit="modifyForm(this); return false;">

	<input type="hidden" value="${article.id}" name="id">

	<div>
		<span>제목</span> <input type="text" value="${article.title}"
			name="title">
	</div>
	<div>
		<span>내용</span>
		<textarea name="body">${article.body}</textarea>
	</div>
	<div>
		<span>수정</span> <input type="submit" value="수정"> <input
			type="button" value="취소" onclick="history.back();">
	</div>
</form>
<%@ include file="../part/foot.jspf"%>