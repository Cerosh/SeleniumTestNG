package com.mercury.demo.tests;

public final class ContactInformation {
	private final FName FIRSTNAME;
	private final LName LASTNAME;
	private final Phone PHONE;
	private final Email EMAIL;

	public ContactInformation(final FName FIRSTNAME, final LName LASTNAME, final Phone PHONE, final Email EMAIL) {
		this.FIRSTNAME = FIRSTNAME;
		this.LASTNAME = LASTNAME;
		this.PHONE = PHONE;
		this.EMAIL = EMAIL;

	}

	public FName getFirstName() {
		return FIRSTNAME;
	}

	public LName getLastName() {
		return LASTNAME;
	}

	public Phone getPhone() {
		return PHONE;
	}

	public Email getEmail() {
		return EMAIL;
	}

	@Override
	public String toString() {
		return FIRSTNAME + "," + LASTNAME+ "," + PHONE+ "," + EMAIL;

	}

}
