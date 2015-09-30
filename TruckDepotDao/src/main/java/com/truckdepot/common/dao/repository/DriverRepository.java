package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.TruckDriver;


public interface DriverRepository extends CrudRepository<TruckDriver, Long> {
	
	TruckDriver findByDriverId(long driverId);
	

}
