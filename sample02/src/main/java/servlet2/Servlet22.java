/*주제: HttpGenericServlet2 도우미 클래스 사용하기
 * => 직접 servlet 인터페이스에 선언된 service를 구현하기 보다는 
 * 	post/get/head등의 요청에 따라 호출되는 메서드를 오버라이딩하자!
 */

package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet22")
public class Servlet22 extends HttpGenericServlet2{
	private static final long serialVersionUID = 1L;
	 

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("GET 요청...");

	}
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.printf("POST 요청...");
	
	
	}
}




// 객체에 대해서 호출한다?
// 
