/*주제: ServletContext 사용시 주의할점.*/

package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet("/servlet34/p4")
public class Servlet34_p4 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setCharacterEncoding("UTF-8");
		session.setAttribute("email", request.getParameter("email"));
		
		request.setCharacterEncoding("UTF-8");
		System.out.println(request.getParameter("email"));
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>p1</title></head>");
		out.println("<body>");
		out.println("<form action='p5' method='post'>");
		out.println("<p>입력을 완료했습니다</p>");
		out.println("<button>다음</button");
		out.println("</form>");
		out.println("</body></html>");
		




	}
}
