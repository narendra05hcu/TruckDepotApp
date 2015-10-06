package com.truckdepot.common.dao.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the shipper database table.
 * 
 */
@Entity
@NamedQuery(name="Shipper.findAll", query="SELECT s FROM Shipper s")
@DiscriminatorValue("SHIPPER")
public class Shipper extends User {
	private static final long serialVersionUID = 1L;

	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="shipper_id")
	private long shipperId;*/

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="default_destination")
	private Address defaultDestination;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="default_origin")
	private Address defaultOrigin;

	//bi-directional many-to-one association to Quote
	@OneToMany(mappedBy="shipper",fetch=FetchType.LAZY)
	private List<Quote> quotes;

	//bi-directional many-to-one association to Shipment
	@OneToMany(mappedBy="shipper",fetch=FetchType.LAZY)
	private List<Shipment> shipments;

	//bi-directional many-to-one association to User
	/*@ManyToOne
	@JoinColumn(name="user_id")
	private User user;*/

	//bi-directional many-to-one association to ShipperQuote
	@OneToMany(mappedBy="shipper",fetch=FetchType.LAZY)
	private List<ShipperQuote> shipperQuotes;

	public Shipper() {
	}

	/*public long getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(long shipperId) {
		this.shipperId = shipperId;
	}*/

	public Address getDefaultDestination() {
		return this.defaultDestination;
	}

	public void setDefaultDestination(Address defaultDestination) {
		this.defaultDestination = defaultDestination;
	}

	public Address getDefaultOrigin() {
		return this.defaultOrigin;
	}

	public void setDefaultOrigin(Address defaultOrigin) {
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

	/*public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}*/

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