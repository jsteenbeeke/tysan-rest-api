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

public class Message {
	private final Date sentTime;

	private final String message;

	private final TysanUser sender;

	public Message(Date sentTime, String message, TysanUser sender) {
		super();
		this.sentTime = sentTime;
		this.message = message;
		this.sender = sender;
	}

	public Date getSentTime() {
		return sentTime;
	}

	public String getMessage() {
		return message;
	}

	public TysanUser getSender() {
		return sender;
	}

}
