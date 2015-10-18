package com.truckdepot.web.beans;

public class ShipperRegistrationMO {

	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String companyName;
	private String mobileNumber;
	
	private AddressMO defaultDestination;
	private AddressMO defaultOrigin;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public AddressMO getDefaultDestination() {
		return defaultDestination;
	}

	public void setDefaultDestination(AddressMO defaultDestination) {
		this.defaultDestination = defaultDestination;
	}

	public AddressMO getDefaultOrigin() {
		return defaultOrigin;
	}

	public void setDefaultOrigin(AddressMO defaultOrigin) {
		this.defaultOrigin = defaultOrigin;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
