/*주제: HttpGenericServlet 도우미 클래스 사용하기
 * 
 */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet21")
public class Servlet21 extends HttpGenericServlet{
	private static final long serialVersionUID = 1L;
	

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service(HttpServletRequest,HttpServiceReponse");

		HttpServletRequest httpRequest = (HttpServletRequest)request;
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("Http 요청방법: %s\n",httpRequest.getMethod());

	}
}




// 객체에 대해서 호출한다?
// 
