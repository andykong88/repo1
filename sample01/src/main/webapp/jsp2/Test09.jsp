<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%-- jsp:useBean의 Scope 속성 사용하기
=> 객체를 꺼내거나 저장할 때 사용할 저장소를 지정하는 속성이다.
=> 저장소를 지정하지 않으면, 기본이 PageContext이다.
	즉 해당 JSP 페이지에서만 사용 가능하다.
=> 값
	page 		: PageContext 저장소 (기본)
	request 	: ServletRequest 저장소
	session 	: HttpSession 저장소
	application : ServletContext 저장소
--%>

<jsp:useBean id="board" class="vo.Board" scope="page"></jsp:useBean>





board : <%=board%>
JspContext : <%=pageContext.getAttribute("board", pageContext.PAGE_SCOPE)%>
board == JspContext: <%=pageContext.getAttribute("board",pageContext.PAGE_SCOPE) == board%>
request: <%=request.getAttribute("board")%>
HttpSession: <%=session.getAttribute("board")%>
ServletContext: <%=application.getAttribute("board")%>
<%-- Jsp 내장변수 request, session, application--%>












