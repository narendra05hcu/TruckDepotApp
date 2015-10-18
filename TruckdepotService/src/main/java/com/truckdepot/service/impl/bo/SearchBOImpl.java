package com.truckdepot.service.impl.bo;

import java.util.List;

import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.common.dao.entities.Quote;
import com.truckdepot.common.dao.repository.QuotesRepository;
import com.truckdepot.common.dao.repository.ShipperRepository;
import com.truckdepot.common.dao.repository.custom.SearchQuotesDao;
import com.truckdepot.common.util.DateUtil;
import com.truckdepot.service.beans.PostLoadRequestSO;
import com.truckdepot.service.beans.ResponseSO;
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
		searchLaodResponseSO.setStatus(Status.OK.getStatusCode());
		
		return searchLaodResponseSO;

	}

	public ResponseSO createQuote(PostLoadRequestSO postLoadRequestSO) {
		Quote quote = SearchSOToDOConverter.convertToQuote(postLoadRequestSO);
		quote.setShipper(shipperRepository.findByUserId(postLoadRequestSO.getShipperId()));
		quotesRepository.save(quote);
		ResponseSO responseSO = new ResponseSO();
		responseSO.setStatus(Status.OK.getStatusCode());
		return responseSO;
	}
}
