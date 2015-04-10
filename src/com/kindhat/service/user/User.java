package com.kindhat.service.user;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import java.util.Set;

import com.google.appengine.datanucleus.annotations.Unowned;
import com.kindhat.service.common.Entity;
import com.kindhat.service.common.EnumExternalIdType;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User extends Entity {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
	
	@Persistent
	private String name;
	
	@Persistent
	private String street;
	
	@Persistent
	private String postalCode;
	
	@Persistent
	private String aboutMe;
	
	@Persistent
	private String image;
	
	@Persistent
	private String email;

	@Persistent
	private Boolean termsAndConditions;
	
	@Persistent
	private EnumExternalIdType externalIdType;
	
	@Persistent
	private String externalId;
	
	@Persistent
	@Unowned
	private Set<Long> requests;
	
	@Persistent
	@Unowned
	private Set<Long> responses;
	
	public User () {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public Boolean getTermsAndConditions() {
		return termsAndConditions;
	}

	public void setTermsAndConditions(Boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	
	public EnumExternalIdType getExternalIdType() {
		return externalIdType;
	}

	public void setExternalIdType(EnumExternalIdType externalIdType) {
		this.externalIdType = externalIdType;
	}
	
	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	
	public Set<Long> getRequests() {
		return requests;
	}

	public void setRequests(Set<Long> requests) {
		this.requests = requests;
	}
	
	public Set<Long> getResponses() {
		return responses;
	}

	public void setResponses(Set<Long> responses) {
		this.responses = responses;
	}
}