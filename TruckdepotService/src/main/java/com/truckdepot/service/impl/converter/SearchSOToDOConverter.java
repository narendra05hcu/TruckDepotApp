package com.truckdepot.service.impl.converter;

import com.truckdepot.common.dao.entities.Address;
import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.common.util.DateUtil;
import com.truckdepot.service.beans.AddressSO;
import com.truckdepot.service.beans.PostLoadSO;

public class SearchSOToDOConverter {

	public static Quote convertToQuote(PostLoadSO postLoadSO) {
		Quote quote = new Quote();
		quote.setDeliveryDate(DateUtil.parseDate(postLoadSO.getDeliveryDate()));
		quote.setDeliveryTime(DateUtil.parseTime(postLoadSO.getDeliveryTime()));
		quote.setDestinationAddress(convertAddress(postLoadSO.getDestinationAddress()));
		quote.setNotes(postLoadSO.getNotes());
		quote.setOriginAddress(convertAddress(postLoadSO.getOriginAddress()));
		quote.setPickupDate(DateUtil.parseDate(postLoadSO.getPickupDate()));
		quote.setPickupTime(DateUtil.parseTime(postLoadSO.getPickupTime()));
		return quote;
	}
	
	private static Address convertAddress(AddressSO addressSO) {
		Address address = new Address();
		address.setLine1(addressSO.getLine1());
		address.setLine2(addressSO.getLine2());
		address.setLandMark(addressSO.getLandMark());
		address.setCity(addressSO.getCity());
		address.setState(addressSO.getState());
		address.setPincode(addressSO.getPincode());
		return address;
	}

}
