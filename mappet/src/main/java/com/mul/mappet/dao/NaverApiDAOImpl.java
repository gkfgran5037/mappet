package com.mul.mappet.dao;

public class NaverApiDAOImpl implements NaverApiDAO {
	private String clientId;
	private String clientSecret;
	
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
}
