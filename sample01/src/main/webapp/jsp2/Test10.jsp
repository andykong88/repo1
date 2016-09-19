<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%-- request/session/application 저정소 확인--%>

<jsp:useBean id="board" class="vo.Board" scope="request"></jsp:useBean>





board : <%=board%>
JspContext : <%=pageContext.getAttribute("board", pageContext.PAGE_SCOPE)%>
request: <%=request.getAttribute("board")%>
HttpSession: <%=session.getAttribute("board")%>
ServletContext: <%=application.getAttribute("board")%>












