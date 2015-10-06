package com.truckdepot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.service.SearchService;
import com.truckdepot.service.beans.PostLoadSO;
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
	public ResponseSO createQuote(PostLoadSO postLoadSO) {
		return searBoImpl.createQuote(postLoadSO);
	}

}