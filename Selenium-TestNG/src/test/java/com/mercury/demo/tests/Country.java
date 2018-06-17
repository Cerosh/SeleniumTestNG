package com.mercury.demo.tests;

public final class Country {
	private final String COUNTRY;
	public Country (final String COUNTRY) {
		this.COUNTRY = COUNTRY;
	}
	public String getCountry() {
		return this.COUNTRY;
	}
	
	@Override
	public String toString() {
		return this.COUNTRY;
	}
	

}
