<%@page import="java.util.Date"%>
<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true" %>

[fmt:formatDate]
- java.util.Date ---->  문자열
<%
Date today = new Date();
pageContext.setAttribute("today", today);
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<fmt:formatDate value="${today}" pattern="yyyy-MM-dd"/>,
<fmt:formatDate value="${today}" pattern="MM/dd/yyyy"/>


