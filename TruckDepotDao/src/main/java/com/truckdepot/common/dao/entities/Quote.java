package com.truckdepot.common.dao.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


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