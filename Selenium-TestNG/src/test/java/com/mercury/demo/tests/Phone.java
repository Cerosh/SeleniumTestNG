package com.mercury.demo.tests;

public final class Phone {
	private final String PHONE;
	public Phone (final String PHONE) {
		this.PHONE = PHONE;
	}
	public String getPhone() {
		return this.PHONE;
	}
	
	@Override
	public String toString() {
		return this.PHONE;
	}
	

}
