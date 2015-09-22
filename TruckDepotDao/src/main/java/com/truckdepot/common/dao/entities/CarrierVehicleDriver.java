package com.truckdepot.common.dao.entities;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the carrier_vehicle_driver database table.
 * 
 */
@Entity
@Table(name="carrier_vehicle_driver")
@NamedQuery(name="CarrierVehicleDriver.findAll", query="SELECT c FROM CarrierVehicleDriver c")
public class CarrierVehicleDriver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;

	//bi-directional many-to-one association to CarrierDriver
	@ManyToOne
	@JoinColumn(name="driver_id")
	private TruckDriver carrierDriver;

	//bi-directional many-to-one association to CarrierVehicle
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private CarrierVehicle carrierVehicle;

	public CarrierVehicleDriver() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TruckDriver getCarrierDriver() {
		return this.carrierDriver;
	}

	public void setCarrierDriver(TruckDriver carrierDriver) {
		this.carrierDriver = carrierDriver;
	}

	public CarrierVehicle getCarrierVehicle() {
		return this.carrierVehicle;
	}

	public void setCarrierVehicle(CarrierVehicle carrierVehicle) {
		this.carrierVehicle = carrierVehicle;
	}

}