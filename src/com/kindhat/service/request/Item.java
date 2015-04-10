package com.kindhat.service.request;

import java.util.Date;
import java.util.Set;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.datanucleus.annotations.Unowned;
import com.kindhat.service.common.Entity;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Item extends Entity {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private Long userId;
	
	@Persistent
	private String item;	
	
	@Persistent
	private String category;	
	
	@Persistent
	private String use;
	
	@Persistent
	private Date borrowDate;	
	
	@Persistent
	private Date returnDate;	
	
	@Persistent
	private String message;
	
	@Persistent
	@Unowned
	private Set<Long> responses;

	public Item () {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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
	
	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Set<Long> getResponses() {
		return responses;
	}

	public void setResponses(Set<Long> responses) {
		this.responses = responses;
	}
}
