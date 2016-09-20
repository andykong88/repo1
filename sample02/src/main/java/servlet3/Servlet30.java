package servlet3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/servlet30")
public class Servlet30 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) ServletContext 보관소에 값을 저장한다.
		ServletContext servletContext = this.getServletContext();
		servletContext.setAttribute("a1", "hello");
		
		
		// 2) ServletContext 보관소에 값을 저장한다.
		request.setAttribute("r1", "world!");
	
		// 3) 다른 서블릿으로 포워딩 한다.
		RequestDispatcher rd = request.getRequestDispatcher("/servlet31");
		rd.forward(request, response);
	
	}
}
