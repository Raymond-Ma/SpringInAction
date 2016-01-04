package com.springinaction.springidol;

/**
 * This is a stage for performers to show techniques, Singleton instance
 * @author RaymondMa
 * @version 0.0.1
 */
public class Stage {
	private static Stage myStage;
	
	private Stage() {}
	
	public static Stage getInstance() {
		if (myStage == null) {
			myStage = new Stage();
		}
		
		System.out.println("Constructor on singleton instance has been called.");
		return myStage;
	}
}
