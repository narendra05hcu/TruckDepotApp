package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.Carrier;


public interface CarrierRepository extends CrudRepository<Carrier, Long> {
	
	Carrier findByCarrierId(long carrierId);
	

}
