<%@ page language="java" 
	contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
템플릿데이터1
템플릿데이터2


<%!
private int plus(int a, int b) {
	return a + b;
}

%>

템플릿데이터3
<%= plus(20, 30) %>
템플릿데이터4
템플릿데이터5

