package com.kindhat.sevice.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoogleGeoCodingViewport {

	@SerializedName("northeast")
	@Expose
	private GoogleGeoCodingCoordinate northEast;
	
	@SerializedName("southwest")
	@Expose
	private GoogleGeoCodingCoordinate southWest;
			
	public GoogleGeoCodingViewport () {}

	public GoogleGeoCodingCoordinate NorthEast() {
		return northEast;
	}

	public void NorthEast(GoogleGeoCodingCoordinate northEast) {
		this.northEast = northEast;
	}

	public GoogleGeoCodingCoordinate SouthWest() {
		return southWest;
	}

	public void SouthWest(GoogleGeoCodingCoordinate southWest) {
		this.southWest = southWest;
	}
}
