package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the carrier_drivers database table.
 * 
 */
@Entity
@Table(name="carrier_drivers")
@NamedQuery(name="CarrierDriver.findAll", query="SELECT c FROM TruckDriver c")
public class TruckDriver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="driver_id")
	private long driverId;

	private String documents;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mobile_number")
	private String mobileNumber;

	//bi-directional many-to-one association to Carrier
	@ManyToOne
	@JoinColumn(name="carrier_id")
	private Carrier carrier;

	//bi-directional many-to-one association to CarrierVehicleDriver
	@OneToMany(mappedBy="carrierDriver")
	private List<CarrierVehicleDriver> carrierVehicleDrivers;

	public TruckDriver() {
	}

	public long getDriverId() {
		return this.driverId;
	}

	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}

	public String getDocuments() {
		return this.documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public Carrier getCarrier() {
		return this.carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public List<CarrierVehicleDriver> getCarrierVehicleDrivers() {
		return this.carrierVehicleDrivers;
	}

	public void setCarrierVehicleDrivers(List<CarrierVehicleDriver> carrierVehicleDrivers) {
		this.carrierVehicleDrivers = carrierVehicleDrivers;
	}

	public CarrierVehicleDriver addCarrierVehicleDriver(CarrierVehicleDriver carrierVehicleDriver) {
		getCarrierVehicleDrivers().add(carrierVehicleDriver);
		carrierVehicleDriver.setCarrierDriver(this);

		return carrierVehicleDriver;
	}

	public CarrierVehicleDriver removeCarrierVehicleDriver(CarrierVehicleDriver carrierVehicleDriver) {
		getCarrierVehicleDrivers().remove(carrierVehicleDriver);
		carrierVehicleDriver.setCarrierDriver(null);

		return carrierVehicleDriver;
	}

}