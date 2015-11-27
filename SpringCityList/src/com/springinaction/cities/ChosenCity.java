package com.springinaction.cities;

/**
 * This is an data structure on city, which has been selected by applicationContext.xml
 * @author RaymondMa
 * @version 0.0.1
 */
public class ChosenCity {
	private String msgEncoding;
	private City chosenCity;
	
	public ChosenCity() {}
	
	public void setMsgEncoding(String msgEncoding) {
		this.msgEncoding = msgEncoding;
	}
	
	public void setChosenCity(City chosenCity) {
		this.chosenCity = chosenCity;
	}
	
	public void showCityMsg() {
		System.out.println("City name : " + chosenCity.getName());
		System.out.println("City State : " + chosenCity.getState());
		System.out.println("City Population : " + chosenCity.getPopulation());
		System.out.println("City Message Encoding : " + msgEncoding);
	}
}
