package com.kindhat.service.configuration;

import java.util.Map;
import java.util.HashMap;
import com.kindhat.service.common.Server;

public class ConfigurationFactory {

	private static String configurationUrl = "http://localhost:8888/_ah/api/configurationendpoint/v1/configuration";
	private static Map<String, String> _configuration;
	
	public static Map<String, String> Current() {
		if(_configuration == null)
		{
			_configuration = new HashMap<String, String>();
			
			Server<ConfigurationItems> server = new Server<ConfigurationItems>(ConfigurationItems.class);
			ConfigurationItems configurationItems = server.getItemSync(configurationUrl);			
			
			for(Configuration configuration : configurationItems.getItems())
			{
				_configuration.put(configuration.getName(), configuration.getValue());
			}
		}
		
		return _configuration;
	}
}
