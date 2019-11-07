<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageName" value="게시물 추가" />
<%@ include file="../part/head.jspf"%>
<form action="./doAdd" method="post"
	onsubmit="addForm(this); return false;">
	<div>
		<span>제목</span> <input type="text" placeholder="제목" name="title">
	</div>
	<div>
		<span>내용</span>
		<textarea name="body" placeholder="내용"></textarea>
	</div>
	<div>
		<span>전송</span> <input type="submit" value="전송"> <input
			type="reset" value="취소">
	</div>
</form>
<%@ include file="../part/foot.jspf"%>