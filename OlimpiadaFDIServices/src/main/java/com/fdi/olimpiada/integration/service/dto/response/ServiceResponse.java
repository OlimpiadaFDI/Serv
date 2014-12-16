package com.fdi.olimpiada.integration.service.dto.response;

/**
 * 
 * @author agonzalez
 *
 */

public class ServiceResponse<T> {

	private int code;
	private String message;
	private T result;
	
	public ServiceResponse(){
		super();
		this.code = 0;
		this.message = "OK";
	}
	
	public ServiceResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public ServiceResponse(int code, String message, T result) {
		this.code = code;
		this.message = message;
		this.result = result;
	}
	
	public ServiceResponse(T result){
		this.code = 0;
		this.message = "OK";
		this.result = result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceResponse [code=");
		builder.append(code);
		builder.append(", ");
		if (message != null) {
			builder.append("message=");
			builder.append(message);
			builder.append(", ");
		}
		if (result != null) {
			builder.append("result=");
			builder.append(result);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
