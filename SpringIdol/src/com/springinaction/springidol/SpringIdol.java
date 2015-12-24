package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdol {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "com/springinaction/springidol/applicationContext.xml");
		
//		Performer dukePerformer = (Performer) ctx.getBean("duke");
//		Performer kennyPerformer = (Performer) ctx.getBean("kenny");
//		Performer hankPerformer = (Performer) ctx.getBean("hank");
		Performer carlPerformer = (Performer) ctx.getBean("carl");
//		kennyPerformer.perform();
		carlPerformer.perform();
		
		Thinker jackThinker = (Thinker) ctx.getBean("volunteer");
		jackThinker.thinkOfSomething("Spring Idol is great!");
	}
}
