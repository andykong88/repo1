<%@ page language="java" 
    contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true" %>

[c:url]
- HTTP 요청을 수행하는 방법

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${param.home == 'naver'}"><c:redirect url="http://www.naver.com"/></c:when> 
	<c:when test="${param.home == 'daum'}"><c:redirect url="http://www.daum.net"/></c:when> 
	<c:when test="${param.home == 'google'}"><c:redirect url="http://www.google.com"/></c:when> 
	<c:otherwise>유효하지 않는 홈페이지입니다.</c:otherwise>

</c:choose>




 


