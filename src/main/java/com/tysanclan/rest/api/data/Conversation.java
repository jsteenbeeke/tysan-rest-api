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
