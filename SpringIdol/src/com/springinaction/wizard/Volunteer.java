package com.springinaction.wizard;

import com.springinaction.springidol.Thinker;

/**
 * This is a volunteer, who would make thoughts in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
public class Volunteer implements Thinker {
	private String thoughts;
	
	@Override
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
	}
	
	public String getThoughts() {
		return thoughts;
	}
}
