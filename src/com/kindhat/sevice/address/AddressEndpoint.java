package com.kindhat.sevice.address;


import java.util.List;
import java.util.ArrayList;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiMethod.HttpMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.kindhat.service.common.Literals;
import com.kindhat.service.common.Server;
import com.kindhat.service.configuration.ConfigurationFactory;

import javax.inject.Named;

@Api(name = "addressendpoint", 
	namespace = @ApiNamespace(ownerDomain = "kindhat.com", 
							  ownerName = "kindhat.com", 
							  packagePath = "service.address"))
public class AddressEndpoint {
	
	private static String googleGeoCodingUrlName = "kh.google.geocoding.url";
	private static String googleApiKeyName = "kh.google.maps.api.key";

	/**
	 * This method calls google to verify an address. It uses HTTP GET method.
	 *
	 * @return A collection of valid addresses.
	 */
	@ApiMethod(
			name = "verifyAddress",
			httpMethod = HttpMethod.GET)
	public Address[] verifyAddress(@Named("street") String street,
								   @Named("postalCode") String postalCode) {
		
		//construct the google geo coding address lookup url
		String googleGeoCodingUrl = ConfigurationFactory.Current().get(googleGeoCodingUrlName).toString();
		String googleApiKey = ConfigurationFactory.Current().get(googleApiKeyName).toString();
		String googleGeoCodingUrlFormatted = ConstructGoogleGeoCodingUrl(googleGeoCodingUrl,
				street,
				postalCode,
				googleApiKey);
		
		//now call the google service with the proper url
		Server<GoogleGeoCodingAddressResults> server = new Server<GoogleGeoCodingAddressResults>(GoogleGeoCodingAddressResults.class);
		GoogleGeoCodingAddressResults googleGeoCodingAddressResults = server.getItemSync(googleGeoCodingUrlFormatted);
		
		//now map the results to kindhat's address format
		Address[] addresses = this.MapGoogleGeoCodingAddressResults(googleGeoCodingAddressResults);
		
		return addresses;
	}
	
	private Address[] MapGoogleGeoCodingAddressResults(GoogleGeoCodingAddressResults googleGeoCodingAddressResults) {
		
		List<Address> addresses = new ArrayList<Address>();
		
		for(GoogleGeoCodingAddressResult result : googleGeoCodingAddressResults.Results()){
			Address address = new Address();
			for(GoogleGeoCodingAddressComponent component : result.AddressComponents()){
				for(String type : component.Types()) {
					address.Map().put(type, component.ShortName());
				}
			}
			addresses.add(address);
		}
		
		return addresses.toArray(new Address[addresses.size()]);
	}
	
	private String ConstructGoogleGeoCodingUrl(String url, String street, String postalCode, String googleApiKey) {
		String streetFormatted = street.replace(Literals.spaceChar, Literals.plusChar);
		String addressFormatted = streetFormatted + Literals.commaString + postalCode;
		return String.format(url, addressFormatted, googleApiKey);
	}
}
