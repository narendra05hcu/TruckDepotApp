package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.Carrier;


public interface CarrierRepository extends CrudRepository<Carrier, Integer> {
	
	Carrier findByCarrierId(int carrierId);
	

}
