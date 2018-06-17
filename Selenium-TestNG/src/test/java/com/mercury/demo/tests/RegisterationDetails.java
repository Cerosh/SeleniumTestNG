package com.mercury.demo.tests;

public final class RegisterationDetails {
	private final ContactInformation CI;
	private final MailingInformation MI;
	private final UserInformation UI;

	public RegisterationDetails(final ContactInformation CI, final MailingInformation MI, final UserInformation UI) {
		this.CI = CI;
		this.MI = MI;
		this.UI = UI;
	}

	public Object getContactInformation() {
		return CI;
	}

	public Object getMailingInformation() {
		return MI;
	}

	public Object getUserInformation() {
		return UI;
	}

	public String toString() {
		return CI + "," + MI + "," + UI;
	}
}
