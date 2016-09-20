<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>






<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:useBean id="board" class="vo.Board" scope="page"/>

<c:set target="${board}" property="no" value="100"/>
<c:set target="${board}" property="title" value="aaaaaa"/>
<c:set target="${board}" property="contents" value="bbbbbb"/>
<c:set target="${board}" property="viewCount" value="12"/>


${board.no},
${board.title},
${board.contents},
${board.viewCount}
