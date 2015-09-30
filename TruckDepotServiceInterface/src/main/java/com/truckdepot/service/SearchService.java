package com.truckdepot.service;

import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.truckdepot.service.beans.PostLoadSO;
import com.truckdepot.service.beans.SearchLoadRequestSO;

@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
@Path("/v1/search")
public interface SearchService {
	@GET
    @Path("/load")
	public Response list(@BeanParam @Valid SearchLoadRequestSO searchLoadRequestSO);
	
	@POST
	@Path("/create-load")
	public Response createQuote(@Valid PostLoadSO postLoadSO);

}
