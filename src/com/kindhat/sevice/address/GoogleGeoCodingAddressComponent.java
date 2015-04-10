package com.kindhat.sevice.address;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GoogleGeoCodingAddressComponent {
	
	@SerializedName("long_name")
	@Expose
	private String longName;
	
	@SerializedName("short_name")
	@Expose
	private String shortName;
	
	@Expose
	private String[] types;
			
	public GoogleGeoCodingAddressComponent () {}

	public String LongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}
	
	public String ShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public String[] Types() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}
}
