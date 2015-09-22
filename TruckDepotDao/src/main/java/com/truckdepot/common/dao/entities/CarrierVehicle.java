package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the carrier_vehicles database table.
 * 
 */
@Entity
@Table(name="carrier_vehicles")
@NamedQuery(name="CarrierVehicle.findAll", query="SELECT c FROM CarrierVehicle c")
public class CarrierVehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="vehicle_id")
	private long vehicleId;

	private String documents;

	@Column(name="vehicle_number")
	private String vehicleNumber;

	@Column(name="vehicle_type")
	private int vehicleType;

	//bi-directional many-to-one association to CarrierVehicleDriver
	@OneToMany(mappedBy="carrierVehicle")
	private List<CarrierVehicleDriver> carrierVehicleDrivers;

	//bi-directional many-to-one association to CarrierVehicleLocation
	@OneToMany(mappedBy="carrierVehicle")
	private List<CarrierVehicleLocation> carrierVehicleLocations;

	//bi-directional many-to-one association to Carrier
	@ManyToOne
	@JoinColumn(name="carrier_id")
	private Carrier carrier;

	public CarrierVehicle() {
	}

	public long getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDocuments() {
		return this.documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<CarrierVehicleDriver> getCarrierVehicleDrivers() {
		return this.carrierVehicleDrivers;
	}

	public void setCarrierVehicleDrivers(List<CarrierVehicleDriver> carrierVehicleDrivers) {
		this.carrierVehicleDrivers = carrierVehicleDrivers;
	}

	public CarrierVehicleDriver addCarrierVehicleDriver(CarrierVehicleDriver carrierVehicleDriver) {
		getCarrierVehicleDrivers().add(carrierVehicleDriver);
		carrierVehicleDriver.setCarrierVehicle(this);

		return carrierVehicleDriver;
	}

	public CarrierVehicleDriver removeCarrierVehicleDriver(CarrierVehicleDriver carrierVehicleDriver) {
		getCarrierVehicleDrivers().remove(carrierVehicleDriver);
		carrierVehicleDriver.setCarrierVehicle(null);

		return carrierVehicleDriver;
	}

	public List<CarrierVehicleLocation> getCarrierVehicleLocations() {
		return this.carrierVehicleLocations;
	}

	public void setCarrierVehicleLocations(List<CarrierVehicleLocation> carrierVehicleLocations) {
		this.carrierVehicleLocations = carrierVehicleLocations;
	}

	public CarrierVehicleLocation addCarrierVehicleLocation(CarrierVehicleLocation carrierVehicleLocation) {
		getCarrierVehicleLocations().add(carrierVehicleLocation);
		carrierVehicleLocation.setCarrierVehicle(this);

		return carrierVehicleLocation;
	}

	public CarrierVehicleLocation removeCarrierVehicleLocation(CarrierVehicleLocation carrierVehicleLocation) {
		getCarrierVehicleLocations().remove(carrierVehicleLocation);
		carrierVehicleLocation.setCarrierVehicle(null);

		return carrierVehicleLocation;
	}

	public Carrier getCarrier() {
		return this.carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

}