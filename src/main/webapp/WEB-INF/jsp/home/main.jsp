<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="pageName" value="홈페이지" />
<%@ include file="../part/head.jspf"%>
<c:if test="${loginedMember != null }">
	<div>회원로그인 id = ${loginedMember.loginId }</div>
</c:if>

<%@ include file="../part/foot.jspf"%>