package com.springinaction.perfadditional;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import com.springinaction.springidol.Contestant;

/**
 * This is a contestant introducer, who would introduce new interface into Performer
 * @author RaymondMa 
 * @version 0.0.1
 */
@Aspect
public class ContestantIntroducer {

	@DeclareParents(value="com.springinaction.springidol.Performer+",defaultImpl=GraciousContestant.class)
	public static Contestant contestant;
}
