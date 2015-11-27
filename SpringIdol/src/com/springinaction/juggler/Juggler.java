package com.springinaction.juggler;

import com.springinaction.springidol.Performer;

/**
 * This is a Juggler, who would take part in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
public class Juggler implements Performer {
	private int beanBags = 3;
	
    public Juggler(){}
    
    public Juggler(int beanBags) {
    	this.beanBags = beanBags;
    }
    
    public void perform() {
    	System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
    
    public static void main(String[] args) {
		
	}
}
