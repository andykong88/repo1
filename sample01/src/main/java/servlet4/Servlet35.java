/* 주제:클라이언트에게 데이터를 보관시키는 방법 - '쿠키' (cookie)
 * => 클라이언트에게 데이터(쿠키)를 보낼 때 응답 header를 이용하여 보낸다.
 * => 데이터(쿠키)는 KEY/VALUE 한 쌍의 값으로 보낸다.
 * => key와 value는 반드시 문자열이여야 한다.
 * => key와 value는 ISO-8859-1 로 인코딩 되어야한다.
 * => 데이터의 사용범위를 지정할 수 있다.
 * => 데이터의 유효 기간을 지정할 수 있다.
 * => 웹브라우저는 서버로 부터 받은 데이터의 사용 범위 내에 있는 URL을 요청 할때, 
 * 		반드시 해당 데이터를 요청 헤더에 포함하여 서버에 보내야 한다.(강제사항!)
 * 		즉... 쿠키는 서버가 데이터를 웹 브라우저에게 주면서 다음과 같이 말하는 것과 같다.
 * 		"내가 준 데이터를 잘 보관하고 있다가 다음에 나한테 요청할때 가져와~"
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


@WebServlet("/servlet35")
public class Servlet35 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 1) 쿠키를 만든다
		Cookie c1 = new Cookie("name",URLEncoder.encode("홍길동", "UTF-8"));
		Cookie c2 = new Cookie("eamil","test@test.com");
		Cookie c3 = new Cookie("age","20");


		// 2) 쿠키를 응답 헤더에 싣는다.
		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);


		/*	Set-Cookie:name=%ED%99%8D%EA%B8%B8%EB%8F%99
				Set-Cookie:eamil="test@test.com"; Version=1
				Set-Cookie:age=20
		 */

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