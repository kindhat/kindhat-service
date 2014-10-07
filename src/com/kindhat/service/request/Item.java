package com.kindhat.service.request;

import java.util.Date;
import java.util.Set;

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
	private Key userId;
	
	@Persistent
	private String item;	
	
	@Persistent
	private String category;	
	
	@Persistent
	private Integer duration;
	
	@Persistent
	private EnumDuration durationType;
	
	@Persistent
	private String use;
	
	@Persistent
	private Date borrowDate;	
	
	@Persistent
	private String message;
	
	@Persistent
	private Set<Key> responses;

	public Item () {}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}
	
	public Key getUserId() {
		return userId;
	}

	public void setUserId(Key userId) {
		this.userId = userId;
	}
	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}	
	
	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public EnumDuration getDurationType() {
		return durationType;
	}

	public void setDurationType(EnumDuration durationType) {
		this.durationType = durationType;
	}
	
	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	
	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Set<Key> getResponses() {
		return responses;
	}

	public void setResponses(Set<Key> responses) {
		this.responses = responses;
	}
}
