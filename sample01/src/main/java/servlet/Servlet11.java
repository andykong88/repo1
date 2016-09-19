package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Servlet11")
public class Servlet11 extends GenericServlet {




	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.printf("%s님 안녕하세요!\n", name);
		out.println("</body>");
		out.println("</html>");




	}
}
		

