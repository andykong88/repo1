<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>



<jsp:useBean id="board" class="vo.Board"></jsp:useBean>
board : <%=board%>
JspContext : <%=pageContext.getAttribute("board", pageContext.PAGE_SCOPE)%>
board == JspContext: <%=pageContext.getAttribute("board",pageContext.PAGE_SCOPE) == board%>
request: <%=request.getAttribute("board")%>
HttpSession: <%=session.getAttribute("board")%>
ServletContext: <%=application.getAttribute("board")%>
<%-- Jsp 내장변수 request, session, application--%>
