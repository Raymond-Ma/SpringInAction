package com.springinaction.cities;

/**
 * This is an data structure on city
 * @author RaymondMa
 * @version 0.0.1
 */
public class City {
	private String name;
	private String state;
	private int population;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public int getPopulation() {
		return population;
	}
}
