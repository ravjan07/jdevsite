package com.websystique.spring.domain.impl;

import com.websystique.spring.domain.Messaging;

public class ActiveMQMessaging implements Messaging{

	public void sendMessage() {
		System.out.println("Sending Message via Active MQ");
	}

}
