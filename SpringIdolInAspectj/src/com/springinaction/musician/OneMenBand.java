package com.springinaction.musician;

//import java.util.Map;
import java.util.Properties;
import java.util.Enumeration;
import com.springinaction.springidol.Performer;
//import com.springinaction.instrument.Instrument;

/**
 * This is an one-man-band, who would take part in Spring Idol contest
 * @author RaymondMa 
 * @version 0.0.1
 */
public class OneMenBand implements Performer{
//	private Map<String, Instrument> instruments;	//Use map to hold instruments
	private Properties instruments;
	private String nullString;
	
//	Handle instruments as Map
//	public void setInstruments(Map<String, Instrument> instruments) {
//		this.instruments = instruments;
//	}
	
//	Handle instruments as Properties
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
	
	public void setNullString(String nullString) {
		this.nullString = nullString;
	}
	
//	Handle instruments as Map	
//	@Override
//	public void perform() {
//		for (String key : instruments.keySet()) {
//			System.out.print(key + " : ");
//			Instrument instrument = instruments.get(key);
//			instrument.play();
//		}
//	}
	
//	Handle instruments as Properties
	@Override
	public void perform() {
		Enumeration<Object> instrumentSet = instruments.elements();
		while (instrumentSet.hasMoreElements()) {
			String key = (String) instrumentSet.nextElement();
			System.out.println(key);
		}
		
		if(null == nullString) {
			System.out.println("nullString is empty.");
		}
	}
}
