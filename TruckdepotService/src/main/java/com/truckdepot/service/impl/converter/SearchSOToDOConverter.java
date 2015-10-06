package com.truckdepot.service.impl.converter;

import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.common.util.DateUtil;
import com.truckdepot.service.beans.PostLoadSO;

public class SearchSOToDOConverter {

	public static Quote convertToQuote(PostLoadSO postLoadSO) {
		Quote quote = new Quote();
		quote.setDeliveryDate(DateUtil.parseDate(postLoadSO.getDeliveryDate()));
		quote.setDeliveryTime(DateUtil.parseTime(postLoadSO.getDeliveryTime()));
		quote.setDestinationAddress(CommonConverter.convertAddressSOToDo(postLoadSO.getDestinationAddress()));
		quote.setNotes(postLoadSO.getNotes());
		quote.setOriginAddress(CommonConverter.convertAddressSOToDo(postLoadSO.getOriginAddress()));
		quote.setPickupDate(DateUtil.parseDate(postLoadSO.getPickupDate()));
		quote.setPickupTime(DateUtil.parseTime(postLoadSO.getPickupTime()));
		return quote;
	}
	

}
