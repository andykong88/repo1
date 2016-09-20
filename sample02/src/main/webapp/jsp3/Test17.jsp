<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

	
<jsp:useBean id="board" class="vo.Board" scope="page"/>
<jsp:setProperty name="board" property="no" value="10"/>
<jsp:setProperty name="board" property="title" value="제목!!"/>
<jsp:setProperty name="board" property="contents" value="내용"/>
<jsp:setProperty name="board" property="viewCount" value="15"/>

\${board} : ${board}
\${board} : ${board.no}
\${board["no"]} : ${board["no"]}


