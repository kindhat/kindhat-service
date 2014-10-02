package com.kindhat.service.item;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Key;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class ItemRequest {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String userId;
	
	@Persistent
	private String userName;
	
	@Persistent
	private String requestMessage;
	
	@Persistent
	private Date requestDate;
	
	@Persistent
	private String requestLength;
	
	@Persistent
	private String requestAvailability;

	public ItemRequest(Key key, String userId, String userName,
			String requestMessage, Date requestDate, String requestLength,
			String requestAvailability) {
		super();
		this.key = key;
		this.userId = userId;
		this.userName = userName;
		this.requestMessage = requestMessage;
		this.requestDate = requestDate;
		this.requestLength = requestLength;
		this.requestAvailability = requestAvailability;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRequestMessage() {
		return requestMessage;
	}

	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getRequestLength() {
		return requestLength;
	}

	public void setRequestLength(String requestLength) {
		this.requestLength = requestLength;
	}

	public String getRequestAvailability() {
		return requestAvailability;
	}

	public void setRequestAvailability(String requestAvailability) {
		this.requestAvailability = requestAvailability;
	}
}
