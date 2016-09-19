/*주제: ServletContext 사용시 주의할점.*/

package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/servlet33/p5")
public class Servlet33_p5 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext sc = request.getServletContext();
		
		
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>p1</title></head>");
		out.println("<body>");
		out.printf("<이름 = %s<br>\n", sc.getAttribute("name"));
		out.printf("<나이 = %s<br>\n", sc.getAttribute("age"));
		out.printf("<이메일 = %s<br>\n", sc.getAttribute("email"));
		out.println("</body></html>");
		




	}
}
