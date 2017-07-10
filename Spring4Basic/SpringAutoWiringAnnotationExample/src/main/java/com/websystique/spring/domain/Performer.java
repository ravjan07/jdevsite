package com.websystique.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("performer")
public class Performer {
	
	private Instrument instrument;
	
	@Autowired
	public Performer(Instrument instrument){
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}

	
}
