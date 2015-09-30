package com.truckdepot.service.beans;

import javax.ws.rs.QueryParam;

import org.hibernate.validator.constraints.NotEmpty;

import com.truckdepot.service.validator.IsDate;

public class SearchLoadRequestSO {
	@QueryParam(value="fromCity")
	@NotEmpty
	private String fromCity;
	@QueryParam(value="toCity")
	@NotEmpty
	private String toCity;
	@QueryParam(value="availableDate")
	@NotEmpty @IsDate
	private String availableDate;

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(String availableDate) {
		this.availableDate = availableDate;
	}
}
