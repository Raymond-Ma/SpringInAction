package com.springinaction.springidol;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;

/**
 * This is a Auditorium for Spring Idol, on which performers show their techniques
 * @author RaymondMa 
 * @version 0.0.1
 */
//public class Auditorium implements InitializingBean,DisposableBean {
public class Auditorium {
	public void turnOnLights() {
		System.out.println("Lights of Auditorium is on.");
	}
	
	public void turnOffLights() {
		System.out.println("Lights of Auditorium is off.");
	}

//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Lights of Auditorium is off.");
//	}
//
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Lights of Auditorium is on.");
//	}
}
