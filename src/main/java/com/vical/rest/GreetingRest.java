package com.vical.rest;

import com.vical.domain.Persona;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author vical on 24-07-17.
 */

@Path("/greeting")
public interface GreetingRest {

    @GET
    @Path("/hello")
    @Produces({MediaType.APPLICATION_JSON})
    Persona getGreeting();
}
