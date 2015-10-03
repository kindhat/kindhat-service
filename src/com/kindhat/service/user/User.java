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
	private Double longitude;
	
	@Persistent
	private Double latitude;
	
	@Persistent
	private String geoHash1;
	
	@Persistent
	private String geoHash2;
	
	@Persistent
	private String geoHash3;
	
	@Persistent
	private String geoHash4;
	
	@Persistent
	private String geoHash5;
	
	@Persistent
	private String geoHash6;
	
	@Persistent
	private String geoHash7;
	
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
	
	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
	public String getGeoHash1() {
		return geoHash1;
	}

	public void setGeoHash1(String geoHash1) {
		this.geoHash1 = geoHash1;
	}
	
	public String getGeoHash2() {
		return geoHash2;
	}

	public void setGeoHash2(String geoHash2) {
		this.geoHash2 = geoHash2;
	}
	
	public String getGeoHash3() {
		return geoHash3;
	}

	public void setGeoHash3(String geoHash3) {
		this.geoHash3 = geoHash3;
	}
	
	public String getGeoHash4() {
		return geoHash4;
	}

	public void setGeoHash4(String geoHash4) {
		this.geoHash4 = geoHash4;
	}
	
	public String getGeoHash5() {
		return geoHash5;
	}

	public void setGeoHash5(String geoHash5) {
		this.geoHash5 = geoHash5;
	}
	
	public String getGeoHash6() {
		return geoHash6;
	}

	public void setGeoHash6(String geoHash6) {
		this.geoHash6 = geoHash6;
	}
	
	public String getGeoHash7() {
		return geoHash7;
	}

	public void setGeoHash7(String geoHash7) {
		this.geoHash7 = geoHash7;
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