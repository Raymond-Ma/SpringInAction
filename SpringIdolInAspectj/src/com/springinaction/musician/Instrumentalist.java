package com.springinaction.musician;

import com.springinaction.springidol.Performer;
import com.springinaction.instrument.Instrument;

/**
 * This is an instrumentalist, who would take part in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	public Instrumentalist() {}
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public String getSong() {
		return song;
	}
	
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public String screamSong() {
		return song;
	}
	
	@Override
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}
}
