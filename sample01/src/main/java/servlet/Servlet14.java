// 주제 : 요청 방식과 응답 - GET, POST, HEAD

package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Servlet14")
public class Servlet14 extends GenericServlet {




	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.printf("이름=%s, 나이=%s", request.getParameter("name"), request.getParameter("age"));
		out.println("</body>");
		out.println("</html>");

		
	}
}

