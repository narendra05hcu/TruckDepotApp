package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.CarrierVehicleDriver;


public interface VehicleDriverRepository extends CrudRepository<CarrierVehicleDriver, Long> {
	
	CarrierVehicleDriver findById(long id);
	

}
