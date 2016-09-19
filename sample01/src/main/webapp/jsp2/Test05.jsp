<%@page import="java.util.ArrayList"%>
<%@page language="java" 
	contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
<%
ArrayList list = new ArrayList();

%>

<jsp:useBean id="list2" class="java.util.ArrayList"></jsp:useBean>
list 의 크기: <%=list.size()%>
list 의 크기: <%=list2.size()%>
