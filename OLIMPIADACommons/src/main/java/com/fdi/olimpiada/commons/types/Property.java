package com.fdi.olimpiada.commons.types;

/**
 * 
 * @author agonzalez
 *
 */

public class Property {
	
	private String code;
	private String text;
	
	public Property(){
		super();
	}
	
	public Property(String code, String text){
		this.code = code;
		this.text = text;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Property [");
		if (code != null) {
			builder.append("code=");
			builder.append(code);
			builder.append(", ");
		}
		if (text != null) {
			builder.append("text=");
			builder.append(text);
		}
		builder.append("]");
		return builder.toString();
	}

}
