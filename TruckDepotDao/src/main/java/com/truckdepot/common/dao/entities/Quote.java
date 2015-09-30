package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the quotes database table.
 * 
 */
@Entity
@Table(name="quotes")
@NamedQuery(name="Quote.findAll", query="SELECT q FROM Quote q")
public class Quote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="quote_id")
	private long quoteId;

	@Temporal(TemporalType.DATE)
	@Column(name="delivery_date")
	private Date deliveryDate;

	@Column(name="delivery_time")
	private Time deliveryTime;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="destination_address_id")
	private Address destinationAddress;

	@Column(name="notes")
	private String notes;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="origin_address_id")
	private Address originAddress;

	@Temporal(TemporalType.DATE)
	@Column(name="pickup_date")
	private Date pickupDate;

	@Column(name="pickup_time")
	private Time pickupTime;

	@Column(name="shipment_type")
	private int shipmentType;

	//bi-directional many-to-one association to Shipper
	@ManyToOne
	@JoinColumn(name="shipper_id")
	private Shipper shipper;

	//bi-directional many-to-one association to QuotesPrice
	@OneToMany(mappedBy="quote")
	private List<QuotesPrice> quotesPrices;

	public Quote() {
	}

	public long getQuoteId() {
		return this.quoteId;
	}

	public void setQuoteId(long quoteId) {
		this.quoteId = quoteId;
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

	public Address getDestinationAddress() {
		return this.destinationAddress;
	}

	public void setDestinationAddress(Address destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Address getOriginAddress() {
		return this.originAddress;
	}

	public void setOriginAddress(Address originAddress) {
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

	public Shipper getShipper() {
		return this.shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	public List<QuotesPrice> getQuotesPrices() {
		return this.quotesPrices;
	}

	public void setQuotesPrices(List<QuotesPrice> quotesPrices) {
		this.quotesPrices = quotesPrices;
	}

	public QuotesPrice addQuotesPrice(QuotesPrice quotesPrice) {
		getQuotesPrices().add(quotesPrice);
		quotesPrice.setQuote(this);

		return quotesPrice;
	}

	public QuotesPrice removeQuotesPrice(QuotesPrice quotesPrice) {
		getQuotesPrices().remove(quotesPrice);
		quotesPrice.setQuote(null);

		return quotesPrice;
	}

}