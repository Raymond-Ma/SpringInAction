package com.springinaction.juggler;

/**
 * This is a PoeticJuggler, who can play juggle while reciting poem
 * @author RaymondMa 
 * @version 0.0.1
 */
public class PoeticJuggler extends Juggler {
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	@Override
	public void perform() {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
