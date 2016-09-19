/*주제: 리다이렉트(redirect) 방법과 용도
 * => 클라이언트에게 즉시 다른 url을 요청하도록 명령을 내릴 때.
 * 방법 : 응답상태 코드를 (200 대신 302)바꾼다. 
 * 용도 : Refresh와 달리 콘텐츠 출력없이 다른 페이지로 보낼 때 사용한다.

 *  */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet26")
public class Servlet26 extends HttpServlet{
	private static final long serialVersionUID = 1L;


	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age = Integer.parseInt(request.getParameter("age"));

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html");
		out.println("<head>");
		out.println("<title>kong 테스트</title>");
		out.println("</head>");
		out.println("</body>");

		if (age < 19) {
			out.println("미성년입니다.");
		} else {
			out.println("성년입니다.");
		}

		if (age <19) {
			response.sendRedirect("servlet24_page2");

		} else {
			response.sendRedirect("servlet24_page3");
		}
	}
}








