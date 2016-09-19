/*주제: 오지니날 도우미 클래스 (HTTPServlet) 사용하기
 * -> Java EE 에서 제공해주는 httpservlet 클래스를 상속 받아서 서블릿을 사용하자!
 */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet24_page3")
public class Servlet24_page3 extends HttpServlet{
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("성년을 위한 메인 페이지!");



	}
}
