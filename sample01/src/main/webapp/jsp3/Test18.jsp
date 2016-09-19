<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

	
<%
pageContext.setAttribute("name", new String[]{"홍길동","임꺽정","유관순","안중근"});
%>

\${names} : ${name}
\${names[2]} : ${name[2]}


