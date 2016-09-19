 /*주제 : 여러개의 필터 꼽기

 */

package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/Servlet17")
public class Filter03 implements Filter{
	FilterConfig config;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		System.out.println("Filter02.init()....");
	}



	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain nextFilter)
			throws IOException, ServletException {
		System.out.println("Filter02.doFilter(): service() 호출하기 전에 수행할 작업..");
		nextFilter.doFilter(request, response);
		System.out.println("Filter02.doFilter(): service() 호출한 후 수행할 작업..");
	}


	@Override
	public void destroy() {
		System.out.println("Filter02.destory()....");
	}



}
