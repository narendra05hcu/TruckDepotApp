package com.truckdepot.service.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckdepot.service.SearchService;
import com.truckdepot.service.beans.PostLoadSO;
import com.truckdepot.service.beans.SearchLoadRequestSO;
import com.truckdepot.service.beans.SearchLoadResponseSO;
import com.truckdepot.service.impl.bo.SearchBOImpl;

@Service
public class SearchServiceImpl implements SearchService {
	@Autowired
	SearchBOImpl searBoImpl;

	public Response list(SearchLoadRequestSO searchLoadRequestSO) {
		SearchLoadResponseSO searchLoadResponseSO = searBoImpl.searchForLoad(searchLoadRequestSO);
		Response response = Response.ok(searchLoadResponseSO)
				.build();
		return response;
	}

	@Override
	public Response createQuote(PostLoadSO postLoadSO) {
		searBoImpl.createQuote(postLoadSO);
		return null;
	}

}