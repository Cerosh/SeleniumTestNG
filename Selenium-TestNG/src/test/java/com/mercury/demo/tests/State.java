package com.mercury.demo.tests;

public final class State {
	private final String STATE;
	public State (final String STATE) {
		this.STATE = STATE;
	}
	public String getState() {
		return this.STATE;
	}
	
	@Override
	public String toString() {
		return this.STATE;
	}
	

}
