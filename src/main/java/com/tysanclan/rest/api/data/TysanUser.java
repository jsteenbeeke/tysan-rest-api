package com.tysanclan.rest.api.data;

public class TysanUser {
	private final String username;

	private final String rank;

	public TysanUser(String username, String rank) {
		super();
		this.username = username;
		this.rank = rank;
	}

	public String getUsername() {
		return username;
	}

	public String getRank() {
		return rank;
	}

}
