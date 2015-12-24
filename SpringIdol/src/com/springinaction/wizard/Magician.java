package com.springinaction.wizard;

import com.springinaction.springidol.MindReader;

/**
 * This is a magician, who would read thoughts from thinker in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
public class Magician implements MindReader {
	
	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts : " + thoughts);
	}
}