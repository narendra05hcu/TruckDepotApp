package com.truckdepot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.service.SearchService;
import com.truckdepot.service.beans.PostLoadRequestSO;
import com.truckdepot.service.beans.ResponseSO;
import com.truckdepot.service.beans.SearchLoadRequestSO;
import com.truckdepot.service.beans.SearchLoadResponseSO;
import com.truckdepot.service.impl.bo.SearchBOImpl;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	SearchBOImpl searBoImpl;

	public SearchLoadResponseSO list(SearchLoadRequestSO searchLoadRequestSO) {
		SearchLoadResponseSO searchLoadResponseSO = searBoImpl.searchForLoad(searchLoadRequestSO);
		return searchLoadResponseSO;
	}

	@Override
	public ResponseSO createQuote(PostLoadRequestSO postLoadRequestSO) {
		return searBoImpl.createQuote(postLoadRequestSO);
	}

}