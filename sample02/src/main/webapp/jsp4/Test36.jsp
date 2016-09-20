<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

[c:forToken]
-특정 문자로 구분된 문자열을 반복하기

<%
pageContext.setAttribute("names", "홍길동,임꺽정,유관순,안중근,안창호,윤봉길");

%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:forTokens items="${names}" var="name" delims=",">
${name}:
</c:forTokens>






