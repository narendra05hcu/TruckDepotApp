package com.truckdepot.service.impl.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.common.dao.repository.QuotesRepository;
import com.truckdepot.common.dao.repository.ShipperRepository;
import com.truckdepot.common.dao.repository.custom.SearchQuotesDao;
import com.truckdepot.common.util.DateUtil;
import com.truckdepot.service.beans.PostLoadSO;
import com.truckdepot.service.beans.SearchLoadRequestSO;
import com.truckdepot.service.beans.SearchLoadResponseSO;
import com.truckdepot.service.impl.converter.SearchDOToSOConverter;
import com.truckdepot.service.impl.converter.SearchSOToDOConverter;

@Service
public class SearchBOImpl {
	@Autowired
	SearchQuotesDao searchQuotesDao;
	
	@Autowired
	QuotesRepository quotesRepository;
	
	@Autowired
	ShipperRepository shipperRepository;

	public SearchLoadResponseSO searchForLoad(
			SearchLoadRequestSO searchRequestSO) {
		
		List<Quote> quotes = searchQuotesDao.searhcQuotes(searchRequestSO.getFromCity(), searchRequestSO.getToCity(), DateUtil.parseDate(searchRequestSO.getAvailableDate()));
		SearchLoadResponseSO searchLaodResponseSO = SearchDOToSOConverter.convertToSearchLoadList(quotes);
		
		return searchLaodResponseSO;

	}

	public void createQuote(PostLoadSO postLoadSO) {
		Quote quote = SearchSOToDOConverter.convertToQuote(postLoadSO);
		quote.setShipper(shipperRepository.findByShipperId(postLoadSO.getShipperId()));
		quotesRepository.save(quote);
	}
}
