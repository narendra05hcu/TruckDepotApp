package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.common.dao.entities.Shipment;


public interface ShipmentsRepository extends CrudRepository<Shipment, Long> {
	
	Quote findByShipmentId(long shipmentId);
	

}
