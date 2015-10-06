package com.truckdepot.service.impl.converter;

import com.truckdepot.common.dao.entities.Address;
import com.truckdepot.service.beans.AddressSO;

public class CommonConverter {
	public static AddressSO convertAddressDOToSO(Address address) {
		if(address == null) {
			return null;
		}
		AddressSO addressSO = new AddressSO();
		addressSO.setLine1(address.getLine1());
		addressSO.setLine2(address.getLine2());
		addressSO.setLandMark(address.getLandMark());
		addressSO.setCity(address.getCity());
		addressSO.setState(address.getState());
		addressSO.setPincode(address.getPincode());
		return addressSO;
	}
	
	public static Address convertAddressSOToDo(AddressSO addressSO) {
		if(addressSO == null) {
			return null;
		}
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
