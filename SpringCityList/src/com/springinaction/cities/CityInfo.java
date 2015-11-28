package com.springinaction.cities;

import java.util.Collection;

/**
 * This is a data structure on CityInfo containing city name and state
 * @author RaymondMa
 * @version 0.0.1
 */
public class CityInfo {
	Collection<String> cityInfo;
	
	public CityInfo() {}
	
	public void setCityInfo(Collection<String> cityInfo) {
		this.cityInfo = cityInfo;
	}
	
	public void showCityMsg() {
		for (String mCityInfo : cityInfo) {
			System.out.println(mCityInfo);
		}
	}
}
