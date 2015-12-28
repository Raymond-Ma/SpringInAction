package com.springinaction.perfadditional;

import com.springinaction.springidol.Contestant;

/**
 * This is a gracious contestant, who would receive award in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
public class GraciousContestant implements Contestant {

	@Override
	public void receiveAward() {
		System.out.println("This performer will be awarded");
	}
}