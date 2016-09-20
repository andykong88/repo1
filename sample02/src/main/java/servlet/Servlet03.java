

package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet03 implements Servlet {
	ServletConfig config;


	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init()");
		this.config = config;


		try {
			String driver = config.getInitParameter("driver");
			String jdbcurl = config.getInitParameter("jdbcurl");;
			String username = config.getInitParameter("username");;
			String password = config.getInitParameter("password");;


			Class.forName(driver);
			Connection con = DriverManager.getConnection(jdbcurl, username, password);
		} catch (Exception e) {
			e.printStackTrace();
			
		}

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
		return null;
	}

}




