package com.kindhat.service.response;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Key;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.kindhat.service.common.*;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Item extends Entity {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private Key requestId;	
	
	@Persistent
	private Key userId;	
	
	@Persistent
	private String message;
	
	@Persistent
	private Boolean confirmed;

	public Item () {}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
	
	public Key getRequestId() {
		return requestId;
	}

	public void setRequestId(Key requestId) {
		this.requestId = requestId;
	}
	
	public Key getUserId() {
		return userId;
	}

	public void setUserId(Key userId) {
		this.userId = userId;
	}		
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Boolean getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
}

