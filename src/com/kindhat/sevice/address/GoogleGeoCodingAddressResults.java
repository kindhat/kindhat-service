package com.kindhat.sevice.address;

import com.google.gson.annotations.Expose;

public class GoogleGeoCodingAddressResults {

	@Expose
    private GoogleGeoCodingAddressResult[] results;
	
	@Expose
	private String status;
			
	public GoogleGeoCodingAddressResults () {}

	public GoogleGeoCodingAddressResult[] Results() {
		return results;
	}

	public void setResults(GoogleGeoCodingAddressResult[] results) {
		this.results = results;
	}
	
	public String Status() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
