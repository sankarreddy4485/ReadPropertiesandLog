package com.java.readfile;

import java.util.Iterator;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ReadPropertiFile {
	private static final Log LOGGER = LogFactory.getLog(ReadPropertiFile.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configurations configurations = new Configurations();
		
		try {
			PropertiesConfiguration propertiesConfiguration = configurations.properties("configuration.properties");
			Iterator<String> iterator = propertiesConfiguration.getKeys();
			while(iterator.hasNext()) {
				String key = iterator.next();
				LOGGER.info(propertiesConfiguration.getProperty(key));
				
			}
			
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			LOGGER.info(e.getMessage());
		}

	}

}
