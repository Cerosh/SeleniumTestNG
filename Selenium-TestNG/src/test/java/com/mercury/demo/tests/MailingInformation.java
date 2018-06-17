package com.mercury.demo.tests;

public class MailingInformation {
	private final Address ADDRESS;
	private final City CITY;
	private final State STATE;
	private final PostalCode POSTALCODE;
	private final Country COUNTRY;

	public MailingInformation(final Address ADDRESS, final City CITY, final State STATE, final PostalCode POSTALCODE,
			final Country COUNTRY) {
		this.ADDRESS = ADDRESS;
		this.CITY = CITY;
		this.STATE = STATE;
		this.POSTALCODE = POSTALCODE;
		this.COUNTRY = COUNTRY;
	}

	public Address getADDRESS() {
		return ADDRESS;
	}

	public City getCITY() {
		return CITY;
	}

	public State getSTATE() {
		return STATE;
	}

	public PostalCode getPOSTALCODE() {
		return POSTALCODE;
	}

	public Country getCOUNTRY() {
		return COUNTRY;
	}

	@Override
	public String toString() {
		return this.ADDRESS + "," + this.CITY + "," + this.STATE + "," + this.POSTALCODE + "," + this.COUNTRY;
	}

}
