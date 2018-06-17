package com.mercury.demo.tests;

public final class FName {
	private final String FNAME;

	public FName(final String FNAME) {
		this.FNAME = FNAME;
	}

	public String getFName() {
		return FNAME;
	}

	@Override
	public String toString() {
		return this.FNAME;
	}
}
