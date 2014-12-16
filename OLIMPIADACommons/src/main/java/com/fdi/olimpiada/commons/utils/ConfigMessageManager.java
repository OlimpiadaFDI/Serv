package com.fdi.olimpiada.commons.utils;

import com.fdi.olimpiada.commons.types.Property;
import com.fdi.olimpiada.commons.utils.PropertyHandler;

/**
 * 
 * @author agonzalez
 *
 */

public class ConfigMessageManager {

	private static ConfigMessageManager instance = new ConfigMessageManager();
	private PropertyHandler pHandler = null;
	
	private ConfigMessageManager(){
		pHandler = new PropertyHandler("br.mensajes.properties");
	}
	
	public static ConfigMessageManager getInstance(){
		return instance;
	}
	
	public String getString(String propertyId){
		String result = null;
		
		try{
			Property prop = pHandler.getProperty(propertyId);
			if (prop != null){
				result = prop.getText();
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
}
