package com.fdi.olimpiada.commons.utils;

/**
 * 
 * @author agonzalez
 *
 */

public class StringFormatter {

	public static <T> String leftPad(T cad, char padding, int size){
		return String.format("%"+size+"s", cad).replace(' ', padding);
	}
	
}
