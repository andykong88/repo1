<%@page import="vo.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%
Board obj = new Board();
obj.setNo(100);
obj.setTitle("haha");
obj.setContents("contents....");
obj.setViewCount(10);

request.setAttribute("board", obj);

%>



<%-- <jsp:useBean> 의 Type 속성
=> 객체를 만들지 않고 꺼내고만 싶을 때 사용
=> type 으로 지정 된 클래스는 레퍼런스 변수를 생성할 때 사용한다.
   객체를 생성하지 않는다.
--%>

<jsp:useBean id="board" class="vo.Board" scope="request"></jsp:useBean>





board : <%=board%>
ServletContext: <%=request.getAttribute("board")%>












