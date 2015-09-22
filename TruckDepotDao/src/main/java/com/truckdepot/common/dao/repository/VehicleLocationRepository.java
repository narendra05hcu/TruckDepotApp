package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.CarrierVehicleDriver;
import com.truckdepot.common.dao.entities.CarrierVehicleLocation;


public interface VehicleLocationRepository extends CrudRepository<CarrierVehicleLocation, Integer> {
	
	CarrierVehicleDriver findById(int id);
	

}
