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
		ChosenCity firstRlt = (ChosenCity) ctx.getBean("firstRlt");
		ChosenCity lastRlt = (ChosenCity) ctx.getBean("lastRlt");
		CityInfo mCityInfo = (CityInfo) ctx.getBean("bigCityInfo");
		
		mChosenCity.showCityMsg();
		System.out.println("First Query Result is shown as below: -- ");
		firstRlt.showCityMsg();
		System.out.println("Last Query Result is shown as below: -- ");
		lastRlt.showCityMsg();
		System.out.println("City Info extracted from big city is shown as below: -- ");
		mCityInfo.showCityMsg();
	}
}
