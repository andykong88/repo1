<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>






<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:set var="name" value="홍길동" scope="request"/>
${requestScope.name},



<c:remove var="name" value="홍길동" scope="request"/>
${requestScope.name}

