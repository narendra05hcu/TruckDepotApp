package com.truckdepot.service.impl.converter;

import java.util.ArrayList;
import java.util.List;

import com.truckdepot.common.dao.entities.Quote;
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
			searchLoadSO.setDestinationAddress(CommonConverter.convertAddressDOToSO(quote.getDestinationAddress()));
			searchLoadSO.setEmail(quote.getShipper().getEmailId());
			searchLoadSO.setMobileNumber(quote.getShipper().getMobileNumber());
			searchLoadSO.setName(quote.getShipper().getFirstName());
			searchLoadSO.setNotes(quote.getNotes());
			searchLoadSO.setOriginAddress(CommonConverter.convertAddressDOToSO(quote.getOriginAddress()));
			searchLoadSO.setPickupDate(quote.getPickupDate());
			searchLoadSO.setPickupTime(quote.getPickupTime());
			searchLoadSO.setQuoteId(quote.getQuoteId());
			
			searchLoadSOs.add(searchLoadSO);
		}
		searchLaodResponseSO.setSearchLoadSOs(searchLoadSOs);
		return searchLaodResponseSO;
	}

}
