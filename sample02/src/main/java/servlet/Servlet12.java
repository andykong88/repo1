// 계산기 만들기
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Servlet12")
public class Servlet12 extends GenericServlet {




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
		

