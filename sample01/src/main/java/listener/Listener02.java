

package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener02 implements ServletRequestListener{
	public Listener02() {
		System.out.println("Listener02()");
	}
	
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// 요청이 들어오면 호출된다.
		System.out.println(sre.getServletRequest().getRemoteAddr());
		System.out.println("Listener02.requestDestroyed");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// service()를 실행한 후 호출된다.
		System.out.println("Listener02.requestInitialized");		
	
	}
		

}
