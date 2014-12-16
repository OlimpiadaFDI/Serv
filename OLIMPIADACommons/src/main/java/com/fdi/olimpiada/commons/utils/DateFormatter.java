package com.fdi.olimpiada.commons.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author agonzalez
 *
 */

public class DateFormatter {
	
	public static String dateToString(Date date, String format){
		String result = null;
		SimpleDateFormat dateFormatter = new SimpleDateFormat(format);
		try {
			if (date != null){
				result = dateFormatter.format(date);
			}			
		} catch (Exception e) {
			// Date Format Incorrect
		}		
		return result;
	}
	
	public static Date stringToDate(String date, String format){
		Date result = null;		
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat(format);
			result = dateFormatter.parse(date);
		} catch (IllegalArgumentException e) {
			// Date Format Incorrect	
		} catch (ParseException e) {
			// Date Format Incorrect
		} catch (Exception e) {
			// Date Format Incorrect
		}		
		return result;
	}

}
