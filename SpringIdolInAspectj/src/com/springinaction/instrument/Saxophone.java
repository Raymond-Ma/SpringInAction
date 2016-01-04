package com.springinaction.instrument;

/**
 * This is a saxophone played by instrumentalist
 * @author RaymondMa
 * @version 0.0.1
 */
public class Saxophone implements Instrument {
	
	public Saxophone() {}

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}
}
