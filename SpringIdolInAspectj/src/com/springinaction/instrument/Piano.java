package com.springinaction.instrument;

/**
 * This is an piano played by instrumentalist
 * @author RaymondMa
 * @version 0.0.1
 */
public class Piano implements Instrument {

	public Piano() {}

	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}
}
