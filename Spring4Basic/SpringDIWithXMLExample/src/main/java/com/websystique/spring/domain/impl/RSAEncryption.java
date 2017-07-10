package com.websystique.spring.domain.impl;

import com.websystique.spring.domain.Encryption;

public class RSAEncryption implements Encryption{

	public void encryptData() {
		System.out.println("Encrypting data using RSA Encryption");
	}
}
