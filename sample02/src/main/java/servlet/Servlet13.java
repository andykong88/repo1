// HTTP 요청과 응답
// 웹 브라우저는 웹 서버에 요청할 때 HTTP 규칙에 따라 데이터를 보낸다.
// 웹 서버 또한 웹 브라우저에게 응답할때 HTTP 규칙에 따라 데이터를 보낸다.
// 확인방법?
// 웹 브라우저와 웹서버 사이에 주고 받는 데이터를 모니터링 프로그램을 통해 확인해보자!
// Fiddler



package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Servlet13")
public class Servlet13 extends GenericServlet {




	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		String op = request.getParameter("op");		
		int result = 0;
		

		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");

		switch (op) {
		case "+": out.printf("%d %s %d = %d",a, op, b, a + b); break;
		case "-": out.printf("%d %s %d = %d",a, op, b, a - b); break; 
		case "*": out.printf("%d %s %d = %d",a, op, b, a * b); break; 
		case "/": out.printf("%d %s %d = %d",a, op, b, a / b); break; 
		default :
			out.println("지원하지않는 연산자입니다.");
		}
		
		
		out.println("</body>");
		out.println("</html>");




	}
}
		

