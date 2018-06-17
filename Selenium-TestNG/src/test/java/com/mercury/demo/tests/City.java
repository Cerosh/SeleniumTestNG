package com.mercury.demo.tests;

public final class City {
	private final String CITY;
	public City (final String CITY) {
		this.CITY = CITY;
	}
	public String getCity() {
		return this.CITY;
	}
	
	@Override
	public String toString() {
		return this.CITY;
	}
	

}
