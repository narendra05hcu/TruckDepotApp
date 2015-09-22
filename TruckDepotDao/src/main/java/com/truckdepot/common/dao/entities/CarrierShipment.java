package com.truckdepot.common.dao.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the carrier_shipments database table.
 * 
 */
@Entity
@Table(name="carrier_shipments")
@NamedQuery(name="CarrierShipment.findAll", query="SELECT c FROM CarrierShipment c")
public class CarrierShipment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;

	@Column(name="shipment_id")
	private int shipmentId;

	//bi-directional many-to-one association to Carrier
	@ManyToOne
	@JoinColumn(name="carrier_id")
	private Carrier carrier;

	public CarrierShipment() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getShipmentId() {
		return this.shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public Carrier getCarrier() {
		return this.carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

}