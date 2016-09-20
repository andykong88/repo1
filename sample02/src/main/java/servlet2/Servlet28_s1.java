/*주제: include 
 * 	=> 다른 서블릿으로 실행을 포함하고 싶을 때 사용하는 기법이다.
 * forward 와 달리 다른 서블릿을 실행한 후 이전 서블릿으로 돌아온다.
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

@WebServlet("/servlet28/s1")
public class Servlet28_s1 extends HttpServlet{
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("첫번째 서블릿: servlet28_s1.............");
		
		

		RequestDispatcher rd = request.getRequestDispatcher("/servlet28/s2");
		rd.include(request, response);
		
		rd = request.getRequestDispatcher("/servlet28/s3");
		rd.include(request, response);
		
		out.println("------------------------------------------------");
		
	}
}

