/* 주제: 쿠키 값 꺼내기 - PAT = /web01/servlet38
 */
package servlet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test2/servlet41")
public class Servlet40 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 요청헤더에 첨부되어 있는 쿠키 데이터 꺼내기
		// 쿠키의 key만 입력하면 value를 리턴하는 메서드가 없다.
		Cookie[] cookies = request.getCookies();
		

		
		// 간단한 응답
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("클라이언트가 보낸 쿠키들:");
		
		if (cookies == null) 
			return;

		for (Cookie cookie : cookies) {
			// URL 인코딩 데이터(예: %ED%99%8D%EA%B8% --> UTF-8 --> 2바이트 유니코드
			out.printf("%s=%s\n", cookie.getName(), URLDecoder.decode(cookie.getValue(), "UTF-8"));

		}
	}
}


