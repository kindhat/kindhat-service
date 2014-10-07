package com.kindhat.service.common;

import java.util.Date;

import javax.jdo.annotations.Persistent;

public class Entity {	
	
	@Persistent
	private Date when;

	public Entity () {}


	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}	
}