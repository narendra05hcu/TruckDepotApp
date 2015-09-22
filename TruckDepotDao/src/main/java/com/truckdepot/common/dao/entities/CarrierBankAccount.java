package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the carrier_bank_account database table.
 * 
 */
@Entity
@Table(name="carrier_bank_account")
@NamedQuery(name="CarrierBankAccount.findAll", query="SELECT c FROM CarrierBankAccount c")
public class CarrierBankAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="account_id")
	private long accountId;

	@Column(name="`accoun t_number`")
	private String accoun_tNumber;

	@Column(name="account_city")
	private String accountCity;

	@Column(name="account_name")
	private String accountName;

	@Column(name="account_type")
	private String accountType;

	private String bank;

	private String branch;

	private String documents;

	@Column(name="ifsc_code")
	private String ifscCode;

	//bi-directional many-to-one association to Carrier
	@ManyToOne
	@JoinColumn(name="carrier_id")
	private Carrier carrier;

	public CarrierBankAccount() {
	}

	public long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccoun_tNumber() {
		return this.accoun_tNumber;
	}

	public void setAccoun_tNumber(String accoun_tNumber) {
		this.accoun_tNumber = accoun_tNumber;
	}

	public String getAccountCity() {
		return this.accountCity;
	}

	public void setAccountCity(String accountCity) {
		this.accountCity = accountCity;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBank() {
		return this.bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDocuments() {
		return this.documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getIfscCode() {
		return this.ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Carrier getCarrier() {
		return this.carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

}