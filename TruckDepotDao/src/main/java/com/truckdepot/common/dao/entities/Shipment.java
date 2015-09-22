package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the shipments database table.
 * 
 */
@Entity
@Table(name="shipments")
@NamedQuery(name="Shipment.findAll", query="SELECT s FROM Shipment s")
public class Shipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shipment_id")
	private long shipmentId;

	@Temporal(TemporalType.DATE)
	@Column(name="delivery_date")
	private Date deliveryDate;

	@Column(name="delivery_time")
	private Time deliveryTime;

	@Column(name="destination_address")
	private int destinationAddress;

	private String notes;

	@Column(name="origin_address")
	private int originAddress;

	@Temporal(TemporalType.DATE)
	@Column(name="pickup_date")
	private Date pickupDate;

	@Column(name="pickup_time")
	private Time pickupTime;

	@Column(name="shipment_type")
	private int shipmentType;

	private String status;

	//bi-directional many-to-one association to Shipper
	@ManyToOne
	@JoinColumn(name="shipper_id")
	private Shipper shipper;

	public Shipment() {
	}

	public long getShipmentId() {
		return this.shipmentId;
	}

	public void setShipmentId(long shipmentId) {
		this.shipmentId = shipmentId;
	}

	public Date getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Time getDeliveryTime() {
		return this.deliveryTime;
	}

	public void setDeliveryTime(Time deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public int getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(int destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(int originAddress) {
		this.originAddress = originAddress;
	}

	public Date getPickupDate() {
		return this.pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Time getPickupTime() {
		return this.pickupTime;
	}

	public void setPickupTime(Time pickupTime) {
		this.pickupTime = pickupTime;
	}

	public int getShipmentType() {
		return this.shipmentType;
	}

	public void setShipmentType(int shipmentType) {
		this.shipmentType = shipmentType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Shipper getShipper() {
		return this.shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

}