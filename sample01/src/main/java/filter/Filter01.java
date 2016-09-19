/*주제 : 필터를 만드는 방법과 구동원리
	=>init() 
	- 필터 객체를 생성한 후 자동으로 호출되는 메서드
	- 필터가 작업할떄 사용할 자원을 준비시키는 코드를 둔다.

	=>doFilter();
	- 필터가 적용될 때 마다 호출되는 메서드
	- 서블릿의 service() 메서드를 호출하기 전에 해야 할 작업이나,
		호출한 후에 해야할 작업을 둔다.
	
	=>destory();
	- 웹 애플리케이션이 멈출때 호출되는 메서드
	
	=> 필터를 DD 파일에(Deployment Descriptor 파일; web.xml) 에 등록한다.
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


/*@WebFilter("/Servlet16")*/
public class Filter01 implements Filter{
	FilterConfig config;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		System.out.println("Filter01.init()....");
	}



	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain nextFilter)
			throws IOException, ServletException {
		System.out.println("Filter01.doFilter(): service() 호출하기 전에 수행할 작업..");
		nextFilter.doFilter(request, response);
		System.out.println("Filter01.doFilter(): service() 호출한 후 수행할 작업..");
	}


	@Override
	public void destroy() {
		System.out.println("Filter01.destory()....");
	}



}
