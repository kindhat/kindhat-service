package com.kindhat.sevice.address;

import java.util.HashMap;

import com.kindhat.service.common.Literals;

public class Address {

	private HashMap<String, String> hashMap;
	
	private String street;
	private String city;
	private String state;
	private String postalCode;
	
	private String streetNumberMapName = "street_number";
	private String routeMapName = "route";
	private String subpremiseMapName = "subpremise";
	private String localityMapName = "locality";
	private String administrativeAreaLevel1MapName = "administrative_area_level_1";
	private String countryMapName = "country";
	private String postalCodeMapName = "postal_code";
	private String postalCodeSuffixMapName = "postal_code_suffix";
			
	public Address () {
		//construct mapping hashmap
		hashMap = new HashMap<String, String>();
		hashMap.put(streetNumberMapName, Literals.emptyString);
		hashMap.put(routeMapName, Literals.emptyString);
		hashMap.put(localityMapName, Literals.emptyString);
		hashMap.put(administrativeAreaLevel1MapName, Literals.emptyString);
		hashMap.put(countryMapName, Literals.emptyString);
		hashMap.put(postalCodeMapName, Literals.emptyString);
		hashMap.put(postalCodeSuffixMapName, Literals.emptyString);
	}

	public String getStreet() {
		street = hashMap.get(streetNumberMapName) +
				Literals.spaceString +
				hashMap.get(routeMapName);
		
		String subpremise = hashMap.get(subpremiseMapName);
		
		if(subpremise != Literals.emptyString) {
			street = street +
					Literals.spaceString +
					Literals.hashtagString +
					subpremise;
		}
		
		return street;
	}
	
	public String getCity() {
		city = hashMap.get(localityMapName);
		return city;
	}
	
	public String getState() {
		state = hashMap.get(administrativeAreaLevel1MapName);
		return state;
	}
	
	public String getPostalCode() {
		postalCode = hashMap.get(postalCodeMapName) + Literals.hyphenString + hashMap.get(postalCodeSuffixMapName);
		return postalCode;
	}
	
	public HashMap<String, String> Map() {
		return hashMap;
	}
}
