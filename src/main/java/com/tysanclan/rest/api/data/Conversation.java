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
package com.tysanclan.rest.api.data;

import java.util.Date;
import java.util.List;

public class Conversation {
	private final long id;

	private final String title;

	private final Date lastEntry;

	private final List<TysanUser> participants;

	private final List<Message> messages;

	public Conversation(long id, String title, Date lastEntry,
			List<TysanUser> participants, List<Message> messages) {
		this.id = id;
		this.title = title;
		this.lastEntry = lastEntry;
		this.participants = participants;
		this.messages = messages;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Date getLastEntry() {
		return lastEntry;
	}

	public List<TysanUser> getParticipants() {
		return participants;
	}

	public List<Message> getMessages() {
		return messages;
	}

}
