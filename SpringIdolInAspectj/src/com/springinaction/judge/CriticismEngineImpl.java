package com.springinaction.judge;

public class CriticismEngineImpl implements CriticismEngine {
	
	public String[] criticismPool;
	
	public void setCriticismPool(String[] criticismPool) {
		this.criticismPool = criticismPool;
	}
	
	@Override
	public String getCriticism() {
		int randNumber = (int) Math.random() * criticismPool.length;
		return criticismPool[randNumber];
	}

}
