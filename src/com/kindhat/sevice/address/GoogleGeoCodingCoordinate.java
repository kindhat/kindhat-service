package com.kindhat.sevice.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoogleGeoCodingCoordinate {
	
	@SerializedName("lat")
	@Expose
	private double latitude;
	
	@SerializedName("lng")
	@Expose
	private double longitude;
			
	public GoogleGeoCodingCoordinate () {}

	public double Latitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double Longitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
