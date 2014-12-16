package com.fdi.olimpiada.commons.utils;

import java.io.File;
import java.io.StringReader;
import java.nio.file.Files;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * 
 * @author agonzalez
 *
 */

public class XmlFormatter {

	public static <T> String objectToXml(T object){
		String result = null;
		
		try{
			JAXBContext context = JAXBContext.newInstance(object.getClass());

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			File f = File.createTempFile("file", "");
			
			marshaller.marshal(object, f);
			byte[] salida = Files.readAllBytes(f.toPath());
			
			result = new String(salida);
		} catch(Exception e){
			e.printStackTrace();
		} 
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T xmlToObject(Class<T> clazz, String xml){
		T result = null;
		
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			StringReader reader = new StringReader(xml);
			result = (T) unmarshaller.unmarshal(reader);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return result;
	}
	
}
