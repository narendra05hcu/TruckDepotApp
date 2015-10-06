package com.truckdepot.common.dao.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * The persistent class for the carrier database table.
 * 
 */
@Entity
@NamedQuery(name="Carrier.findAll", query="SELECT c FROM Carrier c")
@DiscriminatorValue("CARRIER")
public class Carrier extends User {
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="carrier_id")
	private long carrierId;*/

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

	@Column(name="business_type")
	private String businessType;

	/*//bi-directional many-to-one association to User
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;*/

	//bi-directional many-to-one association to CarrierBankAccount
	@OneToOne(mappedBy="carrier")
	private CarrierBankAccount carrierBankAccount;

	//bi-directional many-to-one association to CarrierDriver
	@OneToMany(mappedBy="carrier",fetch=FetchType.LAZY)
	private List<TruckDriver> carrierDrivers;

	//bi-directional many-to-one association to CarrierShipment
	@OneToMany(mappedBy="carrier",fetch=FetchType.LAZY)
	private List<CarrierShipment> carrierShipments;

	//bi-directional many-to-one association to CarrierVehicle
	@OneToMany(mappedBy="carrier",fetch=FetchType.LAZY)
	private List<CarrierVehicle> carrierVehicles;

	//bi-directional many-to-one association to QuotesPrice
	@OneToMany(mappedBy="carrier",fetch=FetchType.LAZY)
	private List<QuotesPrice> quotesPrices;

	public Carrier() {
	}

	/*public long getCarrierId() {
		return this.carrierId;
	}

	public void setCarrierId(long carrierId) {
		this.carrierId = carrierId;
	}*/

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getBusinessType() {
		return this.businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	/*public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/

	public CarrierBankAccount getCarrierBankAccount() {
		return this.carrierBankAccount;
	}

	public void setCarrierBankAccount(CarrierBankAccount carrierBankAccount) {
		this.carrierBankAccount = carrierBankAccount;
	}

	public List<TruckDriver> getCarrierDrivers() {
		return this.carrierDrivers;
	}

	public void setCarrierDrivers(List<TruckDriver> carrierDrivers) {
		this.carrierDrivers = carrierDrivers;
	}

	public TruckDriver addCarrierDriver(TruckDriver carrierDriver) {
		getCarrierDrivers().add(carrierDriver);
		carrierDriver.setCarrier(this);

		return carrierDriver;
	}

	public TruckDriver removeCarrierDriver(TruckDriver carrierDriver) {
		getCarrierDrivers().remove(carrierDriver);
		carrierDriver.setCarrier(null);

		return carrierDriver;
	}

	public List<CarrierShipment> getCarrierShipments() {
		return this.carrierShipments;
	}

	public void setCarrierShipments(List<CarrierShipment> carrierShipments) {
		this.carrierShipments = carrierShipments;
	}

	public CarrierShipment addCarrierShipment(CarrierShipment carrierShipment) {
		getCarrierShipments().add(carrierShipment);
		carrierShipment.setCarrier(this);

		return carrierShipment;
	}

	public CarrierShipment removeCarrierShipment(CarrierShipment carrierShipment) {
		getCarrierShipments().remove(carrierShipment);
		carrierShipment.setCarrier(null);

		return carrierShipment;
	}

	public List<CarrierVehicle> getCarrierVehicles() {
		return this.carrierVehicles;
	}

	public void setCarrierVehicles(List<CarrierVehicle> carrierVehicles) {
		this.carrierVehicles = carrierVehicles;
	}

	public CarrierVehicle addCarrierVehicle(CarrierVehicle carrierVehicle) {
		getCarrierVehicles().add(carrierVehicle);
		carrierVehicle.setCarrier(this);

		return carrierVehicle;
	}

	public CarrierVehicle removeCarrierVehicle(CarrierVehicle carrierVehicle) {
		getCarrierVehicles().remove(carrierVehicle);
		carrierVehicle.setCarrier(null);

		return carrierVehicle;
	}

	public List<QuotesPrice> getQuotesPrices() {
		return this.quotesPrices;
	}

	public void setQuotesPrices(List<QuotesPrice> quotesPrices) {
		this.quotesPrices = quotesPrices;
	}

	public QuotesPrice addQuotesPrice(QuotesPrice quotesPrice) {
		getQuotesPrices().add(quotesPrice);
		quotesPrice.setCarrier(this);

		return quotesPrice;
	}

	public QuotesPrice removeQuotesPrice(QuotesPrice quotesPrice) {
		getQuotesPrices().remove(quotesPrice);
		quotesPrice.setCarrier(null);

		return quotesPrice;
	}

}