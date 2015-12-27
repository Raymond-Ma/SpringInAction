package com.springinaction.wizard;

import com.springinaction.springidol.MindReader;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * This is a magician, who would read thoughts from thinker in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
@Aspect
public class Magician implements MindReader {
	
	@Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
	public void thinking(String thoughts){}
	
	@Override
	@Before("thinking(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts : " + thoughts);
	}
}