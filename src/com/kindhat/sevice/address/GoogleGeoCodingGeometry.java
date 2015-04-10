package com.kindhat.sevice.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoogleGeoCodingGeometry {
	
	@Expose
	private GoogleGeoCodingCoordinate location;
	
	@SerializedName("location_type")
	@Expose
	private String locationType;
	
	@Expose
	private GoogleGeoCodingViewport viewport;
			
	public GoogleGeoCodingGeometry () {}

	public GoogleGeoCodingCoordinate Location() {
		return location;
	}

	public void setLocation(GoogleGeoCodingCoordinate location) {
		this.location = location;
	}

	public String LocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}
	
	public GoogleGeoCodingViewport Viewport() {
		return viewport;
	}

	public void setViewport(GoogleGeoCodingViewport viewport) {
		this.viewport = viewport;
	}
	
}
