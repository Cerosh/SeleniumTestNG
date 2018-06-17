package com.mercury.demo.tests;

public final class Address {
	private final String ADDRESS;
	public Address (final String ADDRESS) {
		this.ADDRESS = ADDRESS;
	}
	public String getAddress() {
		return this.ADDRESS;
	}
	
	@Override
	public String toString() {
		return this.ADDRESS;
	}
	

}
