<%@page import="java.util.ArrayList"%>
<%@page language="java" 
	contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    


<jsp:useBean id="board" class="vo.Board"></jsp:useBean>
게시물 : <%=board%> => out.print(board);
