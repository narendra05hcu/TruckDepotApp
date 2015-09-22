package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.CarrierVehicle;


public interface CarrierVehicleRepository extends CrudRepository<CarrierVehicle, Integer> {
	
	CarrierVehicle findByVehicleId(int vehicleId);
	

}
