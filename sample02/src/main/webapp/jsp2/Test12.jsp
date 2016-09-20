<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>




<jsp:useBean id="list" 
		type="java.util.List<String>"
		class="java.util.ArrayList" 
		scope="request"></jsp:useBean>






ServletRequest: <%=request.getAttribute("list")%>












