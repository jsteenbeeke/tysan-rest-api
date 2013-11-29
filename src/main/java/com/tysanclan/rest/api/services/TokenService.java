package com.tysanclan.rest.api.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tysanclan.rest.api.data.Token;

@Path("/tokens")
public interface TokenService {
	/**
	 * Create a token for the given username and password
	 * 
	 * ONLY USE THIS METHOD OVER SSL!
	 * 
	 * @param username The username for which to get a token
	 * @param password The password for which to get a token
	 * @return A token object
	 */
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	Token getToken(@QueryParam("u") String username,
			@QueryParam("p") String password);
}
