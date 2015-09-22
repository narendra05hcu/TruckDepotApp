package com.truckdepot.service.impl.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.truckdepot.service.beans.ExceptionInfo;

/**
 * Create 404 NOT FOUND exception
 */
public class NotFoundException extends WebApplicationException {
    private static final long serialVersionUID = 1L;

    public NotFoundException() {
        this("Resource not found", null);
    }

    /**
     * Create a HTTP 404 (Not Found) exception.
     * @param message the String that is the entity of the 404 response.
     */
    public NotFoundException(String msg, String desc) {
        super(Response.status(Status.NOT_FOUND).entity(
                new ExceptionInfo(Status.NOT_FOUND.getStatusCode(), msg, desc)
        ).type("application/json").build());
    }

}