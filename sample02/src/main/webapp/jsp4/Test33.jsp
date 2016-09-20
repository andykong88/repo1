<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

[LIST 객체와 반복문
<%
ArrayList<String> names = new ArrayList<String>();
names.add("홍길동");
names.add("임꺽정");
names.add("유관순");
names.add("안중근");
names.add("안창호");
names.add("윤봉길");


pageContext.setAttribute("names", names);

%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${names}" var="name">
${name},
</c:forEach>






