package com.mercury.demo.tests;

public final class PostalCode {
	private final String POSTALCODE;
	public PostalCode (final String POSTALCODE) {
		this.POSTALCODE = POSTALCODE;
	}
	public String getPostalCode() {
		return this.POSTALCODE;
	}
	
	@Override
	public String toString() {
		return this.POSTALCODE;
	}
	

}
