<%@page import="java.util.List"%>
<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>


<jsp:useBean id="board" class="vo.Board" scope="application"></jsp:useBean>
<jsp:setProperty name="board" property="no" value="10"/>
<jsp:setProperty name="board" property="title" value="제목!!"/>
<jsp:setProperty name="board" property="contents" value="내용"/>
<jsp:setProperty name="board" property="viewCount" value="15"/>

게시물: <%=board%>
PageContext: ${pageScope.board}
ServletContext: ${requestScope.board}
HttpSession: ${sessionScope.board}
ServletContext: ${applicationScope.board} 


	
범위를 지정하는 객체 이름을 생략하면 다음 순서대로 찾는다.
pageScope --> requestScope --> sessionScope --> application 
=> ${board}