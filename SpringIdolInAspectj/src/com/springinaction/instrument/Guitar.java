package com.springinaction.instrument;

/**
 * This is a guitar played by instrumentalist
 * @author RaymondMa
 * @version 0.0.1
 */
public class Guitar implements Instrument {

	public Guitar() {}

	@Override
	public void play(){
		System.out.println("DANG DANG DANG");
	}
}
