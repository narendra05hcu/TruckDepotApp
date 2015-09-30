package com.truckdepot.service.impl.converter;

import java.util.ArrayList;
import java.util.List;

import com.truckdepot.common.dao.entities.Address;
import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.service.beans.AddressSO;
import com.truckdepot.service.beans.SearchLoadResponseSO;
import com.truckdepot.service.beans.SearchLoadSO;

public class SearchDOToSOConverter {

	public static SearchLoadResponseSO convertToSearchLoadList(List<Quote> quotes) {
		SearchLoadResponseSO searchLaodResponseSO = new SearchLoadResponseSO();
		List<SearchLoadSO> searchLoadSOs = new ArrayList<SearchLoadSO>();
		for(Quote quote:quotes) {
			SearchLoadSO searchLoadSO = new SearchLoadSO();
			searchLoadSO.setDeliveryDate(quote.getDeliveryDate());
			searchLoadSO.setDeliveryTime(quote.getDeliveryTime());
			searchLoadSO.setDestinationAddress(convertAddress(quote.getDestinationAddress()));
			searchLoadSO.setEmail(quote.getShipper().getUser().getEmailId());
			searchLoadSO.setMobileNumber(quote.getShipper().getUser().getMobileNumber());
			searchLoadSO.setName(quote.getShipper().getUser().getFirstName());
			searchLoadSO.setNotes(quote.getNotes());
			searchLoadSO.setOriginAddress(convertAddress(quote.getOriginAddress()));
			searchLoadSO.setPickupDate(quote.getPickupDate());
			searchLoadSO.setPickupTime(quote.getPickupTime());
			searchLoadSO.setQuoteId(quote.getQuoteId());
			
			searchLoadSOs.add(searchLoadSO);
		}
		searchLaodResponseSO.setSearchLoadSOs(searchLoadSOs);
		return searchLaodResponseSO;
	}

	private static AddressSO convertAddress(Address address) {
		AddressSO addressSO = new AddressSO();
		addressSO.setLine1(address.getLine1());
		addressSO.setLine2(address.getLine2());
		addressSO.setLandMark(address.getLandMark());
		addressSO.setCity(address.getCity());
		addressSO.setState(address.getState());
		addressSO.setPincode(address.getPincode());
		return addressSO;
	}

}
