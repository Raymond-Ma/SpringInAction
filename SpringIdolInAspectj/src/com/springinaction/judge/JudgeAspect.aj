package com.springinaction.judge;

/**
 * This is a judge aspect, which would call CriticismEngine to evaluate performance
 * @author RaymondMa
 * @version 0.0.1
 */
public aspect JudgeAspect {
	
	public JudgeAspect() {}
	
	private CriticismEngine criticismEngine;
	
	public void setCriticismEngine(CriticismEngine criticismEngine) {
		this.criticismEngine = criticismEngine;
	}
	
	pointcut performance() : execution(* perform(..));
	
	after() returning() : performance() {
		System.out.println(criticismEngine.getCriticism());
	}
}