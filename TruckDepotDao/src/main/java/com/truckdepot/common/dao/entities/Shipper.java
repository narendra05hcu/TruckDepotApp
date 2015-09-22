package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the shipper database table.
 * 
 */
@Entity
@NamedQuery(name="Shipper.findAll", query="SELECT s FROM Shipper s")
public class Shipper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shipper_id")
	private long shipperId;

	@Column(name="default_destination")
	private int defaultDestination;

	@Column(name="default_origin")
	private int defaultOrigin;

	//bi-directional many-to-one association to Quote
	@OneToMany(mappedBy="shipper")
	private List<Quote> quotes;

	//bi-directional many-to-one association to Shipment
	@OneToMany(mappedBy="shipper")
	private List<Shipment> shipments;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	//bi-directional many-to-one association to ShipperQuote
	@OneToMany(mappedBy="shipper")
	private List<ShipperQuote> shipperQuotes;

	public Shipper() {
	}

	public long getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}

	public int getDefaultDestination() {
		return this.defaultDestination;
	}

	public void setDefaultDestination(int defaultDestination) {
		this.defaultDestination = defaultDestination;
	}

	public int getDefaultOrigin() {
		return this.defaultOrigin;
	}

	public void setDefaultOrigin(int defaultOrigin) {
		this.defaultOrigin = defaultOrigin;
	}

	public List<Quote> getQuotes() {
		return this.quotes;
	}

	public void setQuotes(List<Quote> quotes) {
		this.quotes = quotes;
	}

	public Quote addQuote(Quote quote) {
		getQuotes().add(quote);
		quote.setShipper(this);

		return quote;
	}

	public Quote removeQuote(Quote quote) {
		getQuotes().remove(quote);
		quote.setShipper(null);

		return quote;
	}

	public List<Shipment> getShipments() {
		return this.shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	public Shipment addShipment(Shipment shipment) {
		getShipments().add(shipment);
		shipment.setShipper(this);

		return shipment;
	}

	public Shipment removeShipment(Shipment shipment) {
		getShipments().remove(shipment);
		shipment.setShipper(null);

		return shipment;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ShipperQuote> getShipperQuotes() {
		return this.shipperQuotes;
	}

	public void setShipperQuotes(List<ShipperQuote> shipperQuotes) {
		this.shipperQuotes = shipperQuotes;
	}

	public ShipperQuote addShipperQuote(ShipperQuote shipperQuote) {
		getShipperQuotes().add(shipperQuote);
		shipperQuote.setShipper(this);

		return shipperQuote;
	}

	public ShipperQuote removeShipperQuote(ShipperQuote shipperQuote) {
		getShipperQuotes().remove(shipperQuote);
		shipperQuote.setShipper(null);

		return shipperQuote;
	}

}