package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.ShipperQuote;


public interface ShipperQuotesRepository extends CrudRepository<ShipperQuote, Integer> {
	
	ShipperQuote findByQuoteId(int quoteId);
	

}
