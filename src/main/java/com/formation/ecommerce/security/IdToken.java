package com.formation.ecommerce.security;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class IdToken {// Token outh2

	private final String accessToken;// jwt// ACCESS8TOKEN

	// bearer = titulaire /porteur
	private final String tokenType = "Bearer";// TOKEN8TYPE

	private final long expiresIn;// EXPIRE8IN

	IdToken(String accessToken, long expiresIn) {
		this.accessToken = accessToken;
		this.expiresIn = expiresIn;

	}

	public String getAccessToken() {
		return accessToken;
	}

	public String getTokenType() {
		return tokenType;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	@Override
	public String toString() {
		return "IdToken [accessToken=PROTECTED, tokenType=" + tokenType + ", expiresIn=" + expiresIn + "]";
	}

}
