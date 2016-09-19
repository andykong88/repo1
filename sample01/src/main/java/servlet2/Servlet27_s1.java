/*주제: forward 
 * 	=> 다른 서블릿으로 실행을 위임할 때 사용하는 기법이다.
 */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet27/s1")
public class Servlet27_s1 extends HttpServlet{
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("첫번째 서블릿: servlet_s1.............");

		RequestDispatcher rd = request.getRequestDispatcher("/servlet27/s2");
		//요청을 위임한다.
		rd.forward(request, response);

	}
}
