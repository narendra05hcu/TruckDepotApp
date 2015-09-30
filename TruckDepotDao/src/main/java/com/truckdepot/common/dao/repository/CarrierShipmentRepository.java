package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.CarrierShipment;
import com.truckdepot.common.dao.entities.CarrierVehicle;


public interface CarrierShipmentRepository extends CrudRepository<CarrierShipment, Long> {
	
	CarrierVehicle findById(long id);
	

}
