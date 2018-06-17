package com.mercury.demo.tests;

public class UserInformation {
	private final UserName USERNAME;
	private final Password PASSWORD;

	public UserInformation(final UserName USERNAME, final Password PASSWORD) {
		this.USERNAME = USERNAME;
		this.PASSWORD = PASSWORD;
	}

	public UserName getUSERNAME() {
		return USERNAME;
	}

	public Password getPASSWORD() {
		return PASSWORD;
	}

	public String toString() {
		return this.USERNAME + "," + this.PASSWORD;
	}

}
