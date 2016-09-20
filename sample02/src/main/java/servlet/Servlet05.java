package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/servlet05")
public class Servlet05 implements Servlet {
	ServletConfig config;


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		this.config = config;
	}


	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("hello~~~~~~~~~~~~~~~~~~");
	}



	@Override
	public void destroy() {
		System.out.println("destory()");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return this.getClass().getName();
	}
}
		

