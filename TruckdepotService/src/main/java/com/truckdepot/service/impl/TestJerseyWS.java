package com.truckdepot.service.impl;

import java.util.Arrays;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

@Service
@Consumes({"application/json"})
@Produces({"application/json"})
@Path("test")
public class TestJerseyWS {

    @GET
    public Response list() {
    	Response response = Response.ok(Arrays.asList("sdsdf","qwwew")).build();
        return response;
    }

}