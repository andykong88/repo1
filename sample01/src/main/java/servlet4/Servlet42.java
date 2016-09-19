/* 주제: 쿠키를 사용할수 있는 범위(URL)을 지정하기.
 */
package servlet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test/servlet42")
public class Servlet42 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie c1 = new Cookie("name",URLEncoder.encode("홍길동", "UTF-8"));
		
		Cookie c2 = new Cookie("eamil","test@test.com");
		c2.setMaxAge(30); 
		
		Cookie c3 = new Cookie("age","20");
		c3.setMaxAge(60);
		
		// 2) 쿠키를 응답 헤더에 싣는다.
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);
		
		
		// 3) 간단한 응답
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("웹브라이저로 쿠키를 보냈습니다. HTTP 응답을 확인하세요");

	}
}


/* URL 인코딩의 의미
	URLEncoder.encoder(...);
	->"홍길동" (2바이트 유니코드) ---> UTF-8 코드(2 ~ 4 바이트) ---> ASCII 코드 
 */