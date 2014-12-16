package com.fdi.olimpiada.commons.persistence.types;


/**
 * 
 * @author agonzalez
 *
 */

public class Filter {

	protected String id;
	protected Object value;
	protected FilterOperator operator;
	
	public Filter(){
		super();
	}
	
	public Filter(String id, Object value) {
		this.id = id;
		this.value = value;
		this.operator = FilterOperator.EQ;
	}
	
	public Filter(String id, Object value, FilterOperator operator) {
		this.id = id;
		this.value = value;
		this.operator = operator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public FilterOperator getOperator() {
		return operator;
	}

	public void setOperator(FilterOperator operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Filter [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (value != null) {
			builder.append("value=");
			builder.append(value);
			builder.append(", ");
		}
		if (operator != null) {
			builder.append("operator=");
			builder.append(operator);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
