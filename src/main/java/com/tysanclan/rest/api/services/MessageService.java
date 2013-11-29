package com.tysanclan.rest.api.services;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.tysanclan.rest.api.data.Conversation;
import com.tysanclan.rest.api.data.Message;

@Path("/messages")
public interface MessageService {
	@GET
	@Produces("text/json")
	List<Conversation> getConversations(@QueryParam("t") String tokenString);

	@PUT
	@Produces("text/json")
	Conversation createConversation(@QueryParam("t") String tokenString,
			@FormParam("recipients") List<String> recipients,
			@FormParam("title") String title, @FormParam("body") String body);

	@PUT
	@Path("/{id}")
	@Produces("text/json")
	Message respondToConversation(@QueryParam("t") String tokenString,
			@PathParam("id") long conversationId, String text);

}
