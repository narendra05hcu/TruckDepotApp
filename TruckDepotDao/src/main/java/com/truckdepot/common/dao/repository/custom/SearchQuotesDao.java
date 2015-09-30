package com.truckdepot.common.dao.repository.custom;

import java.util.Date;
import java.util.List;

import com.truckdepot.common.dao.entities.Quote;

public interface SearchQuotesDao {
	
public List<Quote> searhcQuotes(String fromCity, String toCity, Date availableDate);
}
