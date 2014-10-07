package com.kindhat.service.user;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.lang.String;
import java.util.Set;

import com.google.appengine.api.datastore.Blob;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.datanucleus.annotations.Unowned;
import com.kindhat.service.common.Entity;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User extends Entity {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Key id;
	
	@Persistent
	private String name;
	
	@Persistent
	private String postalCode;
	
	@Persistent
	private String aboutMe;
	
	@Persistent
	private Blob image;
	
	@Persistent
	private String email;

	@Persistent
	private Boolean termsAndConditions;
	
	@Persistent
	private String externalIdType;
	
	@Persistent
	private String externalId;
	
	@Persistent
	@Unowned
	private Set<Key> requests;
	
	@Persistent
	@Unowned
	private Set<Key> responses;
	
	public User () {}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
	
	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	
	public String getExternalIdType() {
		return externalIdType;
	}

	public void setExternalIdType(String externalIdType) {
		this.externalIdType = externalIdType;
	}
	
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public Set<Key> getRequests() {
		return requests;
	}

	public void setRequests(Set<Key> requests) {
		this.requests = requests;
	}
	
	public Set<Key> getResponses() {
		return responses;
	}

	public void setResponses(Set<Key> responses) {
		this.responses = responses;
	}
}