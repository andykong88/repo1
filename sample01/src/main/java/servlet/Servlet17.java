// 주제 : 필터테스트용
package servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Servlet17")
public class Servlet17 extends GenericServlet {




	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {


		//GET 파라미터를 호출하기전에 데이터를 사용할 문자표를 지정
		request.setCharacterEncoding("UTF-8");
		
		String age = request.getParameter("age");
		String name = request.getParameter("name");


		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.printf("이름=%s, 나이=%s", name, age);
		out.println("</body>");
		out.println("</html>");


	}
}

