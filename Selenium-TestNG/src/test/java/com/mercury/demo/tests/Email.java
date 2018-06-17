package com.mercury.demo.tests;

public final class Email {
	private final String EMAIL;
	public Email (final String EMAIL) {
		this.EMAIL = EMAIL;
	}
	public String getAddress() {
		return this.EMAIL;
	}
	
	@Override
	public String toString() {
		return this.EMAIL;
	}
	

}
