package com.ddns.jdevsite.springmvc.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "player")
public class Message {
	String name;
	String text;

	public Message(String name, String text) {
		this.name = name;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}
}
