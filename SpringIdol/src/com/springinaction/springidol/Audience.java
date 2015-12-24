package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * This is an audience on enjoying the Spring Idol
 * @author RaymondMa
 * @version 0.0.1
 */
public class Audience {
	
	public void takeSeats() {
		System.out.println("The audience is taking their seats");
	}
	
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}
	
	public void applaud() {
		System.out.println("CLAP CLAP CLAP");
	}
	
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("The audience is taking their seats");
			System.out.println("The audience is turning off their cellphones");
			
			long start = System.currentTimeMillis();

			joinPoint.proceed();
			
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start) + " milliseconds.");
		}
		catch (Throwable e) {
			System.out.println("Boo! We want out money back!");
		}
	}
}
