package servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public abstract class AbstractServlet implements Servlet {
	ServletConfig config;


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		this.config = config;
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
		return null;
	}




}
