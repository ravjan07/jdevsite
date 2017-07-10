package com.websystique.spring.domain;

public class Driver {

	private License license;
	
	public void setLicense(License license) {
		this.license = license;
	}

	public License getLicense() {
		return license;
	}

	@Override
	public String toString() {
		return "Driver [license=" + license + "]";
	}
}
