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
