package com.springinaction.cities;

import java.util.Collection;

/**
 * This is an data structure on city, which has been selected by applicationContext.xml
 * @author RaymondMa
 * @version 0.0.1
 */
public class ChosenCity {
	private String msgEncoding;
	private Collection<City> chosenCity;
	
	public ChosenCity() {}
	
	public void setMsgEncoding(String msgEncoding) {
		this.msgEncoding = msgEncoding;
	}
	
	public String getMsgEncoding() {
		return msgEncoding;
	}
	
	public void setChosenCity(Collection<City> chosenCity) {
		this.chosenCity = chosenCity;
	}
	
	public void showCityMsg() {
		for (City mCity : chosenCity) {
			System.out.println("City name : " + mCity.getName());
			System.out.println("City State : " + mCity.getState());
			System.out.println("City Population : " + mCity.getPopulation());
		}
		System.out.println("City Message Encoding : " + msgEncoding);
	}
}
