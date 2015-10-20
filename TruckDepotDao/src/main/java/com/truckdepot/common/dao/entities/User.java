package com.truckdepot.common.dao.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.truckdepot.common.dao.enums.UserType;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="user_type", discriminatorType=DiscriminatorType.STRING)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;

	@Column(name="company_name")
	private String companyName;

	@Column(name="email_id")
	private String emailId;

	@Column(name="email_verified")
	private Boolean emailVerified;

	@Column(name="first_name")
	private String firstName;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="is_admin")
	private Boolean isAdmin;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_number")
	private String mobileNumber;

	@Column(name="mobile_verified")
	private Boolean mobileVerified;

	private String password;

	@Column(name="user_type")
	@Enumerated(EnumType.STRING)
	private UserType userType;

	public User() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Boolean getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(Boolean emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Boolean getMobileVerified() {
		return this.mobileVerified;
	}

	public void setMobileVerified(Boolean mobileVerified) {
		this.mobileVerified = mobileVerified;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}