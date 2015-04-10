package com.kindhat.sevice.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoogleGeoCodingAddressResult {

	@SerializedName("address_components")
	@Expose
    private GoogleGeoCodingAddressComponent[] addressComponents;
	
	@SerializedName("formatted_address")
	@Expose
    private String formattedAddress;
	
	@Expose
	private GoogleGeoCodingGeometry geometry;
	
	@SerializedName("place_id")
	@Expose
	private String placeId;
	
	@Expose
	private String[] types;
			
	public GoogleGeoCodingAddressResult () {}

	public GoogleGeoCodingAddressComponent[] AddressComponents() {
		return addressComponents;
	}

	public void setResults(GoogleGeoCodingAddressComponent[] addressComponents) {
		this.addressComponents = addressComponents;
	}
	
	public String FormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}
	
	public GoogleGeoCodingGeometry Geometry() {
		return geometry;
	}

	public void setGeometry(GoogleGeoCodingGeometry geometry) {
		this.geometry = geometry;
	}
	
	public String PlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	
	public String[] Types() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}
}
