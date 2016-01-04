package com.springinaction.juggler;

/**
 * This is a poem written by William Shakespeare
 * @author RaymondMa
 * @version 0.0.1
 */
public class Sonnet29 implements Poem {
	private static String[] LINES = {
		"When, in disgrace with fortune and men's eyes,",
		"I am alone beweep my outcast state"};
	
	public Sonnet29() {}
	
	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}
}
