/**
 * Tysan Clan Website
 * Copyright (C) 2008-2011 Jeroen Steenbeeke and Ties van de Ven
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
