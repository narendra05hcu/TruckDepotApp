package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.QuotesPrice;


public interface QuotesPriceRepository extends CrudRepository<QuotesPrice, Long> {
	
	QuotesPrice findById(long id);
	

}
