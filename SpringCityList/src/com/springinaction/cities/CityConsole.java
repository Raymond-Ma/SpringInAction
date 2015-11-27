package com.springinaction.cities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is a console on showing specified city
 * @author RaymondMa
 * @version 0.0.1
 */
public class CityConsole {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/cities/applicationContext.xml");
		
		ChosenCity mChosenCity = (ChosenCity) ctx.getBean("chosenCity");
		mChosenCity.showCityMsg();
	}
}
