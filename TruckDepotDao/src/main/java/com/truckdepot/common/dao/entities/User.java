package com.truckdepot.common.dao.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.truckdepot.common.dao.enums.UserType;

import java.util.List;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
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
	private byte emailVerified;

	@Column(name="first_name")
	private String firstName;

	@Column(name="is_active")
	private byte isActive;

	@Column(name="is_admin")
	private byte isAdmin;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_number")
	private String mobileNumber;

	@Column(name="mobile_verified")
	private byte mobileVerified;

	private String password;

	@Column(name="user_type")
	@Enumerated(EnumType.STRING)
	private UserType userType;

	//bi-directional many-to-one association to Carrier
	@OneToMany(mappedBy="user")
	private List<Carrier> carriers;

	//bi-directional many-to-one association to Shipper
	@OneToMany(mappedBy="user")
	private List<Shipper> shippers;

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

	public byte getEmailVerified() {
		return this.emailVerified;
	}

	public void setEmailVerified(byte emailVerified) {
		this.emailVerified = emailVerified;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public byte getIsAdmin() {
		return this.isAdmin;
	}

	public void setIsAdmin(byte isAdmin) {
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

	public byte getMobileVerified() {
		return this.mobileVerified;
	}

	public void setMobileVerified(byte mobileVerified) {
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

	public List<Carrier> getCarriers() {
		return this.carriers;
	}

	public void setCarriers(List<Carrier> carriers) {
		this.carriers = carriers;
	}

	public Carrier addCarrier(Carrier carrier) {
		getCarriers().add(carrier);
		carrier.setUser(this);

		return carrier;
	}

	public Carrier removeCarrier(Carrier carrier) {
		getCarriers().remove(carrier);
		carrier.setUser(null);

		return carrier;
	}

	public List<Shipper> getShippers() {
		return this.shippers;
	}

	public void setShippers(List<Shipper> shippers) {
		this.shippers = shippers;
	}

	public Shipper addShipper(Shipper shipper) {
		getShippers().add(shipper);
		shipper.setUser(this);

		return shipper;
	}

	public Shipper removeShipper(Shipper shipper) {
		getShippers().remove(shipper);
		shipper.setUser(null);

		return shipper;
	}

}