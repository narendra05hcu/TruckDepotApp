package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.Shipper;


public interface ShipperRepository extends CrudRepository<Shipper, Integer> {
	
	Shipper findByShipperId(int shipperId);
	

}
