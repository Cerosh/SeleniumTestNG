package com.mercury.demo.tests;

public final class LName {
	private final String LNAME;

	public LName(final String LNAME) {
		this.LNAME = LNAME;
	}

	public String getLName() {
		return LNAME;
	}

	@Override
	public String toString() {
		return this.LNAME;
	}
}
