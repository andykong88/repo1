<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>



<jsp:useBean id="board" class="vo.Board"></jsp:useBean>




<jsp:useBean id="board2" class="vo.Board">
	<jsp:setProperty name="board2" property="no" value="1" />
	<jsp:setProperty name="board2" property="title" value="하하하" />
	<jsp:setProperty name="board2" property="contents" value="내용" />
	<jsp:setProperty name="board2" property="viewCount" value="100" />
</jsp:useBean>


<jsp:useBean id="board3" class="vo.Board"></jsp:useBean>
	<jsp:setProperty name="board3" property="no" value="2" />
	<jsp:setProperty name="board3" property="title" value="하하하gggg" />
	<jsp:setProperty name="board3" property="contents" value="내용jkkkkk" />
	<jsp:setProperty name="board3" property="viewCount" value="200" />





board : <%=board%>
board2 : <%=board2%>
board3 : <%=board3%>



