package com.truckdepot.service;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.truckdepot.service.beans.PostLoadRequestSO;
import com.truckdepot.service.beans.ResponseSO;
import com.truckdepot.service.beans.SearchLoadRequestSO;
import com.truckdepot.service.beans.SearchLoadResponseSO;

@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
@Path("/v1/search")
public interface SearchService {
	@GET
    @Path("/load")
	public SearchLoadResponseSO list(@BeanParam @Valid SearchLoadRequestSO searchLoadRequestSO);
	
	@POST
	@Path("/create-load")
	public ResponseSO createQuote(@Valid PostLoadRequestSO postLoadSO);

}
