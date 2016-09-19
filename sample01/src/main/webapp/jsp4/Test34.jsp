<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

[Map 객체와 반복문]
<%
HashMap<String,String> nameMap = new HashMap<String,String>();
nameMap.put("n1", "홍길동");
nameMap.put("n2","임꺽정");
nameMap.put("n3","유관순");
nameMap.put("n4","안중근");
nameMap.put("n5","안창호");


pageContext.setAttribute("nameMap", nameMap);

%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${nameMap}" var="keyvalue">
${keyvalue},
</c:forEach>






