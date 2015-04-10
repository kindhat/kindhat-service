package com.kindhat.service.response;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.kindhat.service.common.Entity;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Item extends Entity {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private Long requestId;	
	
	@Persistent
	private Long userId;	
	
	@Persistent
	private String message;
	
	@Persistent
	private Boolean confirmed;

	public Item () {}

	public Long getId() {
		return id;
	}

	public void setKey(Long id) {
		this.id = id;
	}
	
	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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

