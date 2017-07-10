package com.websystique.spring;

import com.websystique.spring.domain.Encryption;
import com.websystique.spring.domain.Messaging;

public class Communication {

	private Messaging messaging;
	
	private Encryption encryption;
	
	/*
	 * DI via Constructor Injection
	 */
	public Communication(Encryption encryption){
		this.encryption = encryption;
	}

	/*
	 * DI via Setter
	 */
	public void setMessaging(Messaging messaging){
		this.messaging = messaging;
	}

	public void communicate(){
		encryption.encryptData();
		messaging.sendMessage();
	}

}
