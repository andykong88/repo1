/*주제: GET요청과 POST 요청 구분하기
 */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/servlet20")
public class Servlet20 extends GenericServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {


		//		request.getMethod();

		HttpServletRequest httpRequest = (HttpServletRequest)request;

		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("Http 요청방법: %s\n",httpRequest.getMethod());



	}
}
