package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet01 implements Servlet {
	ServletConfig config;
	
	
	public Servlet01() {
		System.out.println("생성자()");
	}
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		this.config = config;
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service()");
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
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
