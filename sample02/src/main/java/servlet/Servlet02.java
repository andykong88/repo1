

package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet02 implements Servlet {
	ServletConfig config;


	public Servlet02() {
		try {
			String driver = "";
			String jdbcurl = "";
			String username = "";
			String password = "";

			Class.forName("클래스이름");
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
		} catch (Exception e) {}
	}







	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		this.config = config;


		try {
			String driver = config.getInitParameter("driver");
			String jdbcurl = config.getInitParameter("jdbcurl");;
			String username = config.getInitParameter("username");;
			String password = config.getInitParameter("password");;

			System.out.println(driver);
			System.out.println(jdbcurl);
			System.out.println(username);
			System.out.println(password);
			
			

			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
		} catch (Exception e) {}

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




