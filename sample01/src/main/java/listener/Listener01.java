/*주제: 리스너 - 개요 및 ServletContextListener
	=> 특정사건(이벤트)이 발생했을 때 실행되는 객체
	=> 이벤트?
			1) 웹애플리케이션이 시작되었다.
			2) 웹애플리케이션이 종료되었다.
			3) 요청이 들어왔다.
			4) 요청 전용 창고에 데이터가 저장되었다.
			6) 세션 전용 창고에 데이터가 입고되었다.

 	=> ServletContextListener
 			- 웹애플리케이션이 시작되거나 종료될 때 호출될 메서드를 정의한 인터페이스
 			- 이 인터페이스의 구현체는 웹애플리케이션이 시작 되거나 종료될 때 마다 실행된다.
 */


package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener01 implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Listener01.contextInitialized()");
	
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Listener01.contextDestory()");
		
	}


}
