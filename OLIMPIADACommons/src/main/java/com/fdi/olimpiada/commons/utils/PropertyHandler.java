package com.fdi.olimpiada.commons.utils;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fdi.olimpiada.commons.types.Property;

/**
 * 
 * @author agonzalez
 *
 */

public class PropertyHandler {
	
	private static final Logger logger= LoggerFactory.getLogger(PropertyHandler.class);
	private Properties prop = new Properties();
	private Property property;
	private String resourcePath;

	public PropertyHandler(String resourcePath) {
		this.resourcePath = resourcePath;
		reloadResourceFile();
	}

	public Property getProperty(String id) {
		property=new Property();
		String propId = null;
		if (prop.getProperty(id) != null && !prop.getProperty(id).trim().isEmpty()){
			propId = prop.getProperty(id);
			property.setText(propId);
			String split[]=id.split("\\.");
			property.setCode(split[split.length-1]);
		}else{
			property.setCode("SIM0000");
			property.setText("Propiedad No Definida");
		}

		return property;
	}
	
	public void reloadResourceFile(){
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream is = null;
		try {
			is = loader.getResourceAsStream(resourcePath);
			prop.clear();
			prop.load(is);
			is.close();
		} catch (Exception ex) {
			logger.error("Archivo de Propiedades NO Localizado. Revise la ruta de acceso al archivo de propiedades");
		}
	}
	
	public String getResourcePath() {
		return resourcePath;
	}
	
	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}
	
}
