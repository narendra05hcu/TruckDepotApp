package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.Quote;


public interface QuotesRepository extends CrudRepository<Quote, Integer> {
	
	Quote findByQuoteId(int quoteId);
	
	
}
