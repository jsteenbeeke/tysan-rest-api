package com.tysanclan.rest.api.data;

public class Token {
	private final String username;

	private final String tokenString;

	private final long validUntil;

	public Token(String username, String tokenString, long validUntil) {
		super();
		this.username = username;
		this.tokenString = tokenString;
		this.validUntil = validUntil;
	}

	public String getUsername() {
		return username;
	}

	public String getTokenString() {
		return tokenString;
	}

	public boolean isValid() {
		return System.currentTimeMillis() < validUntil;
	}
}