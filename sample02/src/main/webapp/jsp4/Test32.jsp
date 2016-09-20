<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>


<%
pageContext.setAttribute("names", new String[]{"홍길동","임꺽정","유관순", "안중근", "안창호","윤봉길"});

%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${names}" var="name" begin="2" end="4">
${name},
</c:forEach>
-----------------------------------------------------------------

<c:forEach items="${names}" var="name" begin="2">
${name},
</c:forEach>
-----------------------------------------------------------------

<c:forEach items="${names}" var="name" begin="0" end="4">
${name},
</c:forEach>

------------------------------------------------------------------
<c:forEach items="${names}" var="name">
${name},
</c:forEach>






