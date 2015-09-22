package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the carrier_vehicle_location database table.
 * 
 */
@Entity
@Table(name="carrier_vehicle_location")
@NamedQuery(name="CarrierVehicleLocation.findAll", query="SELECT c FROM CarrierVehicleLocation c")
public class CarrierVehicleLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from_date")
	private Date fromDate;

	private String location;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="to_date")
	private Date toDate;

	//bi-directional many-to-one association to CarrierVehicle
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private CarrierVehicle carrierVehicle;

	public CarrierVehicleLocation() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public CarrierVehicle getCarrierVehicle() {
		return this.carrierVehicle;
	}

	public void setCarrierVehicle(CarrierVehicle carrierVehicle) {
		this.carrierVehicle = carrierVehicle;
	}

}